package org.levi.engine.persistence.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

/**
 * Created by IntelliJ IDEA.
 * UserBean: eranda
 * Date: May 10, 2011
 * Time: 8:31:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class HibernateDao {

    Session session;

    public HibernateDao(){
        session = SessionFactoryUtil.getSession();
    }

    public Session getSession(){
        return session;
    }

    public void save(HObject hobj){
        try{
            Transaction tx = session.beginTransaction();
            session.save(hobj);
            tx.commit();
        } catch(ConstraintViolationException e){
            System.out.println("Constraint violated"); //TODO need to handle this exception
        }
    }

    public void update(){
        //TODO update data
    }

    public void close(){
        session.flush();
        session.close();
    }


}
