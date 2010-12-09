/*
 * XML Type:  tProcess
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TProcess
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tProcess(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TProcessImpl extends org.omg.schema.spec.bpmn.x20.impl.TCallableElementImpl implements org.omg.schema.spec.bpmn.x20.TProcess
{
    private static final long serialVersionUID = 1L;
    
    public TProcessImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDITING$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "auditing");
    private static final javax.xml.namespace.QName MONITORING$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "monitoring");
    private static final javax.xml.namespace.QName PROPERTY$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "property");
    private static final javax.xml.namespace.QName LANESET$6 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "laneSet");
    private static final javax.xml.namespace.QName FLOWELEMENT$8 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "flowElement");
    private static final org.apache.xmlbeans.QNameSet FLOWELEMENT$9 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "receiveTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "event"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "flowElement"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataObject"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "businessRuleTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "sendTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "choreographyTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "transaction"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "sequenceFlow"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "scriptTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "complexGateway"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "boundaryEvent"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "manualTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "parallelGateway"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "serviceTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "intermediateThrowEvent"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "userTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "subProcess"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "startEvent"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "endEvent"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataStoreReference"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "callChoreographyActivity"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "eventBasedGateway"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "callActivity"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "implicitThrowEvent"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "task"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "inclusiveGateway"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "choreographySubProcess"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "exclusiveGateway"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "intermediateCatchEvent"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "adHocSubProcess"),
    });
    private static final javax.xml.namespace.QName ARTIFACT$10 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact");
    private static final org.apache.xmlbeans.QNameSet ARTIFACT$11 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "association"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "group"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "textAnnotation"),
    });
    private static final javax.xml.namespace.QName SUPPORTS$12 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "supports");
    private static final javax.xml.namespace.QName PROCESSTYPE$14 = 
        new javax.xml.namespace.QName("", "processType");
    private static final javax.xml.namespace.QName ISCLOSED$16 = 
        new javax.xml.namespace.QName("", "isClosed");
    private static final javax.xml.namespace.QName DEFINITIONALCOLLABORATIONREF$18 = 
        new javax.xml.namespace.QName("", "definitionalCollaborationRef");
    
    
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
     * Gets array of all "property" elements
     */
    public org.omg.schema.spec.bpmn.x20.TProperty[] getPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTY$4, targetList);
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
            target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().find_element_user(PROPERTY$4, i);
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
            return get_store().count_elements(PROPERTY$4);
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
            arraySetterHelper(propertyArray, PROPERTY$4);
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
            target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().find_element_user(PROPERTY$4, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().insert_element_user(PROPERTY$4, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TProperty)get_store().add_element_user(PROPERTY$4);
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
            get_store().remove_element(PROPERTY$4, i);
        }
    }
    
    /**
     * Gets array of all "laneSet" elements
     */
    public org.omg.schema.spec.bpmn.x20.TLaneSet[] getLaneSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LANESET$6, targetList);
            org.omg.schema.spec.bpmn.x20.TLaneSet[] result = new org.omg.schema.spec.bpmn.x20.TLaneSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "laneSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TLaneSet getLaneSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLaneSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().find_element_user(LANESET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "laneSet" element
     */
    public int sizeOfLaneSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANESET$6);
        }
    }
    
    /**
     * Sets array of all "laneSet" element
     */
    public void setLaneSetArray(org.omg.schema.spec.bpmn.x20.TLaneSet[] laneSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(laneSetArray, LANESET$6);
        }
    }
    
    /**
     * Sets ith "laneSet" element
     */
    public void setLaneSetArray(int i, org.omg.schema.spec.bpmn.x20.TLaneSet laneSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLaneSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().find_element_user(LANESET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(laneSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "laneSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TLaneSet insertNewLaneSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLaneSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().insert_element_user(LANESET$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "laneSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TLaneSet addNewLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLaneSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().add_element_user(LANESET$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "laneSet" element
     */
    public void removeLaneSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANESET$6, i);
        }
    }
    
    /**
     * Gets array of all "flowElement" elements
     */
    public org.omg.schema.spec.bpmn.x20.TFlowElement[] getFlowElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLOWELEMENT$9, targetList);
            org.omg.schema.spec.bpmn.x20.TFlowElement[] result = new org.omg.schema.spec.bpmn.x20.TFlowElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "flowElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TFlowElement getFlowElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFlowElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFlowElement)get_store().find_element_user(FLOWELEMENT$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "flowElement" element
     */
    public int sizeOfFlowElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLOWELEMENT$9);
        }
    }
    
    /**
     * Sets array of all "flowElement" element
     */
    public void setFlowElementArray(org.omg.schema.spec.bpmn.x20.TFlowElement[] flowElementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flowElementArray, FLOWELEMENT$8, FLOWELEMENT$9);
        }
    }
    
    /**
     * Sets ith "flowElement" element
     */
    public void setFlowElementArray(int i, org.omg.schema.spec.bpmn.x20.TFlowElement flowElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFlowElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFlowElement)get_store().find_element_user(FLOWELEMENT$9, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(flowElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "flowElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TFlowElement insertNewFlowElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFlowElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFlowElement)get_store().insert_element_user(FLOWELEMENT$9, FLOWELEMENT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "flowElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TFlowElement addNewFlowElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFlowElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFlowElement)get_store().add_element_user(FLOWELEMENT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "flowElement" element
     */
    public void removeFlowElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLOWELEMENT$9, i);
        }
    }
    
    /**
     * Gets array of all "artifact" elements
     */
    public org.omg.schema.spec.bpmn.x20.TArtifact[] getArtifactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ARTIFACT$11, targetList);
            org.omg.schema.spec.bpmn.x20.TArtifact[] result = new org.omg.schema.spec.bpmn.x20.TArtifact[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "artifact" element
     */
    public org.omg.schema.spec.bpmn.x20.TArtifact getArtifactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TArtifact target = null;
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().find_element_user(ARTIFACT$11, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "artifact" element
     */
    public int sizeOfArtifactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARTIFACT$11);
        }
    }
    
    /**
     * Sets array of all "artifact" element
     */
    public void setArtifactArray(org.omg.schema.spec.bpmn.x20.TArtifact[] artifactArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(artifactArray, ARTIFACT$10, ARTIFACT$11);
        }
    }
    
    /**
     * Sets ith "artifact" element
     */
    public void setArtifactArray(int i, org.omg.schema.spec.bpmn.x20.TArtifact artifact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TArtifact target = null;
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().find_element_user(ARTIFACT$11, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(artifact);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "artifact" element
     */
    public org.omg.schema.spec.bpmn.x20.TArtifact insertNewArtifact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TArtifact target = null;
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().insert_element_user(ARTIFACT$11, ARTIFACT$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "artifact" element
     */
    public org.omg.schema.spec.bpmn.x20.TArtifact addNewArtifact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TArtifact target = null;
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().add_element_user(ARTIFACT$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "artifact" element
     */
    public void removeArtifact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARTIFACT$11, i);
        }
    }
    
    /**
     * Gets array of all "supports" elements
     */
    public javax.xml.namespace.QName[] getSupportsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTS$12, targetList);
            javax.xml.namespace.QName[] result = new javax.xml.namespace.QName[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getQNameValue();
            return result;
        }
    }
    
    /**
     * Gets ith "supports" element
     */
    public javax.xml.namespace.QName getSupportsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "supports" elements
     */
    public org.apache.xmlbeans.XmlQName[] xgetSupportsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUPPORTS$12, targetList);
            org.apache.xmlbeans.XmlQName[] result = new org.apache.xmlbeans.XmlQName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "supports" element
     */
    public org.apache.xmlbeans.XmlQName xgetSupportsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SUPPORTS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlQName)target;
        }
    }
    
    /**
     * Returns number of "supports" element
     */
    public int sizeOfSupportsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTS$12);
        }
    }
    
    /**
     * Sets array of all "supports" element
     */
    public void setSupportsArray(javax.xml.namespace.QName[] supportsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(supportsArray, SUPPORTS$12);
        }
    }
    
    /**
     * Sets ith "supports" element
     */
    public void setSupportsArray(int i, javax.xml.namespace.QName supports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setQNameValue(supports);
        }
    }
    
    /**
     * Sets (as xml) array of all "supports" element
     */
    public void xsetSupportsArray(org.apache.xmlbeans.XmlQName[]supportsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(supportsArray, SUPPORTS$12);
        }
    }
    
    /**
     * Sets (as xml) ith "supports" element
     */
    public void xsetSupportsArray(int i, org.apache.xmlbeans.XmlQName supports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_element_user(SUPPORTS$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(supports);
        }
    }
    
    /**
     * Inserts the value as the ith "supports" element
     */
    public void insertSupports(int i, javax.xml.namespace.QName supports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SUPPORTS$12, i);
            target.setQNameValue(supports);
        }
    }
    
    /**
     * Appends the value as the last "supports" element
     */
    public void addSupports(javax.xml.namespace.QName supports)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTS$12);
            target.setQNameValue(supports);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "supports" element
     */
    public org.apache.xmlbeans.XmlQName insertNewSupports(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().insert_element_user(SUPPORTS$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "supports" element
     */
    public org.apache.xmlbeans.XmlQName addNewSupports()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().add_element_user(SUPPORTS$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "supports" element
     */
    public void removeSupports(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTS$12, i);
        }
    }
    
    /**
     * Gets the "processType" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TProcessType.Enum getProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSTYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PROCESSTYPE$14);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.schema.spec.bpmn.x20.TProcessType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "processType" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TProcessType xgetProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProcessType target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProcessType)get_store().find_attribute_user(PROCESSTYPE$14);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TProcessType)get_default_attribute_value(PROCESSTYPE$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "processType" attribute
     */
    public boolean isSetProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROCESSTYPE$14) != null;
        }
    }
    
    /**
     * Sets the "processType" attribute
     */
    public void setProcessType(org.omg.schema.spec.bpmn.x20.TProcessType.Enum processType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROCESSTYPE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROCESSTYPE$14);
            }
            target.setEnumValue(processType);
        }
    }
    
    /**
     * Sets (as xml) the "processType" attribute
     */
    public void xsetProcessType(org.omg.schema.spec.bpmn.x20.TProcessType processType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TProcessType target = null;
            target = (org.omg.schema.spec.bpmn.x20.TProcessType)get_store().find_attribute_user(PROCESSTYPE$14);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TProcessType)get_store().add_attribute_user(PROCESSTYPE$14);
            }
            target.set(processType);
        }
    }
    
    /**
     * Unsets the "processType" attribute
     */
    public void unsetProcessType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROCESSTYPE$14);
        }
    }
    
    /**
     * Gets the "isClosed" attribute
     */
    public boolean getIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCLOSED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ISCLOSED$16);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isClosed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCLOSED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ISCLOSED$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "isClosed" attribute
     */
    public boolean isSetIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISCLOSED$16) != null;
        }
    }
    
    /**
     * Sets the "isClosed" attribute
     */
    public void setIsClosed(boolean isClosed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISCLOSED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISCLOSED$16);
            }
            target.setBooleanValue(isClosed);
        }
    }
    
    /**
     * Sets (as xml) the "isClosed" attribute
     */
    public void xsetIsClosed(org.apache.xmlbeans.XmlBoolean isClosed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ISCLOSED$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ISCLOSED$16);
            }
            target.set(isClosed);
        }
    }
    
    /**
     * Unsets the "isClosed" attribute
     */
    public void unsetIsClosed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISCLOSED$16);
        }
    }
    
    /**
     * Gets the "definitionalCollaborationRef" attribute
     */
    public javax.xml.namespace.QName getDefinitionalCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITIONALCOLLABORATIONREF$18);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "definitionalCollaborationRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetDefinitionalCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(DEFINITIONALCOLLABORATIONREF$18);
            return target;
        }
    }
    
    /**
     * True if has "definitionalCollaborationRef" attribute
     */
    public boolean isSetDefinitionalCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFINITIONALCOLLABORATIONREF$18) != null;
        }
    }
    
    /**
     * Sets the "definitionalCollaborationRef" attribute
     */
    public void setDefinitionalCollaborationRef(javax.xml.namespace.QName definitionalCollaborationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITIONALCOLLABORATIONREF$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFINITIONALCOLLABORATIONREF$18);
            }
            target.setQNameValue(definitionalCollaborationRef);
        }
    }
    
    /**
     * Sets (as xml) the "definitionalCollaborationRef" attribute
     */
    public void xsetDefinitionalCollaborationRef(org.apache.xmlbeans.XmlQName definitionalCollaborationRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(DEFINITIONALCOLLABORATIONREF$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(DEFINITIONALCOLLABORATIONREF$18);
            }
            target.set(definitionalCollaborationRef);
        }
    }
    
    /**
     * Unsets the "definitionalCollaborationRef" attribute
     */
    public void unsetDefinitionalCollaborationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFINITIONALCOLLABORATIONREF$18);
        }
    }
}
