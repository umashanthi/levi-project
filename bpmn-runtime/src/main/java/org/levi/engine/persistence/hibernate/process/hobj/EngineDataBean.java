package org.levi.engine.persistence.hibernate.process.hobj;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CollectionOfElements;
import org.levi.engine.Deployment;
import org.levi.engine.runtime.ProcessInstance;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: May 27, 2011
 * Time: 12:53:22 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "enginedata")
public class EngineDataBean {

    private String id;
    private Map<String, Deployment> deployments;
    private int nDeployments;
    private List<String> deploymentPIds;
    private int nDeploymentPIds;
    private Map<String, ProcessInstance>  runningProcesses;
    private int nRunningProcesses;
    private Map<String, ProcessInstance> stoppedProcesses;
    private Map<String, ProcessInstance> pausedProcesses;
    private List<String> runningProcessIds;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Transient
    public Map<String, Deployment> getDeployments() {
        return deployments;
    }

    public void setDeployments(Map<String, Deployment> deployments) {
        this.deployments = deployments;
    }

    public int getnDeployments() {
        return nDeployments;
    }

    public void setnDeployments(int nDeployments) {
        this.nDeployments = nDeployments;
    }

    @Transient
    public List<String> getDeploymentPIds() {
        return deploymentPIds;
    }

    public void setDeploymentPIds(List<String> deploymentPIds) {
        this.deploymentPIds = deploymentPIds;
    }

    public int getnDeploymentPIds() {
        return nDeploymentPIds;
    }

    public void setnDeploymentPIds(int nDeploymentPIds) {
        this.nDeploymentPIds = nDeploymentPIds;
    }

    public int getnRunningProcesses() {
        return nRunningProcesses;
    }

    public void setnRunningProcesses(int nRunningProcesses) {
        this.nRunningProcesses = nRunningProcesses;
    }

    @Transient
    public Map<String, ProcessInstance> getRunningProcesses() {
        return runningProcesses;
    }

    public void setRunningProcesses(Map<String, ProcessInstance> runningProcesses) {
        this.runningProcesses = runningProcesses;
    }

    @Transient
    public Map<String, ProcessInstance> getStoppedProcesses() {
        return stoppedProcesses;
    }

    public void setStoppedProcesses(Map<String, ProcessInstance> stoppedProcesses) {
        this.stoppedProcesses = stoppedProcesses;
    }

    @Transient
    public Map<String, ProcessInstance> getPausedProcesses() {
        return pausedProcesses;
    }

    public void setPausedProcesses(Map<String, ProcessInstance> pausedProcesses) {
        this.pausedProcesses = pausedProcesses;
    }

    @Transient
    public List<String> getRunningProcessIds() {
        return runningProcessIds;
    }

    public void setRunningProcessIds(List<String> runningProcessIds) {
        this.runningProcessIds = runningProcessIds;
    }
}
