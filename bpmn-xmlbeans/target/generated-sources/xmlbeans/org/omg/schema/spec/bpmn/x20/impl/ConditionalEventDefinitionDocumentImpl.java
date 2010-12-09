/*
 * An XML document type.
 * Localname: conditionalEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ConditionalEventDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one conditionalEventDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ConditionalEventDefinitionDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.EventDefinitionDocumentImpl implements org.omg.schema.spec.bpmn.x20.ConditionalEventDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConditionalEventDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDITIONALEVENTDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conditionalEventDefinition");
    
    
    /**
     * Gets the "conditionalEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition getConditionalEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition)get_store().find_element_user(CONDITIONALEVENTDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conditionalEventDefinition" element
     */
    public void setConditionalEventDefinition(org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition conditionalEventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition)get_store().find_element_user(CONDITIONALEVENTDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition)get_store().add_element_user(CONDITIONALEVENTDEFINITION$0);
            }
            target.set(conditionalEventDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "conditionalEventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition addNewConditionalEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TConditionalEventDefinition)get_store().add_element_user(CONDITIONALEVENTDEFINITION$0);
            return target;
        }
    }
}
