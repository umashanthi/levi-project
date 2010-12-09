/*
 * XML Type:  tInputSet
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TInputSet
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tInputSet(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TInputSetImpl extends org.omg.schema.spec.bpmn.x20.impl.TBaseElementImpl implements org.omg.schema.spec.bpmn.x20.TInputSet
{
    private static final long serialVersionUID = 1L;
    
    public TInputSetImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATAINPUTREFS$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataInputRefs");
    private static final javax.xml.namespace.QName OPTIONALINPUTREFS$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "optionalInputRefs");
    private static final javax.xml.namespace.QName WHILEEXECUTINGINPUTREFS$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "whileExecutingInputRefs");
    private static final javax.xml.namespace.QName OUTPUTSETREFS$6 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "outputSetRefs");
    private static final javax.xml.namespace.QName NAME$8 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets array of all "dataInputRefs" elements
     */
    public java.lang.String[] getDataInputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAINPUTREFS$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "dataInputRefs" element
     */
    public java.lang.String getDataInputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINPUTREFS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "dataInputRefs" elements
     */
    public org.apache.xmlbeans.XmlIDREF[] xgetDataInputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATAINPUTREFS$0, targetList);
            org.apache.xmlbeans.XmlIDREF[] result = new org.apache.xmlbeans.XmlIDREF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "dataInputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetDataInputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(DATAINPUTREFS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlIDREF)target;
        }
    }
    
    /**
     * Returns number of "dataInputRefs" element
     */
    public int sizeOfDataInputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINPUTREFS$0);
        }
    }
    
    /**
     * Sets array of all "dataInputRefs" element
     */
    public void setDataInputRefsArray(java.lang.String[] dataInputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataInputRefsArray, DATAINPUTREFS$0);
        }
    }
    
    /**
     * Sets ith "dataInputRefs" element
     */
    public void setDataInputRefsArray(int i, java.lang.String dataInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINPUTREFS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(dataInputRefs);
        }
    }
    
    /**
     * Sets (as xml) array of all "dataInputRefs" element
     */
    public void xsetDataInputRefsArray(org.apache.xmlbeans.XmlIDREF[]dataInputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(dataInputRefsArray, DATAINPUTREFS$0);
        }
    }
    
    /**
     * Sets (as xml) ith "dataInputRefs" element
     */
    public void xsetDataInputRefsArray(int i, org.apache.xmlbeans.XmlIDREF dataInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(DATAINPUTREFS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(dataInputRefs);
        }
    }
    
    /**
     * Inserts the value as the ith "dataInputRefs" element
     */
    public void insertDataInputRefs(int i, java.lang.String dataInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DATAINPUTREFS$0, i);
            target.setStringValue(dataInputRefs);
        }
    }
    
    /**
     * Appends the value as the last "dataInputRefs" element
     */
    public void addDataInputRefs(java.lang.String dataInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAINPUTREFS$0);
            target.setStringValue(dataInputRefs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "dataInputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF insertNewDataInputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().insert_element_user(DATAINPUTREFS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "dataInputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF addNewDataInputRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(DATAINPUTREFS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "dataInputRefs" element
     */
    public void removeDataInputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINPUTREFS$0, i);
        }
    }
    
    /**
     * Gets array of all "optionalInputRefs" elements
     */
    public java.lang.String[] getOptionalInputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPTIONALINPUTREFS$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "optionalInputRefs" element
     */
    public java.lang.String getOptionalInputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONALINPUTREFS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "optionalInputRefs" elements
     */
    public org.apache.xmlbeans.XmlIDREF[] xgetOptionalInputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OPTIONALINPUTREFS$2, targetList);
            org.apache.xmlbeans.XmlIDREF[] result = new org.apache.xmlbeans.XmlIDREF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "optionalInputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetOptionalInputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(OPTIONALINPUTREFS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlIDREF)target;
        }
    }
    
    /**
     * Returns number of "optionalInputRefs" element
     */
    public int sizeOfOptionalInputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONALINPUTREFS$2);
        }
    }
    
    /**
     * Sets array of all "optionalInputRefs" element
     */
    public void setOptionalInputRefsArray(java.lang.String[] optionalInputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(optionalInputRefsArray, OPTIONALINPUTREFS$2);
        }
    }
    
    /**
     * Sets ith "optionalInputRefs" element
     */
    public void setOptionalInputRefsArray(int i, java.lang.String optionalInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTIONALINPUTREFS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(optionalInputRefs);
        }
    }
    
    /**
     * Sets (as xml) array of all "optionalInputRefs" element
     */
    public void xsetOptionalInputRefsArray(org.apache.xmlbeans.XmlIDREF[]optionalInputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(optionalInputRefsArray, OPTIONALINPUTREFS$2);
        }
    }
    
    /**
     * Sets (as xml) ith "optionalInputRefs" element
     */
    public void xsetOptionalInputRefsArray(int i, org.apache.xmlbeans.XmlIDREF optionalInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(OPTIONALINPUTREFS$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(optionalInputRefs);
        }
    }
    
    /**
     * Inserts the value as the ith "optionalInputRefs" element
     */
    public void insertOptionalInputRefs(int i, java.lang.String optionalInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OPTIONALINPUTREFS$2, i);
            target.setStringValue(optionalInputRefs);
        }
    }
    
    /**
     * Appends the value as the last "optionalInputRefs" element
     */
    public void addOptionalInputRefs(java.lang.String optionalInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPTIONALINPUTREFS$2);
            target.setStringValue(optionalInputRefs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "optionalInputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF insertNewOptionalInputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().insert_element_user(OPTIONALINPUTREFS$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "optionalInputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF addNewOptionalInputRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(OPTIONALINPUTREFS$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "optionalInputRefs" element
     */
    public void removeOptionalInputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONALINPUTREFS$2, i);
        }
    }
    
    /**
     * Gets array of all "whileExecutingInputRefs" elements
     */
    public java.lang.String[] getWhileExecutingInputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WHILEEXECUTINGINPUTREFS$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "whileExecutingInputRefs" element
     */
    public java.lang.String getWhileExecutingInputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHILEEXECUTINGINPUTREFS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "whileExecutingInputRefs" elements
     */
    public org.apache.xmlbeans.XmlIDREF[] xgetWhileExecutingInputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(WHILEEXECUTINGINPUTREFS$4, targetList);
            org.apache.xmlbeans.XmlIDREF[] result = new org.apache.xmlbeans.XmlIDREF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "whileExecutingInputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetWhileExecutingInputRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(WHILEEXECUTINGINPUTREFS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlIDREF)target;
        }
    }
    
    /**
     * Returns number of "whileExecutingInputRefs" element
     */
    public int sizeOfWhileExecutingInputRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WHILEEXECUTINGINPUTREFS$4);
        }
    }
    
    /**
     * Sets array of all "whileExecutingInputRefs" element
     */
    public void setWhileExecutingInputRefsArray(java.lang.String[] whileExecutingInputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(whileExecutingInputRefsArray, WHILEEXECUTINGINPUTREFS$4);
        }
    }
    
    /**
     * Sets ith "whileExecutingInputRefs" element
     */
    public void setWhileExecutingInputRefsArray(int i, java.lang.String whileExecutingInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WHILEEXECUTINGINPUTREFS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(whileExecutingInputRefs);
        }
    }
    
    /**
     * Sets (as xml) array of all "whileExecutingInputRefs" element
     */
    public void xsetWhileExecutingInputRefsArray(org.apache.xmlbeans.XmlIDREF[]whileExecutingInputRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(whileExecutingInputRefsArray, WHILEEXECUTINGINPUTREFS$4);
        }
    }
    
    /**
     * Sets (as xml) ith "whileExecutingInputRefs" element
     */
    public void xsetWhileExecutingInputRefsArray(int i, org.apache.xmlbeans.XmlIDREF whileExecutingInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(WHILEEXECUTINGINPUTREFS$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(whileExecutingInputRefs);
        }
    }
    
    /**
     * Inserts the value as the ith "whileExecutingInputRefs" element
     */
    public void insertWhileExecutingInputRefs(int i, java.lang.String whileExecutingInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(WHILEEXECUTINGINPUTREFS$4, i);
            target.setStringValue(whileExecutingInputRefs);
        }
    }
    
    /**
     * Appends the value as the last "whileExecutingInputRefs" element
     */
    public void addWhileExecutingInputRefs(java.lang.String whileExecutingInputRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WHILEEXECUTINGINPUTREFS$4);
            target.setStringValue(whileExecutingInputRefs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "whileExecutingInputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF insertNewWhileExecutingInputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().insert_element_user(WHILEEXECUTINGINPUTREFS$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "whileExecutingInputRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF addNewWhileExecutingInputRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(WHILEEXECUTINGINPUTREFS$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "whileExecutingInputRefs" element
     */
    public void removeWhileExecutingInputRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WHILEEXECUTINGINPUTREFS$4, i);
        }
    }
    
    /**
     * Gets array of all "outputSetRefs" elements
     */
    public java.lang.String[] getOutputSetRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUTSETREFS$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "outputSetRefs" element
     */
    public java.lang.String getOutputSetRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUTSETREFS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "outputSetRefs" elements
     */
    public org.apache.xmlbeans.XmlIDREF[] xgetOutputSetRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(OUTPUTSETREFS$6, targetList);
            org.apache.xmlbeans.XmlIDREF[] result = new org.apache.xmlbeans.XmlIDREF[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "outputSetRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF xgetOutputSetRefsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(OUTPUTSETREFS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlIDREF)target;
        }
    }
    
    /**
     * Returns number of "outputSetRefs" element
     */
    public int sizeOfOutputSetRefsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUTSETREFS$6);
        }
    }
    
    /**
     * Sets array of all "outputSetRefs" element
     */
    public void setOutputSetRefsArray(java.lang.String[] outputSetRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outputSetRefsArray, OUTPUTSETREFS$6);
        }
    }
    
    /**
     * Sets ith "outputSetRefs" element
     */
    public void setOutputSetRefsArray(int i, java.lang.String outputSetRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OUTPUTSETREFS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(outputSetRefs);
        }
    }
    
    /**
     * Sets (as xml) array of all "outputSetRefs" element
     */
    public void xsetOutputSetRefsArray(org.apache.xmlbeans.XmlIDREF[]outputSetRefsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(outputSetRefsArray, OUTPUTSETREFS$6);
        }
    }
    
    /**
     * Sets (as xml) ith "outputSetRefs" element
     */
    public void xsetOutputSetRefsArray(int i, org.apache.xmlbeans.XmlIDREF outputSetRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_element_user(OUTPUTSETREFS$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(outputSetRefs);
        }
    }
    
    /**
     * Inserts the value as the ith "outputSetRefs" element
     */
    public void insertOutputSetRefs(int i, java.lang.String outputSetRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(OUTPUTSETREFS$6, i);
            target.setStringValue(outputSetRefs);
        }
    }
    
    /**
     * Appends the value as the last "outputSetRefs" element
     */
    public void addOutputSetRefs(java.lang.String outputSetRefs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OUTPUTSETREFS$6);
            target.setStringValue(outputSetRefs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "outputSetRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF insertNewOutputSetRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().insert_element_user(OUTPUTSETREFS$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "outputSetRefs" element
     */
    public org.apache.xmlbeans.XmlIDREF addNewOutputSetRefs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().add_element_user(OUTPUTSETREFS$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "outputSetRefs" element
     */
    public void removeOutputSetRefs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUTSETREFS$6, i);
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
