package org.levi.engine.impl.bpmn;


import org.levi.engine.bpmn.Event;
import org.levi.engine.bpmn.FlowNode;
import org.omg.spec.bpmn.x20100524.model.TEndEvent;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 4:01:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class EndEvent extends Event implements FlowNode {
    private TEndEvent endEvent;
    public EndEvent(TEndEvent endEvent) {
        super();
        this.endEvent = endEvent;
    }

    public void run() {
        System.out.println(this.getClassName());
    }

    public String getId() {
        return endEvent.getId();
    }
}
