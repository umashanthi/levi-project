package org.levi.engine.persistence.hibernate.process.hobj;

import org.levi.engine.persistence.hibernate.HObject;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;
import org.levi.engine.utils.LeviUtils;

import javax.persistence.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/* This class represents a single task in the process */
@Entity
@Table(name = "task")
@SecondaryTables(value = {@SecondaryTable(name = "task_owner"),@SecondaryTable(name = "task_assignee"),@SecondaryTable(name = "task_process_instance")})
public class TaskBean extends HObject{
    private String taskId;
    private GroupBean potentialGroup;
    private String taskName;
    private String taskDescription;
    private UserBean owner;
    private UserBean assignee;
    private Date startTime;
    private Date endTime;
    private boolean isActive;
    private boolean isAssigned;
    private Map<String,String> properties = new HashMap<String,String>();
    private boolean hasUserForm;
    private String formName;
    private String fromPath;
    private boolean isStartEvent;
    private boolean isEndEvent;

    @Id
    //This id should unique to each process (processId + taskId)
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @OneToOne(targetEntity = GroupBean.class, cascade = CascadeType.PERSIST)
    public GroupBean getPotentialGroup() {
        return potentialGroup;
    }

    public void setPotentialGroup(GroupBean potentialGroup) {
        this.potentialGroup = potentialGroup;
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

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "owner", table = "task_owner")
    public UserBean getOwner() {
        return owner;
    }

    public void setOwner(UserBean owner) {
        this.owner = owner;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "assignee", table = "task_assignee")
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

    @ElementCollection
    @CollectionTable(name="task_properties",joinColumns={ @JoinColumn(name="taskId")})
	@MapKeyColumn(name = "property")
    @Column(name = "value")
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

    public String getProcessInstanceId(){
        return LeviUtils.getNotTaskId(taskId);
    }

    public void setProcessInstanceId(String processId){
    }


}
