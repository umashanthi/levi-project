/*
 * XML Type:  tParticipant
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TParticipant
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tParticipant(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TParticipantImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TParticipant
{
    private static final long serialVersionUID = 1L;
    
    public TParticipantImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACEREF$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "interfaceRef");
    private static final javax.xml.namespace.QName ENDPOINTREF$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "endPointRef");
    private static final javax.xml.namespace.QName PARTICIPANTMULTIPLICITY$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "participantMultiplicity");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName PARTNERROLEREF$8 = 
        new javax.xml.namespace.QName("", "partnerRoleRef");
    private static final javax.xml.namespace.QName PARTNERENTITYREF$10 = 
        new javax.xml.namespace.QName("", "partnerEntityRef");
    private static final javax.xml.namespace.QName PROCESSREF$12 = 
        new javax.xml.namespace.QName("", "processRef");
    
    
    /**
     * Gets array of all "interfaceRef" elements
     */
    public javax.xml.namespace.QName[] getInterfaceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERFACEREF$0, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "interfaceRef" element
     */
    public javax.xml.namespace.QName getInterfaceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "interfaceRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetInterfaceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INTERFACEREF$0, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "interfaceRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetInterfaceRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(INTERFACEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "interfaceRef" element
     */
    public int sizeOfInterfaceRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERFACEREF$0);
        }
    }
    
    /**
     * Sets array of all "interfaceRef" element
     */
    public void setInterfaceRefArray(javax.xml.namespace.QName[] interfaceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(interfaceRefArray, INTERFACEREF$0);
        }
    }
    
    /**
     * Sets ith "interfaceRef" element
     */
    public void setInterfaceRefArray(int i, javax.xml.namespace.QName interfaceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INTERFACEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(interfaceRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "interfaceRef" element
     */
    public void xsetInterfaceRefArray(org.apache.xmlbeans.XmlQName[]interfaceRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(interfaceRefArray, INTERFACEREF$0);
        }
    }
    
    /**
     * Sets (as xml) ith "interfaceRef" element
     */
    public void xsetInterfaceRefArray(int i, org.apache.xmlbeans.XmlQName interfaceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(INTERFACEREF$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(interfaceRef);
        }
    }
    
    /**
     * Inserts the value as the ith "interfaceRef" element
     */
    public void insertInterfaceRef(int i, javax.xml.namespace.QName interfaceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INTERFACEREF$0, i);
            target.setQNameValue(interfaceRef);
        }
    }
    
    /**
     * Appends the value as the last "interfaceRef" element
     */
    public void addInterfaceRef(javax.xml.namespace.QName interfaceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INTERFACEREF$0);
            target.setQNameValue(interfaceRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "interfaceRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewInterfaceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(INTERFACEREF$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "interfaceRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewInterfaceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(INTERFACEREF$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "interfaceRef" element
     */
    public void removeInterfaceRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERFACEREF$0, i);
        }
    }
    
    /**
     * Gets array of all "endPointRef" elements
     */
    public javax.xml.namespace.QName[] getEndPointRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENDPOINTREF$2, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "endPointRef" element
     */
    public javax.xml.namespace.QName getEndPointRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINTREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "endPointRef" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetEndPointRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENDPOINTREF$2, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "endPointRef" element
     */
    public org.apache.xmlbeans.XmlQName xgetEndPointRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(ENDPOINTREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "endPointRef" element
     */
    public int sizeOfEndPointRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOINTREF$2);
        }
    }
    
    /**
     * Sets array of all "endPointRef" element
     */
    public void setEndPointRefArray(javax.xml.namespace.QName[] endPointRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(endPointRefArray, ENDPOINTREF$2);
        }
    }
    
    /**
     * Sets ith "endPointRef" element
     */
    public void setEndPointRefArray(int i, javax.xml.namespace.QName endPointRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINTREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(endPointRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "endPointRef" element
     */
    public void xsetEndPointRefArray(org.apache.xmlbeans.XmlQName[]endPointRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(endPointRefArray, ENDPOINTREF$2);
        }
    }
    
    /**
     * Sets (as xml) ith "endPointRef" element
     */
    public void xsetEndPointRefArray(int i, org.apache.xmlbeans.XmlQName endPointRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(ENDPOINTREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(endPointRef);
        }
    }
    
    /**
     * Inserts the value as the ith "endPointRef" element
     */
    public void insertEndPointRef(int i, javax.xml.namespace.QName endPointRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ENDPOINTREF$2, i);
            target.setQNameValue(endPointRef);
        }
    }
    
    /**
     * Appends the value as the last "endPointRef" element
     */
    public void addEndPointRef(javax.xml.namespace.QName endPointRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINTREF$2);
            target.setQNameValue(endPointRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endPointRef" element
     */
    public org.apache.xmlbeans.XmlQName insertNewEndPointRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(ENDPOINTREF$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endPointRef" element
     */
    public org.apache.xmlbeans.XmlQName addNewEndPointRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(ENDPOINTREF$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "endPointRef" element
     */
    public void removeEndPointRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOINTREF$2, i);
        }
    }
    
    /**
     * Gets the "participantMultiplicity" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity getParticipantMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity)get_store().find_element_user(PARTICIPANTMULTIPLICITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "participantMultiplicity" element
     */
    public boolean isSetParticipantMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANTMULTIPLICITY$4) != 0;
        }
    }
    
    /**
     * Sets the "participantMultiplicity" element
     */
    public void setParticipantMultiplicity(org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity participantMultiplicity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity)get_store().find_element_user(PARTICIPANTMULTIPLICITY$4, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity)get_store().add_element_user(PARTICIPANTMULTIPLICITY$4);
            }
            target.set(participantMultiplicity);
        }
    }
    
    /**
     * Appends and returns a new empty "participantMultiplicity" element
     */
    public org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity addNewParticipantMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity target = null;
            target = (org.omg.schema.spec.bpmn.x20.TParticipantMultiplicity)get_store().add_element_user(PARTICIPANTMULTIPLICITY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "participantMultiplicity" element
     */
    public void unsetParticipantMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANTMULTIPLICITY$4, 0);
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
    
    /**
     * Gets the "partnerRoleRef" attribute
     */
    public javax.xml.namespace.QName getPartnerRoleRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERROLEREF$8);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "partnerRoleRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetPartnerRoleRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PARTNERROLEREF$8);
            return target;
        }
    }
    
    /**
     * True if has "partnerRoleRef" attribute
     */
    public boolean isSetPartnerRoleRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARTNERROLEREF$8) != null;
        }
    }
    
    /**
     * Sets the "partnerRoleRef" attribute
     */
    public void setPartnerRoleRef(javax.xml.namespace.QName partnerRoleRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERROLEREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTNERROLEREF$8);
            }
            target.setQNameValue(partnerRoleRef);
        }
    }
    
    /**
     * Sets (as xml) the "partnerRoleRef" attribute
     */
    public void xsetPartnerRoleRef(org.apache.xmlbeans.XmlQName partnerRoleRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PARTNERROLEREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PARTNERROLEREF$8);
            }
            target.set(partnerRoleRef);
        }
    }
    
    /**
     * Unsets the "partnerRoleRef" attribute
     */
    public void unsetPartnerRoleRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARTNERROLEREF$8);
        }
    }
    
    /**
     * Gets the "partnerEntityRef" attribute
     */
    public javax.xml.namespace.QName getPartnerEntityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERENTITYREF$10);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "partnerEntityRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetPartnerEntityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PARTNERENTITYREF$10);
            return target;
        }
    }
    
    /**
     * True if has "partnerEntityRef" attribute
     */
    public boolean isSetPartnerEntityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARTNERENTITYREF$10) != null;
        }
    }
    
    /**
     * Sets the "partnerEntityRef" attribute
     */
    public void setPartnerEntityRef(javax.xml.namespace.QName partnerEntityRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTNERENTITYREF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTNERENTITYREF$10);
            }
            target.setQNameValue(partnerEntityRef);
        }
    }
    
    /**
     * Sets (as xml) the "partnerEntityRef" attribute
     */
    public void xsetPartnerEntityRef(org.apache.xmlbeans.XmlQName partnerEntityRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PARTNERENTITYREF$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PARTNERENTITYREF$10);
            }
            target.set(partnerEntityRef);
        }
    }
    
    /**
     * Unsets the "partnerEntityRef" attribute
     */
    public void unsetPartnerEntityRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARTNERENTITYREF$10);
        }
    }
    
    /**
     * Gets the "processRef" attribute
     */
    public javax.xml.namespace.QName getProcessRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSREF$12);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "processRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetProcessRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROCESSREF$12);
            return target;
        }
    }
    
    /**
     * True if has "processRef" attribute
     */
    public boolean isSetProcessRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROCESSREF$12) != null;
        }
    }
    
    /**
     * Sets the "processRef" attribute
     */
    public void setProcessRef(javax.xml.namespace.QName processRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSREF$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROCESSREF$12);
            }
            target.setQNameValue(processRef);
        }
    }
    
    /**
     * Sets (as xml) the "processRef" attribute
     */
    public void xsetProcessRef(org.apache.xmlbeans.XmlQName processRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(PROCESSREF$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(PROCESSREF$12);
            }
            target.set(processRef);
        }
    }
    
    /**
     * Unsets the "processRef" attribute
     */
    public void unsetProcessRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROCESSREF$12);
        }
    }
}
