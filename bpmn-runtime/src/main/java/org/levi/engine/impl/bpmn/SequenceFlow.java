package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.RunnableFlowNode;

public class SequenceFlow {
    private RunnableFlowNode _parent;
    private RunnableFlowNode _child;

    public SequenceFlow(RunnableFlowNode parent, RunnableFlowNode child) {
        _parent = parent;
        _child = child;
    }
}