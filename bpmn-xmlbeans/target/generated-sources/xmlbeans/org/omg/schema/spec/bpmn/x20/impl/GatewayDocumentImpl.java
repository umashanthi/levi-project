/*
 * An XML document type.
 * Localname: gateway
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.GatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one gateway(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class GatewayDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.GatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public GatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GATEWAY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "gateway");
    
    
    /**
     * Gets the "gateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TGateway getGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGateway)get_store().find_element_user(GATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "gateway" element
     */
    public void setGateway(org.omg.schema.spec.bpmn.x20.TGateway gateway)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGateway)get_store().find_element_user(GATEWAY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TGateway)get_store().add_element_user(GATEWAY$0);
            }
            target.set(gateway);
        }
    }
    
    /**
     * Appends and returns a new empty "gateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TGateway addNewGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGateway)get_store().add_element_user(GATEWAY$0);
            return target;
        }
    }
}
