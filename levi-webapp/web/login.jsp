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
<!-- start header -->
<div id="header">
    <div id="logo">
        <h1><a href="#"><span>&nbsp;&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;&nbsp;</a></h1>

        <p>The Native BPMN 2.0 Execution Engine</p>
    </div>
    <div id="menu">
        <ul id="main">
            <li class="current_page_item"><a href="index.jsp">Home</a></li>
            <li><a href="#">Tasks</a></li>
            <li><a href="processes">Processes</a></li>
            <%if (session.getAttribute("logged") != null && session.getAttribute("logged").toString().equals("true") && session.getAttribute("username").equals("admin")) {%>
            <li><a href="usrmng">User Management</a></li>
            <%} %>
        </ul>
    </div>

</div>
<!-- end header -->
<div id="body">

    <script src="webtoolkit.aim.js" type="text/javascript"><!--mce:0--></script>
    <script type="text/javascript"><!--mce:1--></script>
    <br/><br/>

    <h1> Login</h1>

    <div><br></div>
    <form action="login" method="post">
        <table>
            <tr>
                <td><label>Username:</label>
                </td>
                <td><input name="username" type="text" size="30"/></td>
            </tr>


            <tr>
                <td><label>Password:</label>
                </td>
                <td><input name="password" type="password" size="30"/></td>
            </tr>


            <tr>
                <td></td>
                <td>
                    <input type="submit" value="Login"/></td>
            </tr>
        </table>
    </form>
    <%
        // if login  attempt was unsuccessful, show error message to user
        if (request.getParameter("isLoginSuccess") != null && request.getParameter("isLoginSuccess").equals("false")) {%>
    <h3>Username or password is invalid. Please try again</h3>
    <% }
        if (request.getParameter("error") != null && request.getParameter("error").equals("not-logged")) {%>
    <h3>Please login first</h3>
    <% }
    %>
</div>
<div id="footer">
    <p class="copyright">&copy;&nbsp;&nbsp;2011 All Rights Reserved &nbsp;&bull;&nbsp; Design by <a
            href="http://www.freecsstemplates.org/">Free CSS Templates</a>.</p>

    <p class="link"><a href="#">Privacy Policy</a>&nbsp;&#8226;&nbsp;<a href="#">Terms of Use</a>
    </p>
</div>
</body>
</html>
