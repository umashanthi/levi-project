/*
 * An XML document type.
 * Localname: parallelGateway
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ParallelGatewayDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one parallelGateway(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ParallelGatewayDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ParallelGatewayDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParallelGatewayDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARALLELGATEWAY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "parallelGateway");
    
    
    /**
     * Gets the "parallelGateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TParallelGateway getParallelGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParallelGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParallelGateway)get_store().find_element_user(PARALLELGATEWAY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parallelGateway" element
     */
    public void setParallelGateway(org.omg.schema.spec.bpmn.x20.TParallelGateway parallelGateway)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParallelGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParallelGateway)get_store().find_element_user(PARALLELGATEWAY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TParallelGateway)get_store().add_element_user(PARALLELGATEWAY$0);
            }
            target.set(parallelGateway);
        }
    }
    
    /**
     * Appends and returns a new empty "parallelGateway" element
     */
    public org.omg.schema.spec.bpmn.x20.TParallelGateway addNewParallelGateway()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParallelGateway target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParallelGateway)get_store().add_element_user(PARALLELGATEWAY$0);
            return target;
        }
    }
}
