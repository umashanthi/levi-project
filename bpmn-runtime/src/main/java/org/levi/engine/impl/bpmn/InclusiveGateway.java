package org.levi.engine.impl.bpmn;

import org.levi.engine.bpmn.Gateway;
import org.omg.spec.bpmn.x20100524.model.TGateway;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 22, 2010
 * Time: 3:46:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class InclusiveGateway implements Gateway {
    FlowNodeFactory _Flow_nodeFac;

    public InclusiveGateway(FlowNodeFactory flowNodeFac) {
        super();
        _Flow_nodeFac = flowNodeFac;
    }
    public void run() {
        //System.out.println(this.getClassName());
    }

    public List<TSequenceFlow> evaluate() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void insertIncomingSeqFlow(String id) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public String getId() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public TSequenceFlow getSeqFlowByTargetRef(String id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean isConverging() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean isDiverging() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean isMixed() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public boolean isUnspecified() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public TGateway getType() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
