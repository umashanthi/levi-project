package org.levi.engine.impl.cmd;

import org.levi.engine.cmd.Command;

public class CheckCredentialsCmd implements Command<Boolean> {
    private String username;
    private String password;

    public CheckCredentialsCmd(String username, String password) {
        this.username = username;
        this.password = password;
        //TODO: Handle the credential checking here
    }

    public Boolean execute() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
