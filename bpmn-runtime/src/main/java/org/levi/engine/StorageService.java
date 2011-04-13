package org.levi.engine;

import java.io.IOException;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: keheliya
 * Date: Feb 1, 2011
 * Time: 11:41:48 AM
 * For Levi - The Native BPMN 2.0 Execution Engine
 */
public interface StorageService {
    //DeploymentBuilder createDeployment();
    
    Deployment createDeployment(String larUri) throws IOException;
    public void init();
    public void remove(String processId);
    public void clearAll();
    public List<String> getDeployedProcessList();
    public void showDeployedProcessList();
    public boolean deploy(Deployment d);
}
