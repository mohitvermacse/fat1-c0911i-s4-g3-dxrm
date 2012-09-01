<%-- 
    Document   : premium
    Created on : Aug 27, 2012, 7:13:27 PM
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
    </body>
</html>
