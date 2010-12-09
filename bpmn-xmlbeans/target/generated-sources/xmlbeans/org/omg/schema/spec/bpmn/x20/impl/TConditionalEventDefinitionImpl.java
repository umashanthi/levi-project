/*
 * XML Type:  tConditionalEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tConditionalEventDefinition(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TConditionalEventDefinitionImpl extends org.omg.schema.spec.bpmn.x20.impl.TEventDefinitionImpl implements org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TConditionalEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "condition");
    
    
    /**
     * Gets the "condition" element
     */
    public org.omg.schema.spec.bpmn.x20.TExpression getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "condition" element
     */
    public void setCondition(org.omg.schema.spec.bpmn.x20.TExpression condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().add_element_user(CONDITION$0);
            }
            target.set(condition);
        }
    }
    
    /**
     * Appends and returns a new empty "condition" element
     */
    public org.omg.schema.spec.bpmn.x20.TExpression addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().add_element_user(CONDITION$0);
            return target;
        }
    }
}
