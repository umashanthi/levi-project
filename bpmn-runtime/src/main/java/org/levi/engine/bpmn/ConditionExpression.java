package org.levi.engine.bpmn;

import org.levi.engine.runtime.ProcessInstance;

/**
 * @author Ishan Jayawardena
 */
public interface ConditionExpression {
    boolean evaluate(ProcessInstance processInstance);
}
