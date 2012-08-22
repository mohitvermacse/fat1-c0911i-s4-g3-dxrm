<%-- 
    Document   : payment
    Created on : Aug 21, 2012, 12:53:22 AM
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
        <c:set var="pre" value="${requestScope.listPremium}"/>
        <html:form action="RegisterAction" method="POST">
            <table>
                <th>Premium type</th>
                <th>Charges</th>
                <c:forEach var="p" items="${pre}">
                    <tr>
                        <td>${p.preType}</td>
                        <td>
                            ${p.amount}<html:radio  property="amount" value="${p.amount}"/>
                            <html:hidden value="${p.preId}" property="premium"/>
                        </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td></td>
                    <td><html:submit value="Pay ment" property="action"/></td>
                </tr>
            </table>
        </html:form>

    </body>
</html:html>
