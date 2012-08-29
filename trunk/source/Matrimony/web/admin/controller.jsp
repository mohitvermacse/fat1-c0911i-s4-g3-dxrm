<%-- 
    Document   : controller
    Created on : Aug 29, 2012, 6:26:22 AM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matrimony</title>
    </head>
    <body>
        <html:form action="ControllerAdminAction" method="POST">
            <html:submit property="action" value="Manager Statistic"/>
            <html:submit property="action" value="Manager user Expired"/>
            <html:submit property="action" value="Manager Request"/>
        </html:form>
    </body>
</html>
