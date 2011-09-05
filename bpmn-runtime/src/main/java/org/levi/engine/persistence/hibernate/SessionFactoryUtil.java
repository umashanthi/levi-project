package org.levi.engine.persistence.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.levi.engine.persistence.hibernate.process.hobj.*;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

/**
 *
 * Create Hibernate Sessions
 *
 */
public class SessionFactoryUtil {

    private SessionFactoryUtil() {
    }

    private static SessionFactory sessionFactory;
    private static Configuration config;

    public static void exportSchema(){
        init();
        new SchemaExport(config).create(true, false);
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

    public Session openSession() {
        return sessionFactory.openSession();
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public static void close() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
        sessionFactory = null;
    }
}
