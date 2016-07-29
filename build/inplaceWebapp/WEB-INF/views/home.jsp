<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page import="sprmvc.web.HomeController" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC</title>

    <link href='https://fonts.googleapis.com/css?family=Ubuntu:400,700&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
    <link href="<c:url value="/resources/style.css" />" rel="stylesheet">

    <script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
</head>
<body>

    <s:url value="/posts" var="postsUrl">
        <s:param name="max" value="20"/>
        <s:param name="number" value="10"/>
    </s:url>
    <s:url value="/posts" var="latestPost">
        <s:param name="number" value="1"/>
    </s:url>
    <nav>
        <div class="nav-wrapper row">
            <div class="col s12">
                <a href="<c:url value="/" />" class="brand-logo">Spring MVC</a>
                <ul id="nav-mobile" class="right hide-on-med-and-down">
                    <li><a href="<c:url value="/user/register" />">Register</a></li>
                    <li><a href="${postsUrl}">Posts</a></li>
                    <li><a href="${latestPost}">Latest Post</a></li>
                </ul>
            </div>
        </div>
    </nav>

    <%!
        public String createList(String[] array){
            String result = "<ul class=\"collection\">\n";
            for(String li:array)
                result += "<li class=\"collection-item\">"+li+"</li>\n";
            return result+"</ul>\n";
        }
    %>

    <div class="container">
        <div class="row">
            <div class="col s12">
                <h1><s:message code="home.helloWorld" /></h1>
                <%! HomeController controller = new HomeController(); %>
                <h3>Today is: <%= new Date() %></h3>

                <%= createList(new String[] {"Dominik","Adam","Name","Surname","Lorem","Ipsum"}) %>
            </div>
        </div>
    </div>


</body>
</html>
