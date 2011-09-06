<%@ page import="org.levi.web.troubleticket.Constants" %>
<%@ page import="org.levi.engine.ProcessEngine" %>
<%@ page import="org.levi.engine.persistence.hibernate.process.hobj.TaskBean" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="org.levi.engine.utils.LeviUtils" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Active Loan Applications</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="css/coin-slider.css"/>
    <link rel="stylesheet" type="text/css" href="css/table.css"/>
    <script type="text/javascript" src="js/cufon-yui.js"></script>
    <script type="text/javascript" src="js/cufon-aller.js"></script>
    <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <script type="text/javascript" src="js/coin-slider.min.js"></script>
</head>
<body>
<% if (session.getAttribute("logged") != null && session.getAttribute("logged").equals("true")) {%>
<div class="main">
    <div class="header">
        <div class="header_resize">
            <div class="logo">
                <h1><a href="index.html">CR&FC <span>Bank</span>
                    <small></small>
                </a></h1>
            </div>
            <div class="menu_nav">
                <ul>
                    <li><a href="tasks?assigned=true"><span>My Tasks</span></a></li>
                    <li><a href="tasks?assigned=false"><span>Unassigned Tasks</span></a></li>
                    <% if (session.getAttribute("usergroup") != null && (session.getAttribute("usergroup").equals(Constants.GROUP_LO) || session.getAttribute("usergroup").equals(Constants.GROUP_MN))) {
                    %>
                    <li class="active"><a href="listProcesses?type=active"><span>Active Applications</span></a></li>
                    <li><a href="listProcesses?type=completed"><span>Completed Applications</span></a></li>
                    <%} %>
                    <li><a href="applyloan.jsp"><span>Apply for Loan</span></a></li>
                    <% if (session.getAttribute("usergroup") != null && (session.getAttribute("usergroup").equals(Constants.GROUP_CR))) {
                    %>
                    <li><a href="inbox.jsp"><span>Inbox</span></a></li>
                    <%} %>
                </ul>
            </div>
            <div class="clr"></div>
            <div class="slider">
                <div class="logged">Logged in as <%=session.getAttribute("username").toString()%>
                    of <%=session.getAttribute("usergroup").toString()%> Group | <a href="logout">Logout</a></div>
                <div id="coin-slider"><a href="#"><img src="images/slide1.jpg" width="960" height="320" alt=""/> </a> <a
                        href="#"><img src="images/slide2.jpg" width="960" height="320" alt=""/> </a> <a href="#"><img
                        src="images/slide3.jpg" width="960" height="320" alt=""/> </a></div>
                <div class="clr"></div>
            </div>
            <div class="clr"></div>
        </div>
    </div>
    <div class="content">
        <div class="content_resize">
            <div class="mainbar">
                <div class="article">
                    <h2><span>Active Applications</span></h2>

                    <div class="clr"></div>
                    <% String loggedUser = session.getAttribute("username").toString();
                        Map<String, TaskBean> runningProcessesList = (Map<String, TaskBean>) request.getSession().getAttribute("runningProcessesList");
                        ProcessEngine engine = (ProcessEngine) request.getSession().getAttribute("processEngine");

                        if (runningProcessesList.size() > 0) {
                    %>
                    <table class="hovertable">
                        <tr>
                            <th>Application ID</th>
                            <th>Customer</th>
                            <th>Task Name</th>
                            <th>Task Description</th>
                            <th>Task Assignee</th>
                            <th>Assigned Group</th>
                        </tr>
                        <%
                            for (String processInsId : runningProcessesList.keySet()) {
                                Map<String, Object> processVariables = engine.getVariables(LeviUtils.getNotTaskId(processInsId));
                        %>
                        <tr onmouseover="this.style.backgroundColor='#e8e8e8';"
                            onmouseout="this.style.backgroundColor='#ffffff';">
                            <td><%=(processVariables.get("applicationID") != null) ? processVariables.get("applicationID").toString() : "n/a"%>
                            </td>
                            <td>
                                <%
                                    String customerName = processVariables.get("title") + "." + processVariables.get("firstName") + " " + processVariables.get("lastName");%>
                                <%=(customerName != null) ? customerName : "n/a"%>
                            </td>
                            <td><%=(runningProcessesList.get(processInsId).getTaskName() != null) ? runningProcessesList.get(processInsId).getTaskName() : "n/a"%>
                            </td>
                            <td><%=(runningProcessesList.get(processInsId).getTaskDescription() != null) ? runningProcessesList.get(processInsId).getTaskDescription() : "n/a"%>
                            </td>
                            <td><%=(runningProcessesList.get(processInsId).getAssignee() != null) ? runningProcessesList.get(processInsId).getAssignee() : "n/a"%>
                            </td>
                            <td><%=(runningProcessesList.get(processInsId).getPotentialGroup().getGroupId() != null) ? runningProcessesList.get(processInsId).getPotentialGroup().getGroupId() : "n/a"%>
                            </td>
                        </tr>
                        <% } %>
                    </table>
                    <%} else {%>
                    <ul class="sb_menu">
                        <li><strong>No active applications available</strong></li>
                    </ul>
                    <% }%>
                </div>
            </div>
            <div class="clr"></div>
        </div>


        <div class="footer">
            <div class="footer_resize">
                <p class="lf">&copy; Powered By <a href="http://projectlevi.weebly.com/">Levi</a>.</p>

                <p class="rf">|<a href="#">Privacy Policy</a> | <a href="#">Community Guidelines</a> | <a href="#">Terms
                    of
                    Service</a> | <a href="#">Documentation</a></p>

                <div style="clear:both;"></div>
            </div>
        </div>
    </div>
</div>
<%
    } else {
        response.sendRedirect("login.jsp?error=not-logged");
    }
%>
</body>
</html>
