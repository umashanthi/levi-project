/*
 * An XML document type.
 * Localname: style
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.StyleDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100.impl;
/**
 * A document containing one style(@http://www.omg.com/di/1.0.0) element.
 *
 * This is a complex type.
 */
public class StyleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.omg.di.x100.StyleDocument
{
    private static final long serialVersionUID = 1L;
    
    public StyleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLE$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "style");
    
    
    /**
     * Gets the "style" element
     */
    public com.omg.di.x100.Style getStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Style target = null;
            target = (com.omg.di.x100.Style)get_store().find_element_user(STYLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "style" element
     */
    public void setStyle(com.omg.di.x100.Style style)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Style target = null;
            target = (com.omg.di.x100.Style)get_store().find_element_user(STYLE$0, 0);
            if (target == null)
            {
                target = (com.omg.di.x100.Style)get_store().add_element_user(STYLE$0);
            }
            target.set(style);
        }
    }
    
    /**
     * Appends and returns a new empty "style" element
     */
    public com.omg.di.x100.Style addNewStyle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Style target = null;
            target = (com.omg.di.x100.Style)get_store().add_element_user(STYLE$0);
            return target;
        }
    }
}
