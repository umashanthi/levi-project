package org.levi.engine.impl.cmd;

import org.levi.engine.cmd.Command;
import org.levi.engine.identity.User;
import org.levi.engine.impl.db.DBManagerImpl;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

public class SaveUserCmd implements Command<UserBean> {

    private UserBean user;
    private DBManagerImpl dbManager;

    public SaveUserCmd(UserBean user) {
        this.user = user;
        dbManager = new DBManagerImpl(); // TODO: There should be a DBManager for the session & this should be retrieve from session
    }

    public UserBean execute() {
        dbManager.saveUser(user);
        return user;
    }
}
