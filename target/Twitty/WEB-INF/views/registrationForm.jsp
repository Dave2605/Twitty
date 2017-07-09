<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="/resources/style.css"/>">
</head>
<body>
<h1>Register</h1>
<sf:form method="POST" commandName="author" enctype="multipart/form-data">
    <sf:errors path="*" element="div" cssClass="errors"/>
    <sf:label path="firstName" cssErrorClass="error">First Name</sf:label><br/>
    <sf:input path="firstName" cssErrorClass="error"/><br/>
    <sf:label path="lastName" cssErrorClass="error">Last Name</sf:label><br/>
    <sf:input path="lastName" cssErrorClass="error" /><br/>
    <sf:label path="email" cssErrorClass="error">Email</sf:label><br/>
    <sf:input path="email" cssErrorClass="error" /><br/>
    <sf:label path="userName" cssErrorClass="error">Username</sf:label><br/>
    <sf:input path="userName" cssErrorClass="error" /><br/>
    <sf:label path="password" cssErrorClass="error">Password</sf:label><br/>
    <sf:password path="password" cssErrorClass="error" /><br/>
    <label>Profile Picture</label><br/>
          <input type="file" name="profilePicture"
    accept="image/jpeg,image/png,image/gif" /><br/>
    <br/>
    <input type="submit" value="Sign up"/>
</sf:form>
</body>
</html>