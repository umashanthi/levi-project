/*
 * An XML document type.
 * Localname: package
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.PackageDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * A document containing one package(@http://www.omg.com/dd/1.0.0) element.
 *
 * This is a complex type.
 */
public class PackageDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.omg.dd.x100.PackageDocument
{
    private static final long serialVersionUID = 1L;
    
    public PackageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PACKAGE$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "package");
    
    
    /**
     * Gets the "package" element
     */
    public com.omg.dd.x100.Package getPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.Package target = null;
            target = (com.omg.dd.x100.Package)get_store().find_element_user(PACKAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "package" element
     */
    public void setPackage(com.omg.dd.x100.Package xpackage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.Package target = null;
            target = (com.omg.dd.x100.Package)get_store().find_element_user(PACKAGE$0, 0);
            if (target == null)
            {
                target = (com.omg.dd.x100.Package)get_store().add_element_user(PACKAGE$0);
            }
            target.set(xpackage);
        }
    }
    
    /**
     * Appends and returns a new empty "package" element
     */
    public com.omg.dd.x100.Package addNewPackage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.Package target = null;
            target = (com.omg.dd.x100.Package)get_store().add_element_user(PACKAGE$0);
            return target;
        }
    }
}
