<%-- 
    Document   : login
    Created on : 11-Oct-2020, 2:23:35 PM
    Author     : 822408
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h2>Login</h2>
        <form action="login" method="post">
            Username: <input type="text" name="username" value="${username}"><br>
            Password: <input type="password" name="password" value="${password}"><br>
            <input type="submit" value="Submit">
        </form>
        <c:if test="${message == 'invalidLogin'}">
            <p>Invalid username or password.</p>
        </c:if>
        <c:if test="${message == 'logoutSuccess'}">
            <p>You have successfully logged out.</p>
        </c:if>
        
    </body>
</html>
