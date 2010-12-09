/*
 * XML Type:  tDataAssociation
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TDataAssociation
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tDataAssociation(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TDataAssociationImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TDataAssociation
{
    private static final long serialVersionUID = 1L;
    
    public TDataAssociationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORMATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "transformation");
    private static final javax.xml.namespace.QName ASSIGNMENT$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "assignment");
    
    
    /**
     * Gets the "transformation" element
     */
    public org.omg.schema.spec.bpmn.x20.TFormalExpression getTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().find_element_user(TRANSFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "transformation" element
     */
    public boolean isSetTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSFORMATION$0) != 0;
        }
    }
    
    /**
     * Sets the "transformation" element
     */
    public void setTransformation(org.omg.schema.spec.bpmn.x20.TFormalExpression transformation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().find_element_user(TRANSFORMATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().add_element_user(TRANSFORMATION$0);
            }
            target.set(transformation);
        }
    }
    
    /**
     * Appends and returns a new empty "transformation" element
     */
    public org.omg.schema.spec.bpmn.x20.TFormalExpression addNewTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TFormalExpression target = null;
            target = (org.omg.schema.spec.bpmn.x20.TFormalExpression)get_store().add_element_user(TRANSFORMATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "transformation" element
     */
    public void unsetTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSFORMATION$0, 0);
        }
    }
    
    /**
     * Gets array of all "assignment" elements
     */
    public org.omg.schema.spec.bpmn.x20.TAssignment[] getAssignmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ASSIGNMENT$2, targetList);
            org.omg.schema.spec.bpmn.x20.TAssignment[] result = new org.omg.schema.spec.bpmn.x20.TAssignment[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "assignment" element
     */
    public org.omg.schema.spec.bpmn.x20.TAssignment getAssignmentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAssignment target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAssignment)get_store().find_element_user(ASSIGNMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "assignment" element
     */
    public int sizeOfAssignmentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNMENT$2);
        }
    }
    
    /**
     * Sets array of all "assignment" element
     */
    public void setAssignmentArray(org.omg.schema.spec.bpmn.x20.TAssignment[] assignmentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(assignmentArray, ASSIGNMENT$2);
        }
    }
    
    /**
     * Sets ith "assignment" element
     */
    public void setAssignmentArray(int i, org.omg.schema.spec.bpmn.x20.TAssignment assignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAssignment target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAssignment)get_store().find_element_user(ASSIGNMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(assignment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "assignment" element
     */
    public org.omg.schema.spec.bpmn.x20.TAssignment insertNewAssignment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAssignment target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAssignment)get_store().insert_element_user(ASSIGNMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "assignment" element
     */
    public org.omg.schema.spec.bpmn.x20.TAssignment addNewAssignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TAssignment target = null;
            target = (org.omg.schema.spec.bpmn.x20.TAssignment)get_store().add_element_user(ASSIGNMENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "assignment" element
     */
    public void removeAssignment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNMENT$2, i);
        }
    }
}
