/*
 * XML Type:  tOutputSet
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TOutputSet
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tOutputSet(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TOutputSetImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TOutputSet
{
    private static final long serialVersionUID = 1L;
    
    public TOutputSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAOUTPUTREFS$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataOutputRefs");
    private static final javax.xml.namespace.QName OPTIONALOUTPUTREFS$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "optionalOutputRefs");
    private static final javax.xml.namespace.QName WHILEEXECUTINGOUTPUTREFS$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "whileExecutingOutputRefs");
    private static final javax.xml.namespace.QName INPUTSETREFS$6 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "inputSetRefs");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "dataOutputRefs" elements
     */
    public java.lang.String[] getDataOutputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAOUTPUTREFS$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "dataOutputRefs" element
     */
    public java.lang.String getDataOutputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAOUTPUTREFS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "dataOutputRefs" elements
     */
    public org.apache.xmlbeans.XmlIDREF[] xgetDataOutputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAOUTPUTREFS$0, targetList);
            org.apache.xmlbeans.XmlIDREF[] result = new org.apache.xmlbeans.XmlIDREF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "dataOutputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetDataOutputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(DATAOUTPUTREFS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlIDREF)target;
        }
    }
    
    /**
     * Returns number of "dataOutputRefs" element
     */
    public int sizeOfDataOutputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAOUTPUTREFS$0);
        }
    }
    
    /**
     * Sets array of all "dataOutputRefs" element
     */
    public void setDataOutputRefsArray(java.lang.String[] dataOutputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataOutputRefsArray, DATAOUTPUTREFS$0);
        }
    }
    
    /**
     * Sets ith "dataOutputRefs" element
     */
    public void setDataOutputRefsArray(int i, java.lang.String dataOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAOUTPUTREFS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataOutputRefs);
        }
    }
    
    /**
     * Sets (as xml) array of all "dataOutputRefs" element
     */
    public void xsetDataOutputRefsArray(org.apache.xmlbeans.XmlIDREF[]dataOutputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataOutputRefsArray, DATAOUTPUTREFS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "dataOutputRefs" element
     */
    public void xsetDataOutputRefsArray(int i, org.apache.xmlbeans.XmlIDREF dataOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(DATAOUTPUTREFS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataOutputRefs);
        }
    }
    
    /**
     * Inserts the value as the ith "dataOutputRefs" element
     */
    public void insertDataOutputRefs(int i, java.lang.String dataOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATAOUTPUTREFS$0, i);
            target.setStringValue(dataOutputRefs);
        }
    }
    
    /**
     * Appends the value as the last "dataOutputRefs" element
     */
    public void addDataOutputRefs(java.lang.String dataOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAOUTPUTREFS$0);
            target.setStringValue(dataOutputRefs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataOutputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF insertNewDataOutputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().insert_element_user(DATAOUTPUTREFS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataOutputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF addNewDataOutputRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(DATAOUTPUTREFS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataOutputRefs" element
     */
    public void removeDataOutputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAOUTPUTREFS$0, i);
        }
    }
    
    /**
     * Gets array of all "optionalOutputRefs" elements
     */
    public java.lang.String[] getOptionalOutputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPTIONALOUTPUTREFS$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "optionalOutputRefs" element
     */
    public java.lang.String getOptionalOutputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONALOUTPUTREFS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "optionalOutputRefs" elements
     */
    public org.apache.xmlbeans.XmlIDREF[] xgetOptionalOutputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPTIONALOUTPUTREFS$2, targetList);
            org.apache.xmlbeans.XmlIDREF[] result = new org.apache.xmlbeans.XmlIDREF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "optionalOutputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetOptionalOutputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(OPTIONALOUTPUTREFS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlIDREF)target;
        }
    }
    
    /**
     * Returns number of "optionalOutputRefs" element
     */
    public int sizeOfOptionalOutputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONALOUTPUTREFS$2);
        }
    }
    
    /**
     * Sets array of all "optionalOutputRefs" element
     */
    public void setOptionalOutputRefsArray(java.lang.String[] optionalOutputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(optionalOutputRefsArray, OPTIONALOUTPUTREFS$2);
        }
    }
    
    /**
     * Sets ith "optionalOutputRefs" element
     */
    public void setOptionalOutputRefsArray(int i, java.lang.String optionalOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONALOUTPUTREFS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(optionalOutputRefs);
        }
    }
    
    /**
     * Sets (as xml) array of all "optionalOutputRefs" element
     */
    public void xsetOptionalOutputRefsArray(org.apache.xmlbeans.XmlIDREF[]optionalOutputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(optionalOutputRefsArray, OPTIONALOUTPUTREFS$2);
        }
    }
    
    /**
     * Sets (as xml) ith "optionalOutputRefs" element
     */
    public void xsetOptionalOutputRefsArray(int i, org.apache.xmlbeans.XmlIDREF optionalOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(OPTIONALOUTPUTREFS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(optionalOutputRefs);
        }
    }
    
    /**
     * Inserts the value as the ith "optionalOutputRefs" element
     */
    public void insertOptionalOutputRefs(int i, java.lang.String optionalOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OPTIONALOUTPUTREFS$2, i);
            target.setStringValue(optionalOutputRefs);
        }
    }
    
    /**
     * Appends the value as the last "optionalOutputRefs" element
     */
    public void addOptionalOutputRefs(java.lang.String optionalOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPTIONALOUTPUTREFS$2);
            target.setStringValue(optionalOutputRefs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "optionalOutputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF insertNewOptionalOutputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().insert_element_user(OPTIONALOUTPUTREFS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "optionalOutputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF addNewOptionalOutputRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(OPTIONALOUTPUTREFS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "optionalOutputRefs" element
     */
    public void removeOptionalOutputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONALOUTPUTREFS$2, i);
        }
    }
    
    /**
     * Gets array of all "whileExecutingOutputRefs" elements
     */
    public java.lang.String[] getWhileExecutingOutputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WHILEEXECUTINGOUTPUTREFS$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "whileExecutingOutputRefs" element
     */
    public java.lang.String getWhileExecutingOutputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHILEEXECUTINGOUTPUTREFS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "whileExecutingOutputRefs" elements
     */
    public org.apache.xmlbeans.XmlIDREF[] xgetWhileExecutingOutputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WHILEEXECUTINGOUTPUTREFS$4, targetList);
            org.apache.xmlbeans.XmlIDREF[] result = new org.apache.xmlbeans.XmlIDREF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "whileExecutingOutputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetWhileExecutingOutputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(WHILEEXECUTINGOUTPUTREFS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlIDREF)target;
        }
    }
    
    /**
     * Returns number of "whileExecutingOutputRefs" element
     */
    public int sizeOfWhileExecutingOutputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHILEEXECUTINGOUTPUTREFS$4);
        }
    }
    
    /**
     * Sets array of all "whileExecutingOutputRefs" element
     */
    public void setWhileExecutingOutputRefsArray(java.lang.String[] whileExecutingOutputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(whileExecutingOutputRefsArray, WHILEEXECUTINGOUTPUTREFS$4);
        }
    }
    
    /**
     * Sets ith "whileExecutingOutputRefs" element
     */
    public void setWhileExecutingOutputRefsArray(int i, java.lang.String whileExecutingOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHILEEXECUTINGOUTPUTREFS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(whileExecutingOutputRefs);
        }
    }
    
    /**
     * Sets (as xml) array of all "whileExecutingOutputRefs" element
     */
    public void xsetWhileExecutingOutputRefsArray(org.apache.xmlbeans.XmlIDREF[]whileExecutingOutputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(whileExecutingOutputRefsArray, WHILEEXECUTINGOUTPUTREFS$4);
        }
    }
    
    /**
     * Sets (as xml) ith "whileExecutingOutputRefs" element
     */
    public void xsetWhileExecutingOutputRefsArray(int i, org.apache.xmlbeans.XmlIDREF whileExecutingOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(WHILEEXECUTINGOUTPUTREFS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(whileExecutingOutputRefs);
        }
    }
    
    /**
     * Inserts the value as the ith "whileExecutingOutputRefs" element
     */
    public void insertWhileExecutingOutputRefs(int i, java.lang.String whileExecutingOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(WHILEEXECUTINGOUTPUTREFS$4, i);
            target.setStringValue(whileExecutingOutputRefs);
        }
    }
    
    /**
     * Appends the value as the last "whileExecutingOutputRefs" element
     */
    public void addWhileExecutingOutputRefs(java.lang.String whileExecutingOutputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHILEEXECUTINGOUTPUTREFS$4);
            target.setStringValue(whileExecutingOutputRefs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "whileExecutingOutputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF insertNewWhileExecutingOutputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().insert_element_user(WHILEEXECUTINGOUTPUTREFS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "whileExecutingOutputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF addNewWhileExecutingOutputRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(WHILEEXECUTINGOUTPUTREFS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "whileExecutingOutputRefs" element
     */
    public void removeWhileExecutingOutputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHILEEXECUTINGOUTPUTREFS$4, i);
        }
    }
    
    /**
     * Gets array of all "inputSetRefs" elements
     */
    public java.lang.String[] getInputSetRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUTSETREFS$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "inputSetRefs" element
     */
    public java.lang.String getInputSetRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPUTSETREFS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "inputSetRefs" elements
     */
    public org.apache.xmlbeans.XmlIDREF[] xgetInputSetRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INPUTSETREFS$6, targetList);
            org.apache.xmlbeans.XmlIDREF[] result = new org.apache.xmlbeans.XmlIDREF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "inputSetRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetInputSetRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(INPUTSETREFS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlIDREF)target;
        }
    }
    
    /**
     * Returns number of "inputSetRefs" element
     */
    public int sizeOfInputSetRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTSETREFS$6);
        }
    }
    
    /**
     * Sets array of all "inputSetRefs" element
     */
    public void setInputSetRefsArray(java.lang.String[] inputSetRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inputSetRefsArray, INPUTSETREFS$6);
        }
    }
    
    /**
     * Sets ith "inputSetRefs" element
     */
    public void setInputSetRefsArray(int i, java.lang.String inputSetRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INPUTSETREFS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(inputSetRefs);
        }
    }
    
    /**
     * Sets (as xml) array of all "inputSetRefs" element
     */
    public void xsetInputSetRefsArray(org.apache.xmlbeans.XmlIDREF[]inputSetRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(inputSetRefsArray, INPUTSETREFS$6);
        }
    }
    
    /**
     * Sets (as xml) ith "inputSetRefs" element
     */
    public void xsetInputSetRefsArray(int i, org.apache.xmlbeans.XmlIDREF inputSetRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(INPUTSETREFS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(inputSetRefs);
        }
    }
    
    /**
     * Inserts the value as the ith "inputSetRefs" element
     */
    public void insertInputSetRefs(int i, java.lang.String inputSetRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(INPUTSETREFS$6, i);
            target.setStringValue(inputSetRefs);
        }
    }
    
    /**
     * Appends the value as the last "inputSetRefs" element
     */
    public void addInputSetRefs(java.lang.String inputSetRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INPUTSETREFS$6);
            target.setStringValue(inputSetRefs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inputSetRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF insertNewInputSetRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().insert_element_user(INPUTSETREFS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inputSetRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF addNewInputSetRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(INPUTSETREFS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "inputSetRefs" element
     */
    public void removeInputSetRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTSETREFS$6, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
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
            return get_store().find_attribute_user(NAME$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$8);
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
            get_store().remove_attribute(NAME$8);
        }
    }
}
