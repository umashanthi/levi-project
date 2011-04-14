package org.levi.engine;

import java.io.IOException;
import java.util.List;

public interface StorageService {
    //DeploymentBuilder createDeployment();
    
    Deployment createDeployment(String larPath) throws IOException;
    public boolean start();
    public boolean stop() throws IOException;
    public List<String> getDeployedProcessList();
    public void showDeployedProcessList();
    public boolean deploy(Deployment d);
    public boolean undeploy(Deployment d) throws IOException;
    public boolean undeploy(String id) throws IOException;

}
