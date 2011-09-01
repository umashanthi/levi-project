package org.levi.samples.engine;

import org.levi.engine.ProcessEngine;
import org.levi.engine.db.DBManager;
import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.impl.ProcessEngineImpl;
import org.levi.engine.impl.db.DBManagerImpl;
import org.levi.engine.impl.identity.GroupImpl;
import org.levi.engine.impl.identity.UserImpl;
import org.levi.engine.utils.LeviUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Ishan Jayawardena
 */
public class Main {
    public static void createDb() {
        String username = "admin";
        String password = "admin";
        DBManager dbManager = new DBManagerImpl();
                      Group group = new GroupImpl();
            group.setGroupId("Administration");
            group.setGroupName("Administration");
            group.setGroupDescription("Handles administrative functions");
            dbManager.saveGroup(group);

            User user = new UserImpl();
            List<Group> userGroups = new ArrayList<Group>();
            if (dbManager.getUser(username) == null) {
                user.setUserId(username);
                user.setPassword(password);

                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
            if (dbManager.getUser("admin") == null) {
                user = new UserImpl();
                user.setUserId("admin");
                user.setPassword("admin");
                userGroups = new ArrayList<Group>();
                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
            if (dbManager.getUser("john") == null) {
                user = new UserImpl();
                user.setUserId("john");
                user.setPassword("john");
                userGroups = new ArrayList<Group>();
                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ProcessEngine engine = ProcessEngineImpl.getProcessEngine();
        Main.createDb();
        engine.deploy("/home/ishan/devel/levi/bpmnsamples/troubleTicket.lar");
        //engine.deploy("/home/ishan/Desktop/bpmnsamples/HelloWorldScriptTask.lar");
        //engine.deploy(Constants.LAR_PATH + "book_fig61.lar"); // ProduceAdvertisement
        //engine.deploy(Constants.LAR_PATH + "book_fig49.1.lar"); // Process:Figure-49
        //engine.deploy(Constants.LAR_PATH + "book_fig49.1modified.lar");
        //engine.deploy(Constants.LAR_PATH + "book_fig49.1modified2.lar");
        //Map<String, Object> variables = LeviUtils.newHashMap(1);
        //variables.put("i", 0);
        //long startTime = System.currentTimeMillis();
        //engine.startProcess("test0001", variables, "admin");      // "ProduceAdvertisement"
        //long endTime = System.currentTimeMillis();
        //System.out.println("Time Elapsed: " + (endTime - startTime));
        //engine.undeploy("ExclusiveGatewayTest1");

        //ScriptTaskTest test = new ScriptTaskTest();
        //test.helloWorld();
        //test.scriptWithVariables();
        //engine.undeployAll();
        // todo do clean the dirs after catching an exception
        //ConditionExpressionTest test = new ConditionExpressionTest();
        //test.exclusiveGatewayWithDefaultSeqFlow();
    }
}
