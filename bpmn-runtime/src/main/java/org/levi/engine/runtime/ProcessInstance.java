package org.levi.engine.runtime;

import org.apache.ode.jacob.vpu.ExecutionQueueImpl;
import org.apache.ode.jacob.vpu.JacobVPU;
import org.levi.engine.LeviException;
import org.levi.engine.bpmn.BPMNJacobRunnable;
import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.impl.bpmn.FlowNodeFactory;
import org.levi.engine.impl.bpmn.parser.ProcessDefinition;
import org.omg.spec.bpmn.x20100524.model.TSequenceFlow;

import java.util.Map;

public class ProcessInstance extends BPMNJacobRunnable {
    ProcessDefinition processDefinition;
    ExecutionQueueImpl soup;
    JacobVPU vpu;
    FlowNodeFactory flowNodeFac;
    Map<String, Object> variables;
    String id;

    public ProcessInstance(ProcessDefinition processDefinition, Map<String, Object> variables) {
        if (processDefinition == null) {
            throw new LeviException("Cannot create a process instance. OM is null.");
        }
        this.processDefinition = processDefinition;
        this.variables = variables;
        flowNodeFac = new FlowNodeFactory(this.processDefinition, this);
        this.id = processDefinition.getDefinitionsName();
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
        instance(flowNodeFac.getStartEvent());
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public Object getVariable(String name) {
        if (id == null) {
            throw new LeviException("Variable name is null.");
        }

        return variables.get(name);
    }

    public Object setVariable(String name, Object value) {
        if (name == null) {
            throw new LeviException("Cannot save a variable with a null name");
        }
        if (variables == null) {
            return null;
        }
        return variables.put(name, value);
    }

    public RunnableFlowNode executeNext(RunnableFlowNode currentFlowNode) {
        return flowNodeFac.getNextNode(currentFlowNode);
    }

    public RunnableFlowNode executeNext(TSequenceFlow currentSeqFlow) {
        return flowNodeFac.getNextNode(currentSeqFlow);
    }

    public ProcessDefinition getObjectModel() {
        return processDefinition;
    }
}