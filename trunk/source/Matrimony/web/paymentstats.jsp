<%-- 
    Document   : paymentstats
    Created on : Aug 17, 2012, 2:34:40 PM
    Author     : UTAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment Stats</title>
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
        <jsp:useBean id="statBean" scope="session" class="bean.StatBean"/>
        <h1>Stats Today</h1> ${statBean.todaySum}
        <h1>Stats This Month</h1> ${statBean.monthSum}
        <h1>Stats Custom Date</h1>        

        <html:form action="StatsAction" method="post" styleId="validateForm">
            <html:text property="startDate" styleId="startPicker" size="12" styleClass="dpDate"/> to <html:text property="endDate" styleId="endPicker" size="12" styleClass="dpDate"/>  ---  <html:submit value="Filter"/>
        </html:form>
        <table>
            <tr>
                <th>Date</th>
                <th>Amount</th>
            </tr>
            <c:forEach var="item" items="${statBean.arrS}">
                <tr>
                    <td>${item.date}</td>
                    <td>${item.sum}</td>
                </tr>
            </c:forEach>  
        </table>    



    </body>
</html>
