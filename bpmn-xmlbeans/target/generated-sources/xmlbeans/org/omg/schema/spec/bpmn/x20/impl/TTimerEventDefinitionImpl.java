/*
 * XML Type:  tTimerEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TTimerEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tTimerEventDefinition(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TTimerEventDefinitionImpl extends org.omg.schema.spec.bpmn.x20.impl.TEventDefinitionImpl implements org.omg.schema.spec.bpmn.x20.TTimerEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TTimerEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEDATE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "timeDate");
    private static final javax.xml.namespace.QName TIMECYCLE$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "timeCycle");
    
    
    /**
     * Gets the "timeDate" element
     */
    public org.omg.schema.spec.bpmn.x20.TExpression getTimeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().find_element_user(TIMEDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timeDate" element
     */
    public boolean isSetTimeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMEDATE$0) != 0;
        }
    }
    
    /**
     * Sets the "timeDate" element
     */
    public void setTimeDate(org.omg.schema.spec.bpmn.x20.TExpression timeDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().find_element_user(TIMEDATE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().add_element_user(TIMEDATE$0);
            }
            target.set(timeDate);
        }
    }
    
    /**
     * Appends and returns a new empty "timeDate" element
     */
    public org.omg.schema.spec.bpmn.x20.TExpression addNewTimeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().add_element_user(TIMEDATE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "timeDate" element
     */
    public void unsetTimeDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMEDATE$0, 0);
        }
    }
    
    /**
     * Gets the "timeCycle" element
     */
    public org.omg.schema.spec.bpmn.x20.TExpression getTimeCycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().find_element_user(TIMECYCLE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "timeCycle" element
     */
    public boolean isSetTimeCycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIMECYCLE$2) != 0;
        }
    }
    
    /**
     * Sets the "timeCycle" element
     */
    public void setTimeCycle(org.omg.schema.spec.bpmn.x20.TExpression timeCycle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().find_element_user(TIMECYCLE$2, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().add_element_user(TIMECYCLE$2);
            }
            target.set(timeCycle);
        }
    }
    
    /**
     * Appends and returns a new empty "timeCycle" element
     */
    public org.omg.schema.spec.bpmn.x20.TExpression addNewTimeCycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().add_element_user(TIMECYCLE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "timeCycle" element
     */
    public void unsetTimeCycle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIMECYCLE$2, 0);
        }
    }
}
