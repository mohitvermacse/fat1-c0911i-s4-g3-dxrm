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
            <table>
                <tr>
                    <td align="right">UserName:</td>
                    <td align="left"> <html:text property="userName"/></td>
                    <td><div style="color: red"> <html:errors property="use"/></div></td>
                </tr>
                <tr>
                    <td align="right">Password:</td>
                    <td align="left"><html:password property="password"/></td>
                    <td><div style="color: red"><html:errors property="pas"/></div></td>
                </tr>
                <tr>
                    <td></td>
                    <td align="left">
                        <html:submit value="Log in"/>
                        <html:submit value="Log out"/>
                    </td>
                </tr>
            </table> 
            <div style="color: red"> 
                <html:errors property="logUser"/>
            </div>     
        </html:form>
    </body>
</html:html>

