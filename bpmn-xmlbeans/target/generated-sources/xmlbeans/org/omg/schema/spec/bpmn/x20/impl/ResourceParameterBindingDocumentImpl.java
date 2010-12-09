/*
 * An XML document type.
 * Localname: resourceParameterBinding
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ResourceParameterBindingDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one resourceParameterBinding(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ResourceParameterBindingDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ResourceParameterBindingDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceParameterBindingDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEPARAMETERBINDING$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "resourceParameterBinding");
    
    
    /**
     * Gets the "resourceParameterBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TResourceParameterBinding getResourceParameterBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceParameterBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceParameterBinding)get_store().find_element_user(RESOURCEPARAMETERBINDING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceParameterBinding" element
     */
    public void setResourceParameterBinding(org.omg.schema.spec.bpmn.x20.TResourceParameterBinding resourceParameterBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceParameterBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceParameterBinding)get_store().find_element_user(RESOURCEPARAMETERBINDING$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TResourceParameterBinding)get_store().add_element_user(RESOURCEPARAMETERBINDING$0);
            }
            target.set(resourceParameterBinding);
        }
    }
    
    /**
     * Appends and returns a new empty "resourceParameterBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TResourceParameterBinding addNewResourceParameterBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceParameterBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceParameterBinding)get_store().add_element_user(RESOURCEPARAMETERBINDING$0);
            return target;
        }
    }
}
