package org.levi.engine.impl;

import org.levi.engine.Deployment;
import org.levi.engine.EngineData;
import org.levi.engine.LeviException;
import org.levi.engine.RuntimeService;
import org.levi.engine.impl.bpmn.parser.ProcessDefinition;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.ObjectLoader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public class RuntimeServiceImpl implements RuntimeService {
    private EngineData engineData;

    public RuntimeServiceImpl(EngineData engineData) {
        if (engineData == null) {
            throw new LeviException("EngineData is null.");
        }
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

    public void startProcessByDefinitionsName(String definitionsName, Map<String, Object> variables)
            throws ClassNotFoundException, IOException {
        startProcess(String.valueOf(definitionsName.hashCode()), variables);
    }

    // TODO path != uri, Path.toUri()
    public void startProcess(String definitionsId, Map<String, Object> variables)
            throws IOException, ClassNotFoundException {
        assert definitionsId != null;
        if (engineData.isRunning(definitionsId)) {
            throw new LeviException("Process already running : "+ definitionsId);
        }
        // check if a deployment is available for this process id
        Deployment deployment = engineData.getDeployment(definitionsId);
        if (deployment == null) {
            throw new LeviException("No deployment found for : " + definitionsId);
        }
        // get the path of the processdef
        String definitionPath = deployment.getProcessDefinitionPath();
        // read it in
        ObjectLoader loader = new ObjectLoader(definitionPath);
        ProcessDefinition processDefinition = (ProcessDefinition)loader.readNextObject();
        if (processDefinition == null) {
            throw new LeviException("Retrieved process definition is null");
        }
        // create a new process instance with that processDefinition
        ProcessInstance processInstance = new ProcessInstance(processDefinition, variables);

        System.out.println("[Info] Process running : " + definitionsId);
        // run it
        if (variables != null) {
            variables.put("processInstance", processInstance);     // todo process instance variable name
        }
        processInstance.execute();
        // record this as a running process
        engineData.addProcessInstance(definitionsId, processInstance);
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
