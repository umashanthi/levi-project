/*
 * An XML document type.
 * Localname: diagram
 * Namespace: http://www.omg.com/di/1.0.0
 * Java type: com.omg.di.x100.DiagramDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.di.x100.impl;
/**
 * A document containing one diagram(@http://www.omg.com/di/1.0.0) element.
 *
 * This is a complex type.
 */
public class DiagramDocumentImpl extends com.omg.di.x100.impl.ViewDocumentImpl implements com.omg.di.x100.DiagramDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiagramDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGRAM$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "diagram");
    
    
    /**
     * Gets the "diagram" element
     */
    public com.omg.di.x100.Diagram getDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Diagram target = null;
            target = (com.omg.di.x100.Diagram)get_store().find_element_user(DIAGRAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "diagram" element
     */
    public void setDiagram(com.omg.di.x100.Diagram diagram)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Diagram target = null;
            target = (com.omg.di.x100.Diagram)get_store().find_element_user(DIAGRAM$0, 0);
            if (target == null)
            {
                target = (com.omg.di.x100.Diagram)get_store().add_element_user(DIAGRAM$0);
            }
            target.set(diagram);
        }
    }
    
    /**
     * Appends and returns a new empty "diagram" element
     */
    public com.omg.di.x100.Diagram addNewDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Diagram target = null;
            target = (com.omg.di.x100.Diagram)get_store().add_element_user(DIAGRAM$0);
            return target;
        }
    }
}
