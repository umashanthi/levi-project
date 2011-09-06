<%@ page import="org.levi.web.troubleticket.Constants" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>ShuffleBug | Support</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="css/coin-slider.css"/>
    <link rel="stylesheet" type="text/css" href="css/table.css" />
    <script type="text/javascript" src="js/cufon-yui.js"></script>
    <script type="text/javascript" src="js/cufon-times-700.js"></script>
    <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <script type="text/javascript" src="js/coin-slider.min.js"></script>
</head>
<body>
<% if (session.getAttribute("logged") != null && session.getAttribute("logged").equals("true")) {%>
<div class="main">
    <div class="header">
        <div class="header_resize">
            <div class="searchform">
            You are logged in as <%=session.getAttribute("username").toString()%> of <%=session.getAttribute("usergroup").toString()%>
             <a href="logout">Logout</a>
            </div>
            <div class="logo">
                <img src="images/<%=session.getAttribute("usergroup").toString()%>.jpg"/>
            </div>
            <div class="clr"></div>
            <div class="menu_nav">
                <ul>
                    <li><a href="tasks?assigned=true"><span>My Issues</span></a></li>
                    <li><a href="tasks?assigned=false"><span>Unassigned Issues</span></a></li>
                    <% if (session.getAttribute("usergroup") != null && session.getAttribute("usergroup").equals(Constants.GROUP_AM)) {
                    %>
                    <li><a href="listProcesses?type=active"><span>Open Issues</span></a></li>
                    <li><a href="listProcesses?type=completed"><span>Closed Issues</span></a></li>
                    <li class="active"><a href="newissue.jsp"><span>Create New Issue</span></a></li>
                    <li><a href="inbox.jsp"><span>Inbox</span></a></li>
                    <%} %>
                </ul>
            </div>
            <div class="clr"></div>
            <div class="clr"></div>
        </div>
    </div>
    <div class="content">
        <div class="content_resize">
            <div class="mainbar">
                <% if (request.getParameter("create") != null && request.getParameter("create").equals("success")) { %>
                <h3><font color="maroon"> Issue created successfully!</font></h3> <%} %>
                <div class="article">
                    <form action="startProcess?id=<%=session.getAttribute("appId").toString()%>&action=Start" method="post"
                          id="create_new_issue">
                        <ol>
                            <li>
                                <label for="issueId">Issue ID</label>
                                <input id="issueId" name="issueId" class="text"/>
                            </li>
                            <li>
                                <label for="product">Product</label>
                                <select name="product" id="product">
                                    <option value="Axico">Axico</option>
                                    <option value="Miyaesi">Miyaesi</option>
                                    <option value="BubbleBoy">Bubble Boy</option>
                                    <option value="Siddhi">Siddhi</option>
                                    <option value="GViz">GViz</option>
                                </select>
                            </li>
                            <li>
                                <label for="issueType">Issue Type</label>
                                <select name="issueType" id="issueType">
                                    <option value="Bug">Bug</option>
                                    <option value="FeatureRequest">Feature Request</option>
                                    <option value="Improvement">Improvement</option>
                                    <option value="DocumentationRequest">Documentation Request</option>
                                </select>
                            </li>
                            <li>
                                <label for="priority">Priority</label>
                                <select name="priority" id="priority">
                                    <option value="Bug">Blocker</option>
                                    <option value="Critical">Critical</option>
                                    <option value="Major">Major</option>
                                    <option value="Minor">Minor</option>
                                    <option value="Trivial">Trivial</option>
                                </select>
                            </li>
                            <li>
                                <label for="summary">Summary</label>
                                <input id="summary" name="summary" class="text"/>
                            </li>
                            <li>
                                <label for="reporter">Reporter</label>
                                <input id="reporter" name="reporter" class="text"/>
                            </li>
                            <li>
                                <label for="description">Description</label>
                                <textarea id="description" name="description" rows="8" cols="50"></textarea>
                                <input type="hidden" id="recipient" name="recipient" value="<%=session.getAttribute("username").toString()%>" >
                            </li>
                            <li>
                                <p></p>
                                <input type="submit" value="Create Issue"/>
                            </li>
                        </ol>
                    </form>
                </div>
            </div>

            <div class="clr"></div>
        </div>
    </div>

    <div class="footer">
        <div class="footer_resize">
            <p class="lf">&copy; Powered By <a href="http://projectlevi.weebly.com/">Levi</a>.</p>

            <p class="rf">|<a href="#">Privacy Policy</a> | <a href="#">Community Guidelines</a> | <a href="#">Terms of
                Service</a> | <a href="#">Documentation</a></p>

            <div style="clear:both;"></div>
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
