/*
 * An XML document type.
 * Localname: message
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.MessageDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one message(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class MessageDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.MessageDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "message");
    
    
    /**
     * Gets the "message" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessage getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessage target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessage)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "message" element
     */
    public void setMessage(org.omg.schema.spec.bpmn.x20.TMessage message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessage target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessage)get_store().find_element_user(MESSAGE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TMessage)get_store().add_element_user(MESSAGE$0);
            }
            target.set(message);
        }
    }
    
    /**
     * Appends and returns a new empty "message" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessage addNewMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessage target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessage)get_store().add_element_user(MESSAGE$0);
            return target;
        }
    }
}
