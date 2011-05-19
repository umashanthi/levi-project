package org.levi.engine.bpmn;

/**
 * @author Ishan Jayawardena
 */
public interface FlowNode {
    String getId();
    void resumeTask();
    boolean hasInputForm();
}