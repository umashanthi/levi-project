package org.levi.engine.persistence.hibernate.process;

import org.levi.engine.identity.User;

import java.util.Date;
import java.util.List;

/**
 * @author Ishan Jayawardena.
 */
public class DeploymentBean {
    private String definitionsId;
    private String extractPath;
    private String processDefinitionPath;
    private String diagramPath;
    private User deployedUser;
    private Date deploymentTime;
    private String businessArchiveName;
    private String businessArchiveLocation;
    private List<String> businessArchiveContents;// should list all the contents eg:forms etc
    private User undeployedUser;
    private Date undeployedTime;
    private boolean isUndeployed; // i.e. undeployed

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

    public User getDeployedUser() {
        return deployedUser;
    }

    public void setDeployedUser(User deployedUser) {
        this.deployedUser = deployedUser;
    }

    public Date getDeploymentTime() {
        return deploymentTime;
    }

    public void setDeploymentTime(Date deploymentTime) {
        this.deploymentTime = deploymentTime;
    }

    public String getBusinessArchiveName() {
        return businessArchiveName;
    }

    public void setBusinessArchiveName(String businessArchiveName) {
        this.businessArchiveName = businessArchiveName;
    }

    public String getBusinessArchiveLocation() {
        return businessArchiveLocation;
    }

    public void setBusinessArchiveLocation(String businessArchiveLocation) {
        this.businessArchiveLocation = businessArchiveLocation;
    }

    public List<String> getBusinessArchiveContents() {
        return businessArchiveContents;
    }

    public void setBusinessArchiveContents(List<String> businessArchiveContents) {
        this.businessArchiveContents = businessArchiveContents;
    }

    public User getUndeployedUser() {
        return undeployedUser;
    }

    public void setUndeployedUser(User undeployedUser) {
        this.undeployedUser = undeployedUser;
    }

    public Date getUndeployedTime() {
        return undeployedTime;
    }

    public void setUndeployedTime(Date undeployedTime) {
        this.undeployedTime = undeployedTime;
    }

    public boolean isUndeployed() {
        return isUndeployed;
    }

    public void setUndeployed(boolean undeployed) {
        isUndeployed = undeployed;
    }
}
