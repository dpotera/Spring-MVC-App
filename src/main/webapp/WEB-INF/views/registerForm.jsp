<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register new user</title>

    <link href='https://fonts.googleapis.com/css?family=Ubuntu:400,700&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>

    <h1>Registration</h1>

    <sf:form method="POST" commandName="user">
        User Name: <sf:input path="userName" /><sf:errors path="userName" cssClass="error"/><br>
        Password: <sf:password path="password" /><sf:errors path="password" cssClass="error"/><br>
        First Name: <sf:input path="firstName" /><sf:errors path="firstName" cssClass="error"/><br>
        Last Name: <sf:input path="lastName" /><sf:errors path="lastName" cssClass="error"/><br>
        Email: <sf:input path="email" /><sf:errors path="email" cssClass="error"/><br>
        <button type="submit">Register</button>
    </sf:form>

</body>
</html>
