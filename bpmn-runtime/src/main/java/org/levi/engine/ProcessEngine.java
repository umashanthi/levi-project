package org.levi.engine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public interface ProcessEngine {
    //public void start() throws IOException, ClassNotFoundException;
    public void stop() throws FileNotFoundException, IOException;
    public String deploy(String larPath) throws IOException;
    public void undeployAll() throws IOException;
    public void undeploy(String id) throws IOException;
    public void cleanup() throws IOException;
    public void startProcess(String id, Map<String, Object> variables) throws IOException, ClassNotFoundException;
    public void stopProcess(String id) throws IOException, ClassNotFoundException;
    public String getDiagramPath(String id);
    public List<String> getDeploymentIds();
    public List<String> getRunningProcessIds();
}