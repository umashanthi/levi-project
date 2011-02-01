package org.levi.engine.scripting.impl;

import org.levi.engine.scripting.ScriptEvaluator;
import org.omg.spec.bpmn.x20100524.model.TExpression;

public class ScriptEvaluatorImpl implements ScriptEvaluator {
    public Object evaluate(Object obj) {
        if (obj instanceof TExpression) {
            ExpressionEvaluator evaluator = new ExpressionEvaluator();
            TExpression expression = ((TExpression) obj);
            evaluator.evaluate(expression);
        }
        return false;
    }
}
