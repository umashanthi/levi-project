/*
 * An XML document type.
 * Localname: messageFlowAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.MessageFlowAssociationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one messageFlowAssociation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class MessageFlowAssociationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.MessageFlowAssociationDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageFlowAssociationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEFLOWASSOCIATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageFlowAssociation");
    
    
    /**
     * Gets the "messageFlowAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation getMessageFlowAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation)get_store().find_element_user(MESSAGEFLOWASSOCIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messageFlowAssociation" element
     */
    public void setMessageFlowAssociation(org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation messageFlowAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation)get_store().find_element_user(MESSAGEFLOWASSOCIATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation)get_store().add_element_user(MESSAGEFLOWASSOCIATION$0);
            }
            target.set(messageFlowAssociation);
        }
    }
    
    /**
     * Appends and returns a new empty "messageFlowAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation addNewMessageFlowAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageFlowAssociation)get_store().add_element_user(MESSAGEFLOWASSOCIATION$0);
            return target;
        }
    }
}
