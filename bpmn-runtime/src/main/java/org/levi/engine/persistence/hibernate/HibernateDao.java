package org.levi.engine.persistence.hibernate;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
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

    public HibernateDao() {
    }

    public void save(HObject hobj) {
        Session session = SessionFactoryUtil.getSession();
        try {
            Transaction tx = session.beginTransaction();
            session.save(hobj);
            tx.commit();
            session.flush();
        } catch (ConstraintViolationException e) {
            System.out.println("[error] Constrained violated");
        }
        session.close();
    }

    public Object getObject(Class hibCls, String id) {
        Session session = SessionFactoryUtil.getSession();
        Object obj = session.get(hibCls, id);
        session.close();
        return obj;
    }

    public Object remove(Class hibCls, String id) {
        Session session = SessionFactoryUtil.getSession();
        Transaction tx = session.beginTransaction();
        Object obj = session.get(hibCls, id);
        session.delete(obj);
        tx.commit();
        session.close();
        return obj;
    }

    public void update(HObject hobj) {
        Session session = SessionFactoryUtil.getSession();
        Transaction tx = session.beginTransaction();
        session.saveOrUpdate(hobj);
        tx.commit();
        session.close();
    }

    public List<UserBean> getUserObjects() {
        Session session = SessionFactoryUtil.getSession();
        List objects = session.createCriteria(UserBean.class).list();
        session.close();
        return objects;
    }

    public List<GroupBean> getGroupObjects() {
        Session session = SessionFactoryUtil.getSession();
        List<GroupBean> groups = session.createCriteria(GroupBean.class).list();
        session.close();
        return groups;
    }

    public List<TaskBean> getAssignedTasks(String userId) {
        Session session = SessionFactoryUtil.getSession();
        Criteria criteria = session.createCriteria(TaskBean.class);
        criteria.add(Restrictions.eq("active", true));
        List<TaskBean> tasks=  criteria.list();
        session.close();
        return tasks;
    }

}
