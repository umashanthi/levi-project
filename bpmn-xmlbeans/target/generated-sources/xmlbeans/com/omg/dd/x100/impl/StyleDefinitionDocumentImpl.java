/*
 * An XML document type.
 * Localname: styleDefinition
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.StyleDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * A document containing one styleDefinition(@http://www.omg.com/dd/1.0.0) element.
 *
 * This is a complex type.
 */
public class StyleDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.omg.dd.x100.StyleDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public StyleDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLEDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "styleDefinition");
    
    
    /**
     * Gets the "styleDefinition" element
     */
    public com.omg.dd.x100.StyleDefinition getStyleDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.StyleDefinition target = null;
            target = (com.omg.dd.x100.StyleDefinition)get_store().find_element_user(STYLEDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "styleDefinition" element
     */
    public void setStyleDefinition(com.omg.dd.x100.StyleDefinition styleDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.StyleDefinition target = null;
            target = (com.omg.dd.x100.StyleDefinition)get_store().find_element_user(STYLEDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.omg.dd.x100.StyleDefinition)get_store().add_element_user(STYLEDEFINITION$0);
            }
            target.set(styleDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "styleDefinition" element
     */
    public com.omg.dd.x100.StyleDefinition addNewStyleDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.StyleDefinition target = null;
            target = (com.omg.dd.x100.StyleDefinition)get_store().add_element_user(STYLEDEFINITION$0);
            return target;
        }
    }
}
