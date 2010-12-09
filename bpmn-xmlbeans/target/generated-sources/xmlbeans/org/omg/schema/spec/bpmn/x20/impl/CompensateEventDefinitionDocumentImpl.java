/*
 * An XML document type.
 * Localname: compensateEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CompensateEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one compensateEventDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CompensateEventDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.EventDefinitionDocumentImpl implements org.omg.schema.spec.bpmn.x20.CompensateEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompensateEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPENSATEEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "compensateEventDefinition");
    
    
    /**
     * Gets the "compensateEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition getCompensateEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition)get_store().find_element_user(COMPENSATEEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "compensateEventDefinition" element
     */
    public void setCompensateEventDefinition(org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition compensateEventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition)get_store().find_element_user(COMPENSATEEVENTDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition)get_store().add_element_user(COMPENSATEEVENTDEFINITION$0);
            }
            target.set(compensateEventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "compensateEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition addNewCompensateEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition)get_store().add_element_user(COMPENSATEEVENTDEFINITION$0);
            return target;
        }
    }
}
