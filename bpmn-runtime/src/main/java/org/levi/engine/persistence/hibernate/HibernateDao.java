package org.levi.engine.persistence.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * UserBean: eranda
 * Date: May 10, 2011
 * Time: 8:31:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class HibernateDao {

    Session session;

    public HibernateDao() {
        session = SessionFactoryUtil.getSession();
    }

    public Session getSession() {
        return session;
    }

    public void save(HObject hobj) {
        try {
            Transaction tx = session.beginTransaction();
            session.save(hobj);
            tx.commit();
            session.flush();
        } catch (ConstraintViolationException e) {
            System.out.println("[error] Constrained violated");
        }
    }

    public Object getObject(Class hibCls, String id) {
        Transaction tx = session.beginTransaction();
        Object obj = session.get(hibCls, id);
        tx.commit();
        return obj;
    }

    public Object remove(Class hibCls, String id) {
        Transaction tx = session.beginTransaction();
        Object obj = session.get(hibCls, id);
        session.delete(obj);
        tx.commit();
        return obj;
    }

    public void update(HObject hobj) {
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(hobj);
        tx.commit();
    }

    public void close() {
        session.close();
    }


}
