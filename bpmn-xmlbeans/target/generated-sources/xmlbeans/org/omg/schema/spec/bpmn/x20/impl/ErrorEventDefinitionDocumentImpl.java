/*
 * An XML document type.
 * Localname: errorEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ErrorEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one errorEventDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ErrorEventDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.EventDefinitionDocumentImpl implements org.omg.schema.spec.bpmn.x20.ErrorEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROREVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "errorEventDefinition");
    
    
    /**
     * Gets the "errorEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TErrorEventDefinition getErrorEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TErrorEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TErrorEventDefinition)get_store().find_element_user(ERROREVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "errorEventDefinition" element
     */
    public void setErrorEventDefinition(org.omg.schema.spec.bpmn.x20.TErrorEventDefinition errorEventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TErrorEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TErrorEventDefinition)get_store().find_element_user(ERROREVENTDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TErrorEventDefinition)get_store().add_element_user(ERROREVENTDEFINITION$0);
            }
            target.set(errorEventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "errorEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TErrorEventDefinition addNewErrorEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TErrorEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TErrorEventDefinition)get_store().add_element_user(ERROREVENTDEFINITION$0);
            return target;
        }
    }
}
