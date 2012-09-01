<%-- 
    Document   : forgotPassword
    Created on : Sep 1, 2012, 9:44:40 PM
    Author     : nvc
--%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

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
        <h1>Hello World!</h1>
        <html:form action="ForgotPasswordAction" method="POST">
            <div style="color: red">${requestScope.status}</div>
            <table>
                <tr>
                    <td>Enter your email:<br/>
                        <html:text property="email"/>
                        ex:lukas@gmai.com.vn
                        <div style="color: red">
                            <html:errors property="email"/>
                            <html:errors property="invalidEmail"/>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td><html:submit value="forgot password"/></td>
                </tr>
            </table>
        </html:form>
    </body>
</html>
