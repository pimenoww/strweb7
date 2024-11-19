<%--
  Created by IntelliJ IDEA.
  User: Amsterdamer
  Date: 19.11.2024
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h1>Register</h1>
<form action="/users/register" method="post">
    <%--@declare id="password"--%><%--@declare id="login"--%>
    <label for="login">Login:</label>
    <input type="text" name="login" required><br>
    <label for="password">Password:</label>
    <input type="password" name="password" required><br>
    <button type="submit">Register</button>
</form>
</body>
</html>