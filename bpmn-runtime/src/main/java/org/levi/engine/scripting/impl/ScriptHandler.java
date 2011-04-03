package org.levi.engine.scripting.impl;

import org.levi.engine.scripting.Evaluable;

public class ScriptHandler {

    Evaluable evaluator;

    public void setEvaluator(Evaluable scriptEvaluator) {
        this.evaluator = scriptEvaluator;
    }

    public boolean execute() {
        return evaluator.evaluate();
    }
}
