package org.levi.engine.impl.bpmn;


import org.levi.engine.bpmn.Event;
import org.levi.engine.bpmn.FlowNode;
import org.levi.engine.runtime.ProcessInstance;
import org.omg.spec.bpmn.x20100524.model.TEndEvent;

/**
 * @author Ishan Jayawardena
 */
public class EndEvent extends Event implements FlowNode {
    private final TEndEvent endEvent;
    private final ProcessInstance processInstance;

    public static class Builder {
        private TEndEvent ee;
        private ProcessInstance process;
        
        public Builder(TEndEvent endEvent) {
            ee = endEvent;
        }
        public Builder processInstance(ProcessInstance process) {
            this.process = process;
            return this;
        }
        public EndEvent build() {
            return new EndEvent(this);
        }
    }

    private EndEvent(Builder builder) {
        this.endEvent = builder.ee;
        this.processInstance = builder.process;
    }

    public void run() {
        System.out.println(this.getClassName());
    }

    public String getId() {
        return endEvent.getId();
    }

    public void resumeTask() {
        System.out.println("EndEvent: resumeTask().");
    }
}
