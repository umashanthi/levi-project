/*
 * An XML document type.
 * Localname: interface
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.InterfaceDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one interface(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class InterfaceDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.InterfaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public InterfaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INTERFACE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "interface");
    
    
    /**
     * Gets the "interface" element
     */
    public org.omg.schema.spec.bpmn.x20.TInterface getInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInterface target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInterface)get_store().find_element_user(INTERFACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "interface" element
     */
    public void setInterface(org.omg.schema.spec.bpmn.x20.TInterface xinterface)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInterface target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInterface)get_store().find_element_user(INTERFACE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TInterface)get_store().add_element_user(INTERFACE$0);
            }
            target.set(xinterface);
        }
    }
    
    /**
     * Appends and returns a new empty "interface" element
     */
    public org.omg.schema.spec.bpmn.x20.TInterface addNewInterface()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInterface target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInterface)get_store().add_element_user(INTERFACE$0);
            return target;
        }
    }
}
