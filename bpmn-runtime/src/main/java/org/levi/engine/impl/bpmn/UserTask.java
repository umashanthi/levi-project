package org.levi.engine.impl.bpmn;


import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.runtime.ProcessInstance;
import org.omg.spec.bpmn.x20100524.model.TTask;

/**
 * @author Ishan Jayawardena
 */
public class UserTask extends RunnableFlowNode {
    private final TTask task;
    private final ProcessInstance processInstance;

    public static class Builder {
        private FlowNodeFactory flowNodeFac;
        private TTask task;
        private ProcessInstance process;

        public Builder(TTask task) {
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
    }

    public void run() {
        System.out.println(task.getName());
        instance(processInstance.executeNext(this));
    }

    public String getId() {
        return task.getId();
    }
}
