/*
 * An XML document type.
 * Localname: conversationAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ConversationAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one conversationAssociation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ConversationAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ConversationAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversationAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSATIONASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conversationAssociation");
    
    
    /**
     * Gets the "conversationAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversationAssociation getConversationAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationAssociation)get_store().find_element_user(CONVERSATIONASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversationAssociation" element
     */
    public void setConversationAssociation(org.omg.schema.spec.bpmn.x20.TConversationAssociation conversationAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationAssociation)get_store().find_element_user(CONVERSATIONASSOCIATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TConversationAssociation)get_store().add_element_user(CONVERSATIONASSOCIATION$0);
            }
            target.set(conversationAssociation);
        }
    }
    
    /**
     * Appends and returns a new empty "conversationAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversationAssociation addNewConversationAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationAssociation)get_store().add_element_user(CONVERSATIONASSOCIATION$0);
            return target;
        }
    }
}
