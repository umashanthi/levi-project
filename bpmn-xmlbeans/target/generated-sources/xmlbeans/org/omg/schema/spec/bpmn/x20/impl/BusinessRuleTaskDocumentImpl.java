/*
 * An XML document type.
 * Localname: businessRuleTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.BusinessRuleTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one businessRuleTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class BusinessRuleTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.FlowElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.BusinessRuleTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public BusinessRuleTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUSINESSRULETASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "businessRuleTask");
    
    
    /**
     * Gets the "businessRuleTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TBusinessRuleTask getBusinessRuleTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBusinessRuleTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBusinessRuleTask)get_store().find_element_user(BUSINESSRULETASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "businessRuleTask" element
     */
    public void setBusinessRuleTask(org.omg.schema.spec.bpmn.x20.TBusinessRuleTask businessRuleTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBusinessRuleTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBusinessRuleTask)get_store().find_element_user(BUSINESSRULETASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TBusinessRuleTask)get_store().add_element_user(BUSINESSRULETASK$0);
            }
            target.set(businessRuleTask);
        }
    }
    
    /**
     * Appends and returns a new empty "businessRuleTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TBusinessRuleTask addNewBusinessRuleTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBusinessRuleTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBusinessRuleTask)get_store().add_element_user(BUSINESSRULETASK$0);
            return target;
        }
    }
}
