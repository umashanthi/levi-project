package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.db.DBManager;
import org.levi.engine.impl.db.DBManagerImpl;
import org.levi.engine.runtime.ProcessInstance;
import org.omg.spec.bpmn.x20100524.model.TUserTask;


/**
 * @author Ishan Jayawardena
 */
public class UserTask extends RunnableFlowNode {
    private final TUserTask task;
    private final ProcessInstance processInstance;
    private final boolean hasInputForm;

    public static class Builder {
        private FlowNodeFactory flowNodeFac;
        private TUserTask task;
        private ProcessInstance process;

        public Builder(TUserTask task) {
            this.task = task;
        }

        public Builder processInstance(ProcessInstance process) {
            this.process = process;
            return this;
        }

        public UserTask build() {
            return new UserTask(this);
        }
    }

    private UserTask(Builder builder) {
        this.task = builder.task;
        this.processInstance = builder.process;
        //TResourceRole[] resourceRoles = task.getResourceRoleArray();
        //if (resourceRoles[0] instanceof TPotentialOwner) {
        //    TPotentialOwner potentialOwner = (TPotentialOwner)resourceRoles[0];
        //    potentialOwner.getResourceAssignmentExpression().getExpression();
        //}
        //THumanPerformer humanPerformer = (THumanPerformer)resourceRoles[1];
        //humanPerformer.getResourceAssignmentExpression().getExpression();
        hasInputForm = task.getInputForm() != null;
        // todo check and write the input form data.
        if (hasInputForm()) {
            persistUserTask();
        }
    }

    private void persistUserTask() {
        //TODO rename this to Persist() 
        DBManager manager = new DBManagerImpl();
        manager.persistUserTask(this);
    }

    public void run() {
        processInstance.addRunning(getId());
        // get the details
        System.out.println("UserTask run(): Getting the task details.");
        // write them to the db
        System.out.println("UserTask run(): Wrote details to the db.");
        // see if a form is there
        System.out.println("UserTask run(): Checking for an input form.");
        // if yes then create a waitedtask and wait for it
        System.out.println("UserTask run(): Creating the waited task for the form.");
        System.out.println("UserTask run(): Waiting for the form reply...");
        //WaitedTaskChannel channel = newChannel(WaitedTaskChannel.class, "channel");
        //WaitedTask task = new WaitedTask(channel);
        //processInstance.addWaitedTask(getTaskId(), task);
        //instance(task);
        // todo:
        if (hasInputForm()) {
            System.out.println("Usertask hasInputForm. Pause.");
            processInstance.pause(getId());
        } //else {
        //    resumeTask();
        //}
        /*
        object(new WaitedTaskChannelListener(channel) {
            @Override
            public void resume(Map<String, Object> vars) {
                System.out.println("UserTask run(). done." + vars.toString());
                System.out.println("UserTask run(). saving the variables.");
                processInstance.getVariables().putAll(vars);
                resumeTask();
            }
        }); */


    }

    public String getId() {
        return task.getId();
    }

    public TUserTask getTTask(){
        return task;
    }

    public ProcessInstance getProcessInstance(){
        return processInstance;
    }

    public void resumeTask() {
        // todo this is what must happen when
        // processInstance.getVariables().putAll(vars);
        System.out.println("Resuming user task id " + getId());
        instance(processInstance.executeNext(this));
        processInstance.addCompleted(getId());

    }

    // todo
    public boolean hasInputForm() {
        return hasInputForm;
    }
}
