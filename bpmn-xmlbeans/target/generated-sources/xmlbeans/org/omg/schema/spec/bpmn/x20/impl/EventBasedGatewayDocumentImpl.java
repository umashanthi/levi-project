/*
 * An XML document type.
 * Localname: eventBasedGateway
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.EventBasedGatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one eventBasedGateway(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class EventBasedGatewayDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.EventBasedGatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventBasedGatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTBASEDGATEWAY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "eventBasedGateway");
    
    
    /**
     * Gets the "eventBasedGateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TEventBasedGateway getEventBasedGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventBasedGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventBasedGateway)get_store().find_element_user(EVENTBASEDGATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eventBasedGateway" element
     */
    public void setEventBasedGateway(org.omg.schema.spec.bpmn.x20.TEventBasedGateway eventBasedGateway)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventBasedGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventBasedGateway)get_store().find_element_user(EVENTBASEDGATEWAY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TEventBasedGateway)get_store().add_element_user(EVENTBASEDGATEWAY$0);
            }
            target.set(eventBasedGateway);
        }
    }
    
    /**
     * Appends and returns a new empty "eventBasedGateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TEventBasedGateway addNewEventBasedGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventBasedGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventBasedGateway)get_store().add_element_user(EVENTBASEDGATEWAY$0);
            return target;
        }
    }
}
