package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.RunnableFlowNode;

/**
 * @author Ishan Jayawardena
 */
public class SequenceFlow {
    private RunnableFlowNode parent;
    private RunnableFlowNode child;

    public SequenceFlow(RunnableFlowNode parent, RunnableFlowNode child) {
        this.parent = parent;
        this.child = child;
    }
}