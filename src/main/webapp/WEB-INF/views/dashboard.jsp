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
  <title>Dashboard</title>
</head>
<body>
<h1>Welcome, ${user.login}</h1>
<p>Your bonus card ID: ${user.bonusCard.cardId}</p>
<p>Your points: ${user.bonusCard.points}</p>

<a href="/cards/${user.bonusCard.cardId}">View card details</a>
</body>
</html>