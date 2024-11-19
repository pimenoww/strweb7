<%--
  Created by IntelliJ IDEA.
  User: Amsterdamer
  Date: 19.11.2024
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Bonus Card</title>
</head>
<body>
<h1>Bonus Card Details</h1>
<p>Card ID: ${card.cardId}</p>
<p>Points: ${card.points}</p>

<h2>Credit Points</h2>
<form action="/cards/${card.cardId}/credit" method="post">
    <%--@declare id="amount"--%><label for="amount">Amount:</label>
    <input type="number" name="amount" required><br>
    <button type="submit">Credit</button>
</form>

<h2>Debit Points</h2>
<form action="/cards/${card.cardId}/debit" method="post">
    <label for="amount">Amount:</label>
    <input type="number" name="amount" required><br>
    <button type="submit">Debit</button>
</form>
</body>
</html>