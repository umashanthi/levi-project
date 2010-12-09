/*
 * XML Type:  tLane
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TLane
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tLane(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TLaneImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TLane
{
    private static final long serialVersionUID = 1L;
    
    public TLaneImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTITIONELEMENT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "partitionElement");
    private static final javax.xml.namespace.QName FLOWELEMENTREF$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "flowElementRef");
    private static final javax.xml.namespace.QName CHILDLANESET$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "childLaneSet");
    private static final javax.xml.namespace.QName NAME$6 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName PARTITIONELEMENTREF$8 = 
        new javax.xml.namespace.QName("", "partitionElementRef");
    
    
    /**
     * Gets the "partitionElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TBaseElement getPartitionElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElement)get_store().find_element_user(PARTITIONELEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "partitionElement" element
     */
    public boolean isSetPartitionElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTITIONELEMENT$0) != 0;
        }
    }
    
    /**
     * Sets the "partitionElement" element
     */
    public void setPartitionElement(org.omg.schema.spec.bpmn.x20.TBaseElement partitionElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElement)get_store().find_element_user(PARTITIONELEMENT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TBaseElement)get_store().add_element_user(PARTITIONELEMENT$0);
            }
            target.set(partitionElement);
        }
    }
    
    /**
     * Appends and returns a new empty "partitionElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TBaseElement addNewPartitionElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TBaseElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TBaseElement)get_store().add_element_user(PARTITIONELEMENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "partitionElement" element
     */
    public void unsetPartitionElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTITIONELEMENT$0, 0);
        }
    }
    
    /**
     * Gets array of all "flowElementRef" elements
     */
    public java.lang.String[] getFlowElementRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLOWELEMENTREF$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "flowElementRef" element
     */
    public java.lang.String getFlowElementRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOWELEMENTREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "flowElementRef" elements
     */
    public org.apache.xmlbeans.XmlIDREF[] xgetFlowElementRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FLOWELEMENTREF$2, targetList);
            org.apache.xmlbeans.XmlIDREF[] result = new org.apache.xmlbeans.XmlIDREF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "flowElementRef" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetFlowElementRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(FLOWELEMENTREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlIDREF)target;
        }
    }
    
    /**
     * Returns number of "flowElementRef" element
     */
    public int sizeOfFlowElementRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLOWELEMENTREF$2);
        }
    }
    
    /**
     * Sets array of all "flowElementRef" element
     */
    public void setFlowElementRefArray(java.lang.String[] flowElementRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flowElementRefArray, FLOWELEMENTREF$2);
        }
    }
    
    /**
     * Sets ith "flowElementRef" element
     */
    public void setFlowElementRefArray(int i, java.lang.String flowElementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FLOWELEMENTREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(flowElementRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "flowElementRef" element
     */
    public void xsetFlowElementRefArray(org.apache.xmlbeans.XmlIDREF[]flowElementRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(flowElementRefArray, FLOWELEMENTREF$2);
        }
    }
    
    /**
     * Sets (as xml) ith "flowElementRef" element
     */
    public void xsetFlowElementRefArray(int i, org.apache.xmlbeans.XmlIDREF flowElementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(FLOWELEMENTREF$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(flowElementRef);
        }
    }
    
    /**
     * Inserts the value as the ith "flowElementRef" element
     */
    public void insertFlowElementRef(int i, java.lang.String flowElementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(FLOWELEMENTREF$2, i);
            target.setStringValue(flowElementRef);
        }
    }
    
    /**
     * Appends the value as the last "flowElementRef" element
     */
    public void addFlowElementRef(java.lang.String flowElementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FLOWELEMENTREF$2);
            target.setStringValue(flowElementRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "flowElementRef" element
     */
    public org.apache.xmlbeans.XmlIDREF insertNewFlowElementRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().insert_element_user(FLOWELEMENTREF$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "flowElementRef" element
     */
    public org.apache.xmlbeans.XmlIDREF addNewFlowElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(FLOWELEMENTREF$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "flowElementRef" element
     */
    public void removeFlowElementRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLOWELEMENTREF$2, i);
        }
    }
    
    /**
     * Gets the "childLaneSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TLaneSet getChildLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLaneSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().find_element_user(CHILDLANESET$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "childLaneSet" element
     */
    public boolean isSetChildLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDLANESET$4) != 0;
        }
    }
    
    /**
     * Sets the "childLaneSet" element
     */
    public void setChildLaneSet(org.omg.schema.spec.bpmn.x20.TLaneSet childLaneSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLaneSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().find_element_user(CHILDLANESET$4, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().add_element_user(CHILDLANESET$4);
            }
            target.set(childLaneSet);
        }
    }
    
    /**
     * Appends and returns a new empty "childLaneSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TLaneSet addNewChildLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TLaneSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TLaneSet)get_store().add_element_user(CHILDLANESET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "childLaneSet" element
     */
    public void unsetChildLaneSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDLANESET$4, 0);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            return target;
        }
    }
    
    /**
     * True if has "name" attribute
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NAME$6) != null;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$6);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$6);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "name" attribute
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NAME$6);
        }
    }
    
    /**
     * Gets the "partitionElementRef" attribute
     */
    public java.lang.String getPartitionElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTITIONELEMENTREF$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "partitionElementRef" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetPartitionElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(PARTITIONELEMENTREF$8);
            return target;
        }
    }
    
    /**
     * True if has "partitionElementRef" attribute
     */
    public boolean isSetPartitionElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARTITIONELEMENTREF$8) != null;
        }
    }
    
    /**
     * Sets the "partitionElementRef" attribute
     */
    public void setPartitionElementRef(java.lang.String partitionElementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTITIONELEMENTREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTITIONELEMENTREF$8);
            }
            target.setStringValue(partitionElementRef);
        }
    }
    
    /**
     * Sets (as xml) the "partitionElementRef" attribute
     */
    public void xsetPartitionElementRef(org.apache.xmlbeans.XmlIDREF partitionElementRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(PARTITIONELEMENTREF$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(PARTITIONELEMENTREF$8);
            }
            target.set(partitionElementRef);
        }
    }
    
    /**
     * Unsets the "partitionElementRef" attribute
     */
    public void unsetPartitionElementRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARTITIONELEMENTREF$8);
        }
    }
}
