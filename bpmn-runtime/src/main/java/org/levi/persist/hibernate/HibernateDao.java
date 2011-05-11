package org.levi.persist.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
    private SessionFactory sessionFactory;


    public HibernateDao(HObject hobj){
        this._hobj=hobj;
        sessionFactory = SessionFactoryUtil.getInstance();
    }


    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public HObject getHibernateObj(){
        return _hobj;
    }

    public void update(){
        sessionFactory.getCurrentSession().update(_hobj);
    }
}
