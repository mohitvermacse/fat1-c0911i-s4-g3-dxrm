<%-- 
    Document   : newjsp
    Created on : Sep 3, 2012, 4:09:49 PM
    Author     : nvc
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Matrimony Online</title>
        <jsp:include page="template/meta.jsp"></jsp:include>

    </head>
    <body>

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
                    <%-- <h2 class=" ">Partner Search</h2> 	--%>
                    <h2 class="formHeader">Partner Login</h2>
                    <label>UserName:</label>  <html:text property="userName"/><br class="spacer" />
                    <div style="color: red"><html:errors property="use"/></div>
                    <label>Password:</label> <html:password property="password"/><br class="spacer" />
                    <div style="color: red"><html:errors property="pas"/></div>
                    <br class="spacer" />
                    <input name="btn" class="goBtn1" type="submit" value="Log in"/>                  
                    <a class="a" href="/Matrimony/forgotPassword.jsp">forgot password</a>
                    <br class="spacer" />
                    <div style="color: red">
                        <html:errors property="logUser"/>
                        <html:errors property="userExpireDate"/>
                    </div>
                </html:form> <br class="spacer" />  
                <jsp:include page="template/leftPanel.jsp"></jsp:include>
            </div>
            <div id="rightPanel">
                <h1>Choose premium plan</h1>
                <html:errors property="premiumSelect" />
                <jsp:useBean id="premium" class="bean.UserManager" scope="session" />
                <html:form action="PremiumAction" >
                    <table border="1">
                        <tr>
                            <td>Premium Type</td>
                            <td>Amount</td>
                            <td>Select</td>
                        </tr>
                        <logic:iterate id="pre" collection="${premium.premiumPlans}">
                            <tr>
                                <td>${pre.preType}</td>
                                <td>${pre.amount} $</td>
                                <td><html:radio property="premiumSelecter" value="${pre.preId}"/></td>
                            </tr>
                        </logic:iterate>
                        <tr>
                            <td><html:submit property="submit" value="Payment"/></td>
                            <td></td>
                            <td></td>
                        </tr>    
                    </table>
                </html:form>
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