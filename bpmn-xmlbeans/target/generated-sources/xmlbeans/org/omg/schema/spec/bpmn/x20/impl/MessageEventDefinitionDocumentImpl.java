/*
 * An XML document type.
 * Localname: messageEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.MessageEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one messageEventDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class MessageEventDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.EventDefinitionDocumentImpl implements org.omg.schema.spec.bpmn.x20.MessageEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGEEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageEventDefinition");
    
    
    /**
     * Gets the "messageEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessageEventDefinition getMessageEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageEventDefinition)get_store().find_element_user(MESSAGEEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messageEventDefinition" element
     */
    public void setMessageEventDefinition(org.omg.schema.spec.bpmn.x20.TMessageEventDefinition messageEventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageEventDefinition)get_store().find_element_user(MESSAGEEVENTDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TMessageEventDefinition)get_store().add_element_user(MESSAGEEVENTDEFINITION$0);
            }
            target.set(messageEventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "messageEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TMessageEventDefinition addNewMessageEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMessageEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMessageEventDefinition)get_store().add_element_user(MESSAGEEVENTDEFINITION$0);
            return target;
        }
    }
}
