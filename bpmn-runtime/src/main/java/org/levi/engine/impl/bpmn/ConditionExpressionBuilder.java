package org.levi.engine.impl.bpmn;

import org.levi.engine.LeviException;
import org.levi.engine.bpmn.ConditionExpression;
import org.omg.spec.bpmn.x20100524.model.TExpression;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/**
 * @author Ishan Jayawardena
 */
public class ConditionExpressionBuilder {
    public static final String XSI_NAMESPACE = "http://www.w3.org/2001/XMLSchema-instance";
   

    // TODO: we must support JUEL. Currently only we support javascript as the default expression lang.
    public static ConditionExpression buildNewExpression(TExpression expression) {
        if (expression == null) {
            throw new LeviException("Condition Expression is null.");
        }
        NamedNodeMap attributes = expression.getDomNode().getAttributes();
        if (attributes.getLength() == 0) {
            // default javascript condition expression
            /* TODO: with this approach, there is no way to correctly check if the expression is actually
               ment for javascript */
            return new ScriptConditionExpression(expression);
        } else if (attributes.getLength() == 1) {
            // see if this is UEL
            Node attribute = attributes.getNamedItemNS(XSI_NAMESPACE, "type");
            if (attribute == null) {
                throw new LeviException("Unknown attribute. Only xsi:type is supported.");
            }
            if ("tFormalExpression".equals(attribute.getNodeValue())) {
                throw new LeviException("tFormalExpression is not supported yet.");  // TODO  
            } else {
                throw new LeviException("Unknown type. Only tFormalExpression is supported.");
            }
        } else {
            throw new LeviException("Condition expression not supported.");
        }
    }
}
