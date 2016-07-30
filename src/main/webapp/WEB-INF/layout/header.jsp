<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<s:url value="/posts" var="postsUrl" >
    <s:param name="max" value="20"/>
    <s:param name="number" value="10"/>
</s:url>
<script>
    var postsUrl = "${postsUrl}";
    console.log("postsUrl = "+postsUrl);
</script>
<s:url value="/posts" var="latestPost">
    <s:param name="number" value="1"/>
</s:url>
<nav>
    <div class="nav-wrapper row">
        <div class="col s12">
            <a href="<c:url value="/" />" class="brand-logo"><i class="material-icons">cloud</i> Spring MVC</a>
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href="<s:url value="/" />">Home</a></li>
                <li><a href="<s:url value="/user/register" />">Register</a></li>
                <li><a href="${postsUrl}">Posts</a></li>
                <li><a href="${latestPost}">Latest Post</a></li>
            </ul>
        </div>
    </div>

</nav>
