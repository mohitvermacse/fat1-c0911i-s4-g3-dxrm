<%-- 
    Document   : newjsp
    Created on : Sep 3, 2012, 4:09:49 PM
    Author     : nvc
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Matrimony Online</title>
        <jsp:include page="template/meta.jsp"></jsp:include>

    </head>
    <body>

        <%-- Header start--%>
        <%--<div class="header-repeat">--%>
        <div id="header">
            <jsp:include page="template/header.jsp"></jsp:include>
            <ul>
                <jsp:include page="template/ul.jsp"></jsp:include>
            </ul>
        </div>
        <%--Header End--%>
        <%--Boby Start--%>
        <div id="body">
            <div id="leftPanel">
                <html:form action="LoginAction" method="post" enctype="multipart/form-data">   
                    <%-- <h2 class=" ">Partner Search</h2> 	--%>
                    <h2 class="formHeader">Partner Login</h2>
                    <label>UserName:</label>  <html:text property="userName"/><br class="spacer" />
                    <div style="color: red"><html:errors property="use"/></div>
                    <label>Password:</label> <html:password property="password"/><br class="spacer" />
                    <div style="color: red"><html:errors property="pas"/></div>
                    <br class="spacer" />
                    <input name="btn" class="goBtn1" type="submit" value="Log in"/>                  
                    <a class="a" href="/Matrimony/forgotPassword.jsp">forgot password</a>
                    <br class="spacer" />
                    <div style="color: red">
                        <html:errors property="logUser"/>
                        <html:errors property="userExpireDate"/>
                    </div>
                </html:form> <br class="spacer" />  
                <jsp:include page="template/leftPanel.jsp"></jsp:include>
            </div>
            <div id="rightPanel">
                <h1>Payment Gateway</h1>
                <html:form action="PaymentAction">
                    <div style="color: red"> 
                        <html:errors property="balanceError" />
                        <html:errors property="cardNumberError" />
                    </div>
                    <table>
                        <tr>
                            <td>Your card account: </td>
                            <td>
                                <html:text property="identityNumber" />
                            </td>
                            <td>
                                <div style="color: red"> 
                                    <html:errors property="identityNumberError" />
                                </div>
                            </td>                    
                        </tr>
                        <tr>
                            <td>Password: </td>
                            <td>
                                <html:password property="password" />
                            </td>
                            <td>
                                <div style="color: red"> 
                                    <html:errors property="passwordError" />
                                </div>
                            </td>

                        </tr>
                        <tr>
                            <td>Premium plan: </td>
                            <td><input type="text" value="${premiumType}" disabled="true"/></td>
                        </tr>
                        <tr>
                            <td>Amount: </td>
                            <td><html:text property="" value="${amount}" disabled="true"/><html:hidden property="money" value="${amount}" />$</td>
                        </tr>
                        <tr>
                            <td><html:submit value="Accept"/></td>
                            <td></td>
                        </tr>
                    </table>
                </html:form>
            </div>
            <br class="spacer" />
        </div>
        <%--Boby End--%>
        <%--Footer Start--%>
        <div id="footer">
            <jsp:include page="template/footer.jsp"></jsp:include>
        </div> 
        <%--Footer End--%>
    </body>
</html>