<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
    <head>
        <title>Twitty</title>
        <link rel="stylesheet"
              type="text/css"
              href="<c:url value="/resources/style.css"/>">
    </head>
    <body>
        <h1>Welcome to Twitty</h1>

        <form action="author/register"><input type="submit">Resigster</form>
    </body>
</html>
