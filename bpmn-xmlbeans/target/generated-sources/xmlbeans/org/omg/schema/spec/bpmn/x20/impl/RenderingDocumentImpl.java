/*
 * An XML document type.
 * Localname: rendering
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.RenderingDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one rendering(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class RenderingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.RenderingDocument
{
    private static final long serialVersionUID = 1L;
    
    public RenderingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERING$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "rendering");
    
    
    /**
     * Gets the "rendering" element
     */
    public org.omg.schema.spec.bpmn.x20.TRendering getRendering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRendering target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRendering)get_store().find_element_user(RENDERING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rendering" element
     */
    public void setRendering(org.omg.schema.spec.bpmn.x20.TRendering rendering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRendering target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRendering)get_store().find_element_user(RENDERING$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TRendering)get_store().add_element_user(RENDERING$0);
            }
            target.set(rendering);
        }
    }
    
    /**
     * Appends and returns a new empty "rendering" element
     */
    public org.omg.schema.spec.bpmn.x20.TRendering addNewRendering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRendering target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRendering)get_store().add_element_user(RENDERING$0);
            return target;
        }
    }
}
