/*
 * An XML document type.
 * Localname: startEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.StartEventDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one startEvent(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class StartEventDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.StartEventDocument
{
    private static final long serialVersionUID = 1L;
    
    public StartEventDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STARTEVENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "startEvent");
    
    
    /**
     * Gets the "startEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TStartEvent getStartEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TStartEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TStartEvent)get_store().find_element_user(STARTEVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "startEvent" element
     */
    public void setStartEvent(org.omg.schema.spec.bpmn.x20.TStartEvent startEvent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TStartEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TStartEvent)get_store().find_element_user(STARTEVENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TStartEvent)get_store().add_element_user(STARTEVENT$0);
            }
            target.set(startEvent);
        }
    }
    
    /**
     * Appends and returns a new empty "startEvent" element
     */
    public org.omg.schema.spec.bpmn.x20.TStartEvent addNewStartEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TStartEvent target = null;
            target = (org.omg.schema.spec.bpmn.x20.TStartEvent)get_store().add_element_user(STARTEVENT$0);
            return target;
        }
    }
}
