/*
 * XML Type:  tDataInputAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TDataInputAssociation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tDataInputAssociation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TDataInputAssociationImpl extends org.omg.schema.spec.bpmn.x20.impl.TDataAssociationImpl implements org.omg.schema.spec.bpmn.x20.TDataInputAssociation
{
    private static final long serialVersionUID = 1L;
    
    public TDataInputAssociationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCEREF$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "sourceRef");
    private static final javax.xml.namespace.QName TARGETREF$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "targetRef");
    
    
    /**
     * Gets array of all "sourceRef" elements
     */
    public javax.xml.namespace.QName[] getSourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCEREF$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "sourceRef" element
     */
    public javax.xml.namespace.QName getSourceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "sourceRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetSourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCEREF$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "sourceRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetSourceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SOURCEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "sourceRef" element
     */
    public int sizeOfSourceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEREF$0);
        }
    }
    
    /**
     * Sets array of all "sourceRef" element
     */
    public void setSourceRefArray(javax.xml.namespace.QName[] sourceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceRefArray, SOURCEREF$0);
        }
    }
    
    /**
     * Sets ith "sourceRef" element
     */
    public void setSourceRefArray(int i, javax.xml.namespace.QName sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(sourceRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "sourceRef" element
     */
    public void xsetSourceRefArray(org.apache.xmlbeans.XmlQName[]sourceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceRefArray, SOURCEREF$0);
        }
    }
    
    /**
     * Sets (as xml) ith "sourceRef" element
     */
    public void xsetSourceRefArray(int i, org.apache.xmlbeans.XmlQName sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SOURCEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sourceRef);
        }
    }
    
    /**
     * Inserts the value as the ith "sourceRef" element
     */
    public void insertSourceRef(int i, javax.xml.namespace.QName sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOURCEREF$0, i);
            target.setQNameValue(sourceRef);
        }
    }
    
    /**
     * Appends the value as the last "sourceRef" element
     */
    public void addSourceRef(javax.xml.namespace.QName sourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEREF$0);
            target.setQNameValue(sourceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sourceRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewSourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(SOURCEREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sourceRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewSourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(SOURCEREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "sourceRef" element
     */
    public void removeSourceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEREF$0, i);
        }
    }
    
    /**
     * Gets the "targetRef" element
     */
    public javax.xml.namespace.QName getTargetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETREF$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetTargetRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(TARGETREF$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "targetRef" element
     */
    public void setTargetRef(javax.xml.namespace.QName targetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGETREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGETREF$2);
            }
            target.setQNameValue(targetRef);
        }
    }
    
    /**
     * Sets (as xml) the "targetRef" element
     */
    public void xsetTargetRef(org.apache.xmlbeans.XmlQName targetRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(TARGETREF$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(TARGETREF$2);
            }
            target.set(targetRef);
        }
    }
}
