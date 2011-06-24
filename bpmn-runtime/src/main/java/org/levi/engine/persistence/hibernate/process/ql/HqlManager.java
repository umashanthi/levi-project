package org.levi.engine.persistence.hibernate.process.ql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.type.Type;
import org.levi.engine.persistence.hibernate.SessionFactoryUtil;

import java.sql.Types;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: eranda
 * Date: Jun 20, 2011
 * Time: 11:07:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class HqlManager {

    Session session;

    public HqlManager(){
        session = SessionFactoryUtil.getSession();
    }

    public String[] getAssignedTasks(String userId){
        Query q = session.createQuery("");
        String[] types =  q.getReturnAliases();
        for(String s : types){
            System.out.println(s);
        }
        return types;
    }
}
