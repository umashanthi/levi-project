package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.RunnableFlowNode;
import org.omg.spec.bpmn.x20100524.model.TGateway;
import org.omg.spec.bpmn.x20100524.model.TGatewayDirection;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.ArrayList;
import java.util.List;

public abstract class Gateway extends RunnableFlowNode {
    private final TGateway gateway;
    protected final FlowNodeFactory flowNodeFactory;
    protected final SequenceFlowSet incomingSeqFlowSet;
    protected final SequenceFlowSet outgoingSeqFlowSet;
    protected final List<String> incomingTokens;
    protected final int gatewayDirection;
    
    public Gateway(TGateway gateway, FlowNodeFactory flowNodeFactory) {
        assert gateway != null;
        assert flowNodeFactory !=  null;
        
        this.flowNodeFactory = flowNodeFactory;
        this.gateway = gateway;
        this.incomingSeqFlowSet = this.flowNodeFactory.getTargetSequenceFlowSet(this.gateway.getId());
        this.outgoingSeqFlowSet = this.flowNodeFactory.getSourceSequenceFlowSet(this.gateway.getId());
        incomingTokens = new ArrayList<String>(incomingSeqFlowSet.size());
        gatewayDirection = this.gateway.getGatewayDirection().intValue();
    }

    public String getId() {
        return gateway.getId();
    }

    public String getName() {
        return gateway.getName();
    }

    public void insertToken(String id) {
        // TODO first check for duplicates
        if (!incomingTokens.contains(id)) {
            incomingTokens.add(id);
        } else {
            throw new IllegalStateException("Inserting already existing seq flow");
        }
    }

    public abstract List<TSequenceFlow> evaluate();

    public void run() {
        List<TSequenceFlow> output = evaluate();
        for (TSequenceFlow result : output) {
            instance(flowNodeFactory.getNextNode(result));
        }
    }
    
    public boolean isConverging() {
        return gatewayDirection == TGatewayDirection.INT_CONVERGING;
    }

    public boolean isDiverging() {
        return gatewayDirection == TGatewayDirection.INT_DIVERGING;
    }

    public boolean isMixed() {
        return gatewayDirection == TGatewayDirection.INT_MIXED;
    }

    public boolean isUnspecified() {
        return gatewayDirection == TGatewayDirection.INT_UNSPECIFIED;
    }
}

