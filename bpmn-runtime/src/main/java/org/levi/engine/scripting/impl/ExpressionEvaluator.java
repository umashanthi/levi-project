package org.levi.engine.scripting.impl;

import org.apache.bsf.BSFException;
import org.apache.bsf.BSFManager;
import org.omg.spec.bpmn.x20100524.model.TExpression;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: Feb 1, 2011
 * Time: 12:10:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExpressionEvaluator {
    boolean evaluate(TExpression expression) {
        String script = expression.newXMLStreamReader().getText();

        BSFManager manager = new BSFManager();
        try {
            return ((Boolean) manager.eval("groovy", "myScript", 0, 0, script));
        } catch (BSFException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return false;
    }
}
