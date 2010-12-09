/*
 * XML Type:  tCallableElement
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCallableElement
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCallableElement(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCallableElementImpl extends org.omg.schema.spec.bpmn.x20.impl.TRootElementImpl implements org.omg.schema.spec.bpmn.x20.TCallableElement
{
    private static final long serialVersionUID = 1L;
    
    public TCallableElementImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPPORTEDINTERFACEREF$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "supportedInterfaceRef");
    private static final javax.xml.namespace.QName IOSPECIFICATION$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "ioSpecification");
    private static final javax.xml.namespace.QName IOBINDING$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "ioBinding");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "supportedInterfaceRef" elements
     */
    public javax.xml.namespace.QName[] getSupportedInterfaceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTEDINTERFACEREF$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "supportedInterfaceRef" element
     */
    public javax.xml.namespace.QName getSupportedInterfaceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTEDINTERFACEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "supportedInterfaceRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetSupportedInterfaceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTEDINTERFACEREF$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "supportedInterfaceRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetSupportedInterfaceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SUPPORTEDINTERFACEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "supportedInterfaceRef" element
     */
    public int sizeOfSupportedInterfaceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTEDINTERFACEREF$0);
        }
    }
    
    /**
     * Sets array of all "supportedInterfaceRef" element
     */
    public void setSupportedInterfaceRefArray(javax.xml.namespace.QName[] supportedInterfaceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(supportedInterfaceRefArray, SUPPORTEDINTERFACEREF$0);
        }
    }
    
    /**
     * Sets ith "supportedInterfaceRef" element
     */
    public void setSupportedInterfaceRefArray(int i, javax.xml.namespace.QName supportedInterfaceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTEDINTERFACEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(supportedInterfaceRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "supportedInterfaceRef" element
     */
    public void xsetSupportedInterfaceRefArray(org.apache.xmlbeans.XmlQName[]supportedInterfaceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(supportedInterfaceRefArray, SUPPORTEDINTERFACEREF$0);
        }
    }
    
    /**
     * Sets (as xml) ith "supportedInterfaceRef" element
     */
    public void xsetSupportedInterfaceRefArray(int i, org.apache.xmlbeans.XmlQName supportedInterfaceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SUPPORTEDINTERFACEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supportedInterfaceRef);
        }
    }
    
    /**
     * Inserts the value as the ith "supportedInterfaceRef" element
     */
    public void insertSupportedInterfaceRef(int i, javax.xml.namespace.QName supportedInterfaceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SUPPORTEDINTERFACEREF$0, i);
            target.setQNameValue(supportedInterfaceRef);
        }
    }
    
    /**
     * Appends the value as the last "supportedInterfaceRef" element
     */
    public void addSupportedInterfaceRef(javax.xml.namespace.QName supportedInterfaceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTEDINTERFACEREF$0);
            target.setQNameValue(supportedInterfaceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "supportedInterfaceRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewSupportedInterfaceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(SUPPORTEDINTERFACEREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "supportedInterfaceRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewSupportedInterfaceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(SUPPORTEDINTERFACEREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "supportedInterfaceRef" element
     */
    public void removeSupportedInterfaceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTEDINTERFACEREF$0, i);
        }
    }
    
    /**
     * Gets the "ioSpecification" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputOutputSpecification getIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputSpecification target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().find_element_user(IOSPECIFICATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ioSpecification" element
     */
    public boolean isSetIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IOSPECIFICATION$2) != 0;
        }
    }
    
    /**
     * Sets the "ioSpecification" element
     */
    public void setIoSpecification(org.omg.schema.spec.bpmn.x20.TInputOutputSpecification ioSpecification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputSpecification target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().find_element_user(IOSPECIFICATION$2, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().add_element_user(IOSPECIFICATION$2);
            }
            target.set(ioSpecification);
        }
    }
    
    /**
     * Appends and returns a new empty "ioSpecification" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputOutputSpecification addNewIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputSpecification target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().add_element_user(IOSPECIFICATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "ioSpecification" element
     */
    public void unsetIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IOSPECIFICATION$2, 0);
        }
    }
    
    /**
     * Gets array of all "ioBinding" elements
     */
    public org.omg.schema.spec.bpmn.x20.TInputOutputBinding[] getIoBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IOBINDING$4, targetList);
            org.omg.schema.spec.bpmn.x20.TInputOutputBinding[] result = new org.omg.schema.spec.bpmn.x20.TInputOutputBinding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ioBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputOutputBinding getIoBindingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputBinding)get_store().find_element_user(IOBINDING$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ioBinding" element
     */
    public int sizeOfIoBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IOBINDING$4);
        }
    }
    
    /**
     * Sets array of all "ioBinding" element
     */
    public void setIoBindingArray(org.omg.schema.spec.bpmn.x20.TInputOutputBinding[] ioBindingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ioBindingArray, IOBINDING$4);
        }
    }
    
    /**
     * Sets ith "ioBinding" element
     */
    public void setIoBindingArray(int i, org.omg.schema.spec.bpmn.x20.TInputOutputBinding ioBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputBinding)get_store().find_element_user(IOBINDING$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ioBinding);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ioBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputOutputBinding insertNewIoBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputBinding)get_store().insert_element_user(IOBINDING$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ioBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputOutputBinding addNewIoBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputBinding)get_store().add_element_user(IOBINDING$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "ioBinding" element
     */
    public void removeIoBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IOBINDING$4, i);
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
