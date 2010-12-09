/*
 * An XML document type.
 * Localname: resource
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ResourceDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one resource(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ResourceDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.ResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "resource");
    
    
    /**
     * Gets the "resource" element
     */
    public org.omg.schema.spec.bpmn.x20.TResource getResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResource target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResource)get_store().find_element_user(RESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resource" element
     */
    public void setResource(org.omg.schema.spec.bpmn.x20.TResource resource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResource target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResource)get_store().find_element_user(RESOURCE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TResource)get_store().add_element_user(RESOURCE$0);
            }
            target.set(resource);
        }
    }
    
    /**
     * Appends and returns a new empty "resource" element
     */
    public org.omg.schema.spec.bpmn.x20.TResource addNewResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResource target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResource)get_store().add_element_user(RESOURCE$0);
            return target;
        }
    }
}
