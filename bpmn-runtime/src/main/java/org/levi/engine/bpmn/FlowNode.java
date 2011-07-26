package org.levi.engine.bpmn;

import javax.mail.MessagingException;

/**
 * @author Ishan Jayawardena
 */
public interface FlowNode {
    String getId();
    void resumeTask() throws MessagingException;
    boolean hasInputForm();
}