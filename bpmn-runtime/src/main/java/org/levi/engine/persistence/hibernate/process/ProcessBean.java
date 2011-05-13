package org.levi.engine.persistence.hibernate.process;

import org.levi.engine.identity.User;

import java.util.Date;
import java.util.List;
import java.util.Map;

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
    private boolean isRunning;
    private Map<String, Object> variables;
    private List<String> runningTaskIds;
    private List<String> completedTaskIds;

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

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    public List<String> getRunningTaskIds() {
        return runningTaskIds;
    }

    public void setRunningTaskIds(List<String> runningTaskIds) {
        this.runningTaskIds = runningTaskIds;
    }

    public List<String> getCompletedTaskIds() {
        return completedTaskIds;
    }

    public void setCompletedTaskIds(List<String> completedTaskIds) {
        this.completedTaskIds = completedTaskIds;
    }

    @Override
    public String toString() {
        return "ProcessBean{" +
                "id='" + id + '\'' +
                ", processDefName='" + processDefName + '\'' +
                ", businessArchiveName='" + businessArchiveName + '\'' +
                ", businessArchiveLocation='" + businessArchiveLocation + '\'' +
                ", businessArchiveContents=" + businessArchiveContents +
                ", deployedUser=" + deployedUser +
                ", undeployedUser=" + undeployedUser +
                ", deployedTime=" + deployedTime +
                ", isDeleted=" + isDeleted +
                ", undeployedTime=" + undeployedTime +
                ", isRunning=" + isRunning +
                ", variables=" + variables +
                ", runningTaskIds=" + runningTaskIds +
                ", completedTaskIds=" + completedTaskIds +
                '}';
    }
}
