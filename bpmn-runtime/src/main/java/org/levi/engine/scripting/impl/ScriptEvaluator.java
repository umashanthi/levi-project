package org.levi.engine.scripting.impl;

import org.levi.engine.scripting.Evaluable;

public class ScriptEvaluator {

    Evaluable scriptEvaluator;

    public ScriptEvaluator(Evaluable scriptEvaluator) {
        this.scriptEvaluator = scriptEvaluator;
    }

    public boolean evaluate() {
        return scriptEvaluator.evaluate();
    }
}
