package org.levi.engine.impl.bpmn;

import org.apache.ode.jacob.JacobRunnable;
import org.levi.engine.utils.LeviUtils;

import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public class WaitedTask extends JacobRunnable {
    private WaitedTaskChannel waitedTaskChannel;

    public WaitedTask(WaitedTaskChannel waitedTaskChannel) {
        this.waitedTaskChannel = waitedTaskChannel;
    }

    @Override
    public void run() {
        System.out.println("WaitedTask. Doing nothing. just returning!");
        //wait(1000);
        int answer = LeviUtils.readUserInput(2);
        if (answer == 1) {
            Map<String, Object> variables2 = LeviUtils.newHashMap(1);
            variables2.put("answer", 1);
            resume(variables2);
        }
        
    }

    public void resume(Map<String, Object> vars) {
        waitedTaskChannel.resume(vars);
    }
}
