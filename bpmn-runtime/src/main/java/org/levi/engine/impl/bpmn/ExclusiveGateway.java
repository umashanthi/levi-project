package org.levi.engine.impl.bpmn;

import org.apache.bsf.BSFException;
import org.apache.bsf.BSFManager;
import org.levi.samples.utils.UserInput;
import org.omg.spec.bpmn.x20100524.model.TExclusiveGateway;
import org.omg.spec.bpmn.x20100524.model.TExpression;
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
        //compare();
        //if (isDiverging()
        //    || isConverging()
        //    || isMixed()
        //    || isUnspecified()) { // for exclusive gateway, all these are similar
        //    if (outgoingSeqFlowSet.size() == 1) { // typical converging case
        //        output.add(outgoingSeqFlowSet.get(0));
        //    } else { // typical diverging case
        //        // TODO evaluate!
        //        int which = UserInput.read(outgoingSeqFlowSet.size());
        //        output.add(outgoingSeqFlowSet.get(which));
        //    }
        //    return output;
        //} else {
        //    throw new IllegalArgumentException("Invalid gateway direction: Exclusive Gateway");
        //}

        //Ignore the multiple input and multiple output Gateways since they are not recommended.
        if(isDiverging() || (incomingSeqFlowSet.size()==1)) {
            for(int i=0;i< outgoingSeqFlowSet.size();i++){
                TExpression expression = outgoingSeqFlowSet.get(i).getConditionExpression();
                String script = null;
                if(expression != null){
                    script = expression.newXMLStreamReader().getText();
                    System.out.println(">>>>>=============>>>>>"+script);
                } else{
                    throw new IllegalArgumentException("No conditional expression found: Exclusive Gateway");
                }

                BSFManager manager = new BSFManager();
                try {
                    if((Boolean)manager.eval("groovy", "myScript", 0, 0, script)){
                        //this evaluation may more complex
                        output.add(outgoingSeqFlowSet.get(i));
                        return output;
                    }
                } catch (BSFException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        } else if(isConverging() || (outgoingSeqFlowSet.size()==1)) {
            System.out.println("<<<<<=============<<<<<");
            output.add(outgoingSeqFlowSet.get(0));
        } else {
            throw new IllegalArgumentException("Invalid gateway direction: Exclusive Gateway");
        }
        return output;
    }

    private void compare() {
        assert incomingTokens.size() <= incomingSeqFlowSet.size();
        /*for (int i = incomingSeqFlowSet.size() - 1; i >= 0; --i) {
            for (String token : incomingTokens) {
                if (token.equals(incomingSeqFlowSet.get(i).getId())) {
                    incomingTokens.clear();
                    return;
                }
            }
        }*/
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

    @Override public String toString() {
        return "{ExclusiveGateway: " + getId() + "}";
    }
}
