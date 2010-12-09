/*
 * XML Type:  tAdHocSubProcess
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TAdHocSubProcess
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tAdHocSubProcess(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TAdHocSubProcessImpl extends org.omg.schema.spec.bpmn.x20.impl.TSubProcessImpl implements org.omg.schema.spec.bpmn.x20.TAdHocSubProcess
{
    private static final long serialVersionUID = 1L;
    
    public TAdHocSubProcessImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLETIONCONDITION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "completionCondition");
    private static final javax.xml.namespace.QName CANCELREMAININGINSTANCES$2 = 
        new javax.xml.namespace.QName("", "cancelRemainingInstances");
    private static final javax.xml.namespace.QName ORDERING$4 = 
        new javax.xml.namespace.QName("", "ordering");
    
    
    /**
     * Gets the "completionCondition" element
     */
    public org.omg.schema.spec.bpmn.x20.TExpression getCompletionCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().find_element_user(COMPLETIONCONDITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "completionCondition" element
     */
    public boolean isSetCompletionCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLETIONCONDITION$0) != 0;
        }
    }
    
    /**
     * Sets the "completionCondition" element
     */
    public void setCompletionCondition(org.omg.schema.spec.bpmn.x20.TExpression completionCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().find_element_user(COMPLETIONCONDITION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().add_element_user(COMPLETIONCONDITION$0);
            }
            target.set(completionCondition);
        }
    }
    
    /**
     * Appends and returns a new empty "completionCondition" element
     */
    public org.omg.schema.spec.bpmn.x20.TExpression addNewCompletionCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExpression)get_store().add_element_user(COMPLETIONCONDITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "completionCondition" element
     */
    public void unsetCompletionCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLETIONCONDITION$0, 0);
        }
    }
    
    /**
     * Gets the "cancelRemainingInstances" attribute
     */
    public boolean getCancelRemainingInstances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANCELREMAININGINSTANCES$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CANCELREMAININGINSTANCES$2);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "cancelRemainingInstances" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCancelRemainingInstances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CANCELREMAININGINSTANCES$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(CANCELREMAININGINSTANCES$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "cancelRemainingInstances" attribute
     */
    public boolean isSetCancelRemainingInstances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CANCELREMAININGINSTANCES$2) != null;
        }
    }
    
    /**
     * Sets the "cancelRemainingInstances" attribute
     */
    public void setCancelRemainingInstances(boolean cancelRemainingInstances)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CANCELREMAININGINSTANCES$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CANCELREMAININGINSTANCES$2);
            }
            target.setBooleanValue(cancelRemainingInstances);
        }
    }
    
    /**
     * Sets (as xml) the "cancelRemainingInstances" attribute
     */
    public void xsetCancelRemainingInstances(org.apache.xmlbeans.XmlBoolean cancelRemainingInstances)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(CANCELREMAININGINSTANCES$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(CANCELREMAININGINSTANCES$2);
            }
            target.set(cancelRemainingInstances);
        }
    }
    
    /**
     * Unsets the "cancelRemainingInstances" attribute
     */
    public void unsetCancelRemainingInstances()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CANCELREMAININGINSTANCES$2);
        }
    }
    
    /**
     * Gets the "ordering" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TAdHocOrdering.Enum getOrdering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDERING$4);
            if (target == null)
            {
                return null;
            }
            return (org.omg.schema.spec.bpmn.x20.TAdHocOrdering.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ordering" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TAdHocOrdering xgetOrdering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAdHocOrdering target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAdHocOrdering)get_store().find_attribute_user(ORDERING$4);
            return target;
        }
    }
    
    /**
     * True if has "ordering" attribute
     */
    public boolean isSetOrdering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORDERING$4) != null;
        }
    }
    
    /**
     * Sets the "ordering" attribute
     */
    public void setOrdering(org.omg.schema.spec.bpmn.x20.TAdHocOrdering.Enum ordering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDERING$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDERING$4);
            }
            target.setEnumValue(ordering);
        }
    }
    
    /**
     * Sets (as xml) the "ordering" attribute
     */
    public void xsetOrdering(org.omg.schema.spec.bpmn.x20.TAdHocOrdering ordering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAdHocOrdering target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAdHocOrdering)get_store().find_attribute_user(ORDERING$4);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TAdHocOrdering)get_store().add_attribute_user(ORDERING$4);
            }
            target.set(ordering);
        }
    }
    
    /**
     * Unsets the "ordering" attribute
     */
    public void unsetOrdering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORDERING$4);
        }
    }
}
