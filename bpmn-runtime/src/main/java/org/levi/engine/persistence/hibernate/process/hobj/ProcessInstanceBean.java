package org.levi.engine.persistence.hibernate.process.hobj;


import org.levi.engine.identity.User;
import org.levi.engine.persistence.hibernate.HObject;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;

/* This class represents a Process instance  */

@Entity
public class ProcessInstanceBean extends HObject {
    private String id; // primary key
    private String processInstanceId;
    private String processDefName;
    private UserBean startUser;
    private Date startTime;
    private String startEventId;
    private String endEventId;
    private boolean isActive;

    @Id
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

}