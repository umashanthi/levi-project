/*
 * XML Type:  tThrowEvent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TThrowEvent
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tThrowEvent(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TThrowEventImpl extends org.omg.schema.spec.bpmn.x20.impl.TEventImpl implements org.omg.schema.spec.bpmn.x20.TThrowEvent
{
    private static final long serialVersionUID = 1L;
    
    public TThrowEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAINPUT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataInput");
    private static final javax.xml.namespace.QName DATAINPUTASSOCIATION$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataInputAssociation");
    private static final javax.xml.namespace.QName INPUTSET$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "inputSet");
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
    
    
    /**
     * Gets array of all "dataInput" elements
     */
    public org.omg.schema.spec.bpmn.x20.TDataInput[] getDataInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAINPUT$0, targetList);
            org.omg.schema.spec.bpmn.x20.TDataInput[] result = new org.omg.schema.spec.bpmn.x20.TDataInput[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataInput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInput getDataInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().find_element_user(DATAINPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataInput" element
     */
    public int sizeOfDataInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINPUT$0);
        }
    }
    
    /**
     * Sets array of all "dataInput" element
     */
    public void setDataInputArray(org.omg.schema.spec.bpmn.x20.TDataInput[] dataInputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataInputArray, DATAINPUT$0);
        }
    }
    
    /**
     * Sets ith "dataInput" element
     */
    public void setDataInputArray(int i, org.omg.schema.spec.bpmn.x20.TDataInput dataInput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().find_element_user(DATAINPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataInput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataInput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInput insertNewDataInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().insert_element_user(DATAINPUT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataInput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInput addNewDataInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().add_element_user(DATAINPUT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataInput" element
     */
    public void removeDataInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINPUT$0, i);
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
            get_store().find_all_element_users(DATAINPUTASSOCIATION$2, targetList);
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
            target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().find_element_user(DATAINPUTASSOCIATION$2, i);
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
            return get_store().count_elements(DATAINPUTASSOCIATION$2);
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
            arraySetterHelper(dataInputAssociationArray, DATAINPUTASSOCIATION$2);
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
            target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().find_element_user(DATAINPUTASSOCIATION$2, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().insert_element_user(DATAINPUTASSOCIATION$2, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TDataInputAssociation)get_store().add_element_user(DATAINPUTASSOCIATION$2);
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
            get_store().remove_element(DATAINPUTASSOCIATION$2, i);
        }
    }
    
    /**
     * Gets the "inputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputSet getInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().find_element_user(INPUTSET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "inputSet" element
     */
    public boolean isSetInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTSET$4) != 0;
        }
    }
    
    /**
     * Sets the "inputSet" element
     */
    public void setInputSet(org.omg.schema.spec.bpmn.x20.TInputSet inputSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().find_element_user(INPUTSET$4, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().add_element_user(INPUTSET$4);
            }
            target.set(inputSet);
        }
    }
    
    /**
     * Appends and returns a new empty "inputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputSet addNewInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().add_element_user(INPUTSET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "inputSet" element
     */
    public void unsetInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTSET$4, 0);
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
}
