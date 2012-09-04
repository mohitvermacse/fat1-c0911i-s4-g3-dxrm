<%-- 
    Document   : homepage
    Created on : Sep 1, 2012, 3:56:01 PM
    Author     : nvc
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Dating Online</title>
        <jsp:include page="template/meta.jsp"></jsp:include>

    </head>
    <body>
        <c:set var="allUser" value="${requestScope.allUser}"/>
        <%-- Header start--%>
        <%--<div class="header-repeat">--%>
        <div id="header">
            <jsp:include page="template/header.jsp"></jsp:include>
            <ul>
                <jsp:include page="template/ul.jsp"></jsp:include>
            </ul>
        </div>
        <%--Header End--%>
        <%--Boby Start--%>
        <div id="body">
            <div id="leftPanel">
                <html:form action="LoginAction" method="post" enctype="multipart/form-data">   
                    <h2 class="formHeader">Partner Search</h2>
                    <label>UserName:</label>  <html:text property="userName"/><br class="spacer" />
                    <div style="color: red"><html:errors property="use"/></div>
                    <label>Password:</label> <html:password property="password"/><br class="spacer" />
                    <div style="color: red"><html:errors property="pas"/></div>
                    <br class="spacer" />
                    <input name="btn" class="goBtn1" type="submit" value="Log in"/>
                    <input name="btn" class="goBtn" type="submit" value="Log out"/>
                    <br class="spacer" />
                    <div style="color: red">
                        <html:errors property="logUser"/>
                        <html:errors property="userExpireDate"/>
                    </div>
                </html:form> <br class="spacer" />  
                <jsp:include page="template/leftPanel.jsp"></jsp:include>
            </div>
            <div id="rightPanel">
                <div style="color: red">${requestScope.status}</div>

                <jsp:include page="template/rightBody1.jsp"></jsp:include>
                <jsp:include page="template/rightBody2.jsp"></jsp:include>
                <ul class="profiles">
                    <form action="HomeServlet" method="POST">
                        <c:forEach var="u" items="${allUser}">
                            <li>  <a href="HomeServlet?id=${u.userId}">
                                    <img src=".${u.images}" height="45px" width="40px"/>
                                    ${u.userName}
                                </a>
                            </li>
                        </c:forEach>
                        <div style="color: red">${requestScope.status}</div>
                    </form>
                </ul>
                <%-- <jsp:include page="template/rightBody3.jsp"></jsp:include>--%>
            </div>
            <br class="spacer" />
        </div>
        <%--Boby End--%>
        <%--Footer Start--%>
        <div id="footer">
            <jsp:include page="template/footer.jsp"></jsp:include>
        </div> 
        <%--Footer End--%>
    </body>
</html>