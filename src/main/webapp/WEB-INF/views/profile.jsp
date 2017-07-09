<%--
  Created by IntelliJ IDEA.
  User: dave
  Date: 09.05.17
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<h1>Your Profile</h1>
<c:out value="${author.username}" /><br/>
<c:out value="${author.firstName}" />
<c:out value="${author.lastName}" />
</body>
</html>
