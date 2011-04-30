package org.levi.engine;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ProcessEngine {
    //public void start() throws IOException, ClassNotFoundException;
    public void stop() throws FileNotFoundException, IOException;
    public void deploy(String larPath) throws IOException;
    public void undeploy(String id) throws IOException;
    public void startProcess(String id) throws IOException, ClassNotFoundException;
    public void stopProcess(String id) throws IOException, ClassNotFoundException;
    public List<String> getDeploymentIds();
    public List<String> getRunningProcessIds();
}