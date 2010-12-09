/*
 * An XML document type.
 * Localname: property
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.PropertyDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one property(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class PropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.PropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public PropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROPERTY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "property");
    
    
    /**
     * Gets the "property" element
     */
    public org.omg.schema.spec.bpmn.x20.TProperty getProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProperty target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "property" element
     */
    public void setProperty(org.omg.schema.spec.bpmn.x20.TProperty property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProperty target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().find_element_user(PROPERTY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().add_element_user(PROPERTY$0);
            }
            target.set(property);
        }
    }
    
    /**
     * Appends and returns a new empty "property" element
     */
    public org.omg.schema.spec.bpmn.x20.TProperty addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProperty target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().add_element_user(PROPERTY$0);
            return target;
        }
    }
}
