<%-- 
    Document   : expired
    Created on : Aug 29, 2012, 6:44:46 AM
    Author     : nvc
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matrimony</title>
    </head>
    <body>
        <c:set var="listUser" value="${requestScope.listUserExpired}"/>
        <table border="1">
            <c:forEach var="u" items="${listUser}">
                <html:form action="ExpireAction" method="POST">
                    <tr>
                        <td>${u.userId}</td>
                        <td>${u.images}${u.fullName}</td>
                        <td>${u.address}</td>
                        <td>${u.email}</td>
                        <td>${u.phoneNumber}</td>
                        <td>${u.registerDate}</td>
                        <td>${u.expireDate}</td>
                        <td><html:submit property="action" value="Expired"/></td>
                    </tr>
                </html:form>
            </c:forEach>
        </table>
    </body>
</html>
