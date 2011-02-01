package org.levi.engine.impl.bpmn;

import org.levi.engine.scripting.ScriptEvaluator;
import org.levi.engine.scripting.impl.ScriptEvaluatorImpl;
import org.omg.spec.bpmn.x20100524.model.TExclusiveGateway;
import org.omg.spec.bpmn.x20100524.model.TExpression;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.ArrayList;
import java.util.List;

public final class ExclusiveGateway extends Gateway {
    private final List<TSequenceFlow> output;
    private final String defaultSequenceFlowName;

    public ExclusiveGateway(TExclusiveGateway gateway, FlowNodeFactory factory) {
        super(gateway, factory);
        defaultSequenceFlowName = gateway.getDefault();
        output = new ArrayList<TSequenceFlow>(1); // because it can have only a single result
    }

    public List<TSequenceFlow> evaluate() {
        System.out.println("<Exclusive Gateway " + getName() + " Evaluating>");
        output.clear();
        compare();

        //Ignore the multiple input and multiple output Gateways since they are not recommended.
        TSequenceFlow defaultSequenceFlow = null;
        if (isDiverging() || (incomingSeqFlowSet.size() == 1)) {
            ScriptEvaluator evaluator = new ScriptEvaluatorImpl();
            for (TSequenceFlow sf : outgoingSeqFlowSet) {
                TExpression expression = sf.getConditionExpression();
                String script;
                if (expression != null) {
                    //expression evaluated by scripting package
                    if ((Boolean) evaluator.evaluate(expression)) {
                        output.add(sf);
                        break;
                    }

                } else if (sf.getId().equals(defaultSequenceFlowName)) {
                    defaultSequenceFlow = sf;
                } else {
                    throw new IllegalArgumentException("No conditional expression found: Exclusive Gateway");
                }
            }
        } else if (isConverging() || (outgoingSeqFlowSet.size() == 1)) {
            System.out.println("<<<<<=============<<<<<");
            output.add(outgoingSeqFlowSet.get(0));
        } else {
            throw new IllegalArgumentException("Invalid gateway direction: Exclusive Gateway");  //TODO create new exception for this.
        }

        //set the default sequence flow if others are false
        if (output.isEmpty() && defaultSequenceFlow != null) {
            System.out.println("Set default SequenceFlow");
            output.add(defaultSequenceFlow);
        }
        return output;
    }

    private void compare() {
        assert incomingTokens.size() <= incomingSeqFlowSet.size();
        for (TSequenceFlow sf : incomingSeqFlowSet) {
            for (String token : incomingTokens) {
                if (token.equals(sf.getId())) {
                    incomingTokens.clear();
                    return;
                }
            }
        }
        throw new RuntimeException("incoming sequence flows unmatched");
    }

    @Override
    public String toString() {
        return "{ExclusiveGateway: " + getId() + "}";
    }
}
