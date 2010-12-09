/*
 * XML Type:  tCatchEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCatchEvent
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCatchEvent(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCatchEventImpl extends org.omg.schema.spec.bpmn.x20.impl.TEventImpl implements org.omg.schema.spec.bpmn.x20.TCatchEvent
{
    private static final long serialVersionUID = 1L;
    
    public TCatchEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOUTPUT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataOutput");
    private static final javax.xml.namespace.QName DATAOUTPUTASSOCIATION$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataOutputAssociation");
    private static final javax.xml.namespace.QName OUTPUTSET$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "outputSet");
    private static final javax.xml.namespace.QName EVENTDEFINITION$6 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "eventDefinition");
    private static final org.apache.xmlbeans.QNameSet EVENTDEFINITION$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "errorEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "signalEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "compensateEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "linkEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "timerEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conditionalEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "eventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "cancelEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "escalationEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "terminateEventDefinition"),
    });
    private static final javax.xml.namespace.QName EVENTDEFINITIONREF$8 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "eventDefinitionRef");
    private static final javax.xml.namespace.QName PARALLELMULTIPLE$10 = 
        new javax.xml.namespace.QName("", "parallelMultiple");
    
    
    /**
     * Gets array of all "dataOutput" elements
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutput[] getDataOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAOUTPUT$0, targetList);
            org.omg.schema.spec.bpmn.x20.TDataOutput[] result = new org.omg.schema.spec.bpmn.x20.TDataOutput[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataOutput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutput getDataOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().find_element_user(DATAOUTPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataOutput" element
     */
    public int sizeOfDataOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAOUTPUT$0);
        }
    }
    
    /**
     * Sets array of all "dataOutput" element
     */
    public void setDataOutputArray(org.omg.schema.spec.bpmn.x20.TDataOutput[] dataOutputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataOutputArray, DATAOUTPUT$0);
        }
    }
    
    /**
     * Sets ith "dataOutput" element
     */
    public void setDataOutputArray(int i, org.omg.schema.spec.bpmn.x20.TDataOutput dataOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().find_element_user(DATAOUTPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataOutput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataOutput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutput insertNewDataOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().insert_element_user(DATAOUTPUT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataOutput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutput addNewDataOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().add_element_user(DATAOUTPUT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataOutput" element
     */
    public void removeDataOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAOUTPUT$0, i);
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
            get_store().find_all_element_users(DATAOUTPUTASSOCIATION$2, targetList);
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
            target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().find_element_user(DATAOUTPUTASSOCIATION$2, i);
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
            return get_store().count_elements(DATAOUTPUTASSOCIATION$2);
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
            arraySetterHelper(dataOutputAssociationArray, DATAOUTPUTASSOCIATION$2);
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
            target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().find_element_user(DATAOUTPUTASSOCIATION$2, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().insert_element_user(DATAOUTPUTASSOCIATION$2, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TDataOutputAssociation)get_store().add_element_user(DATAOUTPUTASSOCIATION$2);
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
            get_store().remove_element(DATAOUTPUTASSOCIATION$2, i);
        }
    }
    
    /**
     * Gets the "outputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TOutputSet getOutputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOutputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().find_element_user(OUTPUTSET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outputSet" element
     */
    public boolean isSetOutputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUTSET$4) != 0;
        }
    }
    
    /**
     * Sets the "outputSet" element
     */
    public void setOutputSet(org.omg.schema.spec.bpmn.x20.TOutputSet outputSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOutputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().find_element_user(OUTPUTSET$4, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().add_element_user(OUTPUTSET$4);
            }
            target.set(outputSet);
        }
    }
    
    /**
     * Appends and returns a new empty "outputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TOutputSet addNewOutputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOutputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().add_element_user(OUTPUTSET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "outputSet" element
     */
    public void unsetOutputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUTSET$4, 0);
        }
    }
    
    /**
     * Gets array of all "eventDefinition" elements
     */
    public org.omg.schema.spec.bpmn.x20.TEventDefinition[] getEventDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTDEFINITION$7, targetList);
            org.omg.schema.spec.bpmn.x20.TEventDefinition[] result = new org.omg.schema.spec.bpmn.x20.TEventDefinition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "eventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TEventDefinition getEventDefinitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventDefinition)get_store().find_element_user(EVENTDEFINITION$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "eventDefinition" element
     */
    public int sizeOfEventDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTDEFINITION$7);
        }
    }
    
    /**
     * Sets array of all "eventDefinition" element
     */
    public void setEventDefinitionArray(org.omg.schema.spec.bpmn.x20.TEventDefinition[] eventDefinitionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventDefinitionArray, EVENTDEFINITION$6, EVENTDEFINITION$7);
        }
    }
    
    /**
     * Sets ith "eventDefinition" element
     */
    public void setEventDefinitionArray(int i, org.omg.schema.spec.bpmn.x20.TEventDefinition eventDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventDefinition)get_store().find_element_user(EVENTDEFINITION$7, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eventDefinition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TEventDefinition insertNewEventDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventDefinition)get_store().insert_element_user(EVENTDEFINITION$7, EVENTDEFINITION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventDefinition" element
     */
    public org.omg.schema.spec.bpmn.x20.TEventDefinition addNewEventDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TEventDefinition target = null;
            target = (org.omg.schema.spec.bpmn.x20.TEventDefinition)get_store().add_element_user(EVENTDEFINITION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "eventDefinition" element
     */
    public void removeEventDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTDEFINITION$7, i);
        }
    }
    
    /**
     * Gets array of all "eventDefinitionRef" elements
     */
    public javax.xml.namespace.QName[] getEventDefinitionRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTDEFINITIONREF$8, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "eventDefinitionRef" element
     */
    public javax.xml.namespace.QName getEventDefinitionRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDEFINITIONREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "eventDefinitionRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetEventDefinitionRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTDEFINITIONREF$8, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "eventDefinitionRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetEventDefinitionRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(EVENTDEFINITIONREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "eventDefinitionRef" element
     */
    public int sizeOfEventDefinitionRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTDEFINITIONREF$8);
        }
    }
    
    /**
     * Sets array of all "eventDefinitionRef" element
     */
    public void setEventDefinitionRefArray(javax.xml.namespace.QName[] eventDefinitionRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventDefinitionRefArray, EVENTDEFINITIONREF$8);
        }
    }
    
    /**
     * Sets ith "eventDefinitionRef" element
     */
    public void setEventDefinitionRefArray(int i, javax.xml.namespace.QName eventDefinitionRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDEFINITIONREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(eventDefinitionRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "eventDefinitionRef" element
     */
    public void xsetEventDefinitionRefArray(org.apache.xmlbeans.XmlQName[]eventDefinitionRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventDefinitionRefArray, EVENTDEFINITIONREF$8);
        }
    }
    
    /**
     * Sets (as xml) ith "eventDefinitionRef" element
     */
    public void xsetEventDefinitionRefArray(int i, org.apache.xmlbeans.XmlQName eventDefinitionRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(EVENTDEFINITIONREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(eventDefinitionRef);
        }
    }
    
    /**
     * Inserts the value as the ith "eventDefinitionRef" element
     */
    public void insertEventDefinitionRef(int i, javax.xml.namespace.QName eventDefinitionRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(EVENTDEFINITIONREF$8, i);
            target.setQNameValue(eventDefinitionRef);
        }
    }
    
    /**
     * Appends the value as the last "eventDefinitionRef" element
     */
    public void addEventDefinitionRef(javax.xml.namespace.QName eventDefinitionRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTDEFINITIONREF$8);
            target.setQNameValue(eventDefinitionRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "eventDefinitionRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewEventDefinitionRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(EVENTDEFINITIONREF$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "eventDefinitionRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewEventDefinitionRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(EVENTDEFINITIONREF$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "eventDefinitionRef" element
     */
    public void removeEventDefinitionRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTDEFINITIONREF$8, i);
        }
    }
    
    /**
     * Gets the "parallelMultiple" attribute
     */
    public boolean getParallelMultiple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARALLELMULTIPLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARALLELMULTIPLE$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "parallelMultiple" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetParallelMultiple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PARALLELMULTIPLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(PARALLELMULTIPLE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "parallelMultiple" attribute
     */
    public boolean isSetParallelMultiple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARALLELMULTIPLE$10) != null;
        }
    }
    
    /**
     * Sets the "parallelMultiple" attribute
     */
    public void setParallelMultiple(boolean parallelMultiple)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARALLELMULTIPLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARALLELMULTIPLE$10);
            }
            target.setBooleanValue(parallelMultiple);
        }
    }
    
    /**
     * Sets (as xml) the "parallelMultiple" attribute
     */
    public void xsetParallelMultiple(org.apache.xmlbeans.XmlBoolean parallelMultiple)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(PARALLELMULTIPLE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(PARALLELMULTIPLE$10);
            }
            target.set(parallelMultiple);
        }
    }
    
    /**
     * Unsets the "parallelMultiple" attribute
     */
    public void unsetParallelMultiple()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARALLELMULTIPLE$10);
        }
    }
}
