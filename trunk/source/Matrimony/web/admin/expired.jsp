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
    <center>
        <h3> ${requestScope.status}</h3>
        <table border="0">
            <c:forEach var="u" items="${listUser}">               
                <html:form action="ExpireAction" method="POST">
                    <tr>                        
                        <td>
                            <a href="InforServlet?id=${u.userId}">
                                <img src=".${u.images}" height="40px" width="35px"/>
                                ${u.fullName}
                            </a>                       
                            <html:hidden property="email" value="${u.email}"/>
                            <html:hidden property="expireDa" value="${u.expireDate}"/>
                        </td>                        
                        <td><html:submit property="action" value="Expired"/></td>
                    </tr>
                </html:form>
            </c:forEach>
        </table>
    </center>
</body>
</html>
