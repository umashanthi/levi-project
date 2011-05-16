package org.levi.engine.persistence.hibernate.process;

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
    private String processId; //primary key
    private String processDefId;
    private boolean isRunning;
    private Map<String, Object> variables;
    private List<String> runningTaskIds;
    private List<String> completedTaskIds;

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
}
