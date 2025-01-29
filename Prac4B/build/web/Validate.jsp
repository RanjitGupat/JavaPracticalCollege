<%-- 
    Document   : Validate
    Created on : 8 Aug, 2024, 8:29:05 AM
    Author     : students
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="mypack.ValidateBean"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to Validate page</h1>
        <jsp:useBean id="obj" class="mypack.ValidateBean" scope="request">
            <jsp:setProperty name="obj" property="*"/>
        </jsp:useBean>
        <% if(obj.validate()){  %>
    <body bgcolor="rgb(255, 255, 26)"
        <h1>Welcome <%=obj.getName()%></h1>
        <h1>All input are verified and found valid</h1>
        <% } else{%>
    <body bgcolor="yellow" text="red">
        <h1>Error in data entry..............</h1>
        <h1>Try again.......</h1>
        <jsp:include page="index.html"/>
        <%=obj.getError() %>
        <% } %>
                     
    </body>
</html>
