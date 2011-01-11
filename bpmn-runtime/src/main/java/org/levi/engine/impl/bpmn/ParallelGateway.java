package org.levi.engine.impl.bpmn;

import org.omg.spec.bpmn.x20100524.model.TParallelGateway;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.ArrayList;
import java.util.List;

public final class ParallelGateway extends Gateway {
    private final List<TSequenceFlow> output;

    public ParallelGateway(TParallelGateway gateway, FlowNodeFactory factory) {
        super(gateway, factory);
        output = new ArrayList<TSequenceFlow>(super.outgoingSeqFlowSet.size());
    }

    public List<TSequenceFlow> evaluate() {
        System.out.println("<Parallel Gateway " + getName() + " Evaluating>");
        output.clear();
        if (compare()) {
            for (int i = outgoingSeqFlowSet.size()-1; i >= 0; --i) {
                output.add(outgoingSeqFlowSet.get(i));
            }
        } else {
            //System.out.println(" not done...");
        }
        return output;
    }

    private boolean compare() {
        boolean result = false;
        if (incomingTokens.size() == incomingSeqFlowSet.size()) {
            for (TSequenceFlow sf : incomingSeqFlowSet) {
                for (String token : incomingTokens) {
                    if (token.equals(sf.getId())) {
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

    @Override public String toString() {
        String out = "{";
        out += "ParallelGateway: " + getId() + "}";
        return out;
    }
}
