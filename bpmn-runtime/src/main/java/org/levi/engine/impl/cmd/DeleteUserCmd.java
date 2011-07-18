package org.levi.engine.impl.cmd;

import org.levi.engine.cmd.Command;

public class DeleteUserCmd implements Command<Void> {
    private String userId;

    public DeleteUserCmd(String userId) {
        this.userId = userId;
    }

    public Void execute() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
