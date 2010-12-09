/*
 * XML Type:  tCompensateEventDefinition
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCompensateEventDefinition(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCompensateEventDefinitionImpl extends org.omg.schema.spec.bpmn.x20.impl.TEventDefinitionImpl implements org.omg.schema.spec.bpmn.x20.TCompensateEventDefinition
{
    private static final long serialVersionUID = 1L;
    
    public TCompensateEventDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WAITFORCOMPLETION$0 = 
        new javax.xml.namespace.QName("", "waitForCompletion");
    private static final javax.xml.namespace.QName ACTIVITYREF$2 = 
        new javax.xml.namespace.QName("", "activityRef");
    
    
    /**
     * Gets the "waitForCompletion" attribute
     */
    public boolean getWaitForCompletion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITFORCOMPLETION$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "waitForCompletion" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetWaitForCompletion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WAITFORCOMPLETION$0);
            return target;
        }
    }
    
    /**
     * True if has "waitForCompletion" attribute
     */
    public boolean isSetWaitForCompletion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WAITFORCOMPLETION$0) != null;
        }
    }
    
    /**
     * Sets the "waitForCompletion" attribute
     */
    public void setWaitForCompletion(boolean waitForCompletion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WAITFORCOMPLETION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WAITFORCOMPLETION$0);
            }
            target.setBooleanValue(waitForCompletion);
        }
    }
    
    /**
     * Sets (as xml) the "waitForCompletion" attribute
     */
    public void xsetWaitForCompletion(org.apache.xmlbeans.XmlBoolean waitForCompletion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(WAITFORCOMPLETION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(WAITFORCOMPLETION$0);
            }
            target.set(waitForCompletion);
        }
    }
    
    /**
     * Unsets the "waitForCompletion" attribute
     */
    public void unsetWaitForCompletion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WAITFORCOMPLETION$0);
        }
    }
    
    /**
     * Gets the "activityRef" attribute
     */
    public javax.xml.namespace.QName getActivityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVITYREF$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "activityRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetActivityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ACTIVITYREF$2);
            return target;
        }
    }
    
    /**
     * True if has "activityRef" attribute
     */
    public boolean isSetActivityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ACTIVITYREF$2) != null;
        }
    }
    
    /**
     * Sets the "activityRef" attribute
     */
    public void setActivityRef(javax.xml.namespace.QName activityRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ACTIVITYREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ACTIVITYREF$2);
            }
            target.setQNameValue(activityRef);
        }
    }
    
    /**
     * Sets (as xml) the "activityRef" attribute
     */
    public void xsetActivityRef(org.apache.xmlbeans.XmlQName activityRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ACTIVITYREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ACTIVITYREF$2);
            }
            target.set(activityRef);
        }
    }
    
    /**
     * Unsets the "activityRef" attribute
     */
    public void unsetActivityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ACTIVITYREF$2);
        }
    }
}
