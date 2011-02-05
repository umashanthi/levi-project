package org.levi.engine.impl.cmd;

import org.levi.engine.cmd.Command;
import org.levi.engine.identity.Group;

public class SaveGroupCmd implements Command<Group> {

    private Group group;

    public SaveGroupCmd(Group group) {
        this.group = group;
    }

    public Group execute() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
