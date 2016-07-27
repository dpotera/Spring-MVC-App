<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SprMVC Posts</title>
</head>
<body>

    <c:forEach items="${postsList}" var="post">
        <div class="post">
            <h3><c:out value="${post.message}" /></h3>
            <span class="time">Time: <c:out value="${post.time}" /></span>
            <span class="coords">
                Coordinates:
                <c:out value="${post.latitude}" />
                <c:out value="${post.longitude}" />
            </span>
        </div>
    </c:forEach>

</body>
</html>
