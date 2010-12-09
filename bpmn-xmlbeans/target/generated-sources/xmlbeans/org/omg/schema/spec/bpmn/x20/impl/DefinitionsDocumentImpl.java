/*
 * An XML document type.
 * Localname: definitions
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.DefinitionsDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one definitions(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class DefinitionsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.DefinitionsDocument
{
    private static final long serialVersionUID = 1L;
    
    public DefinitionsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DEFINITIONS$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "definitions");
    
    
    /**
     * Gets the "definitions" element
     */
    public org.omg.schema.spec.bpmn.x20.TDefinitions getDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDefinitions target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDefinitions)get_store().find_element_user(DEFINITIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "definitions" element
     */
    public void setDefinitions(org.omg.schema.spec.bpmn.x20.TDefinitions definitions)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDefinitions target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDefinitions)get_store().find_element_user(DEFINITIONS$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDefinitions)get_store().add_element_user(DEFINITIONS$0);
            }
            target.set(definitions);
        }
    }
    
    /**
     * Appends and returns a new empty "definitions" element
     */
    public org.omg.schema.spec.bpmn.x20.TDefinitions addNewDefinitions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDefinitions target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDefinitions)get_store().add_element_user(DEFINITIONS$0);
            return target;
        }
    }
}
