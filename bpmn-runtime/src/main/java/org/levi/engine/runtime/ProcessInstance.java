package org.levi.engine.runtime;

import org.apache.ode.jacob.vpu.ExecutionQueueImpl;
import org.apache.ode.jacob.vpu.JacobVPU;
import org.levi.engine.bpmn.BPMNJacobRunnable;
import org.levi.engine.impl.bpmn.FlowNodeFactory;
import org.levi.engine.impl.bpmn.parser.ObjectModel;

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
        //System.out.println("Starting ProcessInstance: " + om.getProcessName());
        instance(flowNodeFac.getStartEvent());
    }
}