package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.Gateway;
import org.levi.samples.utils.UserInput;
import org.omg.spec.bpmn.x20100524.model.TExclusiveGateway;
import org.omg.spec.bpmn.x20100524.model.TGateway;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.ArrayList;
import java.util.List;

public final class ExclusiveGateway implements Gateway {
    private final TExclusiveGateway gateway;
    private final GatewayNode gatewayNode;
    private final List<TSequenceFlow> output;

    public ExclusiveGateway(TExclusiveGateway gateway, GatewayNode gatewayNode) {
        this.gateway = gateway;
        this.gatewayNode = gatewayNode;
        output = new ArrayList<TSequenceFlow>(1); // because it can have only a single result
    }

    public TGateway getType() {
        return gateway;
    }

    public List<TSequenceFlow> evaluate() {
        System.out.println("<Exclusive Gateway " + gateway.getName() + " Evaluating>");
        output.clear();
        compare(); // TODO where should this go? this place is the right place
        if (gatewayNode.isDiverging()
            || gatewayNode.isConverging()
            || gatewayNode.isMixed()
            || gatewayNode.isUnspecified()) { //for exclusive gateway, all these are similar
            if (gatewayNode.getOutgoingSeqFlowSet().size() == 1) {// typical converging case
                output.add(gatewayNode.getOutgoingSeqFlowSet().get(0));
            } else { //typical diverging case
                // TODO evaluate!
                int which = UserInput.read(gatewayNode.getOutgoingSeqFlowSet().size());
                output.add(gatewayNode.getOutgoingSeqFlowSet().get(which));
            }
            return output;
        } else {
            throw new IllegalArgumentException("Invalid gateway direction: Exclusive Gateway");
        }
    }

    public String getId() {
        return gateway.getId();
    }

    public TSequenceFlow getSeqFlowByTargetRef(String id) {
        return gatewayNode.getOutgoingSeqFlowSet().getByTargetRef(id);
    }

    private void compare() {
        List<String> incomingTokens = gatewayNode.getIncomingTokens();
        SequenceFlowSet incomingSeqFlowSet = gatewayNode.getIncomingSeqFlowSet();
        assert incomingTokens.size() <= incomingSeqFlowSet.size();
        for (int i = incomingSeqFlowSet.size() - 1; i >= 0; --i) {
            for (String token : incomingTokens) {
                if (token.equals(incomingSeqFlowSet.get(i).getId())) {
                    incomingTokens.clear();
                    return;
                }
            }
        }
        throw new IllegalArgumentException("incoming sequence flows unmatched");
    }
}
