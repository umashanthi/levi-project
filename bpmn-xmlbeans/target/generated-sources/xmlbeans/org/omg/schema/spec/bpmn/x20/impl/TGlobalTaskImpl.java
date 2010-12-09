/*
 * XML Type:  tGlobalTask
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TGlobalTask
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tGlobalTask(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TGlobalTaskImpl extends org.omg.schema.spec.bpmn.x20.impl.TCallableElementImpl implements org.omg.schema.spec.bpmn.x20.TGlobalTask
{
    private static final long serialVersionUID = 1L;
    
    public TGlobalTaskImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERFORMER$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "performer");
    private static final org.apache.xmlbeans.QNameSet PERFORMER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "humanPerformer"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "performer"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "potentialOwner"),
    });
    
    
    /**
     * Gets array of all "performer" elements
     */
    public org.omg.schema.spec.bpmn.x20.TPerformer[] getPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERFORMER$1, targetList);
            org.omg.schema.spec.bpmn.x20.TPerformer[] result = new org.omg.schema.spec.bpmn.x20.TPerformer[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "performer" element
     */
    public org.omg.schema.spec.bpmn.x20.TPerformer getPerformerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPerformer target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPerformer)get_store().find_element_user(PERFORMER$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "performer" element
     */
    public int sizeOfPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERFORMER$1);
        }
    }
    
    /**
     * Sets array of all "performer" element
     */
    public void setPerformerArray(org.omg.schema.spec.bpmn.x20.TPerformer[] performerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(performerArray, PERFORMER$0, PERFORMER$1);
        }
    }
    
    /**
     * Sets ith "performer" element
     */
    public void setPerformerArray(int i, org.omg.schema.spec.bpmn.x20.TPerformer performer)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPerformer target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPerformer)get_store().find_element_user(PERFORMER$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(performer);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "performer" element
     */
    public org.omg.schema.spec.bpmn.x20.TPerformer insertNewPerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPerformer target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPerformer)get_store().insert_element_user(PERFORMER$1, PERFORMER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "performer" element
     */
    public org.omg.schema.spec.bpmn.x20.TPerformer addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TPerformer target = null;
            target = (org.omg.schema.spec.bpmn.x20.TPerformer)get_store().add_element_user(PERFORMER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "performer" element
     */
    public void removePerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERFORMER$1, i);
        }
    }
}
