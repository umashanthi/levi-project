/*
 * XML Type:  tActivityResource
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TActivityResource
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tActivityResource(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TActivityResourceImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TActivityResource
{
    private static final long serialVersionUID = 1L;
    
    public TActivityResourceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEASSIGNMENTEXPRESSION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "resourceAssignmentExpression");
    private static final javax.xml.namespace.QName RESOURCEPARAMETERBINDING$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "resourceParameterBinding");
    private static final javax.xml.namespace.QName RESOURCEREF$4 = 
        new javax.xml.namespace.QName("", "resourceRef");
    
    
    /**
     * Gets the "resourceAssignmentExpression" element
     */
    public org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression getResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression)get_store().find_element_user(RESOURCEASSIGNMENTEXPRESSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "resourceAssignmentExpression" element
     */
    public boolean isSetResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEASSIGNMENTEXPRESSION$0) != 0;
        }
    }
    
    /**
     * Sets the "resourceAssignmentExpression" element
     */
    public void setResourceAssignmentExpression(org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression resourceAssignmentExpression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression)get_store().find_element_user(RESOURCEASSIGNMENTEXPRESSION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression)get_store().add_element_user(RESOURCEASSIGNMENTEXPRESSION$0);
            }
            target.set(resourceAssignmentExpression);
        }
    }
    
    /**
     * Appends and returns a new empty "resourceAssignmentExpression" element
     */
    public org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression addNewResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceAssignmentExpression)get_store().add_element_user(RESOURCEASSIGNMENTEXPRESSION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "resourceAssignmentExpression" element
     */
    public void unsetResourceAssignmentExpression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEASSIGNMENTEXPRESSION$0, 0);
        }
    }
    
    /**
     * Gets array of all "resourceParameterBinding" elements
     */
    public org.omg.schema.spec.bpmn.x20.TResourceParameterBinding[] getResourceParameterBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESOURCEPARAMETERBINDING$2, targetList);
            org.omg.schema.spec.bpmn.x20.TResourceParameterBinding[] result = new org.omg.schema.spec.bpmn.x20.TResourceParameterBinding[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "resourceParameterBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TResourceParameterBinding getResourceParameterBindingArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceParameterBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceParameterBinding)get_store().find_element_user(RESOURCEPARAMETERBINDING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "resourceParameterBinding" element
     */
    public int sizeOfResourceParameterBindingArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESOURCEPARAMETERBINDING$2);
        }
    }
    
    /**
     * Sets array of all "resourceParameterBinding" element
     */
    public void setResourceParameterBindingArray(org.omg.schema.spec.bpmn.x20.TResourceParameterBinding[] resourceParameterBindingArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(resourceParameterBindingArray, RESOURCEPARAMETERBINDING$2);
        }
    }
    
    /**
     * Sets ith "resourceParameterBinding" element
     */
    public void setResourceParameterBindingArray(int i, org.omg.schema.spec.bpmn.x20.TResourceParameterBinding resourceParameterBinding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceParameterBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceParameterBinding)get_store().find_element_user(RESOURCEPARAMETERBINDING$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(resourceParameterBinding);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "resourceParameterBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TResourceParameterBinding insertNewResourceParameterBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceParameterBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceParameterBinding)get_store().insert_element_user(RESOURCEPARAMETERBINDING$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "resourceParameterBinding" element
     */
    public org.omg.schema.spec.bpmn.x20.TResourceParameterBinding addNewResourceParameterBinding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TResourceParameterBinding target = null;
            target = (org.omg.schema.spec.bpmn.x20.TResourceParameterBinding)get_store().add_element_user(RESOURCEPARAMETERBINDING$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "resourceParameterBinding" element
     */
    public void removeResourceParameterBinding(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESOURCEPARAMETERBINDING$2, i);
        }
    }
    
    /**
     * Gets the "resourceRef" attribute
     */
    public javax.xml.namespace.QName getResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCEREF$4);
            if (target == null)
            {
                return null;
            }
            return target.getQNameValue();
        }
    }
    
    /**
     * Gets (as xml) the "resourceRef" attribute
     */
    public org.apache.xmlbeans.XmlQName xgetResourceRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(RESOURCEREF$4);
            return target;
        }
    }
    
    /**
     * Sets the "resourceRef" attribute
     */
    public void setResourceRef(javax.xml.namespace.QName resourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCEREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOURCEREF$4);
            }
            target.setQNameValue(resourceRef);
        }
    }
    
    /**
     * Sets (as xml) the "resourceRef" attribute
     */
    public void xsetResourceRef(org.apache.xmlbeans.XmlQName resourceRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlQName target = null;
            target = (org.apache.xmlbeans.XmlQName)get_store().find_attribute_user(RESOURCEREF$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlQName)get_store().add_attribute_user(RESOURCEREF$4);
            }
            target.set(resourceRef);
        }
    }
}
