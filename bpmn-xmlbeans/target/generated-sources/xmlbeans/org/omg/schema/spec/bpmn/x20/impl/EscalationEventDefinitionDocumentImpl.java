/*
 * An XML document type.
 * Localname: escalationEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.EscalationEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one escalationEventDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class EscalationEventDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.EventDefinitionDocumentImpl implements org.omg.schema.spec.bpmn.x20.EscalationEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public EscalationEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESCALATIONEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "escalationEventDefinition");
    
    
    /**
     * Gets the "escalationEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition getEscalationEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition)get_store().find_element_user(ESCALATIONEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "escalationEventDefinition" element
     */
    public void setEscalationEventDefinition(org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition escalationEventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition)get_store().find_element_user(ESCALATIONEVENTDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition)get_store().add_element_user(ESCALATIONEVENTDEFINITION$0);
            }
            target.set(escalationEventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "escalationEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition addNewEscalationEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEscalationEventDefinition)get_store().add_element_user(ESCALATIONEVENTDEFINITION$0);
            return target;
        }
    }
}
