/*
 * XML Type:  tDataStore
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TDataStore
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tDataStore(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TDataStoreImpl extends org.omg.schema.spec.bpmn.x20.impl.TRootElementImpl implements org.omg.schema.spec.bpmn.x20.TDataStore
{
    private static final long serialVersionUID = 1L;
    
    public TDataStoreImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTATE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataState");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName CAPACITY$4 = 
        new javax.xml.namespace.QName("", "capacity");
    private static final javax.xml.namespace.QName ISUNLIMITED$6 = 
        new javax.xml.namespace.QName("", "isUnlimited");
    private static final javax.xml.namespace.QName ITEMSUBJECTREF$8 = 
        new javax.xml.namespace.QName("", "itemSubjectRef");
    
    
    /**
     * Gets the "dataState" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataState getDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataState target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataState)get_store().find_element_user(DATASTATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataState" element
     */
    public boolean isSetDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASTATE$0) != 0;
        }
    }
    
    /**
     * Sets the "dataState" element
     */
    public void setDataState(org.omg.schema.spec.bpmn.x20.TDataState dataState)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataState target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataState)get_store().find_element_user(DATASTATE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TDataState)get_store().add_element_user(DATASTATE$0);
            }
            target.set(dataState);
        }
    }
    
    /**
     * Appends and returns a new empty "dataState" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataState addNewDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataState target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataState)get_store().add_element_user(DATASTATE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "dataState" element
     */
    public void unsetDataState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASTATE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
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
            return get_store().find_attribute_user(NAME$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
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
            get_store().remove_attribute(NAME$2);
        }
    }
    
    /**
     * Gets the "capacity" attribute
     */
    public java.math.BigInteger getCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPACITY$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "capacity" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CAPACITY$4);
            return target;
        }
    }
    
    /**
     * True if has "capacity" attribute
     */
    public boolean isSetCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CAPACITY$4) != null;
        }
    }
    
    /**
     * Sets the "capacity" attribute
     */
    public void setCapacity(java.math.BigInteger capacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CAPACITY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CAPACITY$4);
            }
            target.setBigIntegerValue(capacity);
        }
    }
    
    /**
     * Sets (as xml) the "capacity" attribute
     */
    public void xsetCapacity(org.apache.xmlbeans.XmlInteger capacity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(CAPACITY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(CAPACITY$4);
            }
            target.set(capacity);
        }
    }
    
    /**
     * Unsets the "capacity" attribute
     */
    public void unsetCapacity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CAPACITY$4);
        }
    }
    
    /**
     * Gets the "isUnlimited" attribute
     */
    public boolean getIsUnlimited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISUNLIMITED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISUNLIMITED$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isUnlimited" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsUnlimited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISUNLIMITED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISUNLIMITED$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "isUnlimited" attribute
     */
    public boolean isSetIsUnlimited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISUNLIMITED$6) != null;
        }
    }
    
    /**
     * Sets the "isUnlimited" attribute
     */
    public void setIsUnlimited(boolean isUnlimited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISUNLIMITED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISUNLIMITED$6);
            }
            target.setBooleanValue(isUnlimited);
        }
    }
    
    /**
     * Sets (as xml) the "isUnlimited" attribute
     */
    public void xsetIsUnlimited(org.apache.xmlbeans.XmlBoolean isUnlimited)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISUNLIMITED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISUNLIMITED$6);
            }
            target.set(isUnlimited);
        }
    }
    
    /**
     * Unsets the "isUnlimited" attribute
     */
    public void unsetIsUnlimited()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISUNLIMITED$6);
        }
    }
    
    /**
     * Gets the "itemSubjectRef" attribute
     */
    public javax.xml.namespace.QName getItemSubjectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMSUBJECTREF$8);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "itemSubjectRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetItemSubjectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ITEMSUBJECTREF$8);
            return target;
        }
    }
    
    /**
     * True if has "itemSubjectRef" attribute
     */
    public boolean isSetItemSubjectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ITEMSUBJECTREF$8) != null;
        }
    }
    
    /**
     * Sets the "itemSubjectRef" attribute
     */
    public void setItemSubjectRef(javax.xml.namespace.QName itemSubjectRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMSUBJECTREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITEMSUBJECTREF$8);
            }
            target.setQNameValue(itemSubjectRef);
        }
    }
    
    /**
     * Sets (as xml) the "itemSubjectRef" attribute
     */
    public void xsetItemSubjectRef(org.apache.xmlbeans.XmlQName itemSubjectRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ITEMSUBJECTREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ITEMSUBJECTREF$8);
            }
            target.set(itemSubjectRef);
        }
    }
    
    /**
     * Unsets the "itemSubjectRef" attribute
     */
    public void unsetItemSubjectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ITEMSUBJECTREF$8);
        }
    }
}
