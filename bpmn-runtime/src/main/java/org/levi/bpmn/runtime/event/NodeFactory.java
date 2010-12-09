package org.levi.bpmn.runtime.event;



import org.levi.bpmn.runtime.EndEvent;
import org.levi.bpmn.runtime.Node;
import org.levi.bpmn.runtime.StartEvent;
import org.levi.bpmn.runtime.Task;
import org.omg.spec.bpmn.x20100524.model.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 24, 2010
 * Time: 11:56:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class NodeFactory {
    private ObjectModel _om;
    private List<TFlowElement> _flowElemList;
    private Iterator<TFlowElement> _flowElemI;

    public NodeFactory(ObjectModel om) {
        _om = om;
        makeFlowElementList();
    }

    private void makeFlowElementList() {
        assert _om != null;
        TFlowElement[] flowElems = _om.getFlowElements(0);
        _flowElemList = new ArrayList<TFlowElement>(flowElems.length);
        for (int i = 0; i < flowElems.length; ++i) {
            _flowElemList.add(flowElems[i]);
        }
        _flowElemI = _flowElemList.iterator();
    }
    public Node createNextNode() {
        if (_flowElemI.hasNext()) {
            TFlowElement e = _flowElemI.next();
            if (e instanceof TTask) {
                return new Task((TTask)e, this);
            } else if (e instanceof TStartEvent) {
                return new StartEvent(this);
            } else if (e instanceof TEndEvent) {
                return new EndEvent();
            } else if (e instanceof TSequenceFlow) {
                TExpression condexp = ((TSequenceFlow)e).getConditionExpression();
                System.out.println("==> " + (condexp == null ? "" : condexp.xmlText()));
                return createNextNode();
            } else if (e instanceof TGateway) {
                if (e instanceof TExclusiveGateway) {
                    TExclusiveGateway eg = (TExclusiveGateway)e;
                    System.out.println("TExclusiveGatewayImpl: " + eg.getName());
                } else if (e instanceof TParallelGateway) {
                    System.out.println("TParallelGatewayImpl");
                } else {
                    throw new AbstractMethodError("Unsupported Gateway type");
                }
                return createNextNode();
            } else {
                System.out.println(e.getClass());
                return createNextNode();
            }
        } else {
            throw new NullPointerException("No more flow elements found");
        }
    }
}
