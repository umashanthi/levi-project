package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.Gateway;
import org.omg.spec.bpmn.x20100524.model.TGateway;
import org.omg.spec.bpmn.x20100524.model.TParallelGateway;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.ArrayList;
import java.util.List;

public final class ParallelGateway implements Gateway {
    private final TParallelGateway gateway;
    private final GatewayNode gatewayNode;
    private final List<TSequenceFlow> output;

    public ParallelGateway(TParallelGateway gateway, GatewayNode gatewayNode) {
        assert gateway != null;
        assert gatewayNode != null;
        this.gateway = gateway;
        this.gatewayNode = gatewayNode;
        output = new ArrayList<TSequenceFlow>(this.gatewayNode.getOutgoingSeqFlowSet().size());
    }

    public TGateway getType() {
        return gateway;
    }

    public List<TSequenceFlow> evaluate() {
        System.out.println("<Parallel Gateway " + gateway.getName() + " Evaluating>");
        output.clear();
        if (compare()) {
            for (int i = gatewayNode.getOutgoingSeqFlowSet().size()-1; i >= 0; --i) {
                output.add(gatewayNode.getOutgoingSeqFlowSet().get(i));
            }
        } else {
            //System.out.println(" not done...");
        }
        return output;
    }

    public String getId() {
        return gateway.getId();
    }

    public TSequenceFlow getSeqFlowByTargetRef(String id) {
        return gatewayNode.getOutgoingSeqFlowSet().getByTargetRef(id);
    }

    private boolean compare() {
        List<String> incomingTokens = gatewayNode.getIncomingTokens();
        SequenceFlowSet incomingSeqFlowSet = gatewayNode.getIncomingSeqFlowSet();
        boolean result = false;
        if (incomingTokens.size() == incomingSeqFlowSet.size()) {
            for (int i = incomingSeqFlowSet.size() - 1; i >= 0; --i) {
                for (String token : incomingTokens) {
                    if (token.equals(incomingSeqFlowSet.get(i).getId())) {
                        result = true;
                        break;
                    }
                    result = false;
                }
                if (!result) {
                    throw new IllegalArgumentException("incoming sequence flows unmatched");
                }
            }
        } else {
            //System.err.println("<Parallel Gateway Still waiting for other tokens>");
        }
        if (result) {
            incomingTokens.clear();
        }
        return result;
    }
}
