package org.levi.engine;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ProcessEngine {
    public void start() throws IOException, ClassNotFoundException;
    public void stop() throws FileNotFoundException, IOException;
    public void showRunningProcesses();
    public void showDeployedProcesses();
}
