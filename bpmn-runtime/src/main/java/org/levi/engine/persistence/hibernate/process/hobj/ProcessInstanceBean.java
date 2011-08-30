package org.levi.engine.persistence.hibernate.process.hobj;

import org.levi.engine.persistence.hibernate.HObject;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import javax.persistence.*;
import java.util.*;

/* This class represents a Process instance  */

@Entity
@Table(name = "process_instance")
@SecondaryTable(name = "process_started_user")
public class ProcessInstanceBean extends HObject {
    private UserBean startUser;
    private String processId;
    private DeploymentBean deployedProcess;
    private Map<String, String> variables = new HashMap<String,String>();
    private Map<String, TaskBean> runningTasks = new HashMap<String,TaskBean>();
    private Map<String, TaskBean> completedTasks = new HashMap<String,TaskBean>();
    private Boolean isRunning;
    private Date startTime;
    private String startEventId;
    private String endEventId;


    @Id
    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }


    @ManyToOne(targetEntity = DeploymentBean.class)
    public DeploymentBean getDeployedProcess() {
        return deployedProcess;
    }

    public void setDeployedProcess(DeploymentBean deployedProcess) {
        this.deployedProcess = deployedProcess;
    }

    @ElementCollection
    @CollectionTable(name="process_variables", joinColumns ={ @JoinColumn(name="processId")})
    @MapKeyColumn(name = "variable")
    @Column(name = "value")
    public Map<String, String> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, String> variables) {
        this.variables = variables;
    }

//    @OneToMany(targetEntity = TaskBean.class, fetch = FetchType.EAGER)
//    @MapKey(name = "taskId")
//    @JoinTable(name = "running_tasks", joinColumns = {@JoinColumn(name = "processId")})
    @ElementCollection
    @CollectionTable(name = "running_tasks", joinColumns = {@JoinColumn(name = "processId")})
    @MapKeyColumn(name = "taskId")
    public Map<String, TaskBean> getRunningTasks() {
        return runningTasks;
    }

    public void setRunningTasks(Map<String, TaskBean> runningTasks) {
        this.runningTasks = runningTasks;
    }

//    @OneToMany(targetEntity = TaskBean.class, fetch = FetchType.EAGER)
//    @MapKey(name = "taskId")
//    @JoinTable(name = "completed_tasks", joinColumns = {@JoinColumn(name = "processId")})
    @ElementCollection
    @CollectionTable(name = "completed_tasks", joinColumns = {@JoinColumn(name = "processId")})
    @MapKeyColumn(name = "taskId")
    public Map<String, TaskBean> getCompletedTasks() {
        return completedTasks;
    }

    public void setCompletedTasks(Map<String, TaskBean> completedTasks) {
        this.completedTasks = completedTasks;
    }

    public Boolean getRunning() {
        return isRunning;
    }

    public void setRunning(Boolean running) {
        isRunning = running;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "startUser", table = "process_started_user")
    public UserBean getStartUser() {
        return startUser;
    }

    public void setStartUser(UserBean startUser) {
        this.startUser = startUser;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getStartEventId() {
        return startEventId;
    }

    public void setStartEventId(String startEventId) {
        this.startEventId = startEventId;
    }

    public String getEndEventId() {
        return endEventId;
    }

    public void setEndEventId(String endEventId) {
        this.endEventId = endEventId;
    }

    public void addToCompletedTask(TaskBean taskBean) {
        if (completedTasks == null) {
            completedTasks = new HashMap<String, TaskBean>();
        }
        if (taskBean != null)
            completedTasks.put(taskBean.getTaskId(), taskBean);
    }

    public void addToRunningTask(TaskBean taskBean) {
        if (runningTasks == null) {
            runningTasks = new HashMap<String, TaskBean>();
        }
        if (taskBean != null)
            runningTasks.put(taskBean.getTaskId(), taskBean);
    }

    public void removeFromRunningTask(TaskBean taskBean) {
        if (runningTasks == null) {
            return;
        }
        if (runningTasks.containsKey(taskBean.getTaskId())) {
            runningTasks.remove(taskBean.getTaskId());
        }
    }
}