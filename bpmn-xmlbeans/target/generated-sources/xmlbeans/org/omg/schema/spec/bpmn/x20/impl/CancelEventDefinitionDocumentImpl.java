/*
 * An XML document type.
 * Localname: cancelEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CancelEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one cancelEventDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CancelEventDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.EventDefinitionDocumentImpl implements org.omg.schema.spec.bpmn.x20.CancelEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CancelEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CANCELEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "cancelEventDefinition");
    
    
    /**
     * Gets the "cancelEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TCancelEventDefinition getCancelEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCancelEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCancelEventDefinition)get_store().find_element_user(CANCELEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cancelEventDefinition" element
     */
    public void setCancelEventDefinition(org.omg.schema.spec.bpmn.x20.TCancelEventDefinition cancelEventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCancelEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCancelEventDefinition)get_store().find_element_user(CANCELEVENTDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCancelEventDefinition)get_store().add_element_user(CANCELEVENTDEFINITION$0);
            }
            target.set(cancelEventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "cancelEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TCancelEventDefinition addNewCancelEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCancelEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCancelEventDefinition)get_store().add_element_user(CANCELEVENTDEFINITION$0);
            return target;
        }
    }
}
