<%-- 
    Document   : loginAdmin
    Created on : Aug 28, 2012, 6:17:31 PM
    Author     : nvc
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html:html lang="true">
    <head>      
        <title>Admin Login</title>
        <link rel="stylesheet" type="text/css" href="css/reset.css">
        <link rel="stylesheet" type="text/css" href="css/structure.css">
    </head>
    <body>
        <html:form action="LogAdminAction" method="POST" styleClass="box login">
            <fieldset class="boxBody">
                <label>Username</label>
                <html:text property="userName"/>
                <label>Password</label>
                <html:password property="password"/> 	  
            </fieldset>
            <footer>
                <html:submit value="Login" styleClass="btnLogin"/>
                <div style="color: red"> 
                    <div style="color: red"> <html:errors property="use"/> </div>
                    <div style="color: red"><html:errors property="pas"/></div>
                    <html:errors property="logUser"/>
                </div>
            </footer>            

        </html:form>
        <footer id="main">
            Chim to vcl
        </footer>
    </body>
</html:html>
