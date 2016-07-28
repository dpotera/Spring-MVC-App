<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SprMVC Posts</title>

    <link href='https://fonts.googleapis.com/css?family=Ubuntu:400,700&subset=latin,latin-ext' rel='stylesheet'
          type='text/css'>
    <link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>

    <c:forEach items="${postList}" var="post" varStatus="loop">
        <c:if test="${ loop.index % 3 == 0 }">
            <div style="clear: both"></div>
        </c:if>
        <div class="post">
            <h3><c:out value="${post.message}"/></h3>
            <span class="time">Time: <c:out value="${post.time}"/></span>
                <span class="coords">
                    Coordinates:
                    <c:out value="${post.latitude}"/>
                    <c:out value="${post.longitude}"/>
                </span>
        </div>
        <c:if test="${ loop.last }">
            <div style="clear: both"></div>
        </c:if>
    </c:forEach>


</body>
</html>
