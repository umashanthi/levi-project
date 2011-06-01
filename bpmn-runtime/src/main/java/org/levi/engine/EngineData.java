package org.levi.engine;

import org.hibernate.Hibernate;
import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.process.hobj.DeploymentBean;
import org.levi.engine.persistence.hibernate.process.hobj.EngineDataBean;
import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 * @author Ishan Jayawardena
 */
public class EngineData implements Serializable {
    //TODO should this class be a singleton?
    private transient Map<String, Deployment> deployments;
    private int nDeployments;
    private transient List<String> deploymentPIds;
    private int nDeploymentPIds;
    private transient Map<String, ProcessInstance> runningProcesses;
    private int nRunningProcesses;
    private transient Map<String, ProcessInstance> stoppedProcesses;
    private transient List<String> stoppedProcessIds;
    private transient Map<String, ProcessInstance> pausedProcesses;
    private transient List<String> pausedProcessIds;
    private transient List<String> runningProcessIds;
    private static final int DEFAULT_SIZE = 25;

    public EngineData() {
        nDeployments = 0;
        nDeploymentPIds = 0;
        nRunningProcesses = 0;
        init(DEFAULT_SIZE);
    }

    private void init(int n) {
        if (n <= 0) {
            n = DEFAULT_SIZE; // this is not necessarily an error
        }
        deployments = LeviUtils.newHashMap(n);
        deploymentPIds = LeviUtils.newArrayList(n);
        // TODO: handle this later on
        runningProcesses = LeviUtils.newHashMap(n);
        runningProcessIds = LeviUtils.newArrayList(n);
    }

    public void setDeployments(Map<String, Deployment> deployments) {
        if (deployments == null) {
            throw new NullPointerException("Deployments is null.");
        }
        this.deployments = deployments;
    }

    public Map<String, Deployment> getDeployments() {
        return deployments;
    }

    public void setDeploymentPIds(List<String> deploymentPIds) {
        if (deploymentPIds == null) {
            throw new NullPointerException("deploymentPIds is null");
        }
        this.deploymentPIds = deploymentPIds;
    }

    public List<String> getDeploymentIds() {
        HibernateDao dao = new HibernateDao();
        EngineDataBean engineDataBean = (EngineDataBean) dao.getObject(EngineDataBean.class, "1");
        Map<String, DeploymentBean> deployedProcesses = engineDataBean.getDeployedProcesses();
        List<String> deploymentIds = new ArrayList<String>();
        for (String id : deployedProcesses.keySet()) {
            deploymentIds.add(((DeploymentBean) deployedProcesses.get(id)).getDefinitionsId());
        }
        //return deploymentPIds;
        return deploymentIds;
    }

    public boolean removeDeployment(Deployment d) {
        if (d == null) {
            throw new NullPointerException("Cannot remove a null deployment.");
        }
        return removeDeployment(d.getDefinitionsId());
    }

    public boolean removeDeployment(String id) {
        if (id == null) {
            throw new NullPointerException("Cannot remove a deployment by a null id.");
        }
        if (deployments.containsKey(id)) {
            deployments.remove(id);
            deploymentPIds.remove(id);
            System.out.println("[Info] Removed deployment " + id);
            return true;
        }
        return false;
    }

    public void setRunningProcesses(Map<String, ProcessInstance> runningProcesses) {
        assert runningProcesses != null;
        this.runningProcesses = runningProcesses;
    }

    public Map<String, ProcessInstance> getRunningProcesses() {
        return runningProcesses;
    }

    public void setRunningProcessIds(List<String> runningProcessIds) {
        assert runningProcessIds != null;
        this.runningProcessIds = runningProcessIds;
    }

    public List<String> getRunningProcessIds() {
        return runningProcessIds;
    }

    public Deployment getDeployment(String processId) {
        return deployments.get(processId);
    }

    private void writeObject(ObjectOutputStream s)
            throws IOException {
        nDeployments = deployments.size();
        nDeploymentPIds = deploymentPIds.size();
        s.defaultWriteObject();
        assert nDeploymentPIds == nDeployments;
        for (int i = 0; i < nDeploymentPIds; ++i) {
            Deployment d = deployments.get(deploymentPIds.get(i));
            s.writeObject(d.getDefinitionsId());
            s.writeObject(d.getProcessDefinitionPath());
            s.writeObject(d.getDiagramPath());
            s.writeObject(d.getExtractPath());
            s.writeObject(d.getDate());
        }
    }

    private void readObject(ObjectInputStream s)
            throws IOException, ClassNotFoundException {
        s.defaultReadObject(); // read the non transient fields
        // TODO;
        init(nDeploymentPIds);
        for (int i = 0; i < nDeploymentPIds; ++i) {
            String processId = (String) s.readObject();
            String omPath = (String) s.readObject();
            String diagramPath = (String) s.readObject();
            String extractPath = (String) s.readObject();
            Date date = (Date) s.readObject();
            Deployment d = new Deployment(processId, omPath, diagramPath, extractPath, date);
            addDeployment(d);
        }
    }

    public void addDeployment(Deployment dep) {
        assert dep != null;
        deployments.put(dep.getDefinitionsId(), dep);
        deploymentPIds.add(dep.getDefinitionsId());
    }

    public boolean hasDeployment(Deployment d) {
        assert d != null;
        return hasDeployment(d.getDefinitionsId());
    }

    public boolean hasDeployment(String processId) {
        assert processId != null;
        return deployments.containsKey(processId);
    }

    public void addProcessInstance(String processId, ProcessInstance p) {
        runningProcessIds.add(processId);
        runningProcesses.put(processId, p);
    }

    public boolean isRunning(String processId) {
        if (processId == null) {
            throw new NullPointerException("ProcessId is null.");
        }
        return runningProcesses.containsKey(processId);
    }

    public ProcessInstance getProcessInstance(String id) {
        if (id == null) {
            throw new NullPointerException("Process Id is null.");
        }
        return runningProcesses.get(id);
    }

    public void setStoppedProcessIds(List<String> stoppedProcessIds) {
        this.stoppedProcessIds = stoppedProcessIds;
    }

    public void setPausedProcessIds(List<String> pausedProcessIds) {
        this.pausedProcessIds = pausedProcessIds;
    }
}
