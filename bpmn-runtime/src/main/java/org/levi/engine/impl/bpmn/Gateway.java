package org.levi.engine.impl.bpmn;

import org.levi.engine.LeviException;
import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;
import org.omg.spec.bpmn.x20100524.model.TGateway;
import org.omg.spec.bpmn.x20100524.model.TGatewayDirection;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.List;

/**
 * @author Ishan Jayawardena
 */
public abstract class Gateway extends RunnableFlowNode {
    private final TGateway gateway;
    protected final ProcessInstance processInstance;
    protected final SequenceFlowSet incomingSeqFlowSet;
    protected final SequenceFlowSet outgoingSeqFlowSet;
    protected final List<String> incomingTokens;
    protected final int gatewayDirection;
    
    public Gateway(TGateway gateway, ProcessInstance processInstance) {
        if (gateway == null) {
            throw new LeviException("Gateway is null.");
        }
        this.processInstance = processInstance;
        this.gateway = gateway;
        this.incomingSeqFlowSet = processInstance.getObjectModel().getTargetSequenceFlowSet(this.gateway.getId());
        this.outgoingSeqFlowSet = processInstance.getObjectModel().getSourceSequenceFlowSet(this.gateway.getId());
        incomingTokens = LeviUtils.newArrayList(incomingSeqFlowSet.size());
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
            instance(processInstance.executeNext(result));
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

