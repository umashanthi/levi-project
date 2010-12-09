/*
 * An XML document type.
 * Localname: artifact
 * Namespace: http://schema.omg.org/spec/BPMN/2.0
 * Java type: org.omg.schema.spec.bpmn.x20.ArtifactDocument
 *
 * Automatically generated - do not modify.
 */
package org.omg.schema.spec.bpmn.x20.impl;
/**
 * A document containing one artifact(@http://schema.omg.org/spec/BPMN/2.0) element.
 *
 * This is a complex type.
 */
public class ArtifactDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.omg.schema.spec.bpmn.x20.ArtifactDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArtifactDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARTIFACT$0 = 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact");
    private static final org.apache.xmlbeans.QNameSet ARTIFACT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "association"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "artifact"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "group"),
        new javax.xml.namespace.QName("http://schema.omg.org/spec/BPMN/2.0", "textAnnotation"),
    });
    
    
    /**
     * Gets the "artifact" element
     */
    public org.omg.schema.spec.bpmn.x20.TArtifact getArtifact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TArtifact target = null;
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().find_element_user(ARTIFACT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "artifact" element
     */
    public void setArtifact(org.omg.schema.spec.bpmn.x20.TArtifact artifact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TArtifact target = null;
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().find_element_user(ARTIFACT$1, 0);
            if (target == null)
            {
                target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().add_element_user(ARTIFACT$0);
            }
            target.set(artifact);
        }
    }
    
    /**
     * Appends and returns a new empty "artifact" element
     */
    public org.omg.schema.spec.bpmn.x20.TArtifact addNewArtifact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.omg.schema.spec.bpmn.x20.TArtifact target = null;
            target = (org.omg.schema.spec.bpmn.x20.TArtifact)get_store().add_element_user(ARTIFACT$0);
            return target;
        }
    }
}
