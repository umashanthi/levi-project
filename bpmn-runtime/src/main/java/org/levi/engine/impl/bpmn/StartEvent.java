package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.Event;
import org.levi.engine.runtime.ProcessInstance;
import org.omg.spec.bpmn.x20100524.model.TStartEvent;

/**
 * @author Ishan Jayawardena
 */
public class StartEvent extends Event {
    private final ProcessInstance processInstance;
    private final TStartEvent startEvent;

    public static class Builder {
        private ProcessInstance process;
        private TStartEvent se;

        public Builder(TStartEvent startEvent) {
            this.se = startEvent;
        }

        public Builder processInstance(ProcessInstance process) {
            this.process = process;
            return this;
        }
        public StartEvent build() {
            return new StartEvent(this);    
        }
    }
    private StartEvent(Builder builder) {
        this.startEvent = builder.se;
        this.processInstance = builder.process;
    }

    public String getId() {
        return startEvent.getId();
    }

    public void run() {
        // todo see if a form is present and pause accordingly
        processInstance.addRunning(getId());
        resumeTask();
    }

    @Override
    public void resumeTask() {
        instance(processInstance.executeNext(this));
        processInstance.addCompleted(getId());
    }

    public String toString() {
        String out = "{";
        out += "startEvent: " + startEvent;
        out += "}";
        return out;
    }
}