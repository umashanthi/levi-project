/*
 * XML Type:  tRelationship
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TRelationship
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tRelationship(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TRelationshipImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TRelationship
{
    private static final long serialVersionUID = 1L;
    
    public TRelationshipImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "source");
    private static final javax.xml.namespace.QName TARGET$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "target");
    private static final javax.xml.namespace.QName TYPE$4 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName DIRECTION$6 = 
        new javax.xml.namespace.QName("", "direction");
    
    
    /**
     * Gets array of all "source" elements
     */
    public javax.xml.namespace.QName[] getSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "source" element
     */
    public javax.xml.namespace.QName getSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "source" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOURCE$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "source" element
     */
    public org.apache.xmlbeans.XmlQName xgetSourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "source" element
     */
    public int sizeOfSourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$0);
        }
    }
    
    /**
     * Sets array of all "source" element
     */
    public void setSourceArray(javax.xml.namespace.QName[] sourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceArray, SOURCE$0);
        }
    }
    
    /**
     * Sets ith "source" element
     */
    public void setSourceArray(int i, javax.xml.namespace.QName source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(source);
        }
    }
    
    /**
     * Sets (as xml) array of all "source" element
     */
    public void xsetSourceArray(org.apache.xmlbeans.XmlQName[]sourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sourceArray, SOURCE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "source" element
     */
    public void xsetSourceArray(int i, org.apache.xmlbeans.XmlQName source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SOURCE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(source);
        }
    }
    
    /**
     * Inserts the value as the ith "source" element
     */
    public void insertSource(int i, javax.xml.namespace.QName source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SOURCE$0, i);
            target.setQNameValue(source);
        }
    }
    
    /**
     * Appends the value as the last "source" element
     */
    public void addSource(javax.xml.namespace.QName source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$0);
            target.setQNameValue(source);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "source" element
     */
    public org.apache.xmlbeans.XmlQName insertNewSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(SOURCE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "source" element
     */
    public org.apache.xmlbeans.XmlQName addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(SOURCE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "source" element
     */
    public void removeSource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$0, i);
        }
    }
    
    /**
     * Gets array of all "target" elements
     */
    public javax.xml.namespace.QName[] getTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGET$2, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "target" element
     */
    public javax.xml.namespace.QName getTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "target" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TARGET$2, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "target" element
     */
    public org.apache.xmlbeans.XmlQName xgetTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(TARGET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "target" element
     */
    public int sizeOfTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGET$2);
        }
    }
    
    /**
     * Sets array of all "target" element
     */
    public void setTargetArray(javax.xml.namespace.QName[] targetValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(targetValueArray, TARGET$2);
        }
    }
    
    /**
     * Sets ith "target" element
     */
    public void setTargetArray(int i, javax.xml.namespace.QName targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TARGET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(targetValue);
        }
    }
    
    /**
     * Sets (as xml) array of all "target" element
     */
    public void xsetTargetArray(org.apache.xmlbeans.XmlQName[]targetValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(targetValueArray, TARGET$2);
        }
    }
    
    /**
     * Sets (as xml) ith "target" element
     */
    public void xsetTargetArray(int i, org.apache.xmlbeans.XmlQName targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(TARGET$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Inserts the value as the ith "target" element
     */
    public void insertTarget(int i, javax.xml.namespace.QName targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TARGET$2, i);
            target.setQNameValue(targetValue);
        }
    }
    
    /**
     * Appends the value as the last "target" element
     */
    public void addTarget(javax.xml.namespace.QName targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TARGET$2);
            target.setQNameValue(targetValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "target" element
     */
    public org.apache.xmlbeans.XmlQName insertNewTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(TARGET$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "target" element
     */
    public org.apache.xmlbeans.XmlQName addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(TARGET$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "target" element
     */
    public void removeTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGET$2, i);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "direction" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TRelationshipDirection.Enum getDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$6);
            if (target == null)
            {
                return null;
            }
            return (org.omg.schema.spec.bpmn.x20.TRelationshipDirection.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "direction" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TRelationshipDirection xgetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRelationshipDirection target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRelationshipDirection)get_store().find_attribute_user(DIRECTION$6);
            return target;
        }
    }
    
    /**
     * True if has "direction" attribute
     */
    public boolean isSetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DIRECTION$6) != null;
        }
    }
    
    /**
     * Sets the "direction" attribute
     */
    public void setDirection(org.omg.schema.spec.bpmn.x20.TRelationshipDirection.Enum direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DIRECTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DIRECTION$6);
            }
            target.setEnumValue(direction);
        }
    }
    
    /**
     * Sets (as xml) the "direction" attribute
     */
    public void xsetDirection(org.omg.schema.spec.bpmn.x20.TRelationshipDirection direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRelationshipDirection target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRelationshipDirection)get_store().find_attribute_user(DIRECTION$6);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TRelationshipDirection)get_store().add_attribute_user(DIRECTION$6);
            }
            target.set(direction);
        }
    }
    
    /**
     * Unsets the "direction" attribute
     */
    public void unsetDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DIRECTION$6);
        }
    }
}
