<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><c:out value="${user.userName}" /></title>

    <link href='https://fonts.googleapis.com/css?family=Ubuntu:400,700&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>

    <table class="userProfile">
        <tr>
            <td>User Name:</td>
            <td><c:out value="${user.userName}" /></td>
        </tr>
        <tr>
            <td>First Name:</td>
            <td><c:out value="${user.firstName}" /></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><c:out value="${user.lastName}" /></td>
        </tr>
        <tr>
            <td>Email adress:</td>
            <td><c:out value="${user.email}" /></td>
        </tr>
    </table>

</body>
</html>
