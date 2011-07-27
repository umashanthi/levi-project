<%@ page import="org.levi.engine.persistence.hibernate.user.hobj.GroupBean" %>
<%@ page import="org.levi.engine.persistence.hibernate.user.hobj.UserBean" %>
<%@ page import="java.util.List" %>


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
    <h2>Users</h2>

    <p>
        &nbsp;&nbsp;<a href="adduser.jsp"><b>Add User</b></a>
    </p>
    <table border="0" width="50%" cellpadding="10" cellspacing="0">
        <tr>
            <th>User Name</th>
            <th>Group</th>
            <th></th>
        </tr>
        <% List<UserBean> userBeanList = (List<UserBean>) request.getAttribute("usersList");
            for (UserBean userBean : userBeanList) {
                String userGroups = "";
                for (GroupBean group1 : userBean.getUserGroups()) {
                    userGroups += group1.getGroupName() + " , ";
                }
                userGroups = userGroups.substring(0, userGroups.length() - 1);
                session.getAttribute("userGroupList")
        %>
        <tr>
            <td><%=userBean.getUserId()%>
            </td>
            <td><%=userGroups%>
            </td>
            <td><a href="usrmng?action=editUser&username=<%=userBean.getUserId()%>">Edit</a></td>
        </tr>
        <%}%>
    </table>
    <p>&nbsp;</p>

    <p>&nbsp;</p>

    <h2>Groups</h2>

    <p>
        &nbsp;&nbsp;<a href="addgroup.jsp"><b>Add Group</b></a>
    </p>
    <table border="0" width="50%" cellpadding="10" cellspacing="0">
        <tr>
            <th>Group Name</th>
            <th>Description</th>
        </tr>
        <% List<GroupBean> groupBeanList = (List<GroupBean>) request.getAttribute("groupList");
            for (GroupBean groupBean : groupBeanList) {
        %>
        <tr>
            <td><%=groupBean.getGroupName()%>
            </td>
            <td><%=groupBean.getGroupDescription()%>
            </td>
        </tr>
        <%}%>
    </table>
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
