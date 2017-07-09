<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Twitties</title>
</head>
<body>
<c:forEach items="${twittyList}" var="twitty" >
    <li id="twitty_<c:out value="twitty.id"/>">
        <div class="twittyMessage">
            <c:out value="${twitty.message}" />
        </div>
        <div>
            <span class="twittyTime"><c:out value="${twitty.time}" /></span>
            <span class="twittyLocation">
                <c:out value="${twitty.latitude}" />,
                <c:out value="${twitty.longitude}" />)</span>
        </div>
    </li>
</c:forEach>
</body>
</html>
