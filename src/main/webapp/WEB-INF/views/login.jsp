<%--
  Created by IntelliJ IDEA.
  User: Amsterdamer
  Date: 19.11.2024
  Time: 18:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<form action="/users/login" method="post">
    <%--@declare id="login"--%><%--@declare id="password"--%><label for="login">Login:</label>
    <input type="text" name="login" required><br>
    <label for="password">Password:</label>
    <input type="password" name="password" required><br>
    <button type="submit">Login</button>
</form>
<c:if test="${param.error == 'true'}">
    <p style="color: red;">Invalid login or password</p>
</c:if>
</body>
</html>