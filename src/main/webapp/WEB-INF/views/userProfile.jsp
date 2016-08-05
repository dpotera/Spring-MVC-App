<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><c:out value="${user.userName}" /></title>

    <link href='https://fonts.googleapis.com/css?family=Ubuntu:400,700&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
    <link href="<c:url value="/resources/style.css" />" rel="stylesheet">

    <script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
</head>
<body>

    <div class="container">
        <div class="row">
            <div class="col s6 offset-s3">

                <h1><c:out value="${user.userName}" /></h1>

                <table class="striped bordered">
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
                    <tr>
                        <td>Profile picture:</td>
                        <td>
                            <img src="<c:url value="${user.profilePicturePath}" />" alt="Profile Picture"/>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    </div>

</body>
</html>
