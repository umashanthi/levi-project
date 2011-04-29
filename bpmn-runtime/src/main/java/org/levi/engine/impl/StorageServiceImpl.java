package org.levi.engine.impl;

import org.levi.engine.*;
import org.levi.engine.impl.bpmn.parser.ObjectModel;
import org.levi.engine.utils.ExtractData;
import org.levi.engine.utils.Extractor;
import org.levi.engine.utils.ObjectSaver;
import org.levi.visualize.api.GraphViz;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StorageServiceImpl implements StorageService {
    private EngineData engineData;

    // todo: make the dirs of serial, extract if not exsisting

    private List<Deployment> createdDeployments = new ArrayList<Deployment>(50);
    
    public boolean start() {
        System.out.println("[Info] Storage Service started");
        return true;
    }

    /**
     * Get the list of deployed processes
     */
    public List<String> getDeploymentIds() {
         return engineData.getDeploymentIds();
    }

    public void showDeployedProcessList() {
        System.out.println("Deployed processes:\n\t");
        System.out.println(engineData.getDeploymentIds().toString());
    }

    public boolean deploy(Deployment d) {
        if (d == null) {
            throw new LeviException("Null Deployment. Deployment failed.");
        }
        boolean removed = createdDeployments.remove(d);
        if (!removed) {
            throw new LeviException("Attempt to deploy a non created deployment.");
        }
        engineData.addDeployment(d);
        System.out.println("[Info] Deployed : " + d.getDefinitionsName());
        return true;
    }

    public void undeploy(String id) throws IOException {
        undeploy(engineData.getDeployment(id));
    }

    public void undeployAll() throws IOException {
        for (String id : engineData.getDeploymentIds()) {
            undeploy(id);
        }
    }
    
    public void undeploy(Deployment d)
            throws IOException {
        if (engineData.hasDeployment(d)) {
            engineData.removeDeployment(d);
            deleteDeploymentData(d);
        }
        throw new LeviException("Attempt to undeploy an untracked deployment : " + d.getDefinitionsName());
    }

    public boolean stop() throws IOException {
        for (Deployment d : createdDeployments) {
            deleteDeploymentData(d);
        }
        System.out.println("[Info] Storage Service stopped.");
        return true;
    }

    private static void deleteDeploymentData(Deployment d)
            throws IOException {
        delete(d.getExtractPath(), true);
        // delete other stuff: om, pic
        delete(d.getOmPath(), false);
        if (!Constants.EMPTY.equals(d.getDiagramPath())) {
            delete(d.getDiagramPath(), false);
        }
    }

    public StorageServiceImpl(EngineData engineData) {
        assert engineData != null;
        this.engineData = engineData;
    }
    
    public Deployment createDeployment(String larPath)
            throws IOException {
        ExtractData exData = Extractor.extract(larPath);
        if (exData == null) {
            throw new LeviException("Could not extract Levi archive: " + larPath);
        }
        String processURI  = exData.getBPMNFiles().get(0);
        // create the om
        ObjectModel om = new ObjectModel(new File(processURI));
        // get the process name
        //String processId = om.getProcessName();
        String definitionsName = om.getDefinitionsName();
        if ("".equals(definitionsName)) { // processId
            throw new LeviException("Cannot deploy a process with no name.");
        }
        if (engineData.hasDeployment(definitionsName)) { // processId
            delete(exData.getExtractPath(), true);
            throw new LeviException("Process already deployed : " + definitionsName);
        }
        // serialize it and get the path
        String omPath = Constants.LOM_PATH + definitionsName.replaceAll(" ", "_") + "-" + om.hashCode()+ ".lom"; // processId
        ObjectSaver saver = new ObjectSaver(omPath);
        saver.saveObject(om);
        // create the BPMN diagram
        GraphViz diagram = new GraphViz();
        String diagramPath = diagram.getGraph(om, exData.getExtractPath());
        // save it and get the path
        // make a deployment
        Deployment d = new Deployment(definitionsName, omPath, diagramPath, exData.getExtractPath());
        createdDeployments.add(d);
        return d;
    }

    /**
     * deletes the content at path
     * @param path
     * @param deleteParent
     * @return
     * @throws java.io.IOException
     */
    public static boolean delete(String path, boolean deleteParent)
            throws IOException {
        assert path != null;
        File dir = new File(path);
        boolean result = delete(dir);
        if (!deleteParent) {
            return result;
        }
        return delete(dir.getParentFile());
    }

    private static boolean delete(File path)
            throws IOException {
        if (path.isDirectory()) {
           for (File child : path.listFiles()) {
               delete(child);
           }
        }
        if (!path.delete()) {
            throw new LeviException("Could not delete : " + path);
        }
        return true;
    }
}