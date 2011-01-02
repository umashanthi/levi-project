package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.Event;
import org.omg.spec.bpmn.x20100524.model.TStartEvent;

public class StartEvent extends Event {
    FlowNodeFactory flowNodeFac;
    TStartEvent startEvent;

    public StartEvent(TStartEvent startEvent, FlowNodeFactory flowNodeFac) {
        super();
        assert startEvent != null;
        assert flowNodeFac != null;
        this.startEvent = startEvent;
        this.flowNodeFac = flowNodeFac;
    }

    public String getId() {
        return startEvent.getId();
    }
    public void run() {
        System.out.println(this.getClassName());

        instance(flowNodeFac.getNextNode(this));
    }
}