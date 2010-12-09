/*
 * XML Type:  tChoreographySubProcess
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TChoreographySubProcess
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tChoreographySubProcess(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TChoreographySubProcessImpl extends org.omg.schema.spec.bpmn.x20.impl.TChoreographyActivityImpl implements org.omg.schema.spec.bpmn.x20.TChoreographySubProcess
{
    private static final long serialVersionUID = 1L;
    
    public TChoreographySubProcessImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FLOWELEMENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "flowElement");
    private static final org.apache.xmlbeans.QNameSet FLOWELEMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
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
    private static final javax.xml.namespace.QName ARTIFACT$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact");
    private static final org.apache.xmlbeans.QNameSet ARTIFACT$3 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "association"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "group"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "textAnnotation"),
    });
    
    
    /**
     * Gets array of all "flowElement" elements
     */
    public org.omg.schema.spec.bpmn.x20.TFlowElement[] getFlowElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLOWELEMENT$1, targetList);
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
            target = (org.omg.schema.spec.bpmn.x20.TFlowElement)get_store().find_element_user(FLOWELEMENT$1, i);
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
            return get_store().count_elements(FLOWELEMENT$1);
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
            arraySetterHelper(flowElementArray, FLOWELEMENT$0, FLOWELEMENT$1);
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
            target = (org.omg.schema.spec.bpmn.x20.TFlowElement)get_store().find_element_user(FLOWELEMENT$1, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TFlowElement)get_store().insert_element_user(FLOWELEMENT$1, FLOWELEMENT$0, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TFlowElement)get_store().add_element_user(FLOWELEMENT$0);
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
            get_store().remove_element(FLOWELEMENT$1, i);
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
            get_store().find_all_element_users(ARTIFACT$3, targetList);
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
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().find_element_user(ARTIFACT$3, i);
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
            return get_store().count_elements(ARTIFACT$3);
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
            arraySetterHelper(artifactArray, ARTIFACT$2, ARTIFACT$3);
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
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().find_element_user(ARTIFACT$3, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().insert_element_user(ARTIFACT$3, ARTIFACT$2, i);
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
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().add_element_user(ARTIFACT$2);
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
            get_store().remove_element(ARTIFACT$3, i);
        }
    }
}
