package org.levi.engine;

import org.levi.engine.runtime.ProcessInstance;
import org.levi.engine.utils.LeviUtils;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public class EngineData implements Serializable {
    //TODO should this class be a singleton?
    private transient Map<String, Deployment> deployments;
    private int nDeployments;
    private transient List<String> deploymentPIds;
    private int nDeploymentPIds;
    private transient Map<String, ProcessInstance>  runningProcesses;
    private int nRunningProcesses;
    private transient Map<String, ProcessInstance> stoppedProcesses;
    private transient Map<String, ProcessInstance> pausedProcesses;
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
        assert deployments != null;
        this.deployments = deployments;
    }

    public Map<String, Deployment> getDeployments() {
        return deployments;
    }

    public void setDeploymentPIds(List<String> deploymentPIds) {
        assert deploymentPIds != null;
        this.deploymentPIds = deploymentPIds;
    }

    public List<String> getDeploymentIds() {
        return deploymentPIds;
    }

    public boolean removeDeployment(Deployment d) {
        assert d != null;
        return removeDeployment(d.getDefinitionsId());
    }

    public boolean removeDeployment(String id) {
        assert id != null;
        if (deployments.containsKey(id)) {
            deployments.remove(id);
            deploymentPIds.remove(id);
            System.out.println("[Info] Removed deployment " + id);
            return true;
        }
        return false;
    }
    
    public void setRunningProcesses(Map<String, ProcessInstance>  runningProcesses) {
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
        }
    }

    private void readObject(ObjectInputStream s)
    	throws IOException, ClassNotFoundException {
    	s.defaultReadObject(); // read the non transient fields
        // TODO;
        init(nDeploymentPIds);
        for (int i = 0; i < nDeploymentPIds; ++i) {
            String processId = (String)s.readObject();
            String omPath = (String)s.readObject();
            String diagramPath = (String)s.readObject();
            String extractPath = (String)s.readObject();
            Deployment d = new Deployment(processId, omPath, diagramPath, extractPath);
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
        assert processId != null;
        return runningProcesses.containsKey(processId);
    }

    public String toString() {
        return "["+"{"+deploymentPIds +"}," +"]";
    }
}
