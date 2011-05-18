package org.levi.engine.persistence.hibernate.process.hobj;


import org.levi.engine.persistence.hibernate.HObject;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

/* This class represents a Process instance  */

@Entity
public class ProcessInstanceBean extends HObject {
    private UserBean startUser;
    private String processId;; // primary key
    private String processDefId;
    private Map<String, Object> variables;
    private ArrayList<String> runningTaskIds;
    private ArrayList<String> completedTaskIds;
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

    @Transient //TODO
    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    public ArrayList<String> getRunningTaskIds() {
        return runningTaskIds;
    }

    public void setRunningTaskIds(ArrayList<String> runningTaskIds) {
        this.runningTaskIds = runningTaskIds;
    }

    public ArrayList<String> getCompletedTaskIds() {
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

    @Transient //TODO OneToOne mapping
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