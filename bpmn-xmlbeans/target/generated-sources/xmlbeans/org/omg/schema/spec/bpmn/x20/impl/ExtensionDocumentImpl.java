/*
 * An XML document type.
 * Localname: extension
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ExtensionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one extension(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ExtensionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ExtensionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtensionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENSION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "extension");
    
    
    /**
     * Gets the "extension" element
     */
    public org.omg.schema.spec.bpmn.x20.TExtension getExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExtension target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExtension)get_store().find_element_user(EXTENSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extension" element
     */
    public void setExtension(org.omg.schema.spec.bpmn.x20.TExtension extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExtension target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExtension)get_store().find_element_user(EXTENSION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TExtension)get_store().add_element_user(EXTENSION$0);
            }
            target.set(extension);
        }
    }
    
    /**
     * Appends and returns a new empty "extension" element
     */
    public org.omg.schema.spec.bpmn.x20.TExtension addNewExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExtension target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExtension)get_store().add_element_user(EXTENSION$0);
            return target;
        }
    }
}
