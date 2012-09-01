<%-- 
    Document   : homepage
    Created on : Sep 1, 2012, 3:56:01 PM
    Author     : nvc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:set var="allUser" value="${requestScope.allUser}"/>
        <form action="HomeServlet" method="POST">
            <center>
                <table>
                    <c:forEach var="u" items="${allUser}">
                        <tr>
                            <td>
                                <a href="HomeServlet?id=${u.userId}">
                                    <img src=".${u.images}" height="45px" width="40px"/>
                                    ${u.userName}
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </center>
            <div style="color: red">${requestScope.status}</div>
        </form>
    </body>
</html>
