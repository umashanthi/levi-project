/*
 * An XML document type.
 * Localname: endPoint
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.EndPointDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one endPoint(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class EndPointDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.EndPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public EndPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "endPoint");
    
    
    /**
     * Gets the "endPoint" element
     */
    public org.omg.schema.spec.bpmn.x20.TEndPoint getEndPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEndPoint target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEndPoint)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "endPoint" element
     */
    public void setEndPoint(org.omg.schema.spec.bpmn.x20.TEndPoint endPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEndPoint target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEndPoint)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TEndPoint)get_store().add_element_user(ENDPOINT$0);
            }
            target.set(endPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "endPoint" element
     */
    public org.omg.schema.spec.bpmn.x20.TEndPoint addNewEndPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEndPoint target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEndPoint)get_store().add_element_user(ENDPOINT$0);
            return target;
        }
    }
}
