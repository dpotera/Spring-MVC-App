<%@ page import="sprmvc.web.HomeController" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC</title>
</head>
<body>
    <h1>Hello MVC !</h1>
    <%! HomeController controller = new HomeController(); %>
    HomeController.home() : <%= controller.home() %>
</body>
</html>
