package org.levi.engine.bpmn;

import org.levi.engine.bpmn.FlowNode;
import org.omg.spec.bpmn.x20100524.model.TGateway;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 2:55:20 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Gateway extends FlowNode {
    List<TSequenceFlow> evaluate();
    TSequenceFlow getSeqFlowByTargetRef(String id);
    TGateway getType();
}


