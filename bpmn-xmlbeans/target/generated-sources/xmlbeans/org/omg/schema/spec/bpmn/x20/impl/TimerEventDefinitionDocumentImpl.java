/*
 * An XML document type.
 * Localname: timerEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TimerEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one timerEventDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class TimerEventDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.EventDefinitionDocumentImpl implements org.omg.schema.spec.bpmn.x20.TimerEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public TimerEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIMEREVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "timerEventDefinition");
    
    
    /**
     * Gets the "timerEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TTimerEventDefinition getTimerEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTimerEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTimerEventDefinition)get_store().find_element_user(TIMEREVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "timerEventDefinition" element
     */
    public void setTimerEventDefinition(org.omg.schema.spec.bpmn.x20.TTimerEventDefinition timerEventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTimerEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTimerEventDefinition)get_store().find_element_user(TIMEREVENTDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TTimerEventDefinition)get_store().add_element_user(TIMEREVENTDEFINITION$0);
            }
            target.set(timerEventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "timerEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TTimerEventDefinition addNewTimerEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTimerEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTimerEventDefinition)get_store().add_element_user(TIMEREVENTDEFINITION$0);
            return target;
        }
    }
}
