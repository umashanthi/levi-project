package org.levi.bpmn.runtime;

import org.apache.ode.jacob.examples.bpmn20.event.NodeFactory;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 3:59:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class StartEvent extends Event {
    NodeFactory _nodeFac;

    public StartEvent(NodeFactory nodeFac) {
        super();
        _nodeFac = nodeFac;
    }
    public void run() {
        System.out.println(this.getClassName());
        instance(_nodeFac.createNextNode());
    }
}

