<%-- 
    Document   : statistic
    Created on : Aug 19, 2012, 10:52:31 PM
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

        <title>matrimony.com/statistic</title>

    </head>
    <body style="background-color: white">   
        <html:form action="StatisticAction" method="PSOT">            
        <center>
            <table width="100%">
                <tr>
                    <td align="right" with="50%">Statistic User have Friend: </td>                   
                    <td align="left" with="50%">
                        <html:submit property="action" value="Total user have friend"/>
                        ${requestScope.friend}
                    </td>
                </tr>
                <tr>
                    <td align="right" with="50%">Statistic Total User Of system: </td>                   
                    <td align="left" with="50%">
                        <html:submit property="action" value="Total User Of System"/>
                        ${requestScope.total}
                    </td>
                </tr>
                <tr>
                    <td align="right" with="50%">
                        Statistic Total New User Of A Day:</br>                    
                        <html:select property="aDay">
                            <html:option value="8/13/2012"></html:option>
                            <html:option value="8/19/2012"></html:option>
                        </html:select>
                    </td>             
                    <td align="left" with="50%"> 
                        <html:submit property="action" value="Total User Of A Day"/>
                        ${requestScope.aday}
                    </td>
                </tr>
                <tr>
                    <td align="right" with="50%">
                        Statistic Total New User Of A Month:</br>
                        <html:select property="aMonth">
                            <html:option value="7"></html:option>
                            <html:option value="8"></html:option>                           
                        </html:select>
                        <html:select property="aYear">
                            <html:option value="2012"></html:option>
                            <html:option value="2013"></html:option>                           
                        </html:select>
                    </td>                   
                    <td align="left" with="50%">
                        <html:submit property="action" value="Total New User Of A Month"/>
                        ${requestScope.amonth}
                    </td>
                </tr>
            </table>
        </center>
    </html:form>
</body>
</html:html>