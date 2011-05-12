package org.levi.persist.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;
import org.levi.persist.hibernate.users.hobj.HObject;

/**
 * Created by IntelliJ IDEA.
 * UserDaoImpl: eranda
 * Date: May 10, 2011
 * Time: 8:31:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class HibernateDao {

    private HObject _hobj;
    private Session session;
    private Transaction tx;


    public HibernateDao(HObject hobj){
        this._hobj=hobj;
        session = SessionFactoryUtil.getSession();
    }

    public HObject getHibernateObj(){
        return _hobj;
    }

    public void update(){
        try{
            tx = session.beginTransaction();
            session.save(_hobj);
            tx.commit();
            session.flush();
            session.close();
        } catch(ConstraintViolationException e){
            System.out.println("Constraint violated"); //TODO need to handle this exception
        }
    }
}
