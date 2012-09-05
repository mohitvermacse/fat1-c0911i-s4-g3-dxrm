<%-- 
    Document   : friendList
    Created on : Sep 5, 2012, 5:12:00 PM
    Author     : TungPT
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
        <h1>Friend List</h1>
        <jsp:useBean id="friendList" class="bean.UserManager" scope="session" />
        <table>
            <logic:iterate id="friend" collection="${friendList.friendList}" >
            <tr>
                <td><img src="${friend.avatarLink}"/></td>
                <td>
                    <a href="InforServlet?id=${friend.userId}" >${friend.userName}</a>
                    <br>
                    ${friend.gender}
                </td>
            </tr>
            </logic:iterate>
        </table>
    </body>
</html>
