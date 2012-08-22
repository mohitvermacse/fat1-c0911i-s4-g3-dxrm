<%-- 
    Document   : changePassword
    Created on : Aug 20, 2012, 9:07:03 PM
    Author     : nvc
--%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">

    <title>matrimony</title>

</head>
<body style="background-color: white">

    <html:form action="ChangePasswordAction" method="POST">
        <table>
            <tr>
                <td align="right">Old Password: </td>
                <td><html:password property="oldPassword"/></td>
                <td>
                    <div style="color: red">
                        <html:errors property="oldPasswords"/>
                        <html:errors property="validOldPasswords"/>
                    </div> 
                </td>
            </tr>
            <tr>
                <td align="right">New Password: </td>
                <td align="left"><html:password property="newPassword"/></td>
                <td>            
                    <div style="color: red">
                        <html:errors property="newPasswords"/>
                    </div> 
                </td>
            </tr>
            <tr>
                <td align="right">Confirm Password:  </td>
                <td align="left"> <html:password property="confirmPassword"/></td>
                <td>
                    <div style="color: red">
                        <html:errors property="validOldNewPasswords1"/>
                        <html:errors property="validOldNewPasswords"/>
                    </div> 
                </td>
            </tr>
            <tr>
                <td></td>
                <td algin="left"><html:submit value="Change"/></td>
            </tr>
        </table>
    </html:form>
</body>
</html:html>
