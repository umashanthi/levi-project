/*
 * An XML document type.
 * Localname: callableElement
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CallableElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one callableElement(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CallableElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.CallableElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public CallableElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CALLABLEELEMENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "callableElement");
    
    
    /**
     * Gets the "callableElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TCallableElement getCallableElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallableElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallableElement)get_store().find_element_user(CALLABLEELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "callableElement" element
     */
    public void setCallableElement(org.omg.schema.spec.bpmn.x20.TCallableElement callableElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallableElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallableElement)get_store().find_element_user(CALLABLEELEMENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCallableElement)get_store().add_element_user(CALLABLEELEMENT$0);
            }
            target.set(callableElement);
        }
    }
    
    /**
     * Appends and returns a new empty "callableElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TCallableElement addNewCallableElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCallableElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCallableElement)get_store().add_element_user(CALLABLEELEMENT$0);
            return target;
        }
    }
}
