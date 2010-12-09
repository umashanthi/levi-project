/*
 * XML Type:  tExtension
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TExtension
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tExtension(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TExtensionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.TExtension
{
    private static final long serialVersionUID = 1L;
    
    public TExtensionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "documentation");
    private static final javax.xml.namespace.QName DEFINITION$2 = 
        new javax.xml.namespace.QName("", "definition");
    private static final javax.xml.namespace.QName MUSTUNDERSTAND$4 = 
        new javax.xml.namespace.QName("", "mustUnderstand");
    
    
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
     * Gets the "definition" attribute
     */
    public javax.xml.namespace.QName getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITION$2);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "definition" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(DEFINITION$2);
            return target;
        }
    }
    
    /**
     * True if has "definition" attribute
     */
    public boolean isSetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DEFINITION$2) != null;
        }
    }
    
    /**
     * Sets the "definition" attribute
     */
    public void setDefinition(javax.xml.namespace.QName definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DEFINITION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DEFINITION$2);
            }
            target.setQNameValue(definition);
        }
    }
    
    /**
     * Sets (as xml) the "definition" attribute
     */
    public void xsetDefinition(org.apache.xmlbeans.XmlQName definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(DEFINITION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(DEFINITION$2);
            }
            target.set(definition);
        }
    }
    
    /**
     * Unsets the "definition" attribute
     */
    public void unsetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DEFINITION$2);
        }
    }
    
    /**
     * Gets the "mustUnderstand" attribute
     */
    public boolean getMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUSTUNDERSTAND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MUSTUNDERSTAND$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "mustUnderstand" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MUSTUNDERSTAND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(MUSTUNDERSTAND$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "mustUnderstand" attribute
     */
    public boolean isSetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MUSTUNDERSTAND$4) != null;
        }
    }
    
    /**
     * Sets the "mustUnderstand" attribute
     */
    public void setMustUnderstand(boolean mustUnderstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MUSTUNDERSTAND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MUSTUNDERSTAND$4);
            }
            target.setBooleanValue(mustUnderstand);
        }
    }
    
    /**
     * Sets (as xml) the "mustUnderstand" attribute
     */
    public void xsetMustUnderstand(org.apache.xmlbeans.XmlBoolean mustUnderstand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(MUSTUNDERSTAND$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(MUSTUNDERSTAND$4);
            }
            target.set(mustUnderstand);
        }
    }
    
    /**
     * Unsets the "mustUnderstand" attribute
     */
    public void unsetMustUnderstand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MUSTUNDERSTAND$4);
        }
    }
}
