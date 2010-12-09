/*
 * An XML document type.
 * Localname: view
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.ViewDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100.impl;
/**
 * A document containing one view(@http://www.omg.com/di/1.0.0) element.
 *
 * This is a complex type.
 */
public class ViewDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.omg.di.x100.ViewDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEW$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "view");
    private static final org.apache.xmlbeans.QNameSet VIEW$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "view"),
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "diagram"),
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "connector"),
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "node"),
    });
    
    
    /**
     * Gets the "view" element
     */
    public com.omg.di.x100.View getView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.View target = null;
            target = (com.omg.di.x100.View)get_store().find_element_user(VIEW$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "view" element
     */
    public void setView(com.omg.di.x100.View view)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.View target = null;
            target = (com.omg.di.x100.View)get_store().find_element_user(VIEW$1, 0);
            if (target == null)
            {
                target = (com.omg.di.x100.View)get_store().add_element_user(VIEW$0);
            }
            target.set(view);
        }
    }
    
    /**
     * Appends and returns a new empty "view" element
     */
    public com.omg.di.x100.View addNewView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.View target = null;
            target = (com.omg.di.x100.View)get_store().add_element_user(VIEW$0);
            return target;
        }
    }
}
