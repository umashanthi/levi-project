/*
 * An XML document type.
 * Localname: exclusiveGateway
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ExclusiveGatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one exclusiveGateway(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ExclusiveGatewayDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ExclusiveGatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExclusiveGatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXCLUSIVEGATEWAY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "exclusiveGateway");
    
    
    /**
     * Gets the "exclusiveGateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TExclusiveGateway getExclusiveGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExclusiveGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExclusiveGateway)get_store().find_element_user(EXCLUSIVEGATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "exclusiveGateway" element
     */
    public void setExclusiveGateway(org.omg.schema.spec.bpmn.x20.TExclusiveGateway exclusiveGateway)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExclusiveGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExclusiveGateway)get_store().find_element_user(EXCLUSIVEGATEWAY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TExclusiveGateway)get_store().add_element_user(EXCLUSIVEGATEWAY$0);
            }
            target.set(exclusiveGateway);
        }
    }
    
    /**
     * Appends and returns a new empty "exclusiveGateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TExclusiveGateway addNewExclusiveGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExclusiveGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExclusiveGateway)get_store().add_element_user(EXCLUSIVEGATEWAY$0);
            return target;
        }
    }
}
