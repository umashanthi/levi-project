package org.levi.engine.persistence.hibernate.process;

import org.levi.engine.identity.User;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 5/13/11
 * Time: 12:18 AM
 * To change this template use File | Settings | File Templates.
 */

/* This class represents a deployed business process  */

public class ProcessBean {

    private String id; //primary key
    private String processDefName;
    private String businessArchiveName;
    private String businessArchiveLocation;
    private List<String> businessArchiveContents;// should list all the contents eg:forms etc
    private User deployedUser;
    private User undeployedUser;
    private Date deployedTime;
    private boolean isDeleted; // i.e. undeployed
    private Date undeployedTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcessDefName() {
        return processDefName;
    }

    public void setProcessDefName(String processDefName) {
        this.processDefName = processDefName;
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

    public User getDeployedUser() {
        return deployedUser;
    }

    public void setDeployedUser(User deployedUser) {
        this.deployedUser = deployedUser;
    }

    public User getUndeployedUser() {
        return undeployedUser;
    }

    public void setUndeployedUser(User undeployedUser) {
        this.undeployedUser = undeployedUser;
    }

    public Date getDeployedTime() {
        return deployedTime;
    }

    public void setDeployedTime(Date deployedTime) {
        this.deployedTime = deployedTime;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Date getUndeployedTime() {
        return undeployedTime;
    }

    public void setUndeployedTime(Date undeployedTime) {
        this.undeployedTime = undeployedTime;
    }
}
