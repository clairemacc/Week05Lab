<%-- 
    Document   : home
    Created on : 11-Oct-2020, 2:23:42 PM
    Author     : 822408
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h2>Home</h2>
        <h4>Hello ${username}.</h4>
        <form action="home" method="get">
            <input type="hidden" name="logout">
            <a href="login?logout">Log out</a>
        </form>
    </body>
</html>
