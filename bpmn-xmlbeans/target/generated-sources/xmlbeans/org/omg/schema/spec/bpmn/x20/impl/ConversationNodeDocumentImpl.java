/*
 * An XML document type.
 * Localname: conversationNode
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ConversationNodeDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one conversationNode(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ConversationNodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ConversationNodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversationNodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSATIONNODE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conversationNode");
    private static final org.apache.xmlbeans.QNameSet CONVERSATIONNODE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "communication"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conversationNode"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "callConversation"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "subConversation"),
    });
    
    
    /**
     * Gets the "conversationNode" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversationNode getConversationNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationNode target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationNode)get_store().find_element_user(CONVERSATIONNODE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversationNode" element
     */
    public void setConversationNode(org.omg.schema.spec.bpmn.x20.TConversationNode conversationNode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationNode target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationNode)get_store().find_element_user(CONVERSATIONNODE$1, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TConversationNode)get_store().add_element_user(CONVERSATIONNODE$0);
            }
            target.set(conversationNode);
        }
    }
    
    /**
     * Appends and returns a new empty "conversationNode" element
     */
    public org.omg.schema.spec.bpmn.x20.TConversationNode addNewConversationNode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConversationNode target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConversationNode)get_store().add_element_user(CONVERSATIONNODE$0);
            return target;
        }
    }
}
