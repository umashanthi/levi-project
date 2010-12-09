/*
 * An XML document type.
 * Localname: documentation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.DocumentationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one documentation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class DocumentationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.DocumentationDocument
{
    private static final long serialVersionUID = 1L;
    
    public DocumentationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "documentation");
    
    
    /**
     * Gets the "documentation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDocumentation getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDocumentation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDocumentation)get_store().find_element_user(DOCUMENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "documentation" element
     */
    public void setDocumentation(org.omg.schema.spec.bpmn.x20.TDocumentation documentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDocumentation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDocumentation)get_store().find_element_user(DOCUMENTATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDocumentation)get_store().add_element_user(DOCUMENTATION$0);
            }
            target.set(documentation);
        }
    }
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDocumentation addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDocumentation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDocumentation)get_store().add_element_user(DOCUMENTATION$0);
            return target;
        }
    }
}
