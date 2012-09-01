<%-- 
    Document   : payment
    Created on : Aug 27, 2012, 7:41:18 PM
    Author     : SENJURO
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
        <h1>Payment Gateway</h1>
        <html:form action="PaymentAction">
            <html:errors property="balanceError" />
            <html:errors property="cardNumberError" />
            
            <table>
                <tr>
                    <td>Your card account: </td>
                    <td>
                        <html:text property="identityNumber" />
                    </td>
                    <td>
                        <html:errors property="identityNumberError" />
                    </td>                    
                </tr>
                <tr>
                    <td>Password: </td>
                    <td>
                        <html:text property="password" />
                    </td>
                    <td>
                        <html:errors property="passwordError" />
                    </td>
                    
                </tr>
                <tr>
                    <td>Premium plan: </td>
                    <td><input type="text" value="${premiumType}" disabled="true"/></td>
                </tr>
                <tr>
                    <td>Amount: </td>
                    <td><html:text property="" value="${amount}" disabled="true"/><html:hidden property="money" value="${amount}" />$</td>
                </tr>
                <tr>
                    <td><html:submit value="Accept"/></td>
                    <td></td>
                </tr>
            </table>
        </html:form>
    </body>
</html>
