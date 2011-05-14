package org.levi.engine.runtime;

import org.apache.ode.jacob.vpu.ExecutionQueueImpl;
import org.apache.ode.jacob.vpu.JacobVPU;
import org.levi.engine.LeviException;
import org.levi.engine.bpmn.BPMNJacobRunnable;
import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.impl.bpmn.FlowNodeFactory;
import org.levi.engine.impl.bpmn.WaitedTask;
import org.levi.engine.impl.bpmn.parser.ProcessDefinition;
import org.levi.engine.utils.LeviUtils;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProcessInstance extends BPMNJacobRunnable {
    ProcessDefinition processDefinition;
    Boolean isRunning;
    ExecutionQueueImpl soup;
    JacobVPU vpu;
    FlowNodeFactory flowNodeFac;
    Map<String, Object> variables;
    Map<String, WaitedTask> waitedTasks;
    ArrayList<String> runningTaskIds;
    ArrayList<String> completedTaskIds;
    String processId;
    String processDefId;
    private List<String> pauseSignals;

    public ProcessInstance(ProcessDefinition processDefinition, Map<String, Object> variables) {
        if (processDefinition == null) {
            throw new LeviException("Cannot create a process instance. OM is null.");
        }
        this.processDefinition = processDefinition;
        this.variables = variables;
        flowNodeFac = new FlowNodeFactory(this.processDefinition, this);
        // todo; is the following processId ok?
        processDefId = processDefinition.getDefinitionsName();
        processId = String.valueOf(this.hashCode());
        waitedTasks = LeviUtils.newHashMap();
        runningTaskIds = LeviUtils.newArrayList();
        completedTaskIds = LeviUtils.newArrayList();
        pauseSignals = LeviUtils.newArrayList();
        setIsRunning(false);
    }
    // this is used by the ProcessInstanceManager class
    public static class Builder {
        private ProcessDefinition processDefinition;
        private Map<String, Object> variables;
        private Map<String, WaitedTask> waitedTasks;
        private ArrayList<String> runningElemIds;
        private ArrayList<String> completedElemIds;
        private String processId;

        public Builder(ProcessDefinition processDefinition) {
            this.processDefinition = processDefinition;
        }
        public Builder variables(Map<String, Object> variables) {
            this.variables = variables;
            return this;
        }
        public Builder waitedTasks(Map<String, WaitedTask> waitedTasks) {
            this.waitedTasks = waitedTasks;
            return this;
        }
        public Builder runningIds(ArrayList<String> ids) {
            runningElemIds = ids;
            return this;
        }
        public Builder completedIds(ArrayList<String> ids) {
            completedElemIds = ids;
            return this;
        }
        public Builder processId(String id) {
            processId = id;
            return this;
        }
        public ProcessInstance build() {
            return new ProcessInstance(this);
        }
    }

    private ProcessInstance(Builder builder) {
        processDefinition = builder.processDefinition;
        setIsRunning(false);
        flowNodeFac = new FlowNodeFactory(processDefinition, this);
        variables = builder.variables;
        waitedTasks = builder.waitedTasks;
        runningTaskIds = builder.runningElemIds;
        completedTaskIds = builder.completedElemIds;
        processDefId = processDefinition.getDefinitionsId();
        processId = builder.processId;
        pauseSignals = LeviUtils.newArrayList();
    }

    public String getProcessId() {
        return processId;
    }
    public void execute() {
        soup = new ExecutionQueueImpl(null);
        vpu = new JacobVPU();
        vpu.setContext(soup);
        vpu.inject(this);
        while (vpu.execute()) {
        }
    }

    public void run() {
        synchronized (runningTaskIds) {
            if (runningTaskIds.isEmpty()) {
                RunnableFlowNode startEvent = flowNodeFac.getStartEvent();
                instance(startEvent);
            } else {
                for (String id : (ArrayList<String>) runningTaskIds.clone()) {
                    flowNodeFac.getNextNode(id).resumeTask();
                    //instance(node);
                    //soup.enqueueReaction(new Continuation(node, m, null));
                    //vpu.addReaction(node, m, null, "description");
                    //node.resumeTask();
                }
            }
        }
        setIsRunning(true);
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public Object getVariable(String name) {
        if (name == null) {
            throw new LeviException("Variable name is null.");
        }
        return variables.get(name);
    }

    public Object setVariable(String name, Object value) {
        if (name == null) {
            throw new LeviException("Cannot save a variable with a null name");
        }
        if (variables == null) {
            return null;
        }
        return variables.put(name, value);
    }

    public RunnableFlowNode executeNext(RunnableFlowNode currentFlowNode) {
        return flowNodeFac.getNextNode(currentFlowNode);
    }

    public RunnableFlowNode executeNext(TSequenceFlow currentSeqFlow) {
        return flowNodeFac.getNextNode(currentSeqFlow);
    }

    public ProcessDefinition getObjectModel() {
        return processDefinition;
    }
    // TODO
    public void continueUserTask(String userTaskId, Map<String, Object> variables) {
        if (userTaskId == null) {
            throw new NullPointerException("User task id is null.");
        }
        waitedTasks.get(userTaskId).resume(variables);
    }

    public void addWaitedTask(String id, WaitedTask waitedTask) {
        if (id == null) {
            throw new NullPointerException("Task ID is null.");
        }
        waitedTasks.put(id, waitedTask);
    }

    public void addRunning(String id) {
        synchronized (runningTaskIds) {
            if (runningTaskIds.contains(id)) {
                throw new LeviException("Running processId is already added.") ;
            }
            runningTaskIds.add(id);
        }
    }

    public void addCompleted(String id) {
        synchronized (runningTaskIds) {
            if (!runningTaskIds.contains(id)) {
                throw new LeviException("No running element found for the processId " + id);
            }
            runningTaskIds.remove(id);
        }
        synchronized (completedTaskIds) {
            completedTaskIds.add(id);
        }
    }

    public synchronized List<String> getRunningTaskIds() {
        return runningTaskIds;
    }

    public synchronized List<String> getCompletedTaskIds() {
        return completedTaskIds;
    }

    public void pause(String taskId) {
        // todo check for the # runningTaskIds before actually pausing.
        if (checkPauseSignal(taskId)) {
            setIsRunning(false);
            System.out.println("Running: " + runningTaskIds.toString());
            System.out.println("Completed: " + completedTaskIds.toString());
            System.out.println("variables: " + variables.toString());
            //resume();
            while (soup.hasReactions()) {
                System.out.println("Removing reactions from the soup.");
                soup.dequeueReaction();
            }
            if (soup.isComplete()) {
                System.out.println("Writing the processs to the database.");
            } else {
                throw new RuntimeException("Incomplete Runtime soup. Cannot pause the process instance.");
            }
        }
    }

    private boolean checkPauseSignal(String taskId) {
        synchronized (pauseSignals) {
            if (!pauseSignals.contains(taskId)) {
                pauseSignals.add(taskId);
            }
            synchronized (runningTaskIds) {
                if (pauseSignals.size() == runningTaskIds.size()) {
                    return pauseSignals.containsAll(runningTaskIds);
                }
            }
        }
        return false;
    }

    public void resume() {
        System.out.println("Retrieved process data from the database.");
        execute();
        setIsRunning(true);
    }

    private synchronized  boolean isRunning() {
        return isRunning;
    }

    private synchronized void setIsRunning(boolean value) {
        isRunning = value;
    }
}