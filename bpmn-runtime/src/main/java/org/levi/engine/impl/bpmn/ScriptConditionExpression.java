package org.levi.engine.impl.bpmn;

import org.levi.engine.LeviException;
import org.levi.engine.bpmn.ConditionExpression;
import org.levi.engine.runtime.ProcessInstance;
import org.omg.spec.bpmn.x20100524.model.TExpression;

/**
 * @author Ishan Jayawardena
 */
public class ScriptConditionExpression implements ConditionExpression {
     public static final String DEFAULT_CONDITION_LANGUAGE = "javascript";

    private final String conditionExpression;
    
    public ScriptConditionExpression(TExpression expression) {
        conditionExpression = expression.newXMLStreamReader().getText();
    }

    public boolean evaluate(ProcessInstance processInstance) {
        System.out.println("Evaluating Script Condition.");
        ScriptEngines scriptEngines = ScriptEngines.getInstance();
        Object result = null;
        result = scriptEngines.evaluate(
                conditionExpression,
                DEFAULT_CONDITION_LANGUAGE,
                processInstance);
        if (result == null) {
            throw new LeviException("Condition expression evaluation returns null.");
        }
        if (!(result instanceof Boolean)) {
            throw new LeviException("Condition expression evaluation returns non boolean result");
        }
        return (Boolean)result;
    }
}
