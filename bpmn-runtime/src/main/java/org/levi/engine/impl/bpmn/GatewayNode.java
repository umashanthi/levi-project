package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.Gateway;
import org.levi.engine.bpmn.RunnableFlowNode;
import org.omg.spec.bpmn.x20100524.model.TGateway;
import org.omg.spec.bpmn.x20100524.model.TGatewayDirection;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.ArrayList;
import java.util.List;

public final class GatewayNode extends RunnableFlowNode {
    private final Gateway gateway;
    private final FlowNodeFactory flowNodeFactory;
    private final SequenceFlowSet incomingSeqFlowSet;
    private final SequenceFlowSet outgoingSeqFlowSet;
    private final List<String> incomingTokens;
    private final int gatewayDirection;

    public GatewayNode(TGateway gateway, FlowNodeFactory flowNodeFactory) {
        super();
        assert gateway != null;
        assert flowNodeFactory != null;
        // TODO check the validity of the parameters

        this.flowNodeFactory = flowNodeFactory;
        incomingSeqFlowSet = flowNodeFactory.getTargetSequenceFlowSet(gateway.getId());
        outgoingSeqFlowSet = flowNodeFactory.getSourceSequenceFlowSet(gateway.getId());
        gatewayDirection = gateway.getGatewayDirection().intValue();
        incomingTokens = new ArrayList<String>(incomingSeqFlowSet.size());
        this.gateway = GatewayFactory.newGateway(gateway, this);
    }

    public TGateway getGatewaType() {
        return gateway.getType();
    }

    public String getId() {
        return gateway.getId();
    }

    public void insertToken(String id) {
        // TODO first check for duplicates
        if (!incomingTokens.contains(id)) {
            incomingTokens.add(id);
        } else {
            throw new IllegalStateException("Inserting already existing seq flow");
        }
        //gateway.insertToken(id);
    }

    public List<String> getIncomingTokens() {
        return incomingTokens;
    }

    public SequenceFlowSet getIncomingSeqFlowSet() {
        return incomingSeqFlowSet;
    }

    public SequenceFlowSet getOutgoingSeqFlowSet() {
        return outgoingSeqFlowSet;
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

    @Override public void run() {
        List<TSequenceFlow> output = gateway.evaluate();
        //if (!isConverging() && output.isEmpty()) {// todo move this check inside exclusive gateway
        //    throw new IllegalArgumentException("empty evaluation result for gateway");
        //}
        for (TSequenceFlow result : output) {
            instance(flowNodeFactory.getNextNode(result));
        }
    }
}

