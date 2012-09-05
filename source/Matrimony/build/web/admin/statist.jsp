<%-- 
    Document   : statistic
    Created on : Aug 28, 2012, 11:57:55 PM
    Author     : nvc
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Matrimony Online</title>       
        <jsp:include page="template/meta.jsp"/>        
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
    <body><div id="container">
            <div id="header">
                <h2>Matrimony Admin Area</h2>
                <div id="topmenu">
                    <ul>
                        <li><a href="index.html">Dashboard</a></li>
                        <li class="current"><a href="#">Statistics</a></li>
                        <li><a href="#">Orders</a></li>                        
                        <li><a href="#">Manage Request</a></li>                        
                    </ul>
                </div>
            </div>        
            <div id="wrapper">
                <div id="content">
                    <div style="display: none;">
                        <img id="calImg" src="jquery.datepick.package-4.0.6/calendar.gif" alt="Popup" class="trigger">
                    </div>
                    <c:set var="listNewUserADay" value="${requestScope.listNewUser}"/>
                    <c:set var="listUserAmonth" value="${requestScope.listNewUserAmonth}"/>
                    <jsp:useBean id="statBean" scope="session" class="bean.StatBean"/>


                    <h4>Total User Of system: ${requestScope.total}</h4>
                    <h4>Total User have Friend: ${requestScope.friend}</h4>
                    <h4>Total money of today: ${statBean.todaySum}</h4>
                    <h4>Total money of this Month: ${statBean.monthSum}</h4>
                    <html:form action="admin/Statistics" method="post" styleId="validateForm">
                        <h4 style="color: #5bb75b">Total money of Custom Date:</h4>
                        <html:text property="startDate" value="" styleId="startPicker" size="12" styleClass="dpDate"/> to
                        <html:text property="endDate" value="" styleId="endPicker" size="12" styleClass="dpDate"/>
                        ---  <html:submit value="Filter"/>
                        <h4 style="color: #5bb75b">Choose a date you want statistic user has been generate: </h4>
                        <html:text property="aDay" value="" styleId="aDayPicker" size="12" styleClass="dpDate"/>
                        ---  <html:submit value="Total User Of A Day"/>

                        <h4 style="color: #5bb75b">Choose a month you want statistic user has been generate:</h4>
                        <html:text property="aMonth" value="" styleId="aMonthPicker" size="12" styleClass="dpDate"/>
                        --- <html:submit value="Total New User Of A Month"/>

                    </html:form>

                    <br class="spacer" />
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
                                <h3 style="color: blue"  align="center"> ${requestScope.totalUser}</h3>
                                <table>
                                    <c:forEach var="u" items="${listNewUserADay}">
                                        <tr>
                                            <td>
                                                <a href="StatistAction.page?id=${u.userId}">
                                                    <img src=".${u.images}" height="40px" width="35px"/> ${u.userName}
                                                </a>
                                                <html:hidden property="email" value="${u.email}"/>
                                            </td>



                                        </tr>
                                    </c:forEach>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <h3 style="color: blue" align="center">${requestScope.totalUserAMonth}</h3>
                                <table>

                                    <c:forEach var="u" items="${listUserAmonth}">
                                        <tr>
                                            <td>
                                                <a href="StatistAction.page?id=${u.userId}">
                                                    <img src=".${u.images}"  height="40px" width="35px"/> ${u.userName}
                                                </a>
                                                <html:hidden property="email" value="${u.email}"/>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </table>
                            </td>
                        </tr>
                    </table>
                </div>            
            </div>
            <div id="footer">
                <div id="credits">
                    Matrimony Site
                </div>
                <br />

            </div>
        </div>



    </body>
</html>