package org.levi.persistance;

import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.user.hobj.GroupDaoImpl;
import org.levi.engine.persistence.hibernate.user.hobj.UserDaoImpl;

/**
 * Created by IntelliJ IDEA.
 * UserDaoImpl: eranda
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

        HibernateDao dao = new HibernateDao();

        UserDaoImpl user1 = new UserDaoImpl();
        user1.setUserId("1");
        user1.setFirstName("eranda");
        user1.setLastName("sooriyabandara");
        user1.setPassword("password");
        user1.setUserEmail("emahesh143@gmail.com");

        UserDaoImpl user2 = new UserDaoImpl();
        user2.setUserId("2");
        user2.setFirstName("eranda");
        user2.setLastName("sooriyabandara");
        user2.setPassword("password");
        user2.setUserEmail("emahesh143@gmail.com");

        UserDaoImpl user3 = new UserDaoImpl();
        user3.setUserId("3");
        user3.setFirstName("eranda");
        user3.setLastName("sooriyabandara");
        user3.setPassword("password");
        user3.setUserEmail("emahesh143@gmail.com");

        dao.save(user1);
        dao.save(user2);
        dao.save(user3);

        GroupDaoImpl group = new GroupDaoImpl();
        group.setGroupId("2");
        group.setGroupName("Mora");
        group.setGroupDescription("fun group");

        group.getMembers().add(user1);
        group.getMembers().add(user2);
        group.getMembers().add(user3);

        dao.save(group);

        dao.close();
    }
}
