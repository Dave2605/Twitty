<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Twitty</title>
</head>
<body>
<div class="TwittyView">
    <div class="twittyMessage"><c:out value="${twitty.message}" /></div>
    <div>
        <span class="twittyTiem"><c:out value="${twitty.time}" /></span>
    </div>
</div>
</body>
</html>
