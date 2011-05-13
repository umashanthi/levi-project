package org.levi.engine.persistence.hibernate.process;

import java.util.Date;

/**
 * @author Ishan Jayawardena.
 */
public class DeploymentBean {
    private String definitionsId;
    private String extractPath;
    private String processDefinitionPath;
    private String diagramPath;
    private Date deploymentTime;

    public String getDefinitionsId() {
        return definitionsId;
    }

    public void setDefinitionsId(String definitionsId) {
        this.definitionsId = definitionsId;
    }

    public String getExtractPath() {
        return extractPath;
    }

    public void setExtractPath(String extractPath) {
        this.extractPath = extractPath;
    }

    public String getProcessDefinitionPath() {
        return processDefinitionPath;
    }

    public void setProcessDefinitionPath(String processDefinitionPath) {
        this.processDefinitionPath = processDefinitionPath;
    }

    public String getDiagramPath() {
        return diagramPath;
    }

    public void setDiagramPath(String diagramPath) {
        this.diagramPath = diagramPath;
    }

    public Date getDeploymentTime() {
        return deploymentTime;
    }

    public void setDeploymentTime(Date deploymentTime) {
        this.deploymentTime = deploymentTime;
    }
}
