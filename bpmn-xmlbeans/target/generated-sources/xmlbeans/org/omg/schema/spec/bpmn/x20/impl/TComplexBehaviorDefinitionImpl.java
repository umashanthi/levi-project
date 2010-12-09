/*
 * XML Type:  tComplexBehaviorDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tComplexBehaviorDefinition(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TComplexBehaviorDefinitionImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TComplexBehaviorDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "condition");
    private static final javax.xml.namespace.QName EVENT$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "event");
    
    
    /**
     * Gets the "condition" element
     */
    public org.omg.schema.spec.bpmn.x20.TFormalExpression getCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().find_element_user(CONDITION$0, 0);
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
    public void setCondition(org.omg.schema.spec.bpmn.x20.TFormalExpression condition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().find_element_user(CONDITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().add_element_user(CONDITION$0);
            }
            target.set(condition);
        }
    }
    
    /**
     * Appends and returns a new empty "condition" element
     */
    public org.omg.schema.spec.bpmn.x20.TFormalExpression addNewCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().add_element_user(CONDITION$0);
            return target;
        }
    }
    
    /**
     * Gets the "event" element
     */
    public org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent)get_store().find_element_user(EVENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "event" element
     */
    public boolean isSetEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENT$2) != 0;
        }
    }
    
    /**
     * Sets the "event" element
     */
    public void setEvent(org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent)get_store().find_element_user(EVENT$2, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent)get_store().add_element_user(EVENT$2);
            }
            target.set(event);
        }
    }
    
    /**
     * Appends and returns a new empty "event" element
     */
    public org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImplicitThrowEvent)get_store().add_element_user(EVENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "event" element
     */
    public void unsetEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENT$2, 0);
        }
    }
}
