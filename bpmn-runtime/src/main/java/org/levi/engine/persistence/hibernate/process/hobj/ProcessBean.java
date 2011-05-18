package org.levi.engine.persistence.hibernate.process.hobj;

import org.levi.engine.persistence.hibernate.HObject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
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

@Entity
public class ProcessBean extends HObject {
    private String processId; //primary key
    private String processDefId;
    private boolean isRunning;
    private Map<String, Object> variables;
    private List<String> runningTaskIds;
    private List<String> completedTaskIds;

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

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Transient //TODO the objects use OneToMany with a list
    public Map<String, Object> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Object> variables) {
        this.variables = variables;
    }

    @Transient //TODO map with TaskBean with OneToMany
    public List<String> getRunningTaskIds() {
        return runningTaskIds;
    }

    public void setRunningTaskIds(List<String> runningTaskIds) {
        this.runningTaskIds = runningTaskIds;
    }

    @Transient //TODO map with TaskBean with OneToMany 
    public List<String> getCompletedTaskIds() {
        return completedTaskIds;
    }

    public void setCompletedTaskIds(List<String> completedTaskIds) {
        this.completedTaskIds = completedTaskIds;
    }
}
