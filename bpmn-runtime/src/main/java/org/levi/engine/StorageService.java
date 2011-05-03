package org.levi.engine;

import java.io.IOException;
import java.util.List;

/**
 * @author Ishan Jayawardena
 */
public interface StorageService {
    //DeploymentBuilder createDeployment();
    
    public StorageService createDeployment(String larPath) throws IOException;
    public boolean start();
    public boolean stop() throws IOException;
    public List<String> getDeploymentIds();
    public void showDeployedProcessList();
    public void cleanup() throws IOException;
    //public boolean deploy(Deployment d);
    public Deployment deploy();
    public void undeploy(Deployment d) throws IOException;
    public void undeployAll() throws IOException;
    public void undeploy(String id) throws IOException;

}
