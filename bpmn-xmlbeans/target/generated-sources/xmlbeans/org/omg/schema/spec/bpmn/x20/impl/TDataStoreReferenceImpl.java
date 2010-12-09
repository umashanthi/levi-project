/*
 * XML Type:  tDataStoreReference
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TDataStoreReference
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tDataStoreReference(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TDataStoreReferenceImpl extends org.omg.schema.spec.bpmn.x20.impl.TFlowElementImpl implements org.omg.schema.spec.bpmn.x20.TDataStoreReference
{
    private static final long serialVersionUID = 1L;
    
    public TDataStoreReferenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATASTATE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataState");
    private static final javax.xml.namespace.QName ITEMSUBJECTREF$2 = 
        new javax.xml.namespace.QName("", "itemSubjectRef");
    private static final javax.xml.namespace.QName DATASTOREREF$4 = 
        new javax.xml.namespace.QName("", "dataStoreRef");
    
    
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
     * Gets the "itemSubjectRef" attribute
     */
    public javax.xml.namespace.QName getItemSubjectRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMSUBJECTREF$2);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ITEMSUBJECTREF$2);
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
            return get_store().find_attribute_user(ITEMSUBJECTREF$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ITEMSUBJECTREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ITEMSUBJECTREF$2);
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
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(ITEMSUBJECTREF$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(ITEMSUBJECTREF$2);
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
            get_store().remove_attribute(ITEMSUBJECTREF$2);
        }
    }
    
    /**
     * Gets the "dataStoreRef" attribute
     */
    public javax.xml.namespace.QName getDataStoreRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASTOREREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "dataStoreRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetDataStoreRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(DATASTOREREF$4);
            return target;
        }
    }
    
    /**
     * True if has "dataStoreRef" attribute
     */
    public boolean isSetDataStoreRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DATASTOREREF$4) != null;
        }
    }
    
    /**
     * Sets the "dataStoreRef" attribute
     */
    public void setDataStoreRef(javax.xml.namespace.QName dataStoreRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DATASTOREREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DATASTOREREF$4);
            }
            target.setQNameValue(dataStoreRef);
        }
    }
    
    /**
     * Sets (as xml) the "dataStoreRef" attribute
     */
    public void xsetDataStoreRef(org.apache.xmlbeans.XmlQName dataStoreRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(DATASTOREREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(DATASTOREREF$4);
            }
            target.set(dataStoreRef);
        }
    }
    
    /**
     * Unsets the "dataStoreRef" attribute
     */
    public void unsetDataStoreRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DATASTOREREF$4);
        }
    }
}
