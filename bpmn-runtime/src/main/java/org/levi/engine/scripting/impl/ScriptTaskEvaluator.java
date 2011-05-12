package org.levi.engine.scripting.impl;

import org.levi.engine.scripting.Evaluable;
import org.omg.spec.bpmn.x20100524.model.TScript;

/**
 * Created by IntelliJ IDEA.
 * UserDaoImpl: eranda
 * Date: Feb 1, 2011
 * Time: 12:12:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class ScriptTaskEvaluator implements Evaluable {

    private TScript expression;
    private String language;

    public ScriptTaskEvaluator(TScript expression, String language) {
        this.expression = expression;
        this.language = language;
    }

    public boolean evaluate() {
        return false;
    }
}
