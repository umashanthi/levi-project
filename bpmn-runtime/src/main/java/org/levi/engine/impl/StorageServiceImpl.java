package org.levi.engine.impl;

import org.levi.engine.*;
import org.levi.engine.impl.bpmn.parser.ProcessDefinition;
import org.levi.engine.utils.ExtractData;
import org.levi.engine.utils.Extractor;
import org.levi.engine.utils.LeviUtils;
import org.levi.engine.utils.ObjectSaver;
import org.levi.visualize.api.GraphViz;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author Ishan Jayawardena
 */
public class StorageServiceImpl implements StorageService {
    private EngineData engineData;
    // todo: make the dirs of serial, extract if not exsisting
    private List<Deployment> createdDeployments = LeviUtils.newArrayList(50);

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
        System.out.println("[Info] Deployed : " + d.getDefinitionsId());
        return true;
    }

    public Deployment deploy() {
        Deployment d = createdDeployments.remove(0);
        if (d == null) {
            throw new LeviException("Null Deployment. Deployment failed.");
        }
        engineData.addDeployment(d);
        System.out.println("[Info] Deployed : " + d.getDefinitionsId());
        return d;
    }

    public void undeploy(String id) throws IOException {
        undeploy(engineData.getDeployment(id));
    }

    public String getDiagramPath(String id) {
        String path = engineData.getDeployment(id).getDiagramPath();
        if (path == null | path == Constants.EMPTY) {
            throw new LeviException("No diagram found for definitions id " + id);
        }
        return path;
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
        } else {
            throw new LeviException("Attempt to undeploy an untracked deployment : " + d.getDefinitionsId());
        }
    }

    public boolean stop() throws IOException {
        cleanup();
        System.out.println("[Info] Storage Service stopped.");
        return true;
    }

    public void cleanup() throws IOException {
        for (Deployment d : createdDeployments) {
            deleteDeploymentData(d);
        }
    }

    private static void deleteDeploymentData(Deployment d)
            throws IOException {
        //delete(Constants.ENGINEDATA_PATH, false);
        //if (!Constants.EMPTY.equals(d.getDiagramPath())) {
        //    delete(d.getDiagramPath(), false);
        //}
        delete(d.getExtractPath(), true);
        // delete other stuff: processdef, pic
        delete(d.getProcessDefinitionPath(), false);

    }

    public StorageServiceImpl(EngineData engineData) {
        assert engineData != null;
        this.engineData = engineData;
    }

    public StorageService createDeployment(String larPath)
            throws IOException {
        // todo delete this lar after this
        ExtractData exData = Extractor.extract(larPath);
        if (exData == null) {
            throw new LeviException("Could not extract Levi archive: " + larPath);
        }
        String processURI = exData.getBPMNFiles().get(0);
        try {
            ProcessDefinition processDefinition = new ProcessDefinition(new File(processURI));

            String definitionsId = processDefinition.getDefinitionsId();
            if (engineData.hasDeployment(definitionsId)) {
                delete(exData.getExtractPath(), true);
                throw new LeviException("Process already deployed : " + definitionsId);
            }
            String omPath = Constants.LOM_PATH + definitionsId + Constants.LOM_EXTENSION;
            ObjectSaver saver = new ObjectSaver(omPath);
            saver.saveObject(processDefinition);
            GraphViz diagram = new GraphViz();
            String diagramPath = diagram.getGraph(processDefinition, exData.getExtractPath() + definitionsId);
            int start = diagramPath.indexOf(Constants.LEVI_ENGINE);
            int end = diagramPath.length();
            // TODO we must save the details of exData aswell
            Deployment d = new Deployment(definitionsId,
                    omPath, diagramPath.substring(start, end),
                    exData.getExtractPath(), new Date());
            createdDeployments.add(d);
        } catch (LeviException e) {
            delete(exData.getExtractPath(), true);
            throw e;

        }
        return this;
    }

    /**
     * deletes the content at path
     *
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