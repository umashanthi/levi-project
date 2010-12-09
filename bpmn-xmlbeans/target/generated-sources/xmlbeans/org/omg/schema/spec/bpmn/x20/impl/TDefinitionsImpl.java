/*
 * XML Type:  tDefinitions
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.TDefinitions
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * An XML tDefinitions(@http://schema.omg.org/spec/BPMN/2.0).
 *
 * This is a complex type.
 */
public class TDefinitionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.TDefinitions
{
    private static final long serialVersionUID = 1L;
    
    public TDefinitionsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "import");
    private static final javax.xml.namespace.QName EXTENSION$2 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "extension");
    private static final javax.xml.namespace.QName ROOTELEMENT$4 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "rootElement");
    private static final org.apache.xmlbeans.QNameSet ROOTELEMENT$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "errorEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "dataStore"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "partnerRole"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "signalEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "partnerEntity"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "eventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conversation"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "rootElement"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "choreography"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "timerEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "collaboration"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "cancelEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalBusinessRuleTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalChoreographyTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "signal"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "endPoint"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalManualTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "compensateEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "process"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "message"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalUserTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "category"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "conditionalEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalScriptTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "messageEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "terminateEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "escalation"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "error"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalCommunication"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "linkEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalTask"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "interface"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "correlationProperty"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "escalationEventDefinition"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "resource"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "itemDefinition"),
    });
    private static final javax.xml.namespace.QName DIAGRAM$6 = 
        new javax.xml.namespace.QName("http://www.omg.com/di/1.0.0", "diagram");
    private static final javax.xml.namespace.QName RELATIONSHIP$8 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "relationship");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName TARGETNAMESPACE$12 = 
        new javax.xml.namespace.QName("", "targetNamespace");
    private static final javax.xml.namespace.QName EXPRESSIONLANGUAGE$14 = 
        new javax.xml.namespace.QName("", "expressionLanguage");
    private static final javax.xml.namespace.QName TYPELANGUAGE$16 = 
        new javax.xml.namespace.QName("", "typeLanguage");
    
    
    /**
     * Gets array of all "import" elements
     */
    public org.omg.schema.spec.bpmn.x20.TImport[] getImportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(IMPORT$0, targetList);
            org.omg.schema.spec.bpmn.x20.TImport[] result = new org.omg.schema.spec.bpmn.x20.TImport[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "import" element
     */
    public org.omg.schema.spec.bpmn.x20.TImport getImportArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImport target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImport)get_store().find_element_user(IMPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "import" element
     */
    public int sizeOfImportArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORT$0);
        }
    }
    
    /**
     * Sets array of all "import" element
     */
    public void setImportArray(org.omg.schema.spec.bpmn.x20.TImport[] ximportArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(ximportArray, IMPORT$0);
        }
    }
    
    /**
     * Sets ith "import" element
     */
    public void setImportArray(int i, org.omg.schema.spec.bpmn.x20.TImport ximport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImport target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImport)get_store().find_element_user(IMPORT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(ximport);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "import" element
     */
    public org.omg.schema.spec.bpmn.x20.TImport insertNewImport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImport target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImport)get_store().insert_element_user(IMPORT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "import" element
     */
    public org.omg.schema.spec.bpmn.x20.TImport addNewImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImport target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImport)get_store().add_element_user(IMPORT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "import" element
     */
    public void removeImport(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORT$0, i);
        }
    }
    
    /**
     * Gets array of all "extension" elements
     */
    public org.omg.schema.spec.bpmn.x20.TExtension[] getExtensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXTENSION$2, targetList);
            org.omg.schema.spec.bpmn.x20.TExtension[] result = new org.omg.schema.spec.bpmn.x20.TExtension[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "extension" element
     */
    public org.omg.schema.spec.bpmn.x20.TExtension getExtensionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExtension target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExtension)get_store().find_element_user(EXTENSION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "extension" element
     */
    public int sizeOfExtensionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTENSION$2);
        }
    }
    
    /**
     * Sets array of all "extension" element
     */
    public void setExtensionArray(org.omg.schema.spec.bpmn.x20.TExtension[] extensionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(extensionArray, EXTENSION$2);
        }
    }
    
    /**
     * Sets ith "extension" element
     */
    public void setExtensionArray(int i, org.omg.schema.spec.bpmn.x20.TExtension extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExtension target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExtension)get_store().find_element_user(EXTENSION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(extension);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "extension" element
     */
    public org.omg.schema.spec.bpmn.x20.TExtension insertNewExtension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExtension target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExtension)get_store().insert_element_user(EXTENSION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "extension" element
     */
    public org.omg.schema.spec.bpmn.x20.TExtension addNewExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TExtension target = null;
            target = (org.omg.schema.spec.bpmn.x20.TExtension)get_store().add_element_user(EXTENSION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "extension" element
     */
    public void removeExtension(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTENSION$2, i);
        }
    }
    
    /**
     * Gets array of all "rootElement" elements
     */
    public org.omg.schema.spec.bpmn.x20.TRootElement[] getRootElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ROOTELEMENT$5, targetList);
            org.omg.schema.spec.bpmn.x20.TRootElement[] result = new org.omg.schema.spec.bpmn.x20.TRootElement[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "rootElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TRootElement getRootElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRootElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRootElement)get_store().find_element_user(ROOTELEMENT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "rootElement" element
     */
    public int sizeOfRootElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ROOTELEMENT$5);
        }
    }
    
    /**
     * Sets array of all "rootElement" element
     */
    public void setRootElementArray(org.omg.schema.spec.bpmn.x20.TRootElement[] rootElementArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(rootElementArray, ROOTELEMENT$4, ROOTELEMENT$5);
        }
    }
    
    /**
     * Sets ith "rootElement" element
     */
    public void setRootElementArray(int i, org.omg.schema.spec.bpmn.x20.TRootElement rootElement)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRootElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRootElement)get_store().find_element_user(ROOTELEMENT$5, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(rootElement);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "rootElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TRootElement insertNewRootElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRootElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRootElement)get_store().insert_element_user(ROOTELEMENT$5, ROOTELEMENT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "rootElement" element
     */
    public org.omg.schema.spec.bpmn.x20.TRootElement addNewRootElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRootElement target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRootElement)get_store().add_element_user(ROOTELEMENT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "rootElement" element
     */
    public void removeRootElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ROOTELEMENT$5, i);
        }
    }
    
    /**
     * Gets array of all "diagram" elements
     */
    public com.omg.di.x100.Diagram[] getDiagramArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIAGRAM$6, targetList);
            com.omg.di.x100.Diagram[] result = new com.omg.di.x100.Diagram[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "diagram" element
     */
    public com.omg.di.x100.Diagram getDiagramArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Diagram target = null;
            target = (com.omg.di.x100.Diagram)get_store().find_element_user(DIAGRAM$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "diagram" element
     */
    public int sizeOfDiagramArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIAGRAM$6);
        }
    }
    
    /**
     * Sets array of all "diagram" element
     */
    public void setDiagramArray(com.omg.di.x100.Diagram[] diagramArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(diagramArray, DIAGRAM$6);
        }
    }
    
    /**
     * Sets ith "diagram" element
     */
    public void setDiagramArray(int i, com.omg.di.x100.Diagram diagram)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Diagram target = null;
            target = (com.omg.di.x100.Diagram)get_store().find_element_user(DIAGRAM$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(diagram);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "diagram" element
     */
    public com.omg.di.x100.Diagram insertNewDiagram(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Diagram target = null;
            target = (com.omg.di.x100.Diagram)get_store().insert_element_user(DIAGRAM$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "diagram" element
     */
    public com.omg.di.x100.Diagram addNewDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.omg.di.x100.Diagram target = null;
            target = (com.omg.di.x100.Diagram)get_store().add_element_user(DIAGRAM$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "diagram" element
     */
    public void removeDiagram(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIAGRAM$6, i);
        }
    }
    
    /**
     * Gets array of all "relationship" elements
     */
    public org.omg.schema.spec.bpmn.x20.TRelationship[] getRelationshipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATIONSHIP$8, targetList);
            org.omg.schema.spec.bpmn.x20.TRelationship[] result = new org.omg.schema.spec.bpmn.x20.TRelationship[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relationship" element
     */
    public org.omg.schema.spec.bpmn.x20.TRelationship getRelationshipArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRelationship target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRelationship)get_store().find_element_user(RELATIONSHIP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relationship" element
     */
    public int sizeOfRelationshipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIP$8);
        }
    }
    
    /**
     * Sets array of all "relationship" element
     */
    public void setRelationshipArray(org.omg.schema.spec.bpmn.x20.TRelationship[] relationshipArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(relationshipArray, RELATIONSHIP$8);
        }
    }
    
    /**
     * Sets ith "relationship" element
     */
    public void setRelationshipArray(int i, org.omg.schema.spec.bpmn.x20.TRelationship relationship)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRelationship target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRelationship)get_store().find_element_user(RELATIONSHIP$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relationship);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relationship" element
     */
    public org.omg.schema.spec.bpmn.x20.TRelationship insertNewRelationship(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRelationship target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRelationship)get_store().insert_element_user(RELATIONSHIP$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relationship" element
     */
    public org.omg.schema.spec.bpmn.x20.TRelationship addNewRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TRelationship target = null;
            target = (org.omg.schema.spec.bpmn.x20.TRelationship)get_store().add_element_user(RELATIONSHIP$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "relationship" element
     */
    public void removeRelationship(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIP$8, i);
        }
    }
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlID xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            return target;
        }
    }
    
    /**
     * True if has "id" attribute
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$10) != null;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" attribute
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$10);
        }
    }
    
    /**
     * Gets the "targetNamespace" attribute
     */
    public java.lang.String getTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "targetNamespace" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTargetNamespace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$12);
            return target;
        }
    }
    
    /**
     * Sets the "targetNamespace" attribute
     */
    public void setTargetNamespace(java.lang.String targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TARGETNAMESPACE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TARGETNAMESPACE$12);
            }
            target.setStringValue(targetNamespace);
        }
    }
    
    /**
     * Sets (as xml) the "targetNamespace" attribute
     */
    public void xsetTargetNamespace(org.apache.xmlbeans.XmlAnyURI targetNamespace)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TARGETNAMESPACE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TARGETNAMESPACE$12);
            }
            target.set(targetNamespace);
        }
    }
    
    /**
     * Gets the "expressionLanguage" attribute
     */
    public java.lang.String getExpressionLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPRESSIONLANGUAGE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(EXPRESSIONLANGUAGE$14);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "expressionLanguage" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetExpressionLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(EXPRESSIONLANGUAGE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_default_attribute_value(EXPRESSIONLANGUAGE$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "expressionLanguage" attribute
     */
    public boolean isSetExpressionLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXPRESSIONLANGUAGE$14) != null;
        }
    }
    
    /**
     * Sets the "expressionLanguage" attribute
     */
    public void setExpressionLanguage(java.lang.String expressionLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXPRESSIONLANGUAGE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXPRESSIONLANGUAGE$14);
            }
            target.setStringValue(expressionLanguage);
        }
    }
    
    /**
     * Sets (as xml) the "expressionLanguage" attribute
     */
    public void xsetExpressionLanguage(org.apache.xmlbeans.XmlAnyURI expressionLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(EXPRESSIONLANGUAGE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(EXPRESSIONLANGUAGE$14);
            }
            target.set(expressionLanguage);
        }
    }
    
    /**
     * Unsets the "expressionLanguage" attribute
     */
    public void unsetExpressionLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXPRESSIONLANGUAGE$14);
        }
    }
    
    /**
     * Gets the "typeLanguage" attribute
     */
    public java.lang.String getTypeLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPELANGUAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPELANGUAGE$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeLanguage" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetTypeLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TYPELANGUAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_default_attribute_value(TYPELANGUAGE$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "typeLanguage" attribute
     */
    public boolean isSetTypeLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPELANGUAGE$16) != null;
        }
    }
    
    /**
     * Sets the "typeLanguage" attribute
     */
    public void setTypeLanguage(java.lang.String typeLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPELANGUAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPELANGUAGE$16);
            }
            target.setStringValue(typeLanguage);
        }
    }
    
    /**
     * Sets (as xml) the "typeLanguage" attribute
     */
    public void xsetTypeLanguage(org.apache.xmlbeans.XmlAnyURI typeLanguage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(TYPELANGUAGE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(TYPELANGUAGE$16);
            }
            target.set(typeLanguage);
        }
    }
    
    /**
     * Unsets the "typeLanguage" attribute
     */
    public void unsetTypeLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPELANGUAGE$16);
        }
    }
}
