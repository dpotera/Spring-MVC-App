<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ page import="sprmvc.web.HomeController" %>
<%@ page import="java.util.Date" %>

    <%!
        private String createList(String[] array){
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

                <code class="card card-panel black-text indigo lighten-5">
                    <div class="card-title">HTML code using &lt;spring:escapeBody htmlEscape</div>
                    <s:escapeBody htmlEscape="true">
                        <div class="html-escaped">
                            Div content
                        </div>
                    </s:escapeBody>
                </code>

                <%= createList(new String[] {"Dominik","Adam","Name","Surname","Lorem","Ipsum"}) %>
            </div>
        </div>
    </div>

