/*
 * An XML document type.
 * Localname: childDefinition
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.ChildDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * A document containing one childDefinition(@http://www.omg.com/dd/1.0.0) element.
 *
 * This is a complex type.
 */
public class ChildDefinitionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.omg.dd.x100.ChildDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public ChildDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHILDDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "childDefinition");
    
    
    /**
     * Gets the "childDefinition" element
     */
    public com.omg.dd.x100.ChildDefinition getChildDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ChildDefinition target = null;
            target = (com.omg.dd.x100.ChildDefinition)get_store().find_element_user(CHILDDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "childDefinition" element
     */
    public void setChildDefinition(com.omg.dd.x100.ChildDefinition childDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ChildDefinition target = null;
            target = (com.omg.dd.x100.ChildDefinition)get_store().find_element_user(CHILDDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.omg.dd.x100.ChildDefinition)get_store().add_element_user(CHILDDEFINITION$0);
            }
            target.set(childDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "childDefinition" element
     */
    public com.omg.dd.x100.ChildDefinition addNewChildDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ChildDefinition target = null;
            target = (com.omg.dd.x100.ChildDefinition)get_store().add_element_user(CHILDDEFINITION$0);
            return target;
        }
    }
}
