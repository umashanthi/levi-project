package org.levi.engine.runtime;

import org.apache.ode.jacob.vpu.ExecutionQueueImpl;
import org.apache.ode.jacob.vpu.JacobVPU;
import org.levi.engine.bpmn.BPMNJacobRunnable;
import org.levi.engine.impl.bpmn.FlowNodeFactory;
import org.levi.engine.impl.bpmn.parser.ObjectModel;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Nov 24, 2010
 * Time: 9:34:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProcessInstance extends BPMNJacobRunnable {
    ObjectModel om;
    ExecutionQueueImpl soup;
    JacobVPU vpu;
    FlowNodeFactory flowNodeFac;

    public ProcessInstance(ObjectModel om) {
        assert om != null;
        this.om = om;
        flowNodeFac = new FlowNodeFactory(this.om);
    }

    public String getProcessId() {
        return String.valueOf(this.hashCode());
    }
    public void execute() {
        soup = new ExecutionQueueImpl(null);
        vpu = new JacobVPU();
        vpu.setContext(soup);
        vpu.inject(this);
        while (vpu.execute()) {
        }
    }

    public void run() {
        System.out.println("Starting ProcessInstance: " + om.getProcessName());
        instance(flowNodeFac.getStartEvent());
    }
}