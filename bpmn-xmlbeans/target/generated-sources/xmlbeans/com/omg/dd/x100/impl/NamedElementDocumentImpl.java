/*
 * An XML document type.
 * Localname: namedElement
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.NamedElementDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * A document containing one namedElement(@http://www.omg.com/dd/1.0.0) element.
 *
 * This is a complex type.
 */
public class NamedElementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.omg.dd.x100.NamedElementDocument
{
    private static final long serialVersionUID = 1L;
    
    public NamedElementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEDELEMENT$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "namedElement");
    
    
    /**
     * Gets the "namedElement" element
     */
    public com.omg.dd.x100.NamedElement getNamedElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.NamedElement target = null;
            target = (com.omg.dd.x100.NamedElement)get_store().find_element_user(NAMEDELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "namedElement" element
     */
    public void setNamedElement(com.omg.dd.x100.NamedElement namedElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.NamedElement target = null;
            target = (com.omg.dd.x100.NamedElement)get_store().find_element_user(NAMEDELEMENT$0, 0);
            if (target == null)
            {
                target = (com.omg.dd.x100.NamedElement)get_store().add_element_user(NAMEDELEMENT$0);
            }
            target.set(namedElement);
        }
    }
    
    /**
     * Appends and returns a new empty "namedElement" element
     */
    public com.omg.dd.x100.NamedElement addNewNamedElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.NamedElement target = null;
            target = (com.omg.dd.x100.NamedElement)get_store().add_element_user(NAMEDELEMENT$0);
            return target;
        }
    }
}
