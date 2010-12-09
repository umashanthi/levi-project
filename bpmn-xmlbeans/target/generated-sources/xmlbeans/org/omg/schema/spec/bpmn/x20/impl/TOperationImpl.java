/*
 * XML Type:  tOperation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TOperation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tOperation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TOperationImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TOperation
{
    private static final long serialVersionUID = 1L;
    
    public TOperationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INMESSAGEREF$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "inMessageRef");
    private static final javax.xml.namespace.QName OUTMESSAGEREF$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "outMessageRef");
    private static final javax.xml.namespace.QName ERRORREF$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "errorRef");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "inMessageRef" element
     */
    public javax.xml.namespace.QName getInMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INMESSAGEREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "inMessageRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetInMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(INMESSAGEREF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "inMessageRef" element
     */
    public void setInMessageRef(javax.xml.namespace.QName inMessageRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INMESSAGEREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INMESSAGEREF$0);
            }
            target.setQNameValue(inMessageRef);
        }
    }
    
    /**
     * Sets (as xml) the "inMessageRef" element
     */
    public void xsetInMessageRef(org.apache.xmlbeans.XmlQName inMessageRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(INMESSAGEREF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(INMESSAGEREF$0);
            }
            target.set(inMessageRef);
        }
    }
    
    /**
     * Gets the "outMessageRef" element
     */
    public javax.xml.namespace.QName getOutMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTMESSAGEREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "outMessageRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetOutMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(OUTMESSAGEREF$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "outMessageRef" element
     */
    public boolean isSetOutMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTMESSAGEREF$2) != 0;
        }
    }
    
    /**
     * Sets the "outMessageRef" element
     */
    public void setOutMessageRef(javax.xml.namespace.QName outMessageRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTMESSAGEREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTMESSAGEREF$2);
            }
            target.setQNameValue(outMessageRef);
        }
    }
    
    /**
     * Sets (as xml) the "outMessageRef" element
     */
    public void xsetOutMessageRef(org.apache.xmlbeans.XmlQName outMessageRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(OUTMESSAGEREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(OUTMESSAGEREF$2);
            }
            target.set(outMessageRef);
        }
    }
    
    /**
     * Unsets the "outMessageRef" element
     */
    public void unsetOutMessageRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTMESSAGEREF$2, 0);
        }
    }
    
    /**
     * Gets array of all "errorRef" elements
     */
    public javax.xml.namespace.QName[] getErrorRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERRORREF$4, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "errorRef" element
     */
    public javax.xml.namespace.QName getErrorRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "errorRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetErrorRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERRORREF$4, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "errorRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetErrorRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(ERRORREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "errorRef" element
     */
    public int sizeOfErrorRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORREF$4);
        }
    }
    
    /**
     * Sets array of all "errorRef" element
     */
    public void setErrorRefArray(javax.xml.namespace.QName[] errorRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorRefArray, ERRORREF$4);
        }
    }
    
    /**
     * Sets ith "errorRef" element
     */
    public void setErrorRefArray(int i, javax.xml.namespace.QName errorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(errorRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "errorRef" element
     */
    public void xsetErrorRefArray(org.apache.xmlbeans.XmlQName[]errorRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorRefArray, ERRORREF$4);
        }
    }
    
    /**
     * Sets (as xml) ith "errorRef" element
     */
    public void xsetErrorRefArray(int i, org.apache.xmlbeans.XmlQName errorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(ERRORREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(errorRef);
        }
    }
    
    /**
     * Inserts the value as the ith "errorRef" element
     */
    public void insertErrorRef(int i, javax.xml.namespace.QName errorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ERRORREF$4, i);
            target.setQNameValue(errorRef);
        }
    }
    
    /**
     * Appends the value as the last "errorRef" element
     */
    public void addErrorRef(javax.xml.namespace.QName errorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORREF$4);
            target.setQNameValue(errorRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "errorRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewErrorRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(ERRORREF$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "errorRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewErrorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(ERRORREF$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "errorRef" element
     */
    public void removeErrorRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORREF$4, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
            }
            target.set(name);
        }
    }
}
