package org.levi.engine.persistence.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.exception.ConstraintViolationException;

import java.util.List;

/**
 *
 * Save, Update and Delete Hibernate Objects
 *
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
            System.out.println(e);
        }
    }

    public Object getObject(Class hibCls, String id) {
        session.close();
        session = SessionFactoryUtil.getSession();
        return session.get(hibCls, id);
    }

    public Object remove(Class hibCls, String id) {
        Transaction tx = session.beginTransaction();
        Object obj = session.get(hibCls, id);
        session.delete(obj);
        tx.commit();
        session.flush();
        return obj;
    }

    public void update(HObject hobj) {
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(hobj);
        tx.commit();
        session.flush();
    }

    public void close() {
        session.close();
    }
}
