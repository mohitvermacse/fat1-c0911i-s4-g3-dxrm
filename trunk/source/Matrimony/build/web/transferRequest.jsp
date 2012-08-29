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
        <table border="1">
            <th>STT</th>
            <th>Full Name user send</th>
            <th>ID user send</th>
            <th>Full Name user receive</th>
            <th>ID user receive</th>
            <th>Content</th>
            <th></th>
            <c:forEach var="t" items="${tranfer}">
                <form action="TransferRequest" method="POST">
                    <tr>
                        <td>${t.receiverId}</td>
                        <td>${t.sImages}${t.sFullName}</td>
                        <td>${t.sendUserId}</td>
                        <td>${t.images}${t.fullName}<input type="hidden" name="receiveID" value="${t.receiverId}"/></td>
                        <td>${t.userId}</td>                            
                        <td>${t.content}</td>
                        <td><input type="submit" name="action" value="Transfer"/></td>
                    </tr>
                </form>
            </c:forEach>
        </table>
    </body>
</html:html>

