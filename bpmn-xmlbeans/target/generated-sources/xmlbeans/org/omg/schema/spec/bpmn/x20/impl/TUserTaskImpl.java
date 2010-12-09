/*
 * XML Type:  tUserTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TUserTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tUserTask(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TUserTaskImpl extends org.omg.schema.spec.bpmn.x20.impl.TTaskImpl implements org.omg.schema.spec.bpmn.x20.TUserTask
{
    private static final long serialVersionUID = 1L;
    
    public TUserTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RENDERING$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "rendering");
    private static final javax.xml.namespace.QName IMPLEMENTATION$2 = 
        new javax.xml.namespace.QName("", "implementation");
    
    
    /**
     * Gets array of all "rendering" elements
     */
    public org.omg.schema.spec.bpmn.x20.TRendering[] getRenderingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RENDERING$0, targetList);
            org.omg.schema.spec.bpmn.x20.TRendering[] result = new org.omg.schema.spec.bpmn.x20.TRendering[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rendering" element
     */
    public org.omg.schema.spec.bpmn.x20.TRendering getRenderingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRendering target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRendering)get_store().find_element_user(RENDERING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rendering" element
     */
    public int sizeOfRenderingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENDERING$0);
        }
    }
    
    /**
     * Sets array of all "rendering" element
     */
    public void setRenderingArray(org.omg.schema.spec.bpmn.x20.TRendering[] renderingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(renderingArray, RENDERING$0);
        }
    }
    
    /**
     * Sets ith "rendering" element
     */
    public void setRenderingArray(int i, org.omg.schema.spec.bpmn.x20.TRendering rendering)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRendering target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRendering)get_store().find_element_user(RENDERING$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rendering);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rendering" element
     */
    public org.omg.schema.spec.bpmn.x20.TRendering insertNewRendering(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRendering target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRendering)get_store().insert_element_user(RENDERING$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rendering" element
     */
    public org.omg.schema.spec.bpmn.x20.TRendering addNewRendering()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRendering target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRendering)get_store().add_element_user(RENDERING$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "rendering" element
     */
    public void removeRendering(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENDERING$0, i);
        }
    }
    
    /**
     * Gets the "implementation" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TUserTaskImplementation.Enum getImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPLEMENTATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IMPLEMENTATION$2);
            }
            if (target == null)
            {
                return null;
            }
            return (org.omg.schema.spec.bpmn.x20.TUserTaskImplementation.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "implementation" attribute
     */
    public org.omg.schema.spec.bpmn.x20.TUserTaskImplementation xgetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TUserTaskImplementation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TUserTaskImplementation)get_store().find_attribute_user(IMPLEMENTATION$2);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TUserTaskImplementation)get_default_attribute_value(IMPLEMENTATION$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "implementation" attribute
     */
    public boolean isSetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(IMPLEMENTATION$2) != null;
        }
    }
    
    /**
     * Sets the "implementation" attribute
     */
    public void setImplementation(org.omg.schema.spec.bpmn.x20.TUserTaskImplementation.Enum implementation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPLEMENTATION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMPLEMENTATION$2);
            }
            target.setEnumValue(implementation);
        }
    }
    
    /**
     * Sets (as xml) the "implementation" attribute
     */
    public void xsetImplementation(org.omg.schema.spec.bpmn.x20.TUserTaskImplementation implementation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TUserTaskImplementation target = null;
            target = (org.omg.schema.spec.bpmn.x20.TUserTaskImplementation)get_store().find_attribute_user(IMPLEMENTATION$2);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TUserTaskImplementation)get_store().add_attribute_user(IMPLEMENTATION$2);
            }
            target.set(implementation);
        }
    }
    
    /**
     * Unsets the "implementation" attribute
     */
    public void unsetImplementation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(IMPLEMENTATION$2);
        }
    }
}
