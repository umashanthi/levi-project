/*
 * An XML document type.
 * Localname: viewDefinition
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.ViewDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * A document containing one viewDefinition(@http://www.omg.com/dd/1.0.0) element.
 *
 * This is a complex type.
 */
public class ViewDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.omg.dd.x100.ViewDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ViewDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VIEWDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "viewDefinition");
    private static final org.apache.xmlbeans.QNameSet VIEWDEFINITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "nodeDefinition"),
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "connectorDefinition"),
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "viewDefinition"),
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "diagramDefinition"),
    });
    
    
    /**
     * Gets the "viewDefinition" element
     */
    public com.omg.dd.x100.ViewDefinition getViewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ViewDefinition target = null;
            target = (com.omg.dd.x100.ViewDefinition)get_store().find_element_user(VIEWDEFINITION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "viewDefinition" element
     */
    public void setViewDefinition(com.omg.dd.x100.ViewDefinition viewDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ViewDefinition target = null;
            target = (com.omg.dd.x100.ViewDefinition)get_store().find_element_user(VIEWDEFINITION$1, 0);
            if (target == null)
            {
                target = (com.omg.dd.x100.ViewDefinition)get_store().add_element_user(VIEWDEFINITION$0);
            }
            target.set(viewDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "viewDefinition" element
     */
    public com.omg.dd.x100.ViewDefinition addNewViewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ViewDefinition target = null;
            target = (com.omg.dd.x100.ViewDefinition)get_store().add_element_user(VIEWDEFINITION$0);
            return target;
        }
    }
}
