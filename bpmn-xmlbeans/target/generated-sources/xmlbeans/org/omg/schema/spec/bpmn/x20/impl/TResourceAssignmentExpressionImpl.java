/*
 * XML Type:  tResourceAssignmentExpression
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tResourceAssignmentExpression(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TResourceAssignmentExpressionImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression
{
    private static final long serialVersionUID = 1L;
    
    public TResourceAssignmentExpressionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "expression");
    private static final org.apache.xmlbeans.QNameSet EXPRESSION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "expression"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "formalExpression"),
    });
    
    
    /**
     * Gets the "expression" element
     */
    public org.omg.schema.spec.bpmn.x20.TExpression getExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().find_element_user(EXPRESSION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "expression" element
     */
    public void setExpression(org.omg.schema.spec.bpmn.x20.TExpression expression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().find_element_user(EXPRESSION$1, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().add_element_user(EXPRESSION$0);
            }
            target.set(expression);
        }
    }
    
    /**
     * Appends and returns a new empty "expression" element
     */
    public org.omg.schema.spec.bpmn.x20.TExpression addNewExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().add_element_user(EXPRESSION$0);
            return target;
        }
    }
}
