<%-- 
    Document   : homeUser
    Created on : Aug 13, 2012, 11:27:04 PM
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
        <title>Matrimony.com</title>      
    </head>
    <body style="background-color: white">
        <c:set var="receive" value="${requestScope.listReceive}"/>
        <c:set var="friend" value="${requestScope.listFriend}"/>
    <center>
        <table width="100%">
            <tr>
                <td width="50%">
                    <table width="100%"> 
                        <c:forEach var="f" items="${listFriend}">
                            <html:form action="MyUserAction" method="POST">
                                <tr>
                                    <td align="right">
                                        <a href="MyUserAction.page?friendId=${f.sendUserId}" style="font: underLine "> ${f.images}</a>
                                    </td>
                                    <td align="left">${f.fullName}</td>
                                </tr>
                            </html:form>
                        </c:forEach>
                    </table>
                </td>
                <td width="50%">
                    <table width="100%">
                        <c:forEach var="r" items="${receive}">
                            <html:form  action="MyUserAction" method="POST">
                                <tr>
                                    <td align="center">
                                        ${r.content}
                                        <html:hidden property="receiveId" value="${r.receiverId}"/>
                                        <html:hidden property="sendId" value="${r.sendId}"/>
                                    </td>
                                    <td align="center">
                                        ${r.fullName}
                                        ${r.images}
                                    </td>
                                    <td align="center">                         
                                        <html:submit property="btn" value="Accept"/>
                                        <html:submit property="btn" value="Deny"/>
                                    </td>
                                </tr>
                            </html:form>
                        </c:forEach>
                    </table>
                </td>
            </tr>
        </table>
    </center>
</body>
</html>