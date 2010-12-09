/*
 * An XML document type.
 * Localname: globalCommunication
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one globalCommunication(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class GlobalCommunicationDocumentImpl extends org.omg.schema.spec.bpmn.x20.impl.RootElementDocumentImpl implements org.omg.schema.spec.bpmn.x20.GlobalCommunicationDocument
{
    private static final long serialVersionUID = 1L;
    
    public GlobalCommunicationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GLOBALCOMMUNICATION$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "globalCommunication");
    
    
    /**
     * Gets the "globalCommunication" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalCommunication getGlobalCommunication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalCommunication target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalCommunication)get_store().find_element_user(GLOBALCOMMUNICATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "globalCommunication" element
     */
    public void setGlobalCommunication(org.omg.schema.spec.bpmn.x20.TGlobalCommunication globalCommunication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalCommunication target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalCommunication)get_store().find_element_user(GLOBALCOMMUNICATION$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TGlobalCommunication)get_store().add_element_user(GLOBALCOMMUNICATION$0);
            }
            target.set(globalCommunication);
        }
    }
    
    /**
     * Appends and returns a new empty "globalCommunication" element
     */
    public org.omg.schema.spec.bpmn.x20.TGlobalCommunication addNewGlobalCommunication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TGlobalCommunication target = null;
            target = (org.omg.schema.spec.bpmn.x20.TGlobalCommunication)get_store().add_element_user(GLOBALCOMMUNICATION$0);
            return target;
        }
    }
}
