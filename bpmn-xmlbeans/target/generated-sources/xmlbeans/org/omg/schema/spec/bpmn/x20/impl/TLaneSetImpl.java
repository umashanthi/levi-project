/*
 * XML Type:  tLaneSet
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TLaneSet
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tLaneSet(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TLaneSetImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TLaneSet
{
    private static final long serialVersionUID = 1L;
    
    public TLaneSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LANE$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "lane");
    
    
    /**
     * Gets array of all "lane" elements
     */
    public org.omg.schema.spec.bpmn.x20.TLane[] getLaneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LANE$0, targetList);
            org.omg.schema.spec.bpmn.x20.TLane[] result = new org.omg.schema.spec.bpmn.x20.TLane[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "lane" element
     */
    public org.omg.schema.spec.bpmn.x20.TLane getLaneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLane target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLane)get_store().find_element_user(LANE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "lane" element
     */
    public int sizeOfLaneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANE$0);
        }
    }
    
    /**
     * Sets array of all "lane" element
     */
    public void setLaneArray(org.omg.schema.spec.bpmn.x20.TLane[] laneArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(laneArray, LANE$0);
        }
    }
    
    /**
     * Sets ith "lane" element
     */
    public void setLaneArray(int i, org.omg.schema.spec.bpmn.x20.TLane lane)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLane target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLane)get_store().find_element_user(LANE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(lane);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "lane" element
     */
    public org.omg.schema.spec.bpmn.x20.TLane insertNewLane(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLane target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLane)get_store().insert_element_user(LANE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "lane" element
     */
    public org.omg.schema.spec.bpmn.x20.TLane addNewLane()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLane target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLane)get_store().add_element_user(LANE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "lane" element
     */
    public void removeLane(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANE$0, i);
        }
    }
}
