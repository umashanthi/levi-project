package org.levi.engine.impl;

import org.levi.engine.Deployment;
import org.levi.engine.EngineData;
import org.levi.engine.LeviException;
import org.levi.engine.RuntimeService;
import org.levi.engine.db.DBManager;
import org.levi.engine.impl.bpmn.parser.ProcessDefinition;
import org.levi.engine.impl.db.DBManagerImpl;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;
import org.levi.engine.utils.ObjectLoader;

import java.io.IOException;
import java.util.*;

/**
 * @author Ishan Jayawardena
 */
public class RuntimeServiceImpl implements RuntimeService {
    private EngineData engineData;
    private DBManager dbManager = new DBManagerImpl();

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

    public void startProcessByDefinitionsName(String definitionsName, Map<String, Object> variables, String userId)
            throws ClassNotFoundException, IOException {
        startProcess(String.valueOf(definitionsName.hashCode()), variables, userId);
    }

    // TODO path != uri, Path.toUri()
    public String startProcess(String definitionsId, Map<String, Object> variables, String userId)
            throws IOException, ClassNotFoundException {
        assert definitionsId != null;
        if (engineData.isRunning(definitionsId)) {
            throw new LeviException("Process already running : " + definitionsId);
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
        ProcessDefinition processDefinition = (ProcessDefinition) loader.readNextObject();
        if (processDefinition == null) {
            throw new LeviException("Retrieved process definition is null");
        }
        // create a new process instance with that processDefinition
        ProcessInstance processInstance = new ProcessInstance(processDefinition, variables);
      //  processInstance.setVariables(variables);
        processInstance.setStartUserId(userId);

        System.out.println("[Info] Process running : " + definitionsId);
        // run it
        if (variables != null) {
            variables.put("processInstance", processInstance);     // todo process instance variable name
        }

        // record this as a running process
        engineData.addProcessInstance(processInstance.getProcessId(), processInstance);
        dbManager.persistProcessInstance(processInstance);
        System.out.println("Started process  " + processInstance.getProcessId() + " " + definitionsId);
        processInstance.execute();
        return processInstance.getProcessId();
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

    public void claim(String pid, String uid, String itemId) {
        engineData.getProcessInstance(pid).claim(uid, itemId);
    }

    public void claimUserTask(String pid, String userTaskId, Map<String, Object> variables) {
        engineData.getProcessInstance(pid)
                .continueUserTask(userTaskId, variables);
    }

    public boolean resumeProcessInstance(String processId) {
        /*if (engineData.isRunning(processId)) {
            throw new RuntimeException("Process with id " + processId + " already running.");
        }*/
        System.out.println("Resuming process instance.");
        String definitionsId = dbManager.getProcessDefinition(processId);
        Deployment deployment = engineData.getDeployment(definitionsId);
        if (deployment == null) {
            throw new LeviException("No deployment found for : " + definitionsId);
        }
        // get the path of the processdef
        String definitionPath = deployment.getProcessDefinitionPath();
        // read it in
        ObjectLoader loader = null;
        try {
            loader = new ObjectLoader(definitionPath);
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        ProcessDefinition processDefinition = null;
        try {
            processDefinition = (ProcessDefinition) loader.readNextObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        if (processDefinition == null) {
            throw new LeviException("Retrieved process definition is null");
        }

        List<String> completed = dbManager.getCompletedTasks(processId);
        //completed.add("theStart");
        List<String> running = dbManager.getRunningTasks(processId);
        //running.add("theTask2");
        Map<String, Object> variables = LeviUtils.newHashMap();
        Map<String, String> processVariables = dbManager.getVariables(processId);
        if (processVariables != null) {
            for (String key : processVariables.keySet()) {
                variables.put(key, processVariables.get(key));
            }
        }
        ProcessInstance p = new ProcessInstance.Builder(processDefinition)
                .completedIds(completed)
                .runningIds(running)
                .processId(processId)
                .variables(variables)
                .build();
        p.resume(running.get(0));
        return true;
    }

    public void setVariable(String processId, String name, Object value) {
        if (name == null) {
            throw new NullPointerException("variable name is null.");
        }
        engineData.getProcessInstance(processId).setVariable(name, value);
    }

    public void setVariables(String processId, Map<String, Object> values) {
        engineData.getProcessInstance(processId).setVariables(values);
    }

    public Object getVariable(String processId, String name) {
        if (name == null) {
            throw new NullPointerException("variable name is null.");
        }
        return engineData.getProcessInstance(processId).getVariable(name);
    }

    public Map<String, Object> getVariables(String processId) {
        return engineData.getProcessInstance(processId).getVariables();
    }

    public boolean hasStartForm(String processId) {
        return engineData.getProcessInstance(processId).hasStartForm();
    }
}