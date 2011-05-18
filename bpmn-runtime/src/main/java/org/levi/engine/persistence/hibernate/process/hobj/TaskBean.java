package org.levi.engine.persistence.hibernate.process.hobj;

import org.levi.engine.identity.User;
import org.levi.engine.persistence.hibernate.HObject;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;
import java.util.Map;


/* This class represents a single task in the process (including usertask) */
@Entity
public class TaskBean extends HObject{
    private String id;// primary key
    private String taskId;
    private String processInstanceId;
    private String processDefName;
    private String taskName;
    private String taskDescription;
    private UserBean owner;
    private UserBean assignee;
    private Date startTime;
    private Date endTime;
    private boolean isActive;
    private boolean isAssigned;
    private Map<String,String> properties;
    private boolean hasUserForm;
    private String formName;
    private String fromPath;
    private boolean isStartEvent;
    private boolean isEndEvent;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @Transient //TODO OneToOne mapping with the User
    public UserBean getOwner() {
        return owner;
    }

    public void setOwner(UserBean owner) {
        this.owner = owner;
    }

    @Transient //TODO OneToOne mapping with the User
    public UserBean getAssignee() {
        return assignee;
    }

    public void setAssignee(UserBean assignee) {
        this.assignee = assignee;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getProcessDefName() {
        return processDefName;
    }

    public void setProcessDefName(String processDefName) {
        this.processDefName = processDefName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }

    @Transient //TODO Map the map
    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public boolean isHasUserForm() {
        return hasUserForm;
    }

    public void setHasUserForm(boolean hasUserForm) {
        this.hasUserForm = hasUserForm;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getFromPath() {
        return fromPath;
    }

    public void setFromPath(String fromPath) {
        this.fromPath = fromPath;
    }

    public boolean isStartEvent() {
        return isStartEvent;
    }

    public void setStartEvent(boolean startEvent) {
        isStartEvent = startEvent;
    }

    public boolean isEndEvent() {
        return isEndEvent;
    }

    public void setEndEvent(boolean endEvent) {
        isEndEvent = endEvent;
    }
}
