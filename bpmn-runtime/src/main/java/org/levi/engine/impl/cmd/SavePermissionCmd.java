package org.levi.engine.impl.cmd;

import org.levi.engine.cmd.Command;
import org.levi.engine.impl.identity.Permission;

public class SavePermissionCmd implements Command<Permission> {
    private Permission permission;

    public SavePermissionCmd(Permission permission) {
        this.permission = permission;
    }

    public Permission execute() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
