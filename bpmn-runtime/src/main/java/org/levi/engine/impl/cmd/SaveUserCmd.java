package org.levi.engine.impl.cmd;

import org.levi.engine.cmd.Command;
import org.levi.engine.identity.User;
import org.levi.engine.impl.db.H2DBManagerImpl;

public class SaveUserCmd implements Command<User> {

    private User user;
    private H2DBManagerImpl dbManager;

    public SaveUserCmd(User user) {
        this.user = user;
        dbManager = new H2DBManagerImpl(); // TODO: There should be a DBManager for the session & this should be retrieve from session
    }

    public User execute() {
        dbManager.saveUser(user);
        return user;
    }
}
