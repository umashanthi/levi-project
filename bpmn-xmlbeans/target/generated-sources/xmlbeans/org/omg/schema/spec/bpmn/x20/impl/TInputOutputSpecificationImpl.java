/*
 * XML Type:  tInputOutputSpecification
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TInputOutputSpecification
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tInputOutputSpecification(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TInputOutputSpecificationImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TInputOutputSpecification
{
    private static final long serialVersionUID = 1L;
    
    public TInputOutputSpecificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAINPUT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataInput");
    private static final javax.xml.namespace.QName DATAOUTPUT$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataOutput");
    private static final javax.xml.namespace.QName INPUTSET$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "inputSet");
    private static final javax.xml.namespace.QName OUTPUTSET$6 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "outputSet");
    
    
    /**
     * Gets array of all "dataInput" elements
     */
    public org.omg.schema.spec.bpmn.x20.TDataInput[] getDataInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAINPUT$0, targetList);
            org.omg.schema.spec.bpmn.x20.TDataInput[] result = new org.omg.schema.spec.bpmn.x20.TDataInput[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataInput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInput getDataInputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().find_element_user(DATAINPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataInput" element
     */
    public int sizeOfDataInputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINPUT$0);
        }
    }
    
    /**
     * Sets array of all "dataInput" element
     */
    public void setDataInputArray(org.omg.schema.spec.bpmn.x20.TDataInput[] dataInputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataInputArray, DATAINPUT$0);
        }
    }
    
    /**
     * Sets ith "dataInput" element
     */
    public void setDataInputArray(int i, org.omg.schema.spec.bpmn.x20.TDataInput dataInput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().find_element_user(DATAINPUT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataInput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataInput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInput insertNewDataInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().insert_element_user(DATAINPUT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataInput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataInput addNewDataInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataInput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataInput)get_store().add_element_user(DATAINPUT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataInput" element
     */
    public void removeDataInput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINPUT$0, i);
        }
    }
    
    /**
     * Gets array of all "dataOutput" elements
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutput[] getDataOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAOUTPUT$2, targetList);
            org.omg.schema.spec.bpmn.x20.TDataOutput[] result = new org.omg.schema.spec.bpmn.x20.TDataOutput[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "dataOutput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutput getDataOutputArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().find_element_user(DATAOUTPUT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "dataOutput" element
     */
    public int sizeOfDataOutputArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAOUTPUT$2);
        }
    }
    
    /**
     * Sets array of all "dataOutput" element
     */
    public void setDataOutputArray(org.omg.schema.spec.bpmn.x20.TDataOutput[] dataOutputArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataOutputArray, DATAOUTPUT$2);
        }
    }
    
    /**
     * Sets ith "dataOutput" element
     */
    public void setDataOutputArray(int i, org.omg.schema.spec.bpmn.x20.TDataOutput dataOutput)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().find_element_user(DATAOUTPUT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataOutput);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataOutput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutput insertNewDataOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().insert_element_user(DATAOUTPUT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataOutput" element
     */
    public org.omg.schema.spec.bpmn.x20.TDataOutput addNewDataOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TDataOutput target = null;
            target = (org.omg.schema.spec.bpmn.x20.TDataOutput)get_store().add_element_user(DATAOUTPUT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataOutput" element
     */
    public void removeDataOutput(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAOUTPUT$2, i);
        }
    }
    
    /**
     * Gets array of all "inputSet" elements
     */
    public org.omg.schema.spec.bpmn.x20.TInputSet[] getInputSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUTSET$4, targetList);
            org.omg.schema.spec.bpmn.x20.TInputSet[] result = new org.omg.schema.spec.bpmn.x20.TInputSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "inputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputSet getInputSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().find_element_user(INPUTSET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "inputSet" element
     */
    public int sizeOfInputSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTSET$4);
        }
    }
    
    /**
     * Sets array of all "inputSet" element
     */
    public void setInputSetArray(org.omg.schema.spec.bpmn.x20.TInputSet[] inputSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inputSetArray, INPUTSET$4);
        }
    }
    
    /**
     * Sets ith "inputSet" element
     */
    public void setInputSetArray(int i, org.omg.schema.spec.bpmn.x20.TInputSet inputSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().find_element_user(INPUTSET$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inputSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputSet insertNewInputSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().insert_element_user(INPUTSET$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TInputSet addNewInputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TInputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TInputSet)get_store().add_element_user(INPUTSET$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "inputSet" element
     */
    public void removeInputSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTSET$4, i);
        }
    }
    
    /**
     * Gets array of all "outputSet" elements
     */
    public org.omg.schema.spec.bpmn.x20.TOutputSet[] getOutputSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUTSET$6, targetList);
            org.omg.schema.spec.bpmn.x20.TOutputSet[] result = new org.omg.schema.spec.bpmn.x20.TOutputSet[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "outputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TOutputSet getOutputSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOutputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().find_element_user(OUTPUTSET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "outputSet" element
     */
    public int sizeOfOutputSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUTSET$6);
        }
    }
    
    /**
     * Sets array of all "outputSet" element
     */
    public void setOutputSetArray(org.omg.schema.spec.bpmn.x20.TOutputSet[] outputSetArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outputSetArray, OUTPUTSET$6);
        }
    }
    
    /**
     * Sets ith "outputSet" element
     */
    public void setOutputSetArray(int i, org.omg.schema.spec.bpmn.x20.TOutputSet outputSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOutputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().find_element_user(OUTPUTSET$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(outputSet);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TOutputSet insertNewOutputSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOutputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().insert_element_user(OUTPUTSET$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outputSet" element
     */
    public org.omg.schema.spec.bpmn.x20.TOutputSet addNewOutputSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TOutputSet target = null;
            target = (org.omg.schema.spec.bpmn.x20.TOutputSet)get_store().add_element_user(OUTPUTSET$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "outputSet" element
     */
    public void removeOutputSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUTSET$6, i);
        }
    }
}
