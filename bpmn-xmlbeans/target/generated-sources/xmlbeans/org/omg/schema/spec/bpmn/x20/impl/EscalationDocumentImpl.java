/*
 * An XML document type.
 * Localname: escalation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.EscalationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one escalation(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class EscalationDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.EscalationDocument
{
    private static final long serialVersionUID = 1L;
    
    public EscalationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ESCALATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "escalation");
    
    
    /**
     * Gets the "escalation" element
     */
    public org.omg.schema.spec.bpmn.x20.TEscalation getEscalation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEscalation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEscalation)get_store().find_element_user(ESCALATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "escalation" element
     */
    public void setEscalation(org.omg.schema.spec.bpmn.x20.TEscalation escalation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEscalation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEscalation)get_store().find_element_user(ESCALATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TEscalation)get_store().add_element_user(ESCALATION$0);
            }
            target.set(escalation);
        }
    }
    
    /**
     * Appends and returns a new empty "escalation" element
     */
    public org.omg.schema.spec.bpmn.x20.TEscalation addNewEscalation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEscalation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEscalation)get_store().add_element_user(ESCALATION$0);
            return target;
        }
    }
}
