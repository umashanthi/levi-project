package org.levi.engine.bpmn;

import org.apache.ode.jacob.JacobRunnable;

/**
 * @author Ishan Jayawardena
 */
public abstract class RunnableFlowNode extends JacobRunnable implements FlowNode {
    protected StringBuffer buffer = new StringBuffer();
}
