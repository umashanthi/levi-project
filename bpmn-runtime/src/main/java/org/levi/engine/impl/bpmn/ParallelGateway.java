package org.levi.engine.impl.bpmn;

import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;
import org.omg.spec.bpmn.x20100524.model.TParallelGateway;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.List;

/**
 * @author Ishan Jayawardena
 */
public final class ParallelGateway extends Gateway {
    private final List<TSequenceFlow> output;

    public static class Builder {
        private TParallelGateway pg;
        private ProcessInstance process;

        public Builder(TParallelGateway pg) {
            this.pg = pg;
        }
        public Builder processInstance(ProcessInstance process) {
            this.process = process;
            return this;
        }
        public ParallelGateway build() {
            return new ParallelGateway(this);
        }
    }

    private ParallelGateway(Builder builder) {
        super(builder.pg, builder.process);
        output = LeviUtils.newArrayList(super.outgoingSeqFlowSet.size());
    }

    public List<TSequenceFlow> evaluate() {
        System.out.println("<Parallel Gateway " + getName() + " Evaluating>");
        output.clear();
        if (compare()) {
            for (TSequenceFlow sf : outgoingSeqFlowSet) {
                output.add(sf);
            }
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

    @Override
    public String toString() {
        String out = "{";
        out += "ParallelGateway: " + getId() + "}";
        return out;
    }
}
