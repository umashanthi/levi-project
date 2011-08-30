package org.levi.persistance;

import org.levi.engine.persistence.hibernate.HibernateDao;
import org.levi.engine.persistence.hibernate.SessionFactoryUtil;
import org.levi.engine.persistence.hibernate.process.hobj.DeploymentBean;
import org.levi.engine.persistence.hibernate.process.hobj.EngineDataBean;
import org.levi.engine.persistence.hibernate.process.hobj.ProcessInstanceBean;
import org.levi.engine.persistence.hibernate.process.hobj.TaskBean;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;

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
        group2.setGroupName("Pera");
        group2.setGroupDescription("fun group2");

        group2.getMembers().add(user1);
        group2.getMembers().add(user2);
        group2.getMembers().add(user3);

        dao.save(group2);

        DeploymentBean deployment = new DeploymentBean();
        deployment.setDefinitionsId("d1");
        deployment.setDeployedUser(user1);

        dao.save(deployment);

        TaskBean task1 = new TaskBean();
        task1.setTaskId("task1");
        task1.getProperties().put("p1","value1");
        task1.getProperties().put("p2","value2");
        task1.getProperties().put("p3","value3");

        dao.save(task1);

        TaskBean task2 = new TaskBean();
        task2.setTaskId("task2");
        task2.getProperties().put("p1","value1");
        task2.getProperties().put("p2","value2");
        task2.getProperties().put("p3","value3");

        dao.save(task2);

        ProcessInstanceBean instance1 = new ProcessInstanceBean();
        instance1.setProcessId("p1");
        instance1.setDeployedProcess(deployment);
        instance1.getRunningTasks().put(task1.getTaskId(),task1);
        instance1.getCompletedTasks().put(task2.getTaskId(),task2);
        instance1.getVariables().put("v1","value1");
        instance1.getVariables().put("v2","value2");
        instance1.setRunning(true);

        dao.save(instance1);

        TaskBean task3 = new TaskBean();
        task3.setTaskId("task3");
        task3.getProperties().put("p1","value1");
        task3.getProperties().put("p2","value2");
        task3.getProperties().put("p3","value3");

        dao.save(task3);

        TaskBean task4 = new TaskBean();
        task4.setTaskId("task4");
        task4.getProperties().put("p1","value1");
        task4.getProperties().put("p2","value2");
        task4.getProperties().put("p3","value3");

        dao.save(task4);

        ProcessInstanceBean instance2 = new ProcessInstanceBean();
        instance2.setProcessId("p2");
        instance2.setDeployedProcess(deployment);
        instance2.getRunningTasks().put(task3.getTaskId(),task3);
        instance2.getCompletedTasks().put(task4.getTaskId(),task4);
        instance2.getVariables().put("v1","value1");
        instance2.getVariables().put("v2","value2");
        instance2.setRunning(false);

        dao.save(instance2);

        TaskBean task5 = new TaskBean();
        task5.setTaskId("task5");
        task5.getProperties().put("p1","value1");
        task5.getProperties().put("p2","value2");
        task5.getProperties().put("p3","value3");

        dao.save(task5);

        TaskBean task6 = new TaskBean();
        task6.setTaskId("task6");
        task6.getProperties().put("p1","value1");
        task6.getProperties().put("p2","value2");
        task6.getProperties().put("p3","value3");

        dao.save(task6);

        ProcessInstanceBean instance3 = new ProcessInstanceBean();
        instance3.setProcessId("p3");
        instance3.setDeployedProcess(deployment);
        instance3.getRunningTasks().put(task5.getTaskId(),task5);
        instance3.getCompletedTasks().put(task6.getTaskId(),task6);
        instance3.getVariables().put("v1","value1");
        instance3.getVariables().put("v2","value2");
        instance3.setRunning(false);

        dao.save(instance3);

        EngineDataBean engine = new EngineDataBean();
        engine.setId("engine");
        engine.getDeployedProcesses().put(deployment.getDefinitionsId(), deployment);
        engine.getRunningProcesses().put(instance1.getProcessId(),instance1);
        engine.getStoppedProcesses().put(instance2.getProcessId(),instance2);
        engine.getPausedProcesses().put(instance3.getProcessId(),instance3);

        dao.save(engine);

        dao.close();

    }
}
