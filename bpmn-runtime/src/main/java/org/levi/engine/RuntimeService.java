package org.levi.engine;

import java.io.IOException;

public interface RuntimeService {
    public boolean start();
    public boolean stop();
    public void runProcess(String processId) throws IOException, ClassNotFoundException;
    public void stopProcess(String processId);
    public void showRunningProcess();
}
