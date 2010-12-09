/*
 * An XML document type.
 * Localname: baseElement
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.BaseElementDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one baseElement(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class BaseElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.BaseElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEELEMENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "baseElement");
    
    
    /**
     * Gets the "baseElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TBaseElement getBaseElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElement)get_store().find_element_user(BASEELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseElement" element
     */
    public void setBaseElement(org.omg.schema.spec.bpmn.x20.TBaseElement baseElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElement)get_store().find_element_user(BASEELEMENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TBaseElement)get_store().add_element_user(BASEELEMENT$0);
            }
            target.set(baseElement);
        }
    }
    
    /**
     * Appends and returns a new empty "baseElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TBaseElement addNewBaseElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElement)get_store().add_element_user(BASEELEMENT$0);
            return target;
        }
    }
}
