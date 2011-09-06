package org.levi.web.troubleticket;

import org.levi.engine.ProcessEngine;
import org.levi.engine.db.DBManager;
import org.levi.engine.identity.Group;
import org.levi.engine.identity.User;
import org.levi.engine.impl.ProcessEngineImpl;
import org.levi.engine.impl.db.DBManagerImpl;
import org.levi.engine.impl.identity.GroupImpl;
import org.levi.engine.impl.identity.UserImpl;
import org.levi.engine.persistence.hibernate.user.hobj.GroupBean;
import org.levi.engine.persistence.hibernate.user.hobj.UserBean;
import org.levi.engine.utils.LeviUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: umashanthi
 * Date: 9/2/11
 * Time: 8:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class TTLoginServlet extends HttpServlet {
    private DBManager dbManager = new DBManagerImpl();
    private String appId = "";

    protected void doPost(javax.servlet.http.HttpServletRequest request,
                          javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // Retrieve appID
        String referer = request.getRequestURI();
        appId = Constants.getAppId(referer);
        session.setAttribute("appId", appId);
        if (!allowUser(username, password)) {
            response.sendRedirect("login.jsp?isLoginSuccess=false");
        } else {
            // Valid login. Make a note in the session object.

            session.setAttribute("username", username);
            session.setAttribute("logged", "true");

            // Start Engine
            ProcessEngine engine = ProcessEngineImpl.getProcessEngine();
            request.getSession().setAttribute("processEngine", engine);

            request.getSession().setAttribute("dbManager", dbManager);
            UserBean loggedUser = dbManager.getUser(username);
            String usergroup = loggedUser.getUserGroups().get(0).getGroupId();
            session.setAttribute("usergroup", usergroup);
            response.sendRedirect("tasks?assigned=true");
        }

    }

    private boolean allowUser(String username, String password) {
        initializeUsers(appId);
        boolean validUser = false;
        UserBean loggedUser = dbManager.getUser(username);
        if (loggedUser != null && loggedUser.getPassword().equals(password.trim())) {
            validUser = true;
        }
        return validUser;
    }

    private void initializeUsers(String appName) {
        User user = new UserImpl();
        List<Group> userGroups = LeviUtils.newArrayList();
        Group group = new GroupImpl();
        if (Constants.APPID_TT.equals(appName.trim())) {
            if (dbManager.getGroup("AccountManagers") == null) {

                group.setGroupId("AccountManagers");
                group.setGroupName("AccountManagers");
                group.setGroupDescription("Handles AccountManagers functions");
                dbManager.saveGroup(group);
            }
            if (dbManager.getUser("am") == null) {
                user.setUserId("am");
                user.setPassword("am");
                userGroups = LeviUtils.newArrayList();
                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
            if (dbManager.getGroup("CustomerSupportAgents") == null) {
                group.setGroupId("CustomerSupportAgents");
                group.setGroupName("CustomerSupportAgents");
                group.setGroupDescription("Handles CustomerSupportAgents functions");
                dbManager.saveGroup(group);
            }
            if (dbManager.getUser("cs") == null) {
                user.setUserId("cs");
                user.setPassword("cs");
                userGroups = LeviUtils.newArrayList();
                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
            if (dbManager.getGroup("QualityAssurance") == null) {
                group.setGroupId("QualityAssurance");
                group.setGroupName("QualityAssurance");
                group.setGroupDescription("Handles QualityAssurance functions");
                dbManager.saveGroup(group);
            }
            if (dbManager.getUser("qa") == null) {
                user.setUserId("qa");
                user.setPassword("qa");
                userGroups = LeviUtils.newArrayList();
                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
            if (dbManager.getGroup("Developers") == null) {
                group.setGroupId("Developers");
                group.setGroupName("Developers");
                group.setGroupDescription("Handles Developers functions");
                dbManager.saveGroup(group);
            }
            if (dbManager.getUser("dev") == null) {
                user.setUserId("dev");
                user.setPassword("dev");
                userGroups = LeviUtils.newArrayList();
                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
        } else if (Constants.APPID_LOAN.equals(appName.trim())) {
            if (dbManager.getGroup("LoanOfficers") == null) {
                group.setGroupId("LoanOfficers");
                group.setGroupName("LoanOfficers");
                group.setGroupDescription("Handles Loan applications");
                dbManager.saveGroup(group);
            }
            if (dbManager.getUser("lo") == null) {
                user.setUserId("lo");
                user.setPassword("lo");
                userGroups = LeviUtils.newArrayList();
                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
            if (dbManager.getGroup("CustomerRepresentatives") == null) {
                group.setGroupId("CustomerRepresentatives");
                group.setGroupName("CustomerRepresentatives");
                group.setGroupDescription("CustomerRepresentatives who provide customer service");
                dbManager.saveGroup(group);
            }
            if (dbManager.getUser("cr") == null) {
                user.setUserId("cr");
                user.setPassword("cr");
                userGroups = LeviUtils.newArrayList();
                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }
            if (dbManager.getGroup("Managers") == null) {
                group.setGroupId("Managers");
                group.setGroupName("Managers");
                group.setGroupDescription("Managers of the bank");
                dbManager.saveGroup(group);
            }
            if (dbManager.getUser("manager") == null) {
                user.setUserId("manager");
                user.setPassword("manager");
                userGroups = LeviUtils.newArrayList();
                userGroups.add(group);
                user.setUserGroups(userGroups);
                dbManager.saveUser(user);
            }

        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request,
                         javax.servlet.http.HttpServletResponse response)
            throws javax.servlet.ServletException, IOException {

    }
}
