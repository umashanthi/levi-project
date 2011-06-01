package org.levi.engine.runtime;

import org.apache.ode.jacob.vpu.ExecutionQueueImpl;
import org.apache.ode.jacob.vpu.JacobVPU;
import org.hibernate.Hibernate;
import org.hibernate.engine.HibernateIterator;
import org.levi.engine.LeviException;
import org.levi.engine.bpmn.BPMNJacobRunnable;
import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.impl.bpmn.FlowNodeFactory;
import org.levi.engine.impl.bpmn.WaitedTask;
import org.levi.engine.impl.bpmn.parser.ProcessDefinition;
import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.process.hobj.ProcessInstanceBean;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.utils.LeviUtils;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProcessInstance extends BPMNJacobRunnable {
    private ProcessDefinition processDefinition;
    private boolean isRunning;
    private ExecutionQueueImpl soup;
    private JacobVPU vpu;
    private FlowNodeFactory flowNodeFac;
    private Map<String, Object> variables;
    private Map<String, WaitedTask> waitedTasks;
    private ArrayList<String> runningTaskIds;
    private ArrayList<String> completedTaskIds;
    private String processId;
    private String processDefId;
    private List<String> pauseSignals;
    private List<String> resumeSignals;
    private boolean hasStartForm;
    private String startUserId;

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
        resumeSignals = LeviUtils.newArrayList();
        setIsRunning(false);
        hasStartForm = false;
    }

    private void init() {
        //TODO
        HibernateDao dao = new HibernateDao();
    }

    public void claim(String uid, String itemId) {
        if (itemId.equals(processDefinition.getStartEvent().getId())) {
            setStartUserId(uid);
        }
    }

    public String getStartUserId() {
        return startUserId;
    }

    public void setStartUserId(String startUserId) {
        this.startUserId = startUserId;
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
        if (builder.processId == null) {
            throw new IllegalArgumentException("Process Instance ID is null.");
        }
        processId = builder.processId;
        pauseSignals = LeviUtils.newArrayList();
        resumeSignals = LeviUtils.newArrayList();
        hasStartForm = false;
    }

    public String getProcessId() {
        return processId;
    }

    public String getDefinitionsId() {
        if (processDefId == null) {
            throw new NullPointerException("ProcessDefID is null.");
        }
        return processDefId;
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
                if (startEvent.hasInputForm()) {
                    pause(startEvent.getId());
                } else {
                    instance(startEvent);
                }
            } else {
                // todo check if all the
                //for (String id : (ArrayList<String>) runningTaskIds.clone()) {
                if (resumeSignals.size() > 1) {
                    throw new RuntimeException("More than one resume signals found.");
                }
                flowNodeFac.getNextNode(resumeSignals.get(0)).resumeTask();
                //instance(node);
                //soup.enqueueReaction(new Continuation(node, m, null));
                //vpu.addReaction(node, m, null, "description");
                //node.resumeTask();
                //}
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

    public void setVariables(Map<String, Object> variables) {
        if (variables == null) {
            throw new NullPointerException("Variables map is null.");
        }
        variables.putAll(variables);
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
            if (!runningTaskIds.contains(id)) {
                runningTaskIds.add(id);
            }

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
            HibernateDao dao = new HibernateDao();
            TaskBean taskBean = (TaskBean) dao.getObject(TaskBean.class, taskId);
            assert taskBean != null;
            ProcessInstanceBean processInstanceBean = taskBean.getProcesseInstance();
            setIsRunning(false);
            System.out.println("Running  :   " + runningTaskIds.toString());
            System.out.println("Completed: " + completedTaskIds.toString());
            //System.out.println("variables: " + variables.toString());
            //resume();
            while (soup.hasReactions()) {
                System.out.println("Removing reactions from the soup.");
                soup.dequeueReaction();
            }
            if (soup.isComplete()) {
                TaskBean taskBeanObj;
                for (String id : runningTaskIds) {
                    taskBeanObj = (TaskBean) dao.getObject(TaskBean.class, id);
                    processInstanceBean.addToRunningTask(taskBeanObj);  // adding all running task beans to the processInstance
                }
                for (String id : completedTaskIds) {
                    taskBeanObj = (TaskBean) dao.getObject(TaskBean.class, id);
                    processInstanceBean.addToCompletedTask(taskBeanObj);  // adding all completed task beans to the processInstance
                }
                dao.update(processInstanceBean);
                System.out.println("Writing the processs to the database.");
            } else {
                throw new RuntimeException("Incomplete Runtime soup. Cannot pause the process instance.");
            }
            addRunning(taskId);
            dao.close();
        }
    }

    private boolean checkPauseSignal(String taskId) {
        if (taskId == null) {
            throw new NullPointerException("TaskId is null.");
        }
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

    private boolean checkResumeSignal(String taskId) {
        if (taskId == null) {
            throw new NullPointerException("TaskId is null.");
        }
        synchronized (resumeSignals) {
            if (!resumeSignals.contains(taskId)) {
                resumeSignals.add(taskId);
            }
            synchronized (runningTaskIds) {
                if (runningTaskIds.contains(taskId)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void resume() {
        System.out.println("Retrieved process data from the database.");
        execute();
        //setIsRunning(true);
    }

    public void resume(String taskId) {
        System.out.println("Retrieved process data from the database.");
        if (checkResumeSignal(taskId)) {
            if (isRunning()) {
                flowNodeFac.getNextNode(taskId).resumeTask();
            } else {
                execute();
            }
        }
        //setIsRunning(true);
    }

    private synchronized boolean isRunning() {
        return isRunning;
    }

    private synchronized void setIsRunning(boolean value) {
        isRunning = value;
    }

    public boolean hasStartForm() {
        return hasStartForm;
    }
}