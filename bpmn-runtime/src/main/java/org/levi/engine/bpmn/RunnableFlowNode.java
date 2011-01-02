package org.levi.engine.bpmn;

import org.apache.ode.jacob.JacobRunnable;
import org.levi.engine.bpmn.FlowNode;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Dec 24, 2010
 * Time: 12:44:10 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class RunnableFlowNode extends JacobRunnable implements FlowNode {
    protected StringBuffer buffer = new StringBuffer();
}
