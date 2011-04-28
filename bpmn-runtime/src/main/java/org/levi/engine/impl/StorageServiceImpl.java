package org.levi.engine.impl;

import org.levi.engine.Deployment;
import org.levi.engine.EngineData;
import org.levi.engine.StorageService;
import org.levi.engine.impl.bpmn.parser.ObjectModel;
import org.levi.engine.utils.ExtractData;
import org.levi.engine.utils.Extractor;
import org.levi.engine.utils.ObjectSaver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class StorageServiceImpl implements StorageService {
    private EngineData engineData;

    public final static String EMPTY = "__EMPTY__".intern();

    private List<Deployment> createdDeployments = new ArrayList<Deployment>(50);
    
    public boolean start() {
        System.out.println("[Info] Storage Service started") ;
        return true;
    }

    /**
     * Get the list of deployed processes
     */
    public List<String> getDeployedProcessList() {
         return engineData.getDeploymentPIds();
    }

    public void showDeployedProcessList() {
        System.out.println("Deployed processes:\n\t");
        System.out.println(engineData.getDeploymentPIds().toString());
    }

    public boolean deploy(Deployment d) {
        if (d == null) {
            System.out.println("[Info] Deployment failed");
            return false;
        }
        boolean removed = createdDeployments.remove(d);
        if (!removed) {
            System.err.println("[Warning] Attempt to deploy a non created deployment");
            return false;
        }
        engineData.addDeployment(d);
        System.out.println("[Info] Deployed <" + d.getDefinitionsName() + ">");
        return true;
    }

    public boolean undeploy(String id) throws IOException {
        return undeploy(engineData.getDeployment(id));
    }

    public boolean undeploy(Deployment d)
            throws IOException {
        if (engineData.hasDeployment(d)) {
            engineData.removeDeployment(d);
            deleteDeploymentData(d);
            return true;
        }
        System.err.println("[Warning] Attempt to undeploy an untracked deployment " + d.getDefinitionsName());
        return false;
    }

    public boolean stop() throws IOException {
        for (Deployment d : createdDeployments) {
            deleteDeploymentData(d);
        }
        System.out.println("[Info] Storage Service stopped");
        return true;
    }

    private static void deleteDeploymentData(Deployment d)
            throws IOException {
        delete(d.getExtractPath(), true);
        // delete other stuff: om, pic
        delete(d.getOmPath(), false);
        if (!EMPTY.equals(d.getDiagramPath())) {
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
            return null;
        }
        String processURI  = exData.getBPMNFiles().get(0);
        // create the om
        ObjectModel om = new ObjectModel(new File(processURI));
        // get the process name
        //String processId = om.getProcessName();
        String definitionsName = om.getDefinitionsName();
        if ("".equals(definitionsName)) { // processId
            System.err.println("[Error] Cannot deploy a process with no/empty name");
            return null;
        }
        if (engineData.hasDeployment(definitionsName)) { // processId
            System.out.println("[Warning] Process already deployed <" + definitionsName + ">");
            delete(exData.getExtractPath(), true);
            return null;
        }
        // serialize it and get the path
        String omPath = LOM_PATH + definitionsName.replaceAll(" ", "_") + "-" + om.hashCode()+ ".lom"; // processId
        ObjectSaver saver = new ObjectSaver(omPath);
        saver.saveObject(om);
        // create the BPMN diagram
        // save it and get the path
        AtomicReference<String> diagramPath = new AtomicReference<String>(EMPTY);
        // make a deployment
        Deployment d = new Deployment(definitionsName, omPath, diagramPath.get(), exData.getExtractPath());
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
            System.err.println("[Warning] Could not delete <" + path + ">");
            return false;
        }
        return true;
    }
}