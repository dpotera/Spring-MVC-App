<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page import="sprmvc.web.HomeController" %>
<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC</title>

    <link href='https://fonts.googleapis.com/css?family=Ubuntu:400,700&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>

    <%!
        public String createList(String[] array){
            String result = "<ul>\n";
            for(String li:array)
                result += "<li>"+li+"</li>\n";
            return result+"</ul>\n";
        }
    %>

    <h1>
        <s:message code="home.helloWorld" />
    </h1>
    <%! HomeController controller = new HomeController(); %>
    <h3>Today is: <%= new Date() %></h3>

    <%= createList(new String[] {"Dominik","Adam","Name","Surname","Lorem","Ipsum"}) %>

</body>
</html>
