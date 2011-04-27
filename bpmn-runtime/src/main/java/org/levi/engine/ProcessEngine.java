package org.levi.engine;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ProcessEngine {
<<<<<<< Updated upstream
    //public void start() throws IOException, ClassNotFoundException;
=======
    public void start() throws IOException, ClassNotFoundException;

>>>>>>> Stashed changes
    public void stop() throws FileNotFoundException, IOException;

    public void deploy(String larPath) throws IOException;

    public void undeploy(String id) throws IOException;
<<<<<<< Updated upstream
    public void startProcess(String id) throws IOException, ClassNotFoundException;
=======

    public void runProcess(String id) throws IOException, ClassNotFoundException;

>>>>>>> Stashed changes
    public void showRunningProcesses();

    public void showDeployedProcesses();

    public StorageService getStorageService();

}
