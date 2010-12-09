/*
 * An XML document type.
 * Localname: communication
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CommunicationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one communication(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CommunicationDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.ConversationNodeDocumentImpl implements org.omg.schema.spec.bpmn.x20.CommunicationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CommunicationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMUNICATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "communication");
    
    
    /**
     * Gets the "communication" element
     */
    public org.omg.schema.spec.bpmn.x20.TCommunication getCommunication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCommunication target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCommunication)get_store().find_element_user(COMMUNICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "communication" element
     */
    public void setCommunication(org.omg.schema.spec.bpmn.x20.TCommunication communication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCommunication target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCommunication)get_store().find_element_user(COMMUNICATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCommunication)get_store().add_element_user(COMMUNICATION$0);
            }
            target.set(communication);
        }
    }
    
    /**
     * Appends and returns a new empty "communication" element
     */
    public org.omg.schema.spec.bpmn.x20.TCommunication addNewCommunication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCommunication target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCommunication)get_store().add_element_user(COMMUNICATION$0);
            return target;
        }
    }
}
