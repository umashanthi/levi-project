package org.levi.engine.impl;

import org.levi.engine.Deployment;
import org.levi.engine.EngineData;
import org.levi.engine.LeviException;
import org.levi.engine.RuntimeService;
import org.levi.engine.impl.bpmn.parser.ObjectModel;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.ObjectLoader;

import java.io.IOException;
import java.util.List;

public class RuntimeServiceImpl implements RuntimeService {
    private EngineData engineData;

    public RuntimeServiceImpl(EngineData engineData) {
        assert engineData != null;
        this.engineData = engineData;
    }

    public boolean start() {
        System.out.println("[Info] Runtime Service started");
        return true;
    }

    public boolean stop() {
        System.out.println("[Info] Runtime Service stopped");
        return true;
    }

    // TODO path != uri, Path.toUri()
    public void startProcess(String processId)
            throws IOException, ClassNotFoundException {
        assert processId != null;
        if (engineData.isRunning(processId)) {
            throw new LeviException("Process already running : "+ processId);
        }
        // check if the om is available for this process id
        Deployment dep = engineData.getDeployment(processId);
        if (dep == null) {
            throw new LeviException("No deployment found for : " + processId);
        }
        // get the path of the om
        String omPath = dep.getOmPath();
        // read it in
        ObjectLoader loader = new ObjectLoader(omPath);
        ObjectModel om = (ObjectModel)loader.readNextObject();
        if (om == null) {
            throw new LeviException("Retrieved OM is null");
        }
        // create a new process instance with that om
        ProcessInstance p = new ProcessInstance(om);
        // record this as a running process
        engineData.addProcessInstance(processId, p);
        System.out.println("[Info] Process running : " + processId );
        // run it
        p.execute();
    }

    public void stopProcess(String processId) {
        
    }

    public void showRunningProcess() {
        System.out.println("Running processes:");
        List<String> runningProcesses = engineData.getRunningProcessIds();
        for (String id : runningProcesses) {
            System.out.println("  " + id);
        }
    }
}
