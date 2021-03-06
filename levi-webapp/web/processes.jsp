<%@ page import="org.levi.engine.ProcessEngine" %>
<%@ page import="org.levi.engine.persistence.hibernate.process.hobj.DeploymentBean" %>
<%@ page import="java.util.List" %>
<%@ page import="org.levi.web.troubleticket.Constants" %>


<%--
  Created by IntelliJ IDEA.
  UserBean: umashanthi
  Date: Mar 29, 2011
  Time: 9:55:15 AM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

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

    var popbackground = "lightskyblue" //specify backcolor or background image for pop window
    var windowtitle = "Process Diagram"  //pop window title

    function detectexist(obj) {
        return (typeof obj != "undefined")
    }

    function jkpopimage(imgpath, popwidth, popheight, textdescription) {
        popwidth = document.body.clientWidth
        function getpos() {
            leftpos = (detectexist(window.screenLeft)) ? screenLeft + document.body.clientWidth / 2 - popwidth / 2 : detectexist(window.screenX) ? screenX + innerWidth / 2 - popwidth / 2 : 0
            toppos = (detectexist(window.screenTop)) ? screenTop + document.body.clientHeight / 2 - popheight / 2 : detectexist(window.screenY) ? screenY + innerHeight / 2 - popheight / 2 : 0
            if (window.opera) {
                leftpos -= screenLeft
                toppos -= screenTop
            }
        }

        getpos()
        var winattributes = 'width=' + popwidth + ',height=' + popheight + ',resizable=yes,left=' + leftpos + ',top=' + toppos
        var bodyattribute = (popbackground.indexOf(".") != -1) ? 'background="' + popbackground + '"' : 'bgcolor="' + popbackground + '"'
        if (typeof jkpopwin == "undefined" || jkpopwin.closed)
            jkpopwin = window.open("", "", winattributes)
        else {
            jkpopwin.resizeTo(popwidth, popheight + 30)
            jkpopwin.scrolling = true
        }
        jkpopwin.document.open()
        jkpopwin.document.write('<html><title>' + windowtitle + '</title><body ' + bodyattribute + '> <div align="center"> <img  align="middle" src="' + imgpath + '" style="margin-bottom: 0.5em"></div><br />' + textdescription + '</body></html>')
        jkpopwin.document.close()
        jkpopwin.focus()
    }


    function startProcess(id) {
        var processForm = document.createElement("form");
        processForm.method = "post";
        processForm.action = "startProcess?id=" + id + "&action=Start";
        processForm.submit();
    }
    function stopProcess(id) {
        var processForm = document.createElement("form");
        processForm.method = "post";
        processForm.action = "startProcess?id=" + id + "&action=Stop";
        processForm.submit();
    }

    function displayForm(processId) {
        popwidth = 600
        popheight = 600
        function getpos() {
            leftpos = (detectexist(window.screenLeft)) ? screenLeft + document.body.clientWidth / 2 - popwidth / 2 : detectexist(window.screenX) ? screenX + innerWidth / 2 - popwidth / 2 : 0
            toppos = (detectexist(window.screenTop)) ? screenTop + document.body.clientHeight / 2 - popheight / 2 : detectexist(window.screenY) ? screenY + innerHeight / 2 - popheight / 2 : 0
            if (window.opera) {
                leftpos -= screenLeft
                toppos -= screenTop
            }
        }

        getpos()
        formWindow = window.open("vel?processId=" + processId, "", "location=0,status=0,scrollbars=1,width=600,height=600");
        formWindow.moveTo(leftpos, toppos);
    }

    function showForm() {
        var processForm = document.createElement("form");
        processForm.method = "post";
        processForm.action = "processes.jsp?formStarted=true";
        processForm.submit();
    }

</script>
<!-- start header -->
<div id="header">
    <div id="logo">
        <h1><a href="#"><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;&nbsp;</a></h1>

        <p>The Native BPMN 2.0 Execution Engine</p>
        <%
            if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true")) {%>
        <div id="name">You are logged in as <span>
               <% out.print(session.getAttribute("username").toString()); %> </span>as a member of <span><%
            out.print(session.getAttribute("userGroupList").toString()); %></span></div>
        <%}%>
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


    <script src="webtoolkit.aim.js" type="text/javascript"><!--mce:0--></script>
    <script type="text/javascript"><!--mce:1--></script>
    <br/><br/>

    <h1> Available Processes</h1>

    <div><br></div>
    <%
        if (session.getAttribute("processList") != null && session.getAttribute("deployments") != null) {
            List<String> processesList = (List<String>) session.getAttribute("processList");
            List<DeploymentBean> deployments = (List<DeploymentBean>) session.getAttribute("deployments");

    %>

    <table>
        <tr>
            <td>
                <input type="button"
                       value="Undeploy all" <% if (processesList.isEmpty()) {%>
                       disabled="true" <%}%>
                       onclick="">
            </td>
        </tr>

        <%for (DeploymentBean process : deployments) { %>
        <tr>
            <form action="<%--startProcess?taskId=<%=process.toString()--%>" method="post">
                <td>
                    <%=process.getDefinitionsId()%>
                </td>
                <td>
                    <%
                        boolean isStartBtnActive = true; // by default it is true;
                        boolean isStopBtnActive = false; // by default it is false;
                        //show whether the process is started
                        if (request.getParameter("isProcessStarted") != null
                                && request.getParameter("processId") != null
                                && request.getParameter("isProcessStarted").equals("true")
                                && request.getParameter("processId").equals(process.toString())) {
                            isStartBtnActive = false;
                            isStopBtnActive = true;
                        } else if (request.getParameter("isProcessStopped") != null
                                && request.getParameter("processId") != null
                                && request.getParameter("isProcessStopped").equals("true")
                                && request.getParameter("processId").equals(process.toString())) {
                            isStartBtnActive = true;
                            isStopBtnActive = false;
                        } else {
                            isStartBtnActive = true; // default
                            isStopBtnActive = false; // default
                        }
                        //else no start action carried out
                    %>
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="button"
                                                                    value="Start" <%if(!isStartBtnActive){%>
                                                                    disabled="true" <%} %>
                                                                    onclick="startProcess('<%=process.getDefinitionsId()%>')">

                </td>
                <!--td>
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="button"
                                                                    value="Stop" <!--%if(!isStopBtnActive){%>
                                                                    disabled="true" <!--%} %>
                                                                    onclick="stopProcess('<!--%=process.getDefinitionsId()%>')">

                </td-->
                <td>
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<%
                    String url = Constants.getAppURL(process.getDefinitionsId()); %><a href="<%=url%>">Start App</a>
                </td>
                <td>
                    <% ProcessEngine engine = (ProcessEngine) session.getAttribute("processEngine");
                        String diagramPath = process.getDiagramPath();//engine.getDiagramPath(process.toString());
                    %>
                    &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="button"
                                                                    value="Show Process Diagram"
                                                                    onclick="jkpopimage('<%=diagramPath%>', 800, 500, ''); return false">

                </td>
            </form>
        </tr>
        <% }
        %>
    </table>

    <%} %>


    <% } else { %>
    response.sendRedirect("login.jsp?error=not-logged");

    <%}%>
</div>
<div id="footer">
    <p class="copyright">&copy;&nbsp;&nbsp;Levi&nbsp;&bull;&nbsp;

    <p class="link"><a href="#">Privacy Policy</a>&nbsp;&#8226;&nbsp;<a href="#">Terms of Use</a>
    </p>
</div>

</body>
</html>
