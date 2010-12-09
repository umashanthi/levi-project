/*
 * An XML document type.
 * Localname: conversation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ConversationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one conversation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ConversationDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ConversationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conversation");
    
    
    /**
     * Gets the "conversation" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversation getConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversation)get_store().find_element_user(CONVERSATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversation" element
     */
    public void setConversation(org.omg.schema.spec.bpmn.x20.TConversation conversation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversation)get_store().find_element_user(CONVERSATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TConversation)get_store().add_element_user(CONVERSATION$0);
            }
            target.set(conversation);
        }
    }
    
    /**
     * Appends and returns a new empty "conversation" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversation addNewConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversation)get_store().add_element_user(CONVERSATION$0);
            return target;
        }
    }
}
