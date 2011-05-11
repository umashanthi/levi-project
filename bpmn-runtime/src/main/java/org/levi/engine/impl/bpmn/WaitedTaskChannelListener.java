package org.levi.engine.impl.bpmn;

import org.apache.ode.jacob.ChannelListener;

/**
 * @author Ishan Jayawardena
 */
public class WaitedTaskChannelListener extends ChannelListener<WaitedTaskChannel> implements WaitedTasks {

    protected WaitedTaskChannelListener(WaitedTaskChannel channel)
            throws IllegalStateException {
        super(channel);
    }

    @Override
    public void resume(Object var) {
        System.out.println("This is what I'v been waiting for...");
    }
}
