<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.levi.engine.ProcessEngine" %>
<%@ page import="java.io.File" %>
<%@ page import="org.apache.commons.io.FileUtils" %>
<%@ page import="org.levi.engine.Deployment" %>
<%@ page import="org.levi.engine.persistence.hibernate.process.hobj.DeploymentBean" %>
<%@ page import="org.levi.engine.persistence.hibernate.user.hobj.UserBean" %>
<%@ page import="org.levi.engine.persistence.hibernate.user.hobj.GroupBean" %>
<%@ page import="org.levi.engine.db.DBManager" %>


<%--
  Created by IntelliJ IDEA.
  UserBean: umashanthi
  Date: Mar 29, 2011
  Time: 9:55:15 AM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name : Premium Series
Description: A three-column, fixed-width blog design.
Version : 1.0
Released : 20090303

-->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <title>Levi - The Native BPMN2.0 Execution Engine</title>
    <meta name="keywords" content=""/>
    <meta name="Premium Series" content=""/>
    <link href="default.css" rel="stylesheet" type="text/css" media="screen"/>

</head>

<body>

<script type="text/javascript">

</script>
<!-- start header -->
<div id="header">
    <div id="logo">
        <h1><a href="#"><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;&nbsp;</a></h1>

        <p>The native bpmn2.0 execution engine</p>
    </div>
    <div id="menu">
        <ul id="main">
            <li class="current_page_item"><a href="index.jsp">Home</a></li>
            <li><a href="tasks">Tasks</a></li>
            <li><a href="processes">Processes</a></li>
            <%if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true") && session.getAttribute("username").equals("admin")) {%>
            <li><a href="usrmng">User Management</a></li>
            <%} %>
            <li></li>
            <li>
                <% if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true")) {%>
                <a href="logout">Logout</a></li>

            <%} else { %>
            <a href="login.jsp">Login</a></li>
            <% }%>


        </ul>

    </div>

</div>
<!-- end header -->
<div id="body">
    <% Object isLogged = session.getAttribute("logged");
        if (isLogged != null && isLogged.toString().equals("true")) { %>
    <h3><a href="usrmng"> User Management </a> > Edit User</h3>

    <form name="updateUser" action="usrmng?action=updateUser" method="POST">
        <%
            assert request.getSession().getAttribute("dbManager") != null;
            DBManager dbManager = (DBManager) request.getSession().getAttribute("dbManager");
            UserBean userBean = (UserBean) request.getAttribute("user");
            // retrieve the user's group1 names
            List<String> userGroupList = new ArrayList<String>();
<<<<<<< HEAD
            if(userBean.getUserGroups()!=null){
            for (GroupBean group1 : userBean.getUserGroups()) {
                userGroupList.add(group1.getGroupName());
            }
=======
            if (userBean.getUserGroups() != null) {
                for (GroupBean group : userBean.getUserGroups()) {
                    userGroupList.add(group.getGroupName());
                }
>>>>>>> 9f59a8dc0f93172164182ea48f22f99283eaf915
            }
            List<GroupBean> groupBeanList = dbManager.getGroupList();
        %>
        <table border="0" width="60%" cellpadding="5" cellspacing="0">
            <tr>
                <td>User Name:</td>
                <td><input type="text" name="username" size="30" value="<%=userBean.getUserId()%>"/></td>
            </tr>
            <tr>
                <td>Password :</td>
                <td><input type="password" name="password" size="30" value="<%=userBean.getPassword()%>"/></td>
            </tr>
            <tr>
                <td colspan="2">Select Groups :</td>
            </tr>
            <% for(GroupBean grp:groupBeanList){ %>
            <tr>
                <td>
                    <input type="checkbox" name="<%=grp.getGroupId()%>" <% if (userGroupList.contains(grp.getGroupId())) {%>
                           checked="true" <%}%>/><%=grp.getGroupName()%>
                </td>
                <td>
                    <input type="radio" name="<%=grp.getGroupId()%>-group-role"> Admin
                    <input type="radio" name="<%=grp.getGroupId()%>-group-role"> User
                </td>
            </tr>
            <%} %>

            <tr>
                <td><input type="submit" value="Edit User"/></td>
                <td><input type="reset" value="Cancel"/></td>
            </tr>
        </table>
    </form>
    <p>&nbsp;</p>

    <% } else { %>
    <div id="bodylogo"></div>

    <%}%>
</div>
<div id="footer">
    <p class="copyright">&copy;&nbsp;&nbsp;2011 All Rights Reserved &nbsp;&bull;&nbsp; Design by <a
            href="http://www.freecsstemplates.org/">Free CSS Templates</a>.</p>

    <p class="link"><a href="#">Privacy Policy</a>&nbsp;&#8226;&nbsp;<a href="#">Terms of Use</a>
    </p>
</div>

</body>
</html>
