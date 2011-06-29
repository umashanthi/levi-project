package org.levi.engine.persistence.hibernate.process.ql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.type.Type;
import org.levi.engine.persistence.hibernate.SessionFactoryUtil;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import java.sql.Types;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: Jun 20, 2011
 * Time: 11:07:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class HqlManager {

    Session session;

    public HqlManager(){
        session = SessionFactoryUtil.getSession();
    }

    public List<UserBean> getUserObjects(){
        List<UserBean> users = session.createQuery("from UserBean").list();
        return users;

        //List<UserBean> users = session.createSQLQuery("select * from users").addEntity(UserBean.class).list();
        //return users;
    }

    public List<GroupBean> getGroupObjects(){
        List<GroupBean> groups = session.createQuery("from GroupBean").list();
        return groups;

        //List<GroupBean> groups = session.createSQLQuery("select * from groups").addEntity(GroupBean.class).list();
        //return groups;
    }

    public void close() {
        session.close();
    }
}
