package org.levi.bpmn.runtime;

import org.levi.bpmn.runtime.event.NodeFactory;


/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 3:46:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class InclusiveGateway extends Gateway {
    NodeFactory _nodeFac;

    public InclusiveGateway(NodeFactory nodeFac) {
        super();
        _nodeFac = nodeFac;
    }
    public void run() {
        System.out.println(this.getClassName());
    }
}
