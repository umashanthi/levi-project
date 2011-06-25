package org.levi.persistance;


import org.levi.engine.impl.db.DBManagerImpl;
import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.SessionFactoryUtil;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.persistence.hibernate.process.ql.HqlManager;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * UserBean: eranda
 * Date: May 10, 2011
 * Time: 10:48:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class PersistTest {


    public static void main(String[] args) {
        PersistTest pt = new PersistTest();
        pt.start();
    }

    public void start() {
        SessionFactoryUtil.exportSchema();
        HibernateDao dao = new HibernateDao();

        UserBean user1 = new UserBean();
        user1.setUserId("1");
        user1.setFirstName("eranda1");
        user1.setLastName("sooriyabandara");
        user1.setPassword("password");
        user1.setUserEmail("emahesh143@gmail.com");

        UserBean user2 = new UserBean();
        user2.setUserId("2");
        user2.setFirstName("eranda2");
        user2.setLastName("sooriyabandara");
        user2.setPassword("password");
        user2.setUserEmail("emahesh143@gmail.com");

        UserBean user3 = new UserBean();
        user3.setUserId("3");
        user3.setFirstName("eranda3");
        user3.setLastName("sooriyabandara");
        user3.setPassword("password");
        user3.setUserEmail("emahesh143@gmail.com");

        dao.save(user1);
        dao.save(user2);
        dao.save(user3);

        GroupBean group1 = new GroupBean();
        group1.setGroupId("1");
        group1.setGroupName("Mora");
        group1.setGroupDescription("fun group1");

        group1.getMembers().add(user1);
        group1.getMembers().add(user2);
        group1.getMembers().add(user3);

        dao.save(group1);

        GroupBean group2 = new GroupBean();
        group2.setGroupId("2");
        group2.setGroupName("Mora");
        group2.setGroupDescription("fun group2");

        group2.getMembers().add(user1);
        group2.getMembers().add(user2);
        group2.getMembers().add(user3);

        dao.save(group2);

        TaskBean task1 = new TaskBean();
        task1.setId("task1");

        dao.save(task1);

        TaskBean task2 = new TaskBean();
        task2.setId("task2");

        dao.save(task2);

        DBManagerImpl manager = new DBManagerImpl();
        manager.assignTask("task1","1");
        manager.assignTask("task2","1");

        List<TaskBean> tasks = dao.getAssignedTasks("1");
        Iterator<TaskBean> itr = tasks.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next().getId());
        }

        manager.unassignTask("task1","1");
        manager.removeTask("task1", "1");


        List<UserBean> list = dao.getUserObjects();

        Iterator<UserBean> i = list.iterator();

        while(i.hasNext()){
            System.out.println(i.next().getFirstName());
        }

        /*
        DeploymentBean deploymentBean = new DeploymentBean();
        deploymentBean.setDefinitionsId("ssd");
        EngineDataBean engineDataBean = new EngineDataBean();
        engineDataBean.setId("1");
        engineDataBean.set_dateCreated(new Date());
        engineDataBean.addDeployment(deploymentBean);
        dao.save(deploymentBean);
        dao.save(engineDataBean);
                                                */


        //EngineDataBean enginedata = (EngineDataBean)dao.getObject(EngineDataBean.class, "1");
        //System.out.println(enginedata.getId());
        //System.out.println(enginedata.getDeployedProcesses().get("ssd").getDefinitionsId());

        dao.close();

        HqlManager mgr= new HqlManager();
        mgr.getUserObjects();

        Iterator<UserBean> iu =  mgr.getUserObjects().iterator();

        while(iu.hasNext()){
            System.out.println(iu.next().getFirstName());
        }

        Iterator<GroupBean> ig =  mgr.getGroupObjects().iterator();

        while(ig.hasNext()){
            System.out.println(ig.next().getGroupName());
        }


    }
}
