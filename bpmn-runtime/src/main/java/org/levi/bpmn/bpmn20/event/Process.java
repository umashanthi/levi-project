package org.levi.bpmn.bpmn20.event;

import org.apache.ode.jacob.vpu.ExecutionQueueImpl;
import org.apache.ode.jacob.vpu.JacobVPU;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 24, 2010
 * Time: 9:34:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class Process extends BPMNJacobRunnable {
    ObjectModel _om;
    ExecutionQueueImpl _soup;
    JacobVPU _vpu;
    NodeFactory _nodeFac;

    public Process(ObjectModel om) {
        assert om != null;
        _om = om;
        _nodeFac = new NodeFactory(_om);
    }

    public void execute() {
        _soup = new ExecutionQueueImpl(null);
        _vpu = new JacobVPU();
        _vpu.setContext(_soup);
        _vpu.inject(this);
        while (_vpu.execute()) {
        }
    }

    public void run() {
        instance(_nodeFac.createNextNode());
    }
}
