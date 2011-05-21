package org.levi.engine.persistence.hibernate.process.hobj;

import org.levi.engine.identity.User;
import org.levi.engine.persistence.hibernate.HObject;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ishan Jayawardena.
 */
@Entity
@Table(name = "deployment")
@SecondaryTables(value = {@SecondaryTable(name = "processdeployeduser"),@SecondaryTable(name = "processundeployeduser")})
public class DeploymentBean extends HObject {
    private String definitionsId;
    private String extractPath;
    private String processDefinitionPath;
    private String diagramPath;
    private UserBean deployedUser;
    private Date deploymentTime;
    private String businessArchiveName;
    private String businessArchiveLocation;
    private ArrayList<String> businessArchiveContents;// should list all the contents eg:forms etc
    private UserBean undeployedUser;
    private Date undeployedTime;
    private boolean isUndeployed; // i.e. undeployed

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
    @JoinColumn(name = "deployeduser", table = "processdeployeduser")
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

    public ArrayList<String> getBusinessArchiveContents() {
        return businessArchiveContents;
    }

    public void setBusinessArchiveContents(ArrayList<String> businessArchiveContents) {
        this.businessArchiveContents = businessArchiveContents;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "undeployeduser", table = "processundeployeduser")
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
