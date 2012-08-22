<%-- 
    Document   : transferRequest
    Created on : Aug 22, 2012, 4:36:24 PM
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

        <title></title>

    </head>
    <body style="background-color: white">

        <c:set var="tranfer" value="${requestScope.listTransfer}"/>
        <table>
            <th>Full Name</th>
            <th>ID</th>
            <th>Full Name</th>
            <th>ID</th>
            <th>Content</th>
            <c:forEach var="t" items="${tranfer}">
                <tr>
                    <td>${t.fullName}</td>
                    <td>${t.userId}</td>
                    <td>${t.fullName}</td>
                    <td>${t.sendUserId}</td>
                    <td>${t.content}</td>
                </tr>
            </c:forEach>
        </table>

    </body>
</html:html>

