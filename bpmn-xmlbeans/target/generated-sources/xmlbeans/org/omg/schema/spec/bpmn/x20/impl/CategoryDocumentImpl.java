/*
 * An XML document type.
 * Localname: category
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one category(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CategoryDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.CategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "category");
    
    
    /**
     * Gets the "category" element
     */
    public org.omg.schema.spec.bpmn.x20.TCategory getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategory target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategory)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "category" element
     */
    public void setCategory(org.omg.schema.spec.bpmn.x20.TCategory category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategory target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategory)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCategory)get_store().add_element_user(CATEGORY$0);
            }
            target.set(category);
        }
    }
    
    /**
     * Appends and returns a new empty "category" element
     */
    public org.omg.schema.spec.bpmn.x20.TCategory addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategory target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategory)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
}
