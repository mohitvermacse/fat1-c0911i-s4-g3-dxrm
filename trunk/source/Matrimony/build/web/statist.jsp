<%-- 
    Document   : statistic
    Created on : Aug 28, 2012, 11:57:55 PM
    Author     : nvc
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
                $('#aDayPicker').datepick({showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'});
                $('#aMonthPicker').datepick({showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'});
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
        <c:set var="listNewUserADay" value="${requestScope.listNewUser}"/>
        <c:set var="listUserAmonth" value="${requestScope.listNewUserAmonth}"/>
        <jsp:useBean id="statBean" scope="session" class="bean.StatBean"/>
        <h3>Total User Of system: ${requestScope.total}</h3>
        <h3>Total User have Friend: ${requestScope.friend}</h3>
        <h3>Total money of today: ${statBean.todaySum}</h3>
        <h3>Total money of this Month: ${statBean.monthSum}</h3>

        <html:form action="StatistAction" method="post" styleId="validateForm">
            <h3>Total money of Custom Date:
                <html:text property="startDate" styleId="startPicker" size="12" styleClass="dpDate"/> to
                <html:text property="endDate" styleId="endPicker" size="12" styleClass="dpDate"/>
                ---  <html:submit value="Filter"/></h3>
            <h3>Choose a date you want statistic user has been generate:
                <html:text property="aDay" styleId="aDayPicker" size="12" styleClass="dpDate"/>
                ---  <html:submit value="Total User Of A Day"/></h3>
            <h3>Choose a month you want statistic user has been generate:
                <html:text property="aMonth" styleId="aMonthPicker" size="12" styleClass="dpDate"/>
                --- <html:submit value="Total New User Of A Month"/></h3>
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
                        <div style="color: green">${requestScope.totalUser}</div>
                        <c:forEach var="u" items="${listNewUserADay}">
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
            <tr>
                <td>
                    <table>
                        <div style="color: green">${requestScope.totalUserAMonth}</div>
                        <c:forEach var="u" items="${listUserAmonth}">
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
