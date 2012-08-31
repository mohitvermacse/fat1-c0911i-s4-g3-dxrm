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
        <c:set var="pending" value="${requestScope.listTransfer}"/>        
        <c:set var="transfer" value="${requestScope.listRequestTransfer}"/>
        <c:set var="approved" value="${requestScope.listRequestApproved}"/>

        <form id="1" action="TransferRequest" method="POST">            
            <input type="submit" name="action" value="Request Transfer"/>
            <input type="submit" name="action" value="Request Approved"/>

            <h3>List request Pending </h3>
            <table border="1" width="100%">

                <th>Full Name user send</th>               
                <th>Content</th>
                <th>Full Name user receive</th>
                <th></th>
                <c:forEach var="t" items="${pending}">
                    <form id="2" action="TransferRequest" method="POST">
                        <tr>
                            <td>
                                <a href="TransferRequest?id=${t.sendUserId}" style="font: underLine ">
                                    <img src=".${t.images}" height="40px" width="35px"/>${t.fullName}
                                    <input type="hidden" name="receiveID" value="${t.receiverId}"/>
                                </a>
                                <%--<td>${t.sendUserId}</td>--%>
                            </td>

                            <td>${t.content}</td>
                            <td><img src=".${t.sImages}" height="45px" width="40px"/>${t.sFullName}</td>

                            <%-- <td>${t.userId}</td>--%>                      

                            <td><input type="submit" name="action" value="Transfer"/></td>
                        </tr>
                    </form>
                </c:forEach>
            </table>
            <h3>List request Transfer </h3>
            <table width="100%">

                <th>Full Name user send</th>               
                <th>Content</th>
                <th>Full Name user receive</th>
                <th></th>
                <c:forEach var="t" items="${transfer}">
                    <form id="2" action="TransferRequest" method="POST">
                        <tr>

                            <td>
                                <a href="TransferRequest?id=${t.sendUserId}" style="font: underLine ">
                                    <img src=".${t.images}" height="45px" width="40px" />${t.fullName}
                                    <input type="hidden" name="receiveID" value="${t.receiverId}"/>
                                </a>
                                <%--<td>${t.sendUserId}</td>--%>
                            </td>

                            <td>${t.content}</td>
                            <td><img src=".${t.sImages}" height="45px" width="40px"/>${t.sFullName}</td>

                            <%-- <td>${t.userId}</td>--%>              
                        </tr>
                    </form>
                </c:forEach>
            </table>
            <h3>List request approved </h3>
            <table width="100%">

                <th>Full Name user send</th>               
                <th>Content</th>
                <th>Full Name user receive</th>
                <th></th>
                <c:forEach var="t" items="${approved}">
                    <form id="2" action="TransferRequest" method="POST">
                        <tr>

                            <td>
                                <a href="TransferRequest?id=${t.sendUserId}" style="font: underLine ">
                                    <img src=".${t.images}"  height="45px" width="40px"/>${t.fullName}
                                </a>
                                <input type="hidden" name="receiveID" value="${t.receiverId}"/></td>
                                <%--<td>${t.sendUserId}</td>--%>
                            <td>${t.content}</td>
                            <td><img src=".${t.sImages}"  height="45px" width="40px"/>${t.sFullName}</td>

                            <%-- <td>${t.userId}</td>--%>                          
                        </tr>
                    </form>
                </c:forEach>
            </table>
        </form>
    </body>
</html:html>

