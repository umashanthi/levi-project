package org.levi.engine.impl;

import org.levi.engine.Deployment;
import org.levi.engine.EngineData;
import org.levi.engine.StorageService;
import org.levi.engine.impl.bpmn.parser.ObjectModel;
import org.levi.engine.utils.ObjectSaver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class StorageServiceImpl implements StorageService {
    private EngineData engineData;

    // TODO: add a stop() method
    // TODO; keep track of created deployments and actual deployments
    // then check if all the created ones are deployed. if not, delete
    // the undeployed ones, in the stop method.
    public void init() {
        System.out.println("Storage Service Initializing...") ;
    }

    /**
     * Removes a deployed process
     * @param processId
     */
    public void remove(String processId) {
    }

    /**
     * Removes all deployed processes
     */
    public void clearAll() {
    }

    /**
     * Get the list of deployed processes
     */
    public List<String> getDeployedProcessList() {
         return engineData.getDeploymentPIds();
    }

    public void showDeployedProcessList() {
        System.out.println("Deployed processes:");
        List<String> deploymentPids = engineData.getDeploymentPIds();
        Map<String, String> deployedLars = engineData.getDeployedLarPaths();
        for (String id : deploymentPids) {
            System.out.println("  " + id + " " + deployedLars.get(id));
        }
    }

    public boolean deploy(Deployment d) {
        if (d == null) {
            return false;
        }
        engineData.addDeployment(d);
        System.out.println("[Info] Process <" + d.getProcessId() + "> was successfully deployed");
        return true;
    }

    public StorageServiceImpl(EngineData engineData) {
        assert engineData != null;
        this.engineData = engineData;
    }
    
    public Deployment createDeployment(String larPath)
            throws IOException {
        // check if this larPath has a previous deployment
        if (engineData.hasLarPath(larPath)) {
            System.out.println("[Warning] The Lar in <"+ larPath + "> has already been deployed...");
            return null;
        }
        // extract the lar
        // get the BPMN file path
        String processURI  = larPath; // todo; for now only
        // create the om
        ObjectModel om = new ObjectModel(new File(processURI));
        // get the process name
        String processId = om.getProcessName();
        if (processId.equals(null) || processId.equals("")) {
            throw new RuntimeException("[Error] Cannot deploy a process with no/empty name");
        }
        if (engineData.hasDeployment(processId)) { //deployments.containsKey(processId)
            System.out.println("[Warning] Process <"+processId + "> has already been deployed...");
            return null;
        }
        // serialize it and get the path
        String path0 = "/home/ishan/devel/levi/serial/";
        String omPath = path0 + processId + "-" + om.hashCode()+ ".lom";
        ObjectSaver saver = new ObjectSaver(omPath);
        saver.saveObject(om);
        // create the BPMN diagram
        // save it and get the path
        String diagramPath = "empty";
        // make a deployment
        Deployment d = new Deployment(processId, omPath, diagramPath, larPath);        
        return d;
    }
}
