/*
 * An XML document type.
 * Localname: complexBehaviorDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ComplexBehaviorDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one complexBehaviorDefinition(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ComplexBehaviorDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ComplexBehaviorDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ComplexBehaviorDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLEXBEHAVIORDEFINITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "complexBehaviorDefinition");
    
    
    /**
     * Gets the "complexBehaviorDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition getComplexBehaviorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition)get_store().find_element_user(COMPLEXBEHAVIORDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "complexBehaviorDefinition" element
     */
    public void setComplexBehaviorDefinition(org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition complexBehaviorDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition)get_store().find_element_user(COMPLEXBEHAVIORDEFINITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition)get_store().add_element_user(COMPLEXBEHAVIORDEFINITION$0);
            }
            target.set(complexBehaviorDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "complexBehaviorDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition addNewComplexBehaviorDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TComplexBehaviorDefinition)get_store().add_element_user(COMPLEXBEHAVIORDEFINITION$0);
            return target;
        }
    }
}
