package org.levi.engine.impl.bpmn;


import org.levi.engine.bpmn.RunnableFlowNode;
import org.levi.engine.impl.bpmn.parser.ObjectModel;
import org.omg.spec.bpmn.x20100524.model.*;

import java.util.HashMap;
import java.util.Map;

public class FlowNodeFactory {
    private final ObjectModel om;
    // this map is used as an object pool to reuse already created RunnableFlowNode elements.
    private final Map<String, RunnableFlowNode> flowNodes = new HashMap<String, RunnableFlowNode>(25);

    public FlowNodeFactory(ObjectModel om) {
        if (om == null) {
            throw new IllegalArgumentException("Attempt to create FlowNodeFactory from a null OM");
        }
        this.om = om;
    }

    public RunnableFlowNode getStartEvent() {
        RunnableFlowNode startEvent = getNode(om.getStartEvent().getId());
        if (startEvent == null) {
            startEvent = new StartEvent(om.getStartEvent(), this);
            registerNode(startEvent);
        }
        return startEvent;
    }

    // this method will be invoked by Gateway objects.
    public RunnableFlowNode getNextNode(TSequenceFlow sequenceFlow) {
        // get the target ref
        RunnableFlowNode flowNode = makeNode(sequenceFlow.getTargetRef());
        insertToken(flowNode, sequenceFlow.getId());
        return flowNode;
    }

    // this method will be invoked by RunnableFlowNode objects other than
    // the Gateway objects.
    public RunnableFlowNode getNextNode(RunnableFlowNode currentFlowNode) {
        // get next seq flow (from the source based map)
        SequenceFlowSet sfs = om.getSourceSequenceFlowSet(currentFlowNode.getId());
        if (sfs.isMultiSet()) {// TODO this method name is funny! i know :P
            // TODO we do not support this yet.
            throw new RuntimeException("sequence flow set size is greater than 1");
        } else {
            // get the target ref
            RunnableFlowNode flowNode = makeNode(sfs.getTargetRef());
            insertToken(flowNode, sfs.getId());
            return flowNode;
        }
        //return null;
    }

    // this method is used to insert a
    public static void insertToken(RunnableFlowNode flowNode, String sfId) {
        if (flowNode instanceof Gateway) {
            ((Gateway)flowNode).insertToken(sfId);
        }
    }

    private RunnableFlowNode makeNode(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Trying to create a new node from a null id");
        }
        TFlowElement e = om.getFlowElement(id);
        // task, gateway, intermediate event, end event
        RunnableFlowNode flowNode = getNode(e.getId());
        if (flowNode == null) {
            if (e instanceof TTask) {
                flowNode = new TaskNode((TTask)e, this);
            } else if (e instanceof TGateway) {
                flowNode = makeGateway((TGateway)e);
            } else if (e instanceof TEndEvent) {
                flowNode = new EndEvent((TEndEvent)e);
            } else {
                // TODO stuff here. e.g intermediate events, message flows, etc.
                flowNode = null;
            }
            // TODO is this thread safe?
            registerNode(flowNode);
        } else {
            // for the illustration purpose only. :) Lets remove this lataaar
            System.err.println("flownode already exists: " + flowNode.getId());
        }
        if (flowNode == null) {
            throw new NullPointerException("Could not find the flow node");
        }
        return flowNode;
    }

    public SequenceFlowSet getSourceSequenceFlowSet(String id) {
        return om.getSourceSequenceFlowSet(id);
    }

    public SequenceFlowSet getTargetSequenceFlowSet(String id) {
        return om.getTargetSequenceFlowSet(id);
    }

    private void registerNode(RunnableFlowNode node) {
        if (node != null) {
            flowNodes.put(node.getId(), node);
        } else {
            throw new IllegalArgumentException("Attempt to register a null flow node");
        }
    }

    private RunnableFlowNode getNode(String id) {
        return (id != null) ? (flowNodes.get(id)) : null;
    }

    private RunnableFlowNode makeGateway(TGateway g) {
        if (g instanceof TExclusiveGateway) {
            return new ExclusiveGateway((TExclusiveGateway)g, this);
        } else if (g instanceof TParallelGateway) {
            return new ParallelGateway((TParallelGateway)g, this);
        } else if (g instanceof TInclusiveGateway) {
            throw new IllegalArgumentException("unsupproted Gateway type");
        } else if (g instanceof TComplexGateway) {
            throw new IllegalArgumentException("unsupproted Gateway type");
        } else {
            throw new IllegalArgumentException("unknown Gateway type");
        }
    }
}