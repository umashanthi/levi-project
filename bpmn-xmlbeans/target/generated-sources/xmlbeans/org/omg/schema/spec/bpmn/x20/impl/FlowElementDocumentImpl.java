/*
 * An XML document type.
 * Localname: flowElement
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.FlowElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one flowElement(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class FlowElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.FlowElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public FlowElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "intermediateThrowEvent"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "serviceTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "userTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "endEvent"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "startEvent"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "subProcess"),
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
    
    
    /**
     * Gets the "flowElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TFlowElement getFlowElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFlowElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFlowElement)get_store().find_element_user(FLOWELEMENT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "flowElement" element
     */
    public void setFlowElement(org.omg.schema.spec.bpmn.x20.TFlowElement flowElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFlowElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFlowElement)get_store().find_element_user(FLOWELEMENT$1, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TFlowElement)get_store().add_element_user(FLOWELEMENT$0);
            }
            target.set(flowElement);
        }
    }
    
    /**
     * Appends and returns a new empty "flowElement" element
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
}
