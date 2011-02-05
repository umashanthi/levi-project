package org.levi.engine.impl.cmd;

import org.levi.engine.cmd.Command;

public class RemoveUserFromGroupCmd implements Command<Void> {

    private String userId, groupId;

    public RemoveUserFromGroupCmd(String userId, String groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }

    public Void execute() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
