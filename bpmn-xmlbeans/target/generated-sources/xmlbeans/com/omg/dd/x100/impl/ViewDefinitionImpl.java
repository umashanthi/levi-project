/*
 * XML Type:  ViewDefinition
 * Namespace: http://www.omg.com/dd/1.0.0
 * Java type: com.omg.dd.x100.ViewDefinition
 *
 * Automatically generated - do not modify.
 */
package com.omg.dd.x100.impl;
/**
 * An XML ViewDefinition(@http://www.omg.com/dd/1.0.0).
 *
 * This is a complex type.
 */
public class ViewDefinitionImpl extends com.omg.dd.x100.impl.NamedElementImpl implements com.omg.dd.x100.ViewDefinition
{
    private static final long serialVersionUID = 1L;
    
    public ViewDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONSTRAINT$0 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "constraint");
    private static final javax.xml.namespace.QName STYLEDEFINITION$2 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "styleDefinition");
    private static final javax.xml.namespace.QName CHILDDEFINITION$4 = 
        new javax.xml.namespace.QName("http://www.omg.com/dd/1.0.0", "childDefinition");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName ABSTRACT$8 = 
        new javax.xml.namespace.QName("", "abstract");
    private static final javax.xml.namespace.QName SUPERDEFINITION$10 = 
        new javax.xml.namespace.QName("", "superDefinition");
    private static final javax.xml.namespace.QName CONTEXTTYPE$12 = 
        new javax.xml.namespace.QName("", "contextType");
    
    
    /**
     * Gets array of all "constraint" elements
     */
    public com.omg.dd.x100.Constraint[] getConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONSTRAINT$0, targetList);
            com.omg.dd.x100.Constraint[] result = new com.omg.dd.x100.Constraint[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "constraint" element
     */
    public com.omg.dd.x100.Constraint getConstraintArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.Constraint target = null;
            target = (com.omg.dd.x100.Constraint)get_store().find_element_user(CONSTRAINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "constraint" element
     */
    public int sizeOfConstraintArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONSTRAINT$0);
        }
    }
    
    /**
     * Sets array of all "constraint" element
     */
    public void setConstraintArray(com.omg.dd.x100.Constraint[] constraintArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(constraintArray, CONSTRAINT$0);
        }
    }
    
    /**
     * Sets ith "constraint" element
     */
    public void setConstraintArray(int i, com.omg.dd.x100.Constraint constraint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.Constraint target = null;
            target = (com.omg.dd.x100.Constraint)get_store().find_element_user(CONSTRAINT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(constraint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "constraint" element
     */
    public com.omg.dd.x100.Constraint insertNewConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.Constraint target = null;
            target = (com.omg.dd.x100.Constraint)get_store().insert_element_user(CONSTRAINT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "constraint" element
     */
    public com.omg.dd.x100.Constraint addNewConstraint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.Constraint target = null;
            target = (com.omg.dd.x100.Constraint)get_store().add_element_user(CONSTRAINT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "constraint" element
     */
    public void removeConstraint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONSTRAINT$0, i);
        }
    }
    
    /**
     * Gets array of all "styleDefinition" elements
     */
    public com.omg.dd.x100.StyleDefinition[] getStyleDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STYLEDEFINITION$2, targetList);
            com.omg.dd.x100.StyleDefinition[] result = new com.omg.dd.x100.StyleDefinition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "styleDefinition" element
     */
    public com.omg.dd.x100.StyleDefinition getStyleDefinitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.StyleDefinition target = null;
            target = (com.omg.dd.x100.StyleDefinition)get_store().find_element_user(STYLEDEFINITION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "styleDefinition" element
     */
    public int sizeOfStyleDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STYLEDEFINITION$2);
        }
    }
    
    /**
     * Sets array of all "styleDefinition" element
     */
    public void setStyleDefinitionArray(com.omg.dd.x100.StyleDefinition[] styleDefinitionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(styleDefinitionArray, STYLEDEFINITION$2);
        }
    }
    
    /**
     * Sets ith "styleDefinition" element
     */
    public void setStyleDefinitionArray(int i, com.omg.dd.x100.StyleDefinition styleDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.StyleDefinition target = null;
            target = (com.omg.dd.x100.StyleDefinition)get_store().find_element_user(STYLEDEFINITION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(styleDefinition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "styleDefinition" element
     */
    public com.omg.dd.x100.StyleDefinition insertNewStyleDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.StyleDefinition target = null;
            target = (com.omg.dd.x100.StyleDefinition)get_store().insert_element_user(STYLEDEFINITION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "styleDefinition" element
     */
    public com.omg.dd.x100.StyleDefinition addNewStyleDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.StyleDefinition target = null;
            target = (com.omg.dd.x100.StyleDefinition)get_store().add_element_user(STYLEDEFINITION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "styleDefinition" element
     */
    public void removeStyleDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STYLEDEFINITION$2, i);
        }
    }
    
    /**
     * Gets array of all "childDefinition" elements
     */
    public com.omg.dd.x100.ChildDefinition[] getChildDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CHILDDEFINITION$4, targetList);
            com.omg.dd.x100.ChildDefinition[] result = new com.omg.dd.x100.ChildDefinition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "childDefinition" element
     */
    public com.omg.dd.x100.ChildDefinition getChildDefinitionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ChildDefinition target = null;
            target = (com.omg.dd.x100.ChildDefinition)get_store().find_element_user(CHILDDEFINITION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "childDefinition" element
     */
    public int sizeOfChildDefinitionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDDEFINITION$4);
        }
    }
    
    /**
     * Sets array of all "childDefinition" element
     */
    public void setChildDefinitionArray(com.omg.dd.x100.ChildDefinition[] childDefinitionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(childDefinitionArray, CHILDDEFINITION$4);
        }
    }
    
    /**
     * Sets ith "childDefinition" element
     */
    public void setChildDefinitionArray(int i, com.omg.dd.x100.ChildDefinition childDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ChildDefinition target = null;
            target = (com.omg.dd.x100.ChildDefinition)get_store().find_element_user(CHILDDEFINITION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(childDefinition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "childDefinition" element
     */
    public com.omg.dd.x100.ChildDefinition insertNewChildDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ChildDefinition target = null;
            target = (com.omg.dd.x100.ChildDefinition)get_store().insert_element_user(CHILDDEFINITION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "childDefinition" element
     */
    public com.omg.dd.x100.ChildDefinition addNewChildDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.dd.x100.ChildDefinition target = null;
            target = (com.omg.dd.x100.ChildDefinition)get_store().add_element_user(CHILDDEFINITION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "childDefinition" element
     */
    public void removeChildDefinition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDDEFINITION$4, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
    public org.apache.xmlbeans.XmlNCName xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(ID$6);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlNCName id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNCName target = null;
            target = (org.apache.xmlbeans.XmlNCName)get_store().find_attribute_user(ID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNCName)get_store().add_attribute_user(ID$6);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "abstract" attribute
     */
    public boolean getAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$8);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "abstract" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$8);
            return target;
        }
    }
    
    /**
     * True if has "abstract" attribute
     */
    public boolean isSetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ABSTRACT$8) != null;
        }
    }
    
    /**
     * Sets the "abstract" attribute
     */
    public void setAbstract(boolean xabstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABSTRACT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABSTRACT$8);
            }
            target.setBooleanValue(xabstract);
        }
    }
    
    /**
     * Sets (as xml) the "abstract" attribute
     */
    public void xsetAbstract(org.apache.xmlbeans.XmlBoolean xabstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ABSTRACT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ABSTRACT$8);
            }
            target.set(xabstract);
        }
    }
    
    /**
     * Unsets the "abstract" attribute
     */
    public void unsetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ABSTRACT$8);
        }
    }
    
    /**
     * Gets the "superDefinition" attribute
     */
    public javax.xml.namespace.QName getSuperDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPERDEFINITION$10);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "superDefinition" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetSuperDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SUPERDEFINITION$10);
            return target;
        }
    }
    
    /**
     * True if has "superDefinition" attribute
     */
    public boolean isSetSuperDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUPERDEFINITION$10) != null;
        }
    }
    
    /**
     * Sets the "superDefinition" attribute
     */
    public void setSuperDefinition(javax.xml.namespace.QName superDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUPERDEFINITION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUPERDEFINITION$10);
            }
            target.setQNameValue(superDefinition);
        }
    }
    
    /**
     * Sets (as xml) the "superDefinition" attribute
     */
    public void xsetSuperDefinition(org.apache.xmlbeans.XmlQName superDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(SUPERDEFINITION$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(SUPERDEFINITION$10);
            }
            target.set(superDefinition);
        }
    }
    
    /**
     * Unsets the "superDefinition" attribute
     */
    public void unsetSuperDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUPERDEFINITION$10);
        }
    }
    
    /**
     * Gets the "contextType" attribute
     */
    public javax.xml.namespace.QName getContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTTYPE$12);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "contextType" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CONTEXTTYPE$12);
            return target;
        }
    }
    
    /**
     * True if has "contextType" attribute
     */
    public boolean isSetContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTEXTTYPE$12) != null;
        }
    }
    
    /**
     * Sets the "contextType" attribute
     */
    public void setContextType(javax.xml.namespace.QName contextType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTTYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXTTYPE$12);
            }
            target.setQNameValue(contextType);
        }
    }
    
    /**
     * Sets (as xml) the "contextType" attribute
     */
    public void xsetContextType(org.apache.xmlbeans.XmlQName contextType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(CONTEXTTYPE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(CONTEXTTYPE$12);
            }
            target.set(contextType);
        }
    }
    
    /**
     * Unsets the "contextType" attribute
     */
    public void unsetContextType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTEXTTYPE$12);
        }
    }
}
