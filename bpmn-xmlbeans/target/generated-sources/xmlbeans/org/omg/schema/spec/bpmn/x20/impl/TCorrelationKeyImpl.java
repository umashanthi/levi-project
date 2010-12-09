/*
 * XML Type:  tCorrelationKey
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCorrelationKey
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCorrelationKey(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCorrelationKeyImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TCorrelationKey
{
    private static final long serialVersionUID = 1L;
    
    public TCorrelationKeyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CORRELATIONPROPERTYREF$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "correlationPropertyRef");
    
    
    /**
     * Gets array of all "correlationPropertyRef" elements
     */
    public javax.xml.namespace.QName[] getCorrelationPropertyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CORRELATIONPROPERTYREF$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "correlationPropertyRef" element
     */
    public javax.xml.namespace.QName getCorrelationPropertyRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONPROPERTYREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "correlationPropertyRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetCorrelationPropertyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CORRELATIONPROPERTYREF$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "correlationPropertyRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetCorrelationPropertyRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(CORRELATIONPROPERTYREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "correlationPropertyRef" element
     */
    public int sizeOfCorrelationPropertyRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CORRELATIONPROPERTYREF$0);
        }
    }
    
    /**
     * Sets array of all "correlationPropertyRef" element
     */
    public void setCorrelationPropertyRefArray(javax.xml.namespace.QName[] correlationPropertyRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(correlationPropertyRefArray, CORRELATIONPROPERTYREF$0);
        }
    }
    
    /**
     * Sets ith "correlationPropertyRef" element
     */
    public void setCorrelationPropertyRefArray(int i, javax.xml.namespace.QName correlationPropertyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIONPROPERTYREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(correlationPropertyRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "correlationPropertyRef" element
     */
    public void xsetCorrelationPropertyRefArray(org.apache.xmlbeans.XmlQName[]correlationPropertyRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(correlationPropertyRefArray, CORRELATIONPROPERTYREF$0);
        }
    }
    
    /**
     * Sets (as xml) ith "correlationPropertyRef" element
     */
    public void xsetCorrelationPropertyRefArray(int i, org.apache.xmlbeans.XmlQName correlationPropertyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(CORRELATIONPROPERTYREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(correlationPropertyRef);
        }
    }
    
    /**
     * Inserts the value as the ith "correlationPropertyRef" element
     */
    public void insertCorrelationPropertyRef(int i, javax.xml.namespace.QName correlationPropertyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CORRELATIONPROPERTYREF$0, i);
            target.setQNameValue(correlationPropertyRef);
        }
    }
    
    /**
     * Appends the value as the last "correlationPropertyRef" element
     */
    public void addCorrelationPropertyRef(javax.xml.namespace.QName correlationPropertyRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRELATIONPROPERTYREF$0);
            target.setQNameValue(correlationPropertyRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "correlationPropertyRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewCorrelationPropertyRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(CORRELATIONPROPERTYREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "correlationPropertyRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewCorrelationPropertyRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(CORRELATIONPROPERTYREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "correlationPropertyRef" element
     */
    public void removeCorrelationPropertyRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CORRELATIONPROPERTYREF$0, i);
        }
    }
}
