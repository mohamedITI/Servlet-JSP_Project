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
        <%--
        <jsp:forward page="getBooksByAutherName">
            <jsp:param name="authorName" value="Dietil"/>
        </jsp:forward>--%>
        <%--
        <jsp:useBean id="user" scope="session" class="POJO.Userinfo">            
        </jsp:useBean>
        
        <jsp:setProperty name="user" property="userId" value="firstID"></jsp:setProperty>
        <jsp:setProperty name="user" property="userName" value="Mohamed Ibrahim"></jsp:setProperty>
        <jsp:setProperty name="user" property="userEmail" value="mohamed@java.com"></jsp:setProperty>
        <jsp:setProperty name="user" property="userPassword" value="password"></jsp:setProperty>
        <jsp:setProperty name="user" property="userBirthdate" value="01/01/1990"></jsp:setProperty>
        <jsp:setProperty name="user" property="userJob" value="Clerk"></jsp:setProperty>
        <jsp:setProperty name="user" property="userCreditnumber" value="56893222222"></jsp:setProperty>
        <jsp:setProperty name="user" property="userCreditbalance" value="100"></jsp:setProperty>
        <jsp:setProperty name="user" property="userInterests" value="Programming"></jsp:setProperty>
        <jsp:setProperty name="user" property="userImage" value="userImageeeee"></jsp:setProperty>
        
        <jsp:forward page="Register"/> --%>
        
        
        <jsp:useBean id="book" scope="session" class="POJO.Books">            
        </jsp:useBean>
        
        <jsp:setProperty name="book" property="bookImage" value="bookimage"></jsp:setProperty>
        <jsp:setProperty name="book" property="bookName" value="bookname"></jsp:setProperty>
        <jsp:setProperty name="book" property="bookPrice" value="6"></jsp:setProperty>
        
        <jsp:forward page="AddProductToShopingCart">
            <jsp:param name="email" value="mohamed@java.com"/>
        </jsp:forward>
        
        <%--
         <jsp:forward page="Login">
            <jsp:param name="email" value="mohamed@java.com"/>
            <jsp:param name="password" value="password"/>
        </jsp:forward>--%>
        
    </body>
</html>
