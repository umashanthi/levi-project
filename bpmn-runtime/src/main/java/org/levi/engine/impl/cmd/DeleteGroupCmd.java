package org.levi.engine.impl.cmd;

import org.levi.engine.cmd.Command;

public class DeleteGroupCmd implements Command<Void> {

    private String groupId;

    public DeleteGroupCmd(String groupId) {
        this.groupId = groupId;

    }

    public Void execute() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
