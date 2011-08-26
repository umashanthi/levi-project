package org.levi.engine.impl.bpmn;

import org.levi.engine.LeviException;
import org.levi.engine.bpmn.ConditionExpression;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;
import org.omg.spec.bpmn.x20100524.model.TExclusiveGateway;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.List;

/**
 * @author Ishan Jayawardena
 */
public final class ExclusiveGateway extends Gateway {
    private final List<TSequenceFlow> output;
    private final String defaultSequenceFlowId;

    public void resumeTask() {
        throw new AssertionError("resumeTask() is not intended to be called.");
    }


    public static class Builder {
        private TExclusiveGateway eg;
        private ProcessInstance process;

        public Builder(TExclusiveGateway eg) {
            this.eg = eg;
        }
        public Builder processInstance(ProcessInstance process) {
            this.process = process;
            return this;
        }
        public ExclusiveGateway build() {
            return new ExclusiveGateway(this);
        }
    }

    private ExclusiveGateway(Builder builder) {
        super(builder.eg, builder.process);
        defaultSequenceFlowId = builder.eg.getDefault();
        output = LeviUtils.newArrayList(1); // because it can have only a single result
    }

    public List<TSequenceFlow> evaluate() {
        //System.out.println("Evaluating Exclusive Gateway: " + getName());
        output.clear();
        compare();
        //Ignore the multiple input and multiple output Gateways since they are not recommended.
        TSequenceFlow defaultSequenceFlow = null;
        if (isDiverging() || (incomingSeqFlowSet.size() == 1)) {
            for (int i = 0; i < outgoingSeqFlowSet.size(); ++i) {
                TSequenceFlow sf = outgoingSeqFlowSet.get(i);
                if (defaultSequenceFlowId != null && defaultSequenceFlowId.equals(sf.getId())) {
                    defaultSequenceFlow = sf;
                    continue;
                }
                ConditionExpression condition
                        = ConditionExpressionBuilder.buildNewExpression(sf.getConditionExpression());
                if (condition.evaluate(processInstance)) {
                    output.add(sf);
                    break;
                }
            }
            if (output.isEmpty()) {
                if (defaultSequenceFlow != null) {
                    //System.out.println("Set default SequenceFlow");
                    output.add(defaultSequenceFlow);
                } else {
                    throw new LeviException("None of the conditions were satisfied.");
                }
            }
        } else if (isConverging() || (outgoingSeqFlowSet.size() == 1)) {
            output.add(outgoingSeqFlowSet.get(0));
        } else {
            throw new LeviException("Invalid gateway direction: Exclusive Gateway");
        }
        return output;
    }

    private void compare() {
        assert incomingTokens.size() <= incomingSeqFlowSet.size();
        for (int i = 0; i < incomingSeqFlowSet.size(); ++i) {
            TSequenceFlow sf = incomingSeqFlowSet.get(i);
            for (String token : incomingTokens) {
                if (token.equals(sf.getId())) {
                    incomingTokens.clear();
                    return;
                }
            }
        }
        throw new LeviException("incoming sequence flows unmatched. " + this.getId());
    }

    @Override
    public String toString() {
        return "{id: " + getId()
                + ", Incoming: "+ incomingSeqFlowSet
                + ", Outgoing: " + outgoingSeqFlowSet
                + ", Default: " + outgoingSeqFlowSet.toStringSf(defaultSequenceFlowId)
                + "}";
    }

    public boolean hasInputForm() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
