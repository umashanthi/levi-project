package org.levi.engine.persistence.hibernate.process.hobj;

import org.levi.engine.persistence.hibernate.HObject;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Ishan Jayawardena.
 */
@Entity
@Table(name = "deployment")
@SecondaryTables(value = {@SecondaryTable(name = "process_deployed_user"),@SecondaryTable(name = "process_undeployed_user")})
public class DeploymentBean extends HObject {
    private String definitionsId;
    private String extractPath;
    private String processDefinitionPath;
    private String diagramPath;
    private UserBean deployedUser;
    private Date deploymentTime;
    private String businessArchiveName;
    private String businessArchiveLocation;
    private UserBean undeployedUser;
    private Date undeployedTime;
    private boolean isUndeployed;

    @Id
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

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "deployed_user", table = "process_deployed_user")
    public UserBean getDeployedUser() {
        return deployedUser;
    }

    public void setDeployedUser(UserBean deployedUser) {
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

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "undeployed_user", table = "process_undeployed_user")
    public UserBean getUndeployedUser() {
        return undeployedUser;
    }

    public void setUndeployedUser(UserBean undeployedUser) {
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
