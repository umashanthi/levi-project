/*
 * An XML document type.
 * Localname: subConversation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.SubConversationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one subConversation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class SubConversationDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.ConversationNodeDocumentImpl implements org.omg.schema.spec.bpmn.x20.SubConversationDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubConversationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBCONVERSATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "subConversation");
    
    
    /**
     * Gets the "subConversation" element
     */
    public org.omg.schema.spec.bpmn.x20.TSubConversation getSubConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSubConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSubConversation)get_store().find_element_user(SUBCONVERSATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subConversation" element
     */
    public void setSubConversation(org.omg.schema.spec.bpmn.x20.TSubConversation subConversation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSubConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSubConversation)get_store().find_element_user(SUBCONVERSATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TSubConversation)get_store().add_element_user(SUBCONVERSATION$0);
            }
            target.set(subConversation);
        }
    }
    
    /**
     * Appends and returns a new empty "subConversation" element
     */
    public org.omg.schema.spec.bpmn.x20.TSubConversation addNewSubConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSubConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSubConversation)get_store().add_element_user(SUBCONVERSATION$0);
            return target;
        }
    }
}
