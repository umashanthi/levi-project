/*
 * An XML document type.
 * Localname: terminateEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TerminateEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one terminateEventDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class TerminateEventDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.EventDefinitionDocumentImpl implements org.omg.schema.spec.bpmn.x20.TerminateEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public TerminateEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERMINATEEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "terminateEventDefinition");
    
    
    /**
     * Gets the "terminateEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TTerminateEventDefinition getTerminateEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTerminateEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTerminateEventDefinition)get_store().find_element_user(TERMINATEEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "terminateEventDefinition" element
     */
    public void setTerminateEventDefinition(org.omg.schema.spec.bpmn.x20.TTerminateEventDefinition terminateEventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTerminateEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTerminateEventDefinition)get_store().find_element_user(TERMINATEEVENTDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TTerminateEventDefinition)get_store().add_element_user(TERMINATEEVENTDEFINITION$0);
            }
            target.set(terminateEventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "terminateEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TTerminateEventDefinition addNewTerminateEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TTerminateEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TTerminateEventDefinition)get_store().add_element_user(TERMINATEEVENTDEFINITION$0);
            return target;
        }
    }
}
