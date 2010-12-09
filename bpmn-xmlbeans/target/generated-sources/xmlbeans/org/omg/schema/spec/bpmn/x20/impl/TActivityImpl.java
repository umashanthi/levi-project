/*
 * XML Type:  tActivity
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TActivity
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tActivity(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TActivityImpl extends org.omg.schema.spec.bpmn.x20.impl.TFlowNodeImpl implements org.omg.schema.spec.bpmn.x20.TActivity
{
    private static final long serialVersionUID = 1L;
    
    public TActivityImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IOSPECIFICATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "ioSpecification");
    private static final javax.xml.namespace.QName PROPERTY$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "property");
    private static final javax.xml.namespace.QName DATAINPUTASSOCIATION$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataInputAssociation");
    private static final javax.xml.namespace.QName DATAOUTPUTASSOCIATION$6 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataOutputAssociation");
    private static final javax.xml.namespace.QName ACTIVITYRESOURCE$8 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "activityResource");
    private static final org.apache.xmlbeans.QNameSet ACTIVITYRESOURCE$9 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "humanPerformer"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "performer"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "activityResource"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "potentialOwner"),
    });
    private static final javax.xml.namespace.QName LOOPCHARACTERISTICS$10 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "loopCharacteristics");
    private static final org.apache.xmlbeans.QNameSet LOOPCHARACTERISTICS$11 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "standardLoopCharacteristics"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "loopCharacteristics"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "multiInstanceLoopCharacteristics"),
    });
    private static final javax.xml.namespace.QName ISFORCOMPENSATION$12 = 
        new javax.xml.namespace.QName("", "isForCompensation");
    private static final javax.xml.namespace.QName STARTQUANTITY$14 = 
        new javax.xml.namespace.QName("", "startQuantity");
    private static final javax.xml.namespace.QName COMPLETIONQUANTITY$16 = 
        new javax.xml.namespace.QName("", "completionQuantity");
    private static final javax.xml.namespace.QName DEFAULT$18 = 
        new javax.xml.namespace.QName("", "default");
    
    
    /**
     * Gets the "ioSpecification" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputOutputSpecification getIoSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputOutputSpecification target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().find_element_user(IOSPECIFICATION$0, 0);
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
            return get_store().count_elements(IOSPECIFICATION$0) != 0;
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
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().find_element_user(IOSPECIFICATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().add_element_user(IOSPECIFICATION$0);
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
            target = (org.omg.schema.spec.bpmn.x20.TInputOutputSpecification)get_store().add_element_user(IOSPECIFICATION$0);
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
            get_store().remove_element(IOSPECIFICATION$0, 0);
        }
    }
    
    /**
     * Gets array of all "property" elements
     */
    public org.omg.schema.spec.bpmn.x20.TProperty[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$2, targetList);
            org.omg.schema.spec.bpmn.x20.TProperty[] result = new org.omg.schema.spec.bpmn.x20.TProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "property" element
     */
    public org.omg.schema.spec.bpmn.x20.TProperty getPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProperty target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().find_element_user(PROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "property" element
     */
    public int sizeOfPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTY$2);
        }
    }
    
    /**
     * Sets array of all "property" element
     */
    public void setPropertyArray(org.omg.schema.spec.bpmn.x20.TProperty[] propertyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertyArray, PROPERTY$2);
        }
    }
    
    /**
     * Sets ith "property" element
     */
    public void setPropertyArray(int i, org.omg.schema.spec.bpmn.x20.TProperty property)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProperty target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().find_element_user(PROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(property);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "property" element
     */
    public org.omg.schema.spec.bpmn.x20.TProperty insertNewProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProperty target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().insert_element_user(PROPERTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "property" element
     */
    public org.omg.schema.spec.bpmn.x20.TProperty addNewProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProperty target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().add_element_user(PROPERTY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "property" element
     */
    public void removeProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTY$2, i);
        }
    }
    
    /**
     * Gets array of all "dataInputAssociation" elements
     */
    public org.omg.schema.spec.bpmn.x20.TDataInputAssociation[] getDataInputAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAINPUTASSOCIATION$4, targetList);
            org.omg.schema.spec.bpmn.x20.TDataInputAssociation[] result = new org.omg.schema.spec.bpmn.x20.TDataInputAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataInputAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInputAssociation getDataInputAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().find_element_user(DATAINPUTASSOCIATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataInputAssociation" element
     */
    public int sizeOfDataInputAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINPUTASSOCIATION$4);
        }
    }
    
    /**
     * Sets array of all "dataInputAssociation" element
     */
    public void setDataInputAssociationArray(org.omg.schema.spec.bpmn.x20.TDataInputAssociation[] dataInputAssociationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataInputAssociationArray, DATAINPUTASSOCIATION$4);
        }
    }
    
    /**
     * Sets ith "dataInputAssociation" element
     */
    public void setDataInputAssociationArray(int i, org.omg.schema.spec.bpmn.x20.TDataInputAssociation dataInputAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().find_element_user(DATAINPUTASSOCIATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataInputAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataInputAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInputAssociation insertNewDataInputAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().insert_element_user(DATAINPUTASSOCIATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataInputAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInputAssociation addNewDataInputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().add_element_user(DATAINPUTASSOCIATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataInputAssociation" element
     */
    public void removeDataInputAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINPUTASSOCIATION$4, i);
        }
    }
    
    /**
     * Gets array of all "dataOutputAssociation" elements
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutputAssociation[] getDataOutputAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAOUTPUTASSOCIATION$6, targetList);
            org.omg.schema.spec.bpmn.x20.TDataOutputAssociation[] result = new org.omg.schema.spec.bpmn.x20.TDataOutputAssociation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataOutputAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutputAssociation getDataOutputAssociationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().find_element_user(DATAOUTPUTASSOCIATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataOutputAssociation" element
     */
    public int sizeOfDataOutputAssociationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAOUTPUTASSOCIATION$6);
        }
    }
    
    /**
     * Sets array of all "dataOutputAssociation" element
     */
    public void setDataOutputAssociationArray(org.omg.schema.spec.bpmn.x20.TDataOutputAssociation[] dataOutputAssociationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataOutputAssociationArray, DATAOUTPUTASSOCIATION$6);
        }
    }
    
    /**
     * Sets ith "dataOutputAssociation" element
     */
    public void setDataOutputAssociationArray(int i, org.omg.schema.spec.bpmn.x20.TDataOutputAssociation dataOutputAssociation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().find_element_user(DATAOUTPUTASSOCIATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataOutputAssociation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataOutputAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutputAssociation insertNewDataOutputAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().insert_element_user(DATAOUTPUTASSOCIATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataOutputAssociation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutputAssociation addNewDataOutputAssociation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutputAssociation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().add_element_user(DATAOUTPUTASSOCIATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataOutputAssociation" element
     */
    public void removeDataOutputAssociation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAOUTPUTASSOCIATION$6, i);
        }
    }
    
    /**
     * Gets array of all "activityResource" elements
     */
    public org.omg.schema.spec.bpmn.x20.TActivityResource[] getActivityResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ACTIVITYRESOURCE$9, targetList);
            org.omg.schema.spec.bpmn.x20.TActivityResource[] result = new org.omg.schema.spec.bpmn.x20.TActivityResource[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "activityResource" element
     */
    public org.omg.schema.spec.bpmn.x20.TActivityResource getActivityResourceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TActivityResource target = null;
            target = (org.omg.schema.spec.bpmn.x20.TActivityResource)get_store().find_element_user(ACTIVITYRESOURCE$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "activityResource" element
     */
    public int sizeOfActivityResourceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTIVITYRESOURCE$9);
        }
    }
    
    /**
     * Sets array of all "activityResource" element
     */
    public void setActivityResourceArray(org.omg.schema.spec.bpmn.x20.TActivityResource[] activityResourceArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(activityResourceArray, ACTIVITYRESOURCE$8, ACTIVITYRESOURCE$9);
        }
    }
    
    /**
     * Sets ith "activityResource" element
     */
    public void setActivityResourceArray(int i, org.omg.schema.spec.bpmn.x20.TActivityResource activityResource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TActivityResource target = null;
            target = (org.omg.schema.spec.bpmn.x20.TActivityResource)get_store().find_element_user(ACTIVITYRESOURCE$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(activityResource);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "activityResource" element
     */
    public org.omg.schema.spec.bpmn.x20.TActivityResource insertNewActivityResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TActivityResource target = null;
            target = (org.omg.schema.spec.bpmn.x20.TActivityResource)get_store().insert_element_user(ACTIVITYRESOURCE$9, ACTIVITYRESOURCE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "activityResource" element
     */
    public org.omg.schema.spec.bpmn.x20.TActivityResource addNewActivityResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TActivityResource target = null;
            target = (org.omg.schema.spec.bpmn.x20.TActivityResource)get_store().add_element_user(ACTIVITYRESOURCE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "activityResource" element
     */
    public void removeActivityResource(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTIVITYRESOURCE$9, i);
        }
    }
    
    /**
     * Gets the "loopCharacteristics" element
     */
    public org.omg.schema.spec.bpmn.x20.TLoopCharacteristics getLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLoopCharacteristics)get_store().find_element_user(LOOPCHARACTERISTICS$11, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "loopCharacteristics" element
     */
    public boolean isSetLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOOPCHARACTERISTICS$11) != 0;
        }
    }
    
    /**
     * Sets the "loopCharacteristics" element
     */
    public void setLoopCharacteristics(org.omg.schema.spec.bpmn.x20.TLoopCharacteristics loopCharacteristics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLoopCharacteristics)get_store().find_element_user(LOOPCHARACTERISTICS$11, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TLoopCharacteristics)get_store().add_element_user(LOOPCHARACTERISTICS$10);
            }
            target.set(loopCharacteristics);
        }
    }
    
    /**
     * Appends and returns a new empty "loopCharacteristics" element
     */
    public org.omg.schema.spec.bpmn.x20.TLoopCharacteristics addNewLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLoopCharacteristics target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLoopCharacteristics)get_store().add_element_user(LOOPCHARACTERISTICS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "loopCharacteristics" element
     */
    public void unsetLoopCharacteristics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOOPCHARACTERISTICS$11, 0);
        }
    }
    
    /**
     * Gets the "isForCompensation" attribute
     */
    public boolean getIsForCompensation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFORCOMPENSATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISFORCOMPENSATION$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isForCompensation" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsForCompensation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFORCOMPENSATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISFORCOMPENSATION$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "isForCompensation" attribute
     */
    public boolean isSetIsForCompensation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISFORCOMPENSATION$12) != null;
        }
    }
    
    /**
     * Sets the "isForCompensation" attribute
     */
    public void setIsForCompensation(boolean isForCompensation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISFORCOMPENSATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISFORCOMPENSATION$12);
            }
            target.setBooleanValue(isForCompensation);
        }
    }
    
    /**
     * Sets (as xml) the "isForCompensation" attribute
     */
    public void xsetIsForCompensation(org.apache.xmlbeans.XmlBoolean isForCompensation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISFORCOMPENSATION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISFORCOMPENSATION$12);
            }
            target.set(isForCompensation);
        }
    }
    
    /**
     * Unsets the "isForCompensation" attribute
     */
    public void unsetIsForCompensation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISFORCOMPENSATION$12);
        }
    }
    
    /**
     * Gets the "startQuantity" attribute
     */
    public java.math.BigInteger getStartQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTQUANTITY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(STARTQUANTITY$14);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "startQuantity" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetStartQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(STARTQUANTITY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(STARTQUANTITY$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "startQuantity" attribute
     */
    public boolean isSetStartQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTQUANTITY$14) != null;
        }
    }
    
    /**
     * Sets the "startQuantity" attribute
     */
    public void setStartQuantity(java.math.BigInteger startQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTQUANTITY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTQUANTITY$14);
            }
            target.setBigIntegerValue(startQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "startQuantity" attribute
     */
    public void xsetStartQuantity(org.apache.xmlbeans.XmlInteger startQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(STARTQUANTITY$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(STARTQUANTITY$14);
            }
            target.set(startQuantity);
        }
    }
    
    /**
     * Unsets the "startQuantity" attribute
     */
    public void unsetStartQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTQUANTITY$14);
        }
    }
    
    /**
     * Gets the "completionQuantity" attribute
     */
    public java.math.BigInteger getCompletionQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPLETIONQUANTITY$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMPLETIONQUANTITY$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "completionQuantity" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCompletionQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COMPLETIONQUANTITY$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_default_attribute_value(COMPLETIONQUANTITY$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "completionQuantity" attribute
     */
    public boolean isSetCompletionQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPLETIONQUANTITY$16) != null;
        }
    }
    
    /**
     * Sets the "completionQuantity" attribute
     */
    public void setCompletionQuantity(java.math.BigInteger completionQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPLETIONQUANTITY$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPLETIONQUANTITY$16);
            }
            target.setBigIntegerValue(completionQuantity);
        }
    }
    
    /**
     * Sets (as xml) the "completionQuantity" attribute
     */
    public void xsetCompletionQuantity(org.apache.xmlbeans.XmlInteger completionQuantity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COMPLETIONQUANTITY$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COMPLETIONQUANTITY$16);
            }
            target.set(completionQuantity);
        }
    }
    
    /**
     * Unsets the "completionQuantity" attribute
     */
    public void unsetCompletionQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPLETIONQUANTITY$16);
        }
    }
    
    /**
     * Gets the "default" attribute
     */
    public java.lang.String getDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "default" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(DEFAULT$18);
            return target;
        }
    }
    
    /**
     * True if has "default" attribute
     */
    public boolean isSetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFAULT$18) != null;
        }
    }
    
    /**
     * Sets the "default" attribute
     */
    public void setDefault(java.lang.String xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFAULT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFAULT$18);
            }
            target.setStringValue(xdefault);
        }
    }
    
    /**
     * Sets (as xml) the "default" attribute
     */
    public void xsetDefault(org.apache.xmlbeans.XmlIDREF xdefault)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(DEFAULT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(DEFAULT$18);
            }
            target.set(xdefault);
        }
    }
    
    /**
     * Unsets the "default" attribute
     */
    public void unsetDefault()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFAULT$18);
        }
    }
}
