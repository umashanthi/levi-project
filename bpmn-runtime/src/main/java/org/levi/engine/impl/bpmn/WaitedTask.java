package org.levi.engine.impl.bpmn;

import org.apache.ode.jacob.JacobRunnable;

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
        System.out.println("WaitedTask. Done.");
        waitedTaskChannel.resume("WaitedTask calling resume().");
    }
}
