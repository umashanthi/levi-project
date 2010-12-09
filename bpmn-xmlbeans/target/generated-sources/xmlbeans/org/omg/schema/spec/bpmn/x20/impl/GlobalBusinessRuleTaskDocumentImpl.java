/*
 * An XML document type.
 * Localname: globalBusinessRuleTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.GlobalBusinessRuleTaskDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one globalBusinessRuleTask(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class GlobalBusinessRuleTaskDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.GlobalBusinessRuleTaskDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalBusinessRuleTaskDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALBUSINESSRULETASK$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalBusinessRuleTask");
    
    
    /**
     * Gets the "globalBusinessRuleTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalBusinessRuleTask getGlobalBusinessRuleTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalBusinessRuleTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalBusinessRuleTask)get_store().find_element_user(GLOBALBUSINESSRULETASK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalBusinessRuleTask" element
     */
    public void setGlobalBusinessRuleTask(org.omg.schema.spec.bpmn.x20.TGlobalBusinessRuleTask globalBusinessRuleTask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalBusinessRuleTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalBusinessRuleTask)get_store().find_element_user(GLOBALBUSINESSRULETASK$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TGlobalBusinessRuleTask)get_store().add_element_user(GLOBALBUSINESSRULETASK$0);
            }
            target.set(globalBusinessRuleTask);
        }
    }
    
    /**
     * Appends and returns a new empty "globalBusinessRuleTask" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalBusinessRuleTask addNewGlobalBusinessRuleTask()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalBusinessRuleTask target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalBusinessRuleTask)get_store().add_element_user(GLOBALBUSINESSRULETASK$0);
            return target;
        }
    }
}
