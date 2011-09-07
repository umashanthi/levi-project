<%@ page import="org.levi.web.troubleticket.Constants" %>
<%@ page import="org.levi.engine.ProcessEngine" %>
<%@ page import="org.levi.engine.persistence.hibernate.process.hobj.TaskBean" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="org.levi.engine.utils.LeviUtils" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>New Loan Application</title>
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
                    <li class="active"><a href="tasks?assigned=true"><span>My Tasks</span></a></li>
                    <li><a href="tasks?assigned=false"><span>Unassigned Tasks</span></a></li>
                    <% if (session.getAttribute("usergroup") != null && (session.getAttribute("usergroup").equals(Constants.GROUP_LO) || session.getAttribute("usergroup").equals(Constants.GROUP_MN))) {
                    %>
                    <li><a href="listProcesses?type=active"><span>Active Applications</span></a></li>
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
                </div>
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
                <% if (request.getParameter("create") != null && request.getParameter("create").equals("success")) { %>
                <h3><font color="maroon"> Loan Application Success!</font></h3> <%} %>
                <div class="article">
                    <form action="startProcess?id=<%=session.getAttribute("appId").toString()%>&action=Start"
                          method="post"
                          id="create_new_issue">
                        <ol>
                            <li>
                                <label for="applicationID">Application ID</label>
                                <input id="applicationID" name="applicationID" class="text"/>
                            </li>
                            <li>
                                <label for="title">Title</label>
                                <select name="title" id="title">
                                    <option value="Mr">Mr.</option>
                                    <option value="Mrs">Mrs.</option>
                                    <option value="Ms">Ms.</option>
                                    <option value="Rev">Rev.</option>
                                </select>
                            </li>
                            <li>
                                <label for="firstName">First Name</label>
                                <input id="firstName" name="firstName" class="text"/>
                            </li>
                            <li>
                                <label for="lastName">Last Name</label>
                                <input id="lastName" name="lastName" class="text"/>
                            </li>
                            <li>
                                <label for="mobile">Mobile Number</label>
                                <input id="mobile" name="mobile" class="text"/>
                            </li>
                            <li>
                                <label for="landline">Home Number</label>
                                <input id="landline" name="landline" class="text"/>
                            </li>
                            <li>
                                <label for="email">Email</label>
                                <input id="email" name="email" class="text"/>
                            </li>
                            <li>
                                <label for="address">Address</label>
                                <textarea id="address" name="address" rows="8" cols="50"></textarea>
                                <input type="hidden" id="customerRepEmail" name="customerRepEmail"
                                       value="<%=session.getAttribute("username").toString()%>">
                            </li>
                            <li>
                                <label for="loantype">Loan Type</label>
                                <select name="loantype" id="loantype">
                                    <option value="Housing">Housing</option>
                                    <option value="Vehicle">Vehicle</option>
                                    <option value="Education">Education</option>
                                    <option value="Other">Other</option>
                                </select>
                            </li>
                            <li>
                                <label for="amount">Loan Amount</label>
                                <input id="amount" name="amount" class="text"/>
                            </li>
                            <li>
                                <label for="nic">NIC Number</label>
                                <input id="nic" name="nic" class="text"/>
                            </li>
                            <li>
                                <p></p>
                                <input type="submit" value="Submit Application"/>
                            </li>
                        </ol>
                    </form>
                </div>
            </div>

            <div class="clr"></div>
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
