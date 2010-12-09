/*
 * XML Type:  tBaseElementWithMixedContent
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tBaseElementWithMixedContent(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TBaseElementWithMixedContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.TBaseElementWithMixedContent
{
    private static final long serialVersionUID = 1L;
    
    public TBaseElementWithMixedContentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "documentation");
    private static final javax.xml.namespace.QName CATEGORY$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "category");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "id");
    
    
    /**
     * Gets array of all "documentation" elements
     */
    public org.omg.schema.spec.bpmn.x20.TDocumentation[] getDocumentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTATION$0, targetList);
            org.omg.schema.spec.bpmn.x20.TDocumentation[] result = new org.omg.schema.spec.bpmn.x20.TDocumentation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "documentation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDocumentation getDocumentationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDocumentation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDocumentation)get_store().find_element_user(DOCUMENTATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "documentation" element
     */
    public int sizeOfDocumentationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATION$0);
        }
    }
    
    /**
     * Sets array of all "documentation" element
     */
    public void setDocumentationArray(org.omg.schema.spec.bpmn.x20.TDocumentation[] documentationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(documentationArray, DOCUMENTATION$0);
        }
    }
    
    /**
     * Sets ith "documentation" element
     */
    public void setDocumentationArray(int i, org.omg.schema.spec.bpmn.x20.TDocumentation documentation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDocumentation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDocumentation)get_store().find_element_user(DOCUMENTATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(documentation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDocumentation insertNewDocumentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDocumentation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDocumentation)get_store().insert_element_user(DOCUMENTATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentation" element
     */
    public org.omg.schema.spec.bpmn.x20.TDocumentation addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDocumentation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDocumentation)get_store().add_element_user(DOCUMENTATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "documentation" element
     */
    public void removeDocumentation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATION$0, i);
        }
    }
    
    /**
     * Gets array of all "category" elements
     */
    public org.omg.schema.spec.bpmn.x20.TCategory[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CATEGORY$2, targetList);
            org.omg.schema.spec.bpmn.x20.TCategory[] result = new org.omg.schema.spec.bpmn.x20.TCategory[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "category" element
     */
    public org.omg.schema.spec.bpmn.x20.TCategory getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategory target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategory)get_store().find_element_user(CATEGORY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$2);
        }
    }
    
    /**
     * Sets array of all "category" element
     */
    public void setCategoryArray(org.omg.schema.spec.bpmn.x20.TCategory[] categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$2);
        }
    }
    
    /**
     * Sets ith "category" element
     */
    public void setCategoryArray(int i, org.omg.schema.spec.bpmn.x20.TCategory category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategory target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategory)get_store().find_element_user(CATEGORY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "category" element
     */
    public org.omg.schema.spec.bpmn.x20.TCategory insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategory target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategory)get_store().insert_element_user(CATEGORY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "category" element
     */
    public org.omg.schema.spec.bpmn.x20.TCategory addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TCategory target = null;
            target = (org.omg.schema.spec.bpmn.x20.TCategory)get_store().add_element_user(CATEGORY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$2, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
}
