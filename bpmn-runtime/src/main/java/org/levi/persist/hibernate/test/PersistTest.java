package org.levi.persist.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.levi.engine.impl.identity.UserImpl;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: May 10, 2011
 * Time: 10:48:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class PersistTest {


    public static void main(String[] args){
        PersistTest pt = new PersistTest();
        pt.start();
    }

    public void start(){
        Session session = null;
        Transaction tx = null;
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(UserImpl.class);
        config.configure("hibernate.cfg.xml");
        //drop the table and create a fresh table

        //new SchemaExport(config).create(true, true);

        SessionFactory sessionFactory = config.buildSessionFactory();

        session =sessionFactory.openSession();
        tx = session.beginTransaction();
    }
}
