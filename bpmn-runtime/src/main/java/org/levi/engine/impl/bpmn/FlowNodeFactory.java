package org.levi.engine.impl.bpmn;


import org.levi.engine.LeviException;
import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.impl.bpmn.parser.ProcessDefinition;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;
import org.omg.spec.bpmn.x20100524.model.*;

import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public class FlowNodeFactory {
    private final ProcessDefinition processDefinition;
    // this map is used as an object pool to reuse already created RunnableFlowNode elements.
    private final Map<String, RunnableFlowNode> flowNodes = LeviUtils.newHashMap(25);
    private final Map<String, Object> variables;
    private final ProcessInstance process;

    public FlowNodeFactory(ProcessDefinition processDefinition, ProcessInstance process) {
        if (processDefinition == null) {
            throw new IllegalArgumentException("Attempt to create FlowNodeFactory from a null OM");
        }
        this.processDefinition = processDefinition;
        this.variables = process.getVariables();
        this.process = process;
    }

    public synchronized RunnableFlowNode getStartEvent() {
        RunnableFlowNode startEvent = getNode(processDefinition.getStartEvent().getId());
        if (startEvent == null) {
            startEvent = new StartEvent.Builder(processDefinition.getStartEvent())
                    .processInstance(process)
                    .build();
            registerNode(startEvent);
        }
        return startEvent;
    }

    // this method will be invoked by Gateway objects.
    public synchronized RunnableFlowNode getNextNode(TSequenceFlow sequenceFlow) {
        // get the target ref
        RunnableFlowNode flowNode = makeNode(sequenceFlow.getTargetRef());
        insertToken(flowNode, sequenceFlow.getId());
        return flowNode;
    }

    // this method will be invoked by RunnableFlowNode objects other than
    // the Gateway objects.
    public synchronized RunnableFlowNode getNextNode(RunnableFlowNode currentFlowNode) {
        // get next seq flow (from the source based map)
        SequenceFlowSet sfs = processDefinition.getSourceSequenceFlowSet(currentFlowNode.getId());
        if (sfs.isMultiSet()) {// TODO this method name is funny! i know :P
            // TODO we do not support this yet.
            throw new RuntimeException("sequence flow set size is greater than 1");
        }
        RunnableFlowNode flowNode = makeNode(sfs.getTargetRef());
        insertToken(flowNode, sfs.getId());
        return flowNode;
    }

    // this method is used to insert a
    public static void insertToken(RunnableFlowNode flowNode, String sfId) {
        if (flowNode instanceof Gateway) {
            ((Gateway)flowNode).insertToken(sfId);
        }
    }

    private synchronized RunnableFlowNode makeNode(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Trying to create a new node from a null id");
        }
        TFlowElement e = processDefinition.getFlowElement(id);
        // task, gateway, intermediate event, end event
        RunnableFlowNode flowNode = getNode(e.getId());
        if (flowNode == null) {
            if (e instanceof TScriptTask) {
                flowNode = new ScriptTask.Builder((TScriptTask)e)
                        .processInstance(process)
                        .build();
            } else if (e instanceof TTask) {
                flowNode = new UserTask.Builder((TTask)e)
                        .processInstance(process)
                        .build();
            } else if (e instanceof TGateway) {
                flowNode = makeGateway((TGateway)e);
            } else if (e instanceof TEndEvent) {
                flowNode = new EndEvent.Builder((TEndEvent)e)
                        .processInstance(process)
                        .build();
            } else {
                // TODO stuff here. e.g intermediate events, message flows, etc.
                flowNode = null;
            }
            // TODO is this thread safe?
            registerNode(flowNode);
        } else {
            System.err.println("flownode already exists: " + flowNode.getId());
        }
        if (flowNode == null) {
            throw new NullPointerException("Could not find the flow node");
        }
        return flowNode;
    }

    public SequenceFlowSet getSourceSequenceFlowSet(String id) {
        return processDefinition.getSourceSequenceFlowSet(id);
    }

    public SequenceFlowSet getTargetSequenceFlowSet(String id) {
        return processDefinition.getTargetSequenceFlowSet(id);
    }

    private synchronized void registerNode(RunnableFlowNode node) {
        if (node != null) {
            flowNodes.put(node.getId(), node);
        } else {
            throw new IllegalArgumentException("Attempt to register a null flow node");
        }
    }

    private synchronized RunnableFlowNode getNode(String id) {
        return (id != null) ? (flowNodes.get(id)) : null;
    }

    private synchronized RunnableFlowNode makeGateway(TGateway g) {
        if (g instanceof TExclusiveGateway) {
            return new ExclusiveGateway.Builder((TExclusiveGateway)g)
                    .processInstance(process)
                    .build();
        } else if (g instanceof TParallelGateway) {
            return new ParallelGateway.Builder((TParallelGateway)g)
                    .processInstance(process)
                    .build();
        } else if (g instanceof TInclusiveGateway) {
            throw new LeviException("Unsupported Gateway type");
        } else if (g instanceof TComplexGateway) {
            throw new LeviException("Unsupported Gateway type");
        } else {
            throw new LeviException("Unsupported Gateway type");
        }
    }
}