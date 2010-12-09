/*
 * An XML document type.
 * Localname: import
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ImportDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one import(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ImportDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ImportDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImportDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "import");
    
    
    /**
     * Gets the "import" element
     */
    public org.omg.schema.spec.bpmn.x20.TImport getImport()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImport target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImport)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "import" element
     */
    public void setImport(org.omg.schema.spec.bpmn.x20.TImport ximport)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TImport target = null;
            target = (org.omg.schema.spec.bpmn.x20.TImport)get_store().find_element_user(IMPORT$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TImport)get_store().add_element_user(IMPORT$0);
            }
            target.set(ximport);
        }
    }
    
    /**
     * Appends and returns a new empty "import" element
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
}
