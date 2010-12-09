/*
 * XML Type:  tFlowElement
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TFlowElement
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tFlowElement(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TFlowElementImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TFlowElement
{
    private static final long serialVersionUID = 1L;
    
    public TFlowElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITING$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "auditing");
    private static final javax.xml.namespace.QName MONITORING$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "monitoring");
    private static final javax.xml.namespace.QName CATEGORYVALUEREF$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "categoryValueRef");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "auditing" element
     */
    public org.omg.schema.spec.bpmn.x20.TAuditing getAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAuditing target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAuditing)get_store().find_element_user(AUDITING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "auditing" element
     */
    public boolean isSetAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDITING$0) != 0;
        }
    }
    
    /**
     * Sets the "auditing" element
     */
    public void setAuditing(org.omg.schema.spec.bpmn.x20.TAuditing auditing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAuditing target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAuditing)get_store().find_element_user(AUDITING$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TAuditing)get_store().add_element_user(AUDITING$0);
            }
            target.set(auditing);
        }
    }
    
    /**
     * Appends and returns a new empty "auditing" element
     */
    public org.omg.schema.spec.bpmn.x20.TAuditing addNewAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAuditing target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAuditing)get_store().add_element_user(AUDITING$0);
            return target;
        }
    }
    
    /**
     * Unsets the "auditing" element
     */
    public void unsetAuditing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDITING$0, 0);
        }
    }
    
    /**
     * Gets the "monitoring" element
     */
    public org.omg.schema.spec.bpmn.x20.TMonitoring getMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMonitoring target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMonitoring)get_store().find_element_user(MONITORING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "monitoring" element
     */
    public boolean isSetMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MONITORING$2) != 0;
        }
    }
    
    /**
     * Sets the "monitoring" element
     */
    public void setMonitoring(org.omg.schema.spec.bpmn.x20.TMonitoring monitoring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMonitoring target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMonitoring)get_store().find_element_user(MONITORING$2, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TMonitoring)get_store().add_element_user(MONITORING$2);
            }
            target.set(monitoring);
        }
    }
    
    /**
     * Appends and returns a new empty "monitoring" element
     */
    public org.omg.schema.spec.bpmn.x20.TMonitoring addNewMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMonitoring target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMonitoring)get_store().add_element_user(MONITORING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "monitoring" element
     */
    public void unsetMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MONITORING$2, 0);
        }
    }
    
    /**
     * Gets array of all "categoryValueRef" elements
     */
    public javax.xml.namespace.QName[] getCategoryValueRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYVALUEREF$4, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "categoryValueRef" element
     */
    public javax.xml.namespace.QName getCategoryValueRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYVALUEREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "categoryValueRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetCategoryValueRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYVALUEREF$4, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "categoryValueRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetCategoryValueRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(CATEGORYVALUEREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "categoryValueRef" element
     */
    public int sizeOfCategoryValueRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYVALUEREF$4);
        }
    }
    
    /**
     * Sets array of all "categoryValueRef" element
     */
    public void setCategoryValueRefArray(javax.xml.namespace.QName[] categoryValueRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryValueRefArray, CATEGORYVALUEREF$4);
        }
    }
    
    /**
     * Sets ith "categoryValueRef" element
     */
    public void setCategoryValueRefArray(int i, javax.xml.namespace.QName categoryValueRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYVALUEREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(categoryValueRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "categoryValueRef" element
     */
    public void xsetCategoryValueRefArray(org.apache.xmlbeans.XmlQName[]categoryValueRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryValueRefArray, CATEGORYVALUEREF$4);
        }
    }
    
    /**
     * Sets (as xml) ith "categoryValueRef" element
     */
    public void xsetCategoryValueRefArray(int i, org.apache.xmlbeans.XmlQName categoryValueRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(CATEGORYVALUEREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categoryValueRef);
        }
    }
    
    /**
     * Inserts the value as the ith "categoryValueRef" element
     */
    public void insertCategoryValueRef(int i, javax.xml.namespace.QName categoryValueRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CATEGORYVALUEREF$4, i);
            target.setQNameValue(categoryValueRef);
        }
    }
    
    /**
     * Appends the value as the last "categoryValueRef" element
     */
    public void addCategoryValueRef(javax.xml.namespace.QName categoryValueRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYVALUEREF$4);
            target.setQNameValue(categoryValueRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "categoryValueRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewCategoryValueRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(CATEGORYVALUEREF$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "categoryValueRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewCategoryValueRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(CATEGORYVALUEREF$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "categoryValueRef" element
     */
    public void removeCategoryValueRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYVALUEREF$4, i);
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
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$6) != null;
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
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$6);
        }
    }
}
