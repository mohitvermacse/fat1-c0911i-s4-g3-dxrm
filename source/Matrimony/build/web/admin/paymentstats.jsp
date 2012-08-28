<%-- 
    Document   : paymentstats
    Created on : Aug 17, 2012, 2:34:40 PM
    Author     : UTAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Statistic</title>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js"></script>
        <style type="text/css">@import "jquery.datepick.package-4.0.6/jquery.datepick.css";</style> 
        <style type="text/css">
            label { width: 10em; float: left; }
            label.error { float: none; color: red; padding-left: .5em; vertical-align: top; }
        </style>
        <script type="text/javascript" src="jquery.datepick.package-4.0.6/jquery.validate.js"></script>
        <script type="text/javascript" src="jquery.datepick.package-4.0.6/jquery.mousewheel.js"></script>
        <script type="text/javascript" src="jquery.datepick.package-4.0.6/jquery.datepick.js"></script>
        <script type="text/javascript" src="jquery.datepick.package-4.0.6/jquery.datepick.validation.js"></script>
        <script type="text/javascript">            
            function customRange(dates) { 
                if (this.id == 'startPicker') { 
                    $('#endPicker').datepick('option', 'minDate', dates[0] || null); 
                } 
                else { 
                    $('#startPicker').datepick('option', 'maxDate', dates[0] || null); 
                } 
            }
            $(function() {                
                $('#startPicker').datepick({onSelect: customRange, showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'});
                $('#endPicker').datepick({onSelect: customRange, showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'}); 
                $('#aDayPicker').datepick({onSelect: customRange, showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'})
                $('#validateForm').validate({ 
                    errorPlacement: $.datepick.errorPlacement, 
                    rules: { 
                        startPicker: { 
                            required: true, 
                            dpDate: true 
                        },
                        endPicker: { 
                            required: true, 
                            dpDate: true 
                        }
       
                    }, 
                    messages: {                         
                        startPicker: 'Please enter a valid date',
                        endPicker: 'Please enter a valid date'
                    }});
                
            });
        </script>
    </head>
    <body>
        <div style="display: none;">
            <img id="calImg" src="jquery.datepick.package-4.0.6/calendar.gif" alt="Popup" class="trigger">
        </div>
        <c:set var="listNewUser" value="${requestScope.listNewUser}"/>
        <jsp:useBean id="statBean" scope="session" class="bean.StatBean"/>
        <h3>Total money of today: ${statBean.todaySum}</h3>
        <h3>Total money of this Month: ${statBean.monthSum}</h3> 
        <h3>Total money of Custom Date:</br></h3> 
            <html:form action="StatsAction" method="post" styleId="validateForm">
                <html:text property="startDate" styleId="startPicker" size="12" styleClass="dpDate"/> to
            <html:text property="endDate" styleId="endPicker" size="12" styleClass="dpDate"/>
            ---  <html:submit value="Filter"/>
            <h3>Choose a date you want statistic user has been generate: </h3>
            <html:text property="aDay" styleId="aDayPicker" size="12" styleClass="dpDate"/>
            ---  <html:submit value="A Day"/>
        </html:form>
        <table>
            <tr>
                <td>
                    <table>
                        <th>Date</th>
                        <th>Amount</th>
                        <c:forEach var="item" items="${statBean.arrS}">
                            <tr>
                                <td align="center">${item.date}</td>
                                <td align="center">${item.sum}</td>
                            </tr>
                        </c:forEach>  
                    </table>
                </td>
            </tr>
            <tr>
                <td>
                    <table>
                        <div style="color: green">${requestScope.listADay}</div>
                        <c:forEach var="u" items="${listNewUser}">
                            <tr>

                                <td>
                                    <a href="StatsAction.page?id=${u.userId}" style="font: underLine:false"> ${u.images} ${u.fullName}</a>
                                </td>
                                <td>${u.email}
                                    <html:hidden property="email" value="${u.email}"/>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </td>
            </tr>
        </table>

    </body>
</html>
