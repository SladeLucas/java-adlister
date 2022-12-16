<%--
  Created by IntelliJ IDEA.
  User: gabriellekhokhar
  Date: 12/16/22
  Time: 1:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game!</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/GuessingServlet" action="post">
    <label>Pick a Number Between 1 and 3... </label>
    <input type="text" name="guess">

</form>
</body>
</html>