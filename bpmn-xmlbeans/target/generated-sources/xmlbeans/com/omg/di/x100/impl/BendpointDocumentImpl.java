/*
 * An XML document type.
 * Localname: bendpoint
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.BendpointDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100.impl;
/**
 * A document containing one bendpoint(@http://www.omg.com/di/1.0.0) element.
 *
 * This is a complex type.
 */
public class BendpointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.omg.di.x100.BendpointDocument
{
    private static final long serialVersionUID = 1L;
    
    public BendpointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BENDPOINT$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "bendpoint");
    
    
    /**
     * Gets the "bendpoint" element
     */
    public com.omg.di.x100.Bendpoint getBendpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Bendpoint target = null;
            target = (com.omg.di.x100.Bendpoint)get_store().find_element_user(BENDPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "bendpoint" element
     */
    public void setBendpoint(com.omg.di.x100.Bendpoint bendpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Bendpoint target = null;
            target = (com.omg.di.x100.Bendpoint)get_store().find_element_user(BENDPOINT$0, 0);
            if (target == null)
            {
                target = (com.omg.di.x100.Bendpoint)get_store().add_element_user(BENDPOINT$0);
            }
            target.set(bendpoint);
        }
    }
    
    /**
     * Appends and returns a new empty "bendpoint" element
     */
    public com.omg.di.x100.Bendpoint addNewBendpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Bendpoint target = null;
            target = (com.omg.di.x100.Bendpoint)get_store().add_element_user(BENDPOINT$0);
            return target;
        }
    }
}
