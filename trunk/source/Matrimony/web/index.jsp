<%-- 
    Document   : index
    Created on : Aug 14, 2012, 3:52:54 PM
    Author     : Senjuro
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
        <html:form action="MatrimonyAction">
            <html:submit property="name" value="sendRequest" />
        </html:form>
    </body>
</html>
