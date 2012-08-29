<%-- 
    Document   : managepic
    Created on : Aug 28, 2012, 8:16:20 PM
    Author     : UTAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="iBean" scope="session" class="bean.ImageBean"/>
        <table width="100%">
            <c:forEach var="item" items="${iBean.arImg}">
                <html:form action="PhotoAction" method="POST">
                    <tr>
                        <td>
                            <img src=".${item.imagePath}" style="max-width: 200px; max-height: 200px"/>
                            <html:hidden property="photoId" value="${item.imageId}"/>
                            <html:hidden property="photoPath" value="${item.imagePath}"/>
                        </td>
                        <td>
                            <html:submit property="btn" value="Make Profile Picture"/><br/>
                            <html:submit property="btn" value="Delete"/>
                        </td>
                    </tr>
                </html:form>
            </c:forEach>
        </table>
        ${requestScope.message}
    </body>
</html>
