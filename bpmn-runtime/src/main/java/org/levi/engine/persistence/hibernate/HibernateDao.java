package org.levi.engine.persistence.hibernate;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.ConstraintViolationException;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import java.util.List;


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

    public List<UserBean> getUserObjects() {
        List objects = session.createCriteria(UserBean.class).list();
        return objects;
    }

    public List<GroupBean> getGroupObjects() {
        List objects = session.createCriteria(GroupBean.class).list();
        return objects;
    }

    public void close() {
        session.close();
    }

    public List<TaskBean> getAssignedTasks(String userId) {
        Criteria criteria = session.createCriteria(TaskBean.class);
        criteria.add(Restrictions.eq("active", true));
        return criteria.list();
    }


}
