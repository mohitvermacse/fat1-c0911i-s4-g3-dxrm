<%-- 
    Document   : home
    Created on : Aug 26, 2012, 12:56:48 AM
    Author     : SENJURO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <html:link page="/RegisterTemp.page">Register</html:link>
        <br>
        <html:link page="/ProfileTemp.page">Profile</html:link>
        <br>
        <html:link page="/PremiumTemp.page">Premium</html:link>
        <br>
        <html:link page="/FriendTemp.page">Friend</html:link>
    </body>
</html>
