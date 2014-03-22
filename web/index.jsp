<%-- 
    Document   : index
    Created on : Mar 21, 2014, 11:47:39 PM
    Author     : Mohamed-ITI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%--
        <jsp:forward page="getBookInfoByISBN">
            <jsp:param name="ISBN" value="ISBN1"/>
        </jsp:forward>--%>
        <%--
        <jsp:forward page="getBooksListByCategoryName">
            <jsp:param name="categoryName" value="MC_ENG"/>
        </jsp:forward>--%>
        
        <jsp:forward page="getBooksByAutherName">
            <jsp:param name="authorName" value="Dietil"/>
        </jsp:forward>
        
    </body>
</html>
