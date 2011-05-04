package org.levi.persist.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: May 3, 2011
 * Time: 11:53:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class SessionFactoryUtil {

    /**
     * The single instance of hibernate SessionFactory
     */
    private static SessionFactory sessionFactory;

    /**
     * disable constructor to guaranty a single instance
     */
    private SessionFactoryUtil() {
    }

    static {
        sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
    }

    public static SessionFactory getInstance() {
        return sessionFactory;
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
