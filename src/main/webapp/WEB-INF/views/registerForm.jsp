<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register new user</title>

    <link href='https://fonts.googleapis.com/css?family=Ubuntu:400,700&subset=latin,latin-ext' rel='stylesheet' type='text/css'>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/css/materialize.min.css">
    <link href="<c:url value="/resources/style.css" />" rel="stylesheet">

    <script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.7/js/materialize.min.js"></script>
</head>
<body>
    <div class="container">

        <h1>Registration</h1>

        <sf:form method="POST" commandName="user" cssClass="register-form" enctype="multipart/form-data">
            <div class="row">
                <div class="col s12 m6">
                    <sf:errors path="*" cssClass="card-panel pink white-text" element="div" />
                </div>
            </div>

            <div class="row">
                <div class="input-field col s6">
                    <sf:input path="userName" cssClass="validate" />
                    <label for="userName">User Name</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s6">
                    <sf:password path="password" cssClass="validate" />
                    <label for="password">Password</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s6">
                    <sf:input path="firstName" cssClass="validate" />
                    <label for="firstName">First Name</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s6">
                    <sf:input path="lastName" cssClass="validate" />
                    <label for="lastName">Last Name</label>
                </div>
            </div>
            <div class="row">
                <div class="input-field col s6">
                    <sf:input path="email" cssClass="validate" />
                    <label for="email">Email</label>
                </div>
            </div>
            <div class="row">
                <div class="col s6">
                    <label for="file">Profile picture</label>
                    <sf:input type="file" path="file" cssClass="validate" />
                </div>
            </div>
            <div class="row">
                <div class="col s6">
                    <button class="btn waves-effect waves-light right" type="submit">
                        Register <i class="material-icons right">send</i>
                    </button>
                </div>
            </div>

        </sf:form>
    </div>
</body>
</html>
