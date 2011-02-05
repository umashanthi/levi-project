package org.levi.engine.impl.cmd;

import org.levi.engine.cmd.Command;

public class DeletePermissionCmd implements Command<Void> {

    private String permissionId;

    public DeletePermissionCmd(String permissionId) {
        this.permissionId = permissionId;
    }

    public Void execute() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
