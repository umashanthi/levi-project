/*
 * An XML document type.
 * Localname: eventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.EventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one eventDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class EventDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.EventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "eventDefinition");
    private static final org.apache.xmlbeans.QNameSet EVENTDEFINITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "errorEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "signalEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "compensateEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "linkEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "timerEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conditionalEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "eventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "cancelEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "escalationEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "terminateEventDefinition"),
    });
    
    
    /**
     * Gets the "eventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TEventDefinition getEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventDefinition)get_store().find_element_user(EVENTDEFINITION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eventDefinition" element
     */
    public void setEventDefinition(org.omg.schema.spec.bpmn.x20.TEventDefinition eventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventDefinition)get_store().find_element_user(EVENTDEFINITION$1, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TEventDefinition)get_store().add_element_user(EVENTDEFINITION$0);
            }
            target.set(eventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "eventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TEventDefinition addNewEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventDefinition)get_store().add_element_user(EVENTDEFINITION$0);
            return target;
        }
    }
}
