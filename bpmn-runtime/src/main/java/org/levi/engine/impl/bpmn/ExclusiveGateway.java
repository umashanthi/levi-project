package org.levi.engine.impl.bpmn;

import org.levi.samples.utils.UserInput;
import org.omg.spec.bpmn.x20100524.model.TExclusiveGateway;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.ArrayList;
import java.util.List;

public final class ExclusiveGateway extends Gateway {
    private final List<TSequenceFlow> output;

    public ExclusiveGateway(TExclusiveGateway gateway, FlowNodeFactory factory) {
        super(gateway, factory);
        output = new ArrayList<TSequenceFlow>(1); // because it can have only a single result
    }

    public List<TSequenceFlow> evaluate() {
        System.out.println("<Exclusive Gateway " + getName() + " Evaluating>");
        output.clear();
        compare(); // TODO where should this go? this place is the right place
        if (isDiverging()
            || isConverging()
            || isMixed()
            || isUnspecified()) { //for exclusive gateway, all these are similar
            if (outgoingSeqFlowSet.size() == 1) {// typical converging case
                output.add(outgoingSeqFlowSet.get(0));
            } else { //typical diverging case
                // TODO evaluate!
                int which = UserInput.read(outgoingSeqFlowSet.size());
                output.add(outgoingSeqFlowSet.get(which));
            }
            return output;
        } else {
            throw new IllegalArgumentException("Invalid gateway direction: Exclusive Gateway");
        }
    }

    private void compare() {
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

    @Override public String toString() {
        String out = "{";
        out += "ExclusiveGateway: " + getId() + "}";
        return out;
    }
}
