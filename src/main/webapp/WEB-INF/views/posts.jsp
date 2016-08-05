<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<div class="row">

    <%! int i=1; %>
    <c:forEach items="${postList}" var="post" varStatus="loop">
        <c:if test="${ loop.index % 3 == 0 }">
            <div style="clear: both"></div>
        </c:if>
        <s:url value="/posts" var="postUrl">
            <s:param name="number" value="1" />
            <s:param name="max" value="${post.id}" />
        </s:url>

        <div class="col s12 m6 l4">
            <div class="card blue-grey lighten-4s">
                <div class="card-content white-text">
                    <span class="card-title"><c:out value="${post.message}"/></span>
                    <table class="bordered striped">
                        <thead class="white-text">
                            <tr>
                                <th class="data-field">Time</th>
                                <th class="data-field">Latitude</th>
                                <th class="data-field">Longitude</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><c:out value="${post.time}"/></td>
                                <td><c:out value="${post.latitude}"/></td>
                                <td><c:out value="${post.longitude}"/></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="card-action">
                    <a href="${postUrl}">Post link</a>
                </div>
            </div>
        </div>

        <c:if test="${ loop.last }">
            <div style="clear: both"></div>
        </c:if>
    </c:forEach>
</div>