package org.levi.engine.persistence.hibernate.process.hobj;


import org.levi.engine.persistence.hibernate.HObject;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* This class represents a Process instance  */

@Entity
@Table(name = "processinstance")
@SecondaryTable(name = "processstarteduser")
public class ProcessInstanceBean extends HObject {
    private UserBean startUser;
    private String processId;
    private String processDefId;  //TODO DeploymentBean instead processDefId
    private Map<String, Object> variables;
    private List<String> runningTaskIds;    //TODO TaskBean instead taskId
    private List<String> completedTaskIds;   //TODO TaskBean instead taskId
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

    public String getProcessDefId() {
        return processDefId;
    }

    public void setProcessDefId(String processDefId) {
        this.processDefId = processDefId;
    }

    @Transient //TODO Object
    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    @Transient
    public List<String> getRunningTaskIds() {
        return runningTaskIds;
    }

    public void setRunningTaskIds(ArrayList<String> runningTaskIds) {
        this.runningTaskIds = runningTaskIds;
    }

    @Transient
    public List<String> getCompletedTaskIds() {
        return completedTaskIds;
    }

    public void setCompletedTaskIds(ArrayList<String> completedTaskIds) {
        this.completedTaskIds = completedTaskIds;
    }

    public Boolean getRunning() {
        return isRunning;
    }

    public void setRunning(Boolean running) {
        isRunning = running;
    }

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "startuser", table = "processstarteduser")
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

}