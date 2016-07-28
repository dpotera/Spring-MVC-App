<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Post</title>

    <link href='https://fonts.googleapis.com/css?family=Ubuntu:400,700&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>
    <div class="post">
        <h3><c:out value="${post.message}" /></h3>
        <table>
            <tr>
                <td>Time:</td>
                <td><c:out value="${post.time}" /></td>
                <td>Longitude:</td>
                <td><c:out value="${post.longitude}" /></td>
                <td>Latitude:</td>
                <td><c:out value="${post.latitude}" /></td>
            </tr>
        </table>
    </div>
</body>
</html>
