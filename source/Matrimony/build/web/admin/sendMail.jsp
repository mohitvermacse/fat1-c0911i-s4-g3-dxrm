<%-- 
    Document   : sendMail
    Created on : Aug 29, 2012, 10:55:36 PM
    Author     : nvc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="../SendmailServlet" method="POST">
            <table>
                <tr>
                    <td>Mail To:</td>
                    <td><input type="text" name="mailTo"/></td>
                </tr>
                <tr>
                    <td>Subject:</td>
                    <td><input type="text" name="subject"/></td>
                </tr>
                <tr>
                    <td>Messages:</td>
                    <td>
                        <input type="text" name="messages" height="250px" width="250px"/>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Send"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
