/*
 * An XML document type.
 * Localname: callConversation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CallConversationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one callConversation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CallConversationDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.ConversationNodeDocumentImpl implements org.omg.schema.spec.bpmn.x20.CallConversationDocument
{
    private static final long serialVersionUID = 1L;
    
    public CallConversationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLCONVERSATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "callConversation");
    
    
    /**
     * Gets the "callConversation" element
     */
    public org.omg.schema.spec.bpmn.x20.TCallConversation getCallConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallConversation)get_store().find_element_user(CALLCONVERSATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "callConversation" element
     */
    public void setCallConversation(org.omg.schema.spec.bpmn.x20.TCallConversation callConversation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallConversation)get_store().find_element_user(CALLCONVERSATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCallConversation)get_store().add_element_user(CALLCONVERSATION$0);
            }
            target.set(callConversation);
        }
    }
    
    /**
     * Appends and returns a new empty "callConversation" element
     */
    public org.omg.schema.spec.bpmn.x20.TCallConversation addNewCallConversation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallConversation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallConversation)get_store().add_element_user(CALLCONVERSATION$0);
            return target;
        }
    }
}
