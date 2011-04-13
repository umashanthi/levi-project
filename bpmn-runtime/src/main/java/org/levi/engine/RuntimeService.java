package org.levi.engine;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: ishan
 * Date: Dec 30, 2010
 * Time: 12:30:35 PM
 * To change this template use File | Settings | File Templates.
 */
public interface RuntimeService {
    public void runProcess(String processId) throws IOException, ClassNotFoundException;
    public void stopProcess(String processId);
    public void showRunningProcess();
}
