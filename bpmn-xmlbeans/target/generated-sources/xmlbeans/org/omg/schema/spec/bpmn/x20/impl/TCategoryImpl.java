/*
 * XML Type:  tCategory
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TCategory
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tCategory(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TCategoryImpl extends org.omg.schema.spec.bpmn.x20.impl.TRootElementImpl implements org.omg.schema.spec.bpmn.x20.TCategory
{
    private static final long serialVersionUID = 1L;
    
    public TCategoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYVALUE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "categoryValue");
    
    
    /**
     * Gets array of all "categoryValue" elements
     */
    public org.omg.schema.spec.bpmn.x20.TCategoryValue[] getCategoryValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORYVALUE$0, targetList);
            org.omg.schema.spec.bpmn.x20.TCategoryValue[] result = new org.omg.schema.spec.bpmn.x20.TCategoryValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "categoryValue" element
     */
    public org.omg.schema.spec.bpmn.x20.TCategoryValue getCategoryValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategoryValue target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategoryValue)get_store().find_element_user(CATEGORYVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "categoryValue" element
     */
    public int sizeOfCategoryValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYVALUE$0);
        }
    }
    
    /**
     * Sets array of all "categoryValue" element
     */
    public void setCategoryValueArray(org.omg.schema.spec.bpmn.x20.TCategoryValue[] categoryValueArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryValueArray, CATEGORYVALUE$0);
        }
    }
    
    /**
     * Sets ith "categoryValue" element
     */
    public void setCategoryValueArray(int i, org.omg.schema.spec.bpmn.x20.TCategoryValue categoryValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategoryValue target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategoryValue)get_store().find_element_user(CATEGORYVALUE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(categoryValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "categoryValue" element
     */
    public org.omg.schema.spec.bpmn.x20.TCategoryValue insertNewCategoryValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategoryValue target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategoryValue)get_store().insert_element_user(CATEGORYVALUE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "categoryValue" element
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
    
    /**
     * Removes the ith "categoryValue" element
     */
    public void removeCategoryValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYVALUE$0, i);
        }
    }
}
