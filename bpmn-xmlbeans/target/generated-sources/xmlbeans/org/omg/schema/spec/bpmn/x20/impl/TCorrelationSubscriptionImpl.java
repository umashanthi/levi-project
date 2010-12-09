/*
 * XML Type:  tCorrelationSubscription
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCorrelationSubscription
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCorrelationSubscription(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCorrelationSubscriptionImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TCorrelationSubscription
{
    private static final long serialVersionUID = 1L;
    
    public TCorrelationSubscriptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONPROPERTYBINDING$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "correlationPropertyBinding");
    private static final javax.xml.namespace.QName PROCESS$2 = 
        new javax.xml.namespace.QName("", "process");
    private static final javax.xml.namespace.QName CORRELATIONKEYREF$4 = 
        new javax.xml.namespace.QName("", "correlationKeyRef");
    
    
    /**
     * Gets array of all "correlationPropertyBinding" elements
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding[] getCorrelationPropertyBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CORRELATIONPROPERTYBINDING$0, targetList);
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding[] result = new org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "correlationPropertyBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding getCorrelationPropertyBindingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding)get_store().find_element_user(CORRELATIONPROPERTYBINDING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "correlationPropertyBinding" element
     */
    public int sizeOfCorrelationPropertyBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONPROPERTYBINDING$0);
        }
    }
    
    /**
     * Sets array of all "correlationPropertyBinding" element
     */
    public void setCorrelationPropertyBindingArray(org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding[] correlationPropertyBindingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(correlationPropertyBindingArray, CORRELATIONPROPERTYBINDING$0);
        }
    }
    
    /**
     * Sets ith "correlationPropertyBinding" element
     */
    public void setCorrelationPropertyBindingArray(int i, org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding correlationPropertyBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding)get_store().find_element_user(CORRELATIONPROPERTYBINDING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(correlationPropertyBinding);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "correlationPropertyBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding insertNewCorrelationPropertyBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding)get_store().insert_element_user(CORRELATIONPROPERTYBINDING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "correlationPropertyBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding addNewCorrelationPropertyBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCorrelationPropertyBinding)get_store().add_element_user(CORRELATIONPROPERTYBINDING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "correlationPropertyBinding" element
     */
    public void removeCorrelationPropertyBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONPROPERTYBINDING$0, i);
        }
    }
    
    /**
     * Gets the "process" attribute
     */
    public javax.xml.namespace.QName getProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESS$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "process" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetProcess()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROCESS$2);
            return target;
        }
    }
    
    /**
     * Sets the "process" attribute
     */
    public void setProcess(javax.xml.namespace.QName process)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROCESS$2);
            }
            target.setQNameValue(process);
        }
    }
    
    /**
     * Sets (as xml) the "process" attribute
     */
    public void xsetProcess(org.apache.xmlbeans.XmlQName process)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROCESS$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROCESS$2);
            }
            target.set(process);
        }
    }
    
    /**
     * Gets the "correlationKeyRef" attribute
     */
    public javax.xml.namespace.QName getCorrelationKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONKEYREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "correlationKeyRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetCorrelationKeyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CORRELATIONKEYREF$4);
            return target;
        }
    }
    
    /**
     * Sets the "correlationKeyRef" attribute
     */
    public void setCorrelationKeyRef(javax.xml.namespace.QName correlationKeyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CORRELATIONKEYREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CORRELATIONKEYREF$4);
            }
            target.setQNameValue(correlationKeyRef);
        }
    }
    
    /**
     * Sets (as xml) the "correlationKeyRef" attribute
     */
    public void xsetCorrelationKeyRef(org.apache.xmlbeans.XmlQName correlationKeyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CORRELATIONKEYREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CORRELATIONKEYREF$4);
            }
            target.set(correlationKeyRef);
        }
    }
}
