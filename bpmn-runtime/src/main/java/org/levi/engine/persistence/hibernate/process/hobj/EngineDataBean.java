package org.levi.engine.persistence.hibernate.process.hobj;

import org.levi.engine.persistence.hibernate.HObject;
import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: May 27, 2011
 * Time: 12:53:22 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "engine_data")
public class EngineDataBean extends HObject {

    private String id;
    private Map<String, DeploymentBean> deployedProcesses = new HashMap<String,DeploymentBean>();
    private Map<String, ProcessInstanceBean> runningProcesses = new HashMap<String,ProcessInstanceBean>();
    private Map<String, ProcessInstanceBean> stoppedProcesses = new HashMap<String,ProcessInstanceBean>();
    private Map<String, ProcessInstanceBean> pausedProcesses = new HashMap<String,ProcessInstanceBean>();

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    @OneToMany(targetEntity = DeploymentBean.class)
//    @MapKey(name = "definitionsId")
//    @JoinTable(name = "deployed_processes", joinColumns = {@JoinColumn(name = "id")})
    @ElementCollection
    @CollectionTable(name = "deployed_processes", joinColumns = {@JoinColumn(name = "id")})
    @MapKeyColumn(name = "definitionsId")
    public Map<String, DeploymentBean> getDeployedProcesses() {
        return deployedProcesses;
    }

    public void setDeployedProcesses(Map<String, DeploymentBean> deployedProcesses) {
        this.deployedProcesses = deployedProcesses;
    }

//    @OneToMany(targetEntity = ProcessInstanceBean.class)
//    @MapKey(name = "processId")
//    @JoinTable(name = "process_instance_data", joinColumns = {@JoinColumn(name = "id")})
    @ElementCollection
    @CollectionTable(name = "process_instances", joinColumns = {@JoinColumn(name = "id")})
    @MapKeyColumn(name = "processId")
    public Map<String, ProcessInstanceBean> getRunningProcesses() {
        return runningProcesses;
    }

    public void setRunningProcesses(Map<String, ProcessInstanceBean> runningProcesses) {
        this.runningProcesses = runningProcesses;
    }

//    @OneToMany(targetEntity = ProcessInstanceBean.class)
//    @MapKey(name = "processId")
//    @JoinTable(name = "stopped_process_instance_data", joinColumns = {@JoinColumn(name = "id")})
    @ElementCollection
    @CollectionTable(name = "stopped_process_instances", joinColumns = {@JoinColumn(name = "id")})
    @MapKeyColumn(name = "processId")
    public Map<String, ProcessInstanceBean> getStoppedProcesses() {
        return stoppedProcesses;
    }

    public void setStoppedProcesses(Map<String, ProcessInstanceBean> stoppedProcesses) {
        this.stoppedProcesses = stoppedProcesses;
    }

//    @OneToMany(targetEntity = ProcessInstanceBean.class)
//    @MapKey(name = "processId")
//    @JoinTable(name = "paused_process_instance_data", joinColumns = {@JoinColumn(name = "id")})
    @ElementCollection
    @CollectionTable(name = "paused_process_instances", joinColumns = {@JoinColumn(name = "id")})
    @MapKeyColumn(name = "processId")
    public Map<String, ProcessInstanceBean> getPausedProcesses() {
        return pausedProcesses;
    }

    public void setPausedProcesses(Map<String, ProcessInstanceBean> pausedProcesses) {
        this.pausedProcesses = pausedProcesses;
    }

    public void addDeployment(DeploymentBean deploymentBean) {
        if (deployedProcesses == null) {
            deployedProcesses = new HashMap<String, DeploymentBean>();
        }
        deployedProcesses.put(deploymentBean.getDefinitionsId(), deploymentBean);
    }

    public void addProcessInstance(ProcessInstanceBean processInstanceBean) {
        if (runningProcesses == null) {
            runningProcesses = new HashMap<String, ProcessInstanceBean>();
        }
        runningProcesses.put(processInstanceBean.getProcessId(), processInstanceBean);
    }
}
