package org.levi.engine.db;


import org.levi.engine.identity.User;

import java.util.Date;

public class ProcessBean {
    private String id; // primary key
    private String processInstanceId;
    private String processDefName;
    private User startUser;
    private Date startTime;
    private String startEventId;
    private String endEventId;
    private boolean isActive;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getProcessDefName() {
        return processDefName;
    }

    public void setProcessDefName(String processDefName) {
        this.processDefName = processDefName;
    }

    public User getStartUser() {
        return startUser;
    }

    public void setStartUser(User startUser) {
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
