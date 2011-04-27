package org.levi.engine;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ProcessEngine {
    //public void start() throws IOException, ClassNotFoundException;
    public void stop() throws FileNotFoundException, IOException;
    public void deploy(String larPath) throws IOException;
    public void undeploy(String id) throws IOException;
    public void startProcess(String id) throws IOException, ClassNotFoundException;
    public void showRunningProcesses();
    public void showDeployedProcesses();
}