package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.RunnableFlowNode;
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
    }

    public void run() {
        processInstance.run(getId());
        System.out.println("Running UserTask: " + getId());
        if (hasInputForm()) {
            processInstance.save(this);
            System.out.println("Pause UserTask: " + getId());
            processInstance.pause(getId());
        } else {
            resumeTask();
        }
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
        System.out.println("Resuming UserTask: " + getId());
        instance(processInstance.executeNext(this));
        processInstance.complete(getId());

    }

    public boolean hasInputForm() {
        return hasInputForm;
    }


}
