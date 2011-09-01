package org.levi.engine.persistence.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.levi.engine.persistence.hibernate.process.hobj.*;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;


/**
 * Created by IntelliJ IDEA.
 * UserBean: eranda
 * Date: May 3, 2011
 * Time: 11:53:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class SessionFactoryUtil {

    /**
     * disable constructor to guaranty a single instance
     */
    private SessionFactoryUtil() {
    }

    private static SessionFactory sessionFactory;
    private static Configuration config;

    /**
     * Opens a session configured with the default settings.
     *
     * @return the session
     */
    public static void exportSchema(){
        init();
        new SchemaExport(config).create(true, true);
    }

    public static void init(){
        config = new Configuration();
        config.addAnnotatedClass(UserBean.class);
        config.addAnnotatedClass(GroupBean.class);
        config.addAnnotatedClass(DeploymentBean.class);
        config.addAnnotatedClass(ProcessInstanceBean.class);
        config.addAnnotatedClass(TaskBean.class);
        config.addAnnotatedClass(EngineDataBean.class);
        config.configure("persistence.xml");
    }

    public static Session getSession() {
        sessionFactory = config.buildSessionFactory();
        return sessionFactory.openSession();
    }

    /**
     * Opens a session and will not bind it to a session context
     *
     * @return the session
     */
    public Session openSession() {
        return sessionFactory.openSession();
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * closes the session factory
     */
    public static void close() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
        sessionFactory = null;
    }
}
