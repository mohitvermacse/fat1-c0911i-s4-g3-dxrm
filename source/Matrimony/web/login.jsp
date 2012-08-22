<%-- 
    Document   : login
    Created on : Aug 13, 2012, 9:02:43 PM
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
        <html:form action="LoginAction" method="POST">
            <div style="color: red">
                <html:errors property="userName"/>
                <html:errors property="password"/>
                <html:errors property="loginUser"/>
            </div>
            <table>
                <tr>
                    <td align="right">UserName:</td>
                    <td align="left"> <html:text property="userName"/></td>
                </tr>
                <tr>
                    <td align="right">Password:</td>
                    <td align="left"><html:password property="password"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td align="left">
                        <html:submit value="Log in" property="button1"/>
                        <html:submit value="Log out" property="button2"/>
                    </td>
                </tr>
            </table>       
        </html:form>

    </body>
</html:html>

