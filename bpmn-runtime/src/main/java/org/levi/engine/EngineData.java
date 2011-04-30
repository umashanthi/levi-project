package org.levi.engine;

import org.levi.engine.runtime.ProcessInstance;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EngineData implements Serializable {
    //TODO should this class be a singleton?
    private transient Map<String, Deployment> deployments;// <processId, deployment>
    private int nDeployments;
    private transient List<String> deploymentPIds;
    private int nDeploymentPIds;
    //private transient Map<String, String> deployedLarPaths; // <processId, larPath>
    //private int nDeploymentURIs;
    private transient Map<String, ProcessInstance>  runningProcesses;
    private int nRunningProcesses;
    private transient Map<String, ProcessInstance> stoppedProcesses;
    private transient Map<String, ProcessInstance> pausedProcesses;
    private transient List<String> runningProcessIds;

    public EngineData() {
        nDeployments = 0;
        nDeploymentPIds = 0;
        nRunningProcesses = 0;
        init(25);
    }

    private void init(int n) {
        assert n > 0;
        deployments = new HashMap<String, Deployment>(n);
        deploymentPIds = new ArrayList<String>(n);
        // TODO: handle this later on
        runningProcesses = new HashMap<String, ProcessInstance>(n);
        runningProcessIds = new ArrayList<String>(n);
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
        return removeDeployment(d.getDefinitionsName());
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
    /*
    public void setDeployedLarPaths(Map<String, String> deploymentsURIs) {
        assert deploymentsURIs != null;
        this.deployedLarPaths = deploymentsURIs;
    } */

    /*
    public Map<String, String> getDeployedLarPaths() {
        return deployedLarPaths;
    }*/

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
            s.writeObject(d.getDefinitionsName());
            s.writeObject(d.getOmPath());
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
        deployments.put(dep.getDefinitionsName(), dep);
        deploymentPIds.add(dep.getDefinitionsName());
    }

    /*
    public boolean hasLarPath(String larPath) {
        assert larPath != null;
        return deployedLarPaths.containsKey(larPath);
    }*/
    public boolean hasDeployment(Deployment d) {
        assert d != null;
        return hasDeployment(d.getDefinitionsName());
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
}
