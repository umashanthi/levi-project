/*
 * An XML document type.
 * Localname: monitoring
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.MonitoringDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one monitoring(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class MonitoringDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.MonitoringDocument
{
    private static final long serialVersionUID = 1L;
    
    public MonitoringDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MONITORING$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "monitoring");
    
    
    /**
     * Gets the "monitoring" element
     */
    public org.omg.schema.spec.bpmn.x20.TMonitoring getMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMonitoring target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMonitoring)get_store().find_element_user(MONITORING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "monitoring" element
     */
    public void setMonitoring(org.omg.schema.spec.bpmn.x20.TMonitoring monitoring)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMonitoring target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMonitoring)get_store().find_element_user(MONITORING$0, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TMonitoring)get_store().add_element_user(MONITORING$0);
            }
            target.set(monitoring);
        }
    }
    
    /**
     * Appends and returns a new empty "monitoring" element
     */
    public org.omg.schema.spec.bpmn.x20.TMonitoring addNewMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TMonitoring target = null;
            target = (org.omg.schema.spec.bpmn.x20.TMonitoring)get_store().add_element_user(MONITORING$0);
            return target;
        }
    }
}
