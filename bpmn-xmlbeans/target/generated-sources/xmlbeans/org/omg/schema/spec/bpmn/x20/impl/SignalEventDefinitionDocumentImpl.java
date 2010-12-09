/*
 * An XML document type.
 * Localname: signalEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.SignalEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one signalEventDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class SignalEventDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.EventDefinitionDocumentImpl implements org.omg.schema.spec.bpmn.x20.SignalEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public SignalEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNALEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "signalEventDefinition");
    
    
    /**
     * Gets the "signalEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TSignalEventDefinition getSignalEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSignalEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSignalEventDefinition)get_store().find_element_user(SIGNALEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "signalEventDefinition" element
     */
    public void setSignalEventDefinition(org.omg.schema.spec.bpmn.x20.TSignalEventDefinition signalEventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSignalEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSignalEventDefinition)get_store().find_element_user(SIGNALEVENTDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TSignalEventDefinition)get_store().add_element_user(SIGNALEVENTDEFINITION$0);
            }
            target.set(signalEventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "signalEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TSignalEventDefinition addNewSignalEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TSignalEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TSignalEventDefinition)get_store().add_element_user(SIGNALEVENTDEFINITION$0);
            return target;
        }
    }
}
