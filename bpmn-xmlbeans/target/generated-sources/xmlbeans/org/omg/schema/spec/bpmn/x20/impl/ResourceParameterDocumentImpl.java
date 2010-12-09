/*
 * An XML document type.
 * Localname: resourceParameter
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ResourceParameterDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one resourceParameter(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ResourceParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ResourceParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEPARAMETER$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "resourceParameter");
    
    
    /**
     * Gets the "resourceParameter" element
     */
    public org.omg.schema.spec.bpmn.x20.TResourceParameter getResourceParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceParameter target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceParameter)get_store().find_element_user(RESOURCEPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceParameter" element
     */
    public void setResourceParameter(org.omg.schema.spec.bpmn.x20.TResourceParameter resourceParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceParameter target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceParameter)get_store().find_element_user(RESOURCEPARAMETER$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TResourceParameter)get_store().add_element_user(RESOURCEPARAMETER$0);
            }
            target.set(resourceParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "resourceParameter" element
     */
    public org.omg.schema.spec.bpmn.x20.TResourceParameter addNewResourceParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceParameter target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceParameter)get_store().add_element_user(RESOURCEPARAMETER$0);
            return target;
        }
    }
}
