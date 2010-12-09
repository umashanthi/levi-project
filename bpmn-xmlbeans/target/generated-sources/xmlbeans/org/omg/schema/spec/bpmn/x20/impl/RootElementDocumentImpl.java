/*
 * An XML document type.
 * Localname: rootElement
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.RootElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one rootElement(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class RootElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.RootElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public RootElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOTELEMENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "rootElement");
    private static final org.apache.xmlbeans.QNameSet ROOTELEMENT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "errorEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataStore"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "partnerRole"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "signalEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "partnerEntity"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "eventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conversation"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "rootElement"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "choreography"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "timerEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "collaboration"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "cancelEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalChoreographyTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalBusinessRuleTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "signal"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "endPoint"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalManualTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "compensateEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalUserTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "message"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "process"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "category"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conditionalEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalScriptTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "terminateEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "escalation"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "error"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalCommunication"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "linkEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "interface"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "correlationProperty"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "escalationEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "resource"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "itemDefinition"),
    });
    
    
    /**
     * Gets the "rootElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TRootElement getRootElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRootElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRootElement)get_store().find_element_user(ROOTELEMENT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rootElement" element
     */
    public void setRootElement(org.omg.schema.spec.bpmn.x20.TRootElement rootElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRootElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRootElement)get_store().find_element_user(ROOTELEMENT$1, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TRootElement)get_store().add_element_user(ROOTELEMENT$0);
            }
            target.set(rootElement);
        }
    }
    
    /**
     * Appends and returns a new empty "rootElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TRootElement addNewRootElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRootElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRootElement)get_store().add_element_user(ROOTELEMENT$0);
            return target;
        }
    }
}
