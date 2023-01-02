<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: gabriellekhokhar
  Date: 1/2/23
  Time: 3:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Ads List</title>
</head>
<body>
<h1>List of Ads: </h1>
<c:forEach var="ad" items="${ads}">
  <div class="ad">
    <h2>${ad.title}</h2>
    <p>Description: ${ad.description}</p>
  </div>
</c:forEach>
</body>
</html>