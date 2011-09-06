<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>ShuffleBug | Support</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="css/coin-slider.css"/>
    <script type="text/javascript" src="js/cufon-yui.js"></script>
    <script type="text/javascript" src="js/cufon-times-700.js"></script>
    <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
    <script type="text/javascript" src="js/coin-slider.min.js"></script>
</head>
<body>
<div class="main">
    <div class="header">
        <div class="header_resize">
            <div class="logo">
                <img src="images/AccountManagers.jpg"/>
            </div>
            <div class="clr"></div>
            <div class="menu_nav">
                <ul>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                    <li></li>
                </ul>
            </div>
            <div class="clr"></div>
            <div class="clr"></div>
            <div class="slider">
                <div id="coin-slider"><a href="#"><img src="images/slide2.jpg" width="960" height="360"
                                                       alt=""/><span><big></big><br/></span></a> <a href="#"><img
                        src="images/slide3.jpg" width="960" height="360" alt=""/><span><big></span></a> <a href="#"><img
                        src="images/slide1.jpg" width="960" height="360" alt=""/><span><big></big><br/>
          </span></a></div>
                <div class="clr"></div>
            </div>
            <div class="clr"></div>
        </div>
    </div>
    <div class="content">
        <div class="content_resize">
            <div class="mainbar">
                <div class="article">
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
</body>
</html>