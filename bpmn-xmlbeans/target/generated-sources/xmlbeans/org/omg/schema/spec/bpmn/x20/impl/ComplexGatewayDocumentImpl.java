/*
 * An XML document type.
 * Localname: complexGateway
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ComplexGatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one complexGateway(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ComplexGatewayDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ComplexGatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComplexGatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLEXGATEWAY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "complexGateway");
    
    
    /**
     * Gets the "complexGateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TComplexGateway getComplexGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TComplexGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TComplexGateway)get_store().find_element_user(COMPLEXGATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "complexGateway" element
     */
    public void setComplexGateway(org.omg.schema.spec.bpmn.x20.TComplexGateway complexGateway)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TComplexGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TComplexGateway)get_store().find_element_user(COMPLEXGATEWAY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TComplexGateway)get_store().add_element_user(COMPLEXGATEWAY$0);
            }
            target.set(complexGateway);
        }
    }
    
    /**
     * Appends and returns a new empty "complexGateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TComplexGateway addNewComplexGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TComplexGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TComplexGateway)get_store().add_element_user(COMPLEXGATEWAY$0);
            return target;
        }
    }
}
