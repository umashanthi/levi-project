package org.levi.engine.impl.bpmn;

import org.levi.engine.LeviException;
import org.levi.engine.runtime.ProcessInstance;

/**
 * @author Ishan Jayawardena.
 */
public class FormalExpression {
    public static final String DEFAULT_EXPRESSION_LANGUAGE = "javascript";
    private final String formalExpression;

    public FormalExpression(String formalExpression) {
        System.out.println("Found: " + formalExpression);
        if (formalExpression == null) {
            throw new NullPointerException("Formal expression is null.");
        }
        formalExpression = formalExpression.trim();
        if (formalExpression.length() <= 3) {
            throw new RuntimeException("Formal expression is empty.");
        }
        if (formalExpression.charAt(0) == '$'
                && formalExpression.charAt(1) == '{'
                && formalExpression.charAt(formalExpression.length() - 1) == '}') {
             this.formalExpression = formalExpression.substring(2, formalExpression.length() - 2);
        } else {
            throw new RuntimeException("Malformed formal expression: " + formalExpression);
        }
    }

    public Object evaluate(ProcessInstance processInstance) {
        System.out.println("Evaluating formal expression: " + formalExpression);
        ScriptEngines scriptEngines = ScriptEngines.getInstance();
        Object result;
        result = scriptEngines.evaluate(
                formalExpression,
                DEFAULT_EXPRESSION_LANGUAGE,
                processInstance);
        if (result == null) {
            throw new LeviException("Formal expression evaluation returns null.");
        }
        return result;
    }
}
