/*
 * An XML document type.
 * Localname: categoryValue
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.CategoryValueDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one categoryValue(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class CategoryValueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.CategoryValueDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryValueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYVALUE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "categoryValue");
    
    
    /**
     * Gets the "categoryValue" element
     */
    public org.omg.schema.spec.bpmn.x20.TCategoryValue getCategoryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategoryValue target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategoryValue)get_store().find_element_user(CATEGORYVALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categoryValue" element
     */
    public void setCategoryValue(org.omg.schema.spec.bpmn.x20.TCategoryValue categoryValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategoryValue target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategoryValue)get_store().find_element_user(CATEGORYVALUE$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TCategoryValue)get_store().add_element_user(CATEGORYVALUE$0);
            }
            target.set(categoryValue);
        }
    }
    
    /**
     * Appends and returns a new empty "categoryValue" element
     */
    public org.omg.schema.spec.bpmn.x20.TCategoryValue addNewCategoryValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategoryValue target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategoryValue)get_store().add_element_user(CATEGORYVALUE$0);
            return target;
        }
    }
}
