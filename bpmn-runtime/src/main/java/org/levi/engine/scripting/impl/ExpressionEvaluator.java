package org.levi.engine.scripting.impl;

import org.apache.bsf.BSFEngine;
import org.apache.bsf.BSFException;
import org.apache.bsf.BSFManager;
import org.levi.engine.scripting.Evaluable;
import org.omg.spec.bpmn.x20100524.model.TExpression;

/**
 * Created by IntelliJ IDEA.
 * UserDaoImpl: eranda
 * Date: Feb 1, 2011
 * Time: 12:10:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExpressionEvaluator implements Evaluable {

    private TExpression expression;
    private String language;

    public ExpressionEvaluator(TExpression expression, String language) {
        this.expression = expression;
        this.language = language;
    }

    public boolean evaluate() {
        String script = expression.newXMLStreamReader().getText();
        BSFManager manager = new BSFManager();
        //System.out.println("......" + manager.lookupBean("price1"));
        manager.registerBean("price1", "10");
        //manager.
        try {
            BSFEngine engine = manager.loadScriptingEngine(language);
            return ((Boolean) engine.eval("myScript", 0, 0, script));
            //return ((Boolean) manager.eval("groovy", "myScript", 0, 0, script));
        } catch (BSFException e) {
            e.printStackTrace();  //TODO change body of catch statement use File | Settings | File Templates.
        }
        return false;
    }
}
