package org.levi.engine.impl.cmd;

import org.levi.engine.cmd.Command;

public class AddUserToGroupCmd implements Command<Boolean> {

    private String userId, groupId;

    public AddUserToGroupCmd(String userId, String groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }

    public Boolean execute() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
