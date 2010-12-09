/*
 * An XML document type.
 * Localname: inclusiveGateway
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.InclusiveGatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one inclusiveGateway(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class InclusiveGatewayDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.InclusiveGatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public InclusiveGatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUSIVEGATEWAY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "inclusiveGateway");
    
    
    /**
     * Gets the "inclusiveGateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TInclusiveGateway getInclusiveGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInclusiveGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInclusiveGateway)get_store().find_element_user(INCLUSIVEGATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "inclusiveGateway" element
     */
    public void setInclusiveGateway(org.omg.schema.spec.bpmn.x20.TInclusiveGateway inclusiveGateway)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInclusiveGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInclusiveGateway)get_store().find_element_user(INCLUSIVEGATEWAY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TInclusiveGateway)get_store().add_element_user(INCLUSIVEGATEWAY$0);
            }
            target.set(inclusiveGateway);
        }
    }
    
    /**
     * Appends and returns a new empty "inclusiveGateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TInclusiveGateway addNewInclusiveGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInclusiveGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInclusiveGateway)get_store().add_element_user(INCLUSIVEGATEWAY$0);
            return target;
        }
    }
}
