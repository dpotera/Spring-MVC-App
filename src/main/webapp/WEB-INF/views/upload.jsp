<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <h1>File upload:</h1>

    <div class="row">
        <div class="col s6 offset-s3">
            <form method="post" enctype="multipart/form-data">
                <div class="file-field input-field">
                    <div class="btn">
                        <span>File</span>
                        <input name="file" type="file" />
                    </div>
                    <div class="file-path-wrapper">
                        <input class="file-path validate" type="text">
                    </div>
                </div>
                <div class="center-align">
                    <button type="submit" class="waves-effect waves-light btn-large">
                        <i class="material-icons left">open_in_browser</i>Upload
                    </button>
                </div>
            </form>
        </div>
    </div>

    <div class="row">
        <h2 class="center-align">Uploaded files:</h2>
        <c:forEach items="${files}" var="file">
            <div class="col s12 m6">
                <div class="card">
                    <div class="card-image">
                        <img class="materialboxed" src="<c:url value="${file.displayPath}" />">
                        <span class="card-title">${file.fileName}</span>
                    </div>
                    <div class="card-content">
                        <p>
                            Size: ${file.fileSize} <br>
                        </p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>


</div>