<%-- 
    Document   : register
    Created on : Aug 20, 2012, 11:05:47 PM
    Author     : nvc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html:html lang="true">
    <head>        
        <title>Matrimony</title>
    </head>
    <body style="background-color: white">     
        <html:form action="RegisterAction" method="POST">
            <c:set var="listCi" value="${requestScope.listCity}"/>
        <center>
            <div style="color: red">
                <html:errors property="userNameEr"/>
                <html:errors property="passwordEr"/>
                <html:errors property="firstNameEr"/>
                <html:errors property="lastNameEr"/>
                <html:errors property="genderEr"/>
                <html:errors property="emailEr"/>
                <html:errors property="phoneEr"/>
                <html:errors property="userEmailEr"/>
                <html:errors property="cityEr"/>
                <html:errors property="EmailEr"/>
            </div>
        </center>
        <table align="center">
            <tr>
                <td>User Name: </td>
                <td><html:text property="userName"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Password: </td>
                <td><html:password property="password"/></td>
                <td></td>
            </tr>
            <tr>
                <td>First Name: </td>
                <td><html:text property="firstName"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Last Name: </td>
                <td><html:text property="lastName"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><html:text property="address"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Gender: </td>
                <td>
                    <html:select property="gender">
                        <html:option value="Select">---Select--</html:option>
                        <html:option value="Male">Male</html:option>
                        <html:option value="Female">Female</html:option>
                    </html:select>
                </td>
                <td></td>
            </tr>
            <tr>
                <td>Birth Day: </td>
                <td>                        
                    <html:text property="birthDay"/>  
                </td>
                <td></td>
            </tr>
            <tr>
                <td>Email(Jon@gmail.com): </td>
                <td><html:text property="email"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Phone Number: </td>
                <td><html:text property="phoneNumber"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Marital status: </td>
                <td><html:textarea property="maritalStatus"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Height: </td>
                <td><html:text property="height"/></td>
                <td></td>
            </tr>
            <tr>
                <td>City: </td>
                <td>
                    <html:select property="city">
                        <%--<html:option value="Select">--Select--</html:option>--%>
                        <c:forEach var="c" items="${listCi}">  
                            <html:option value="${c.cityId}">${c.cityName}</html:option>
                        </c:forEach>
                    </html:select>
                </td>
                <td></td>
            </tr>
            <tr>
                <td>Languages: </td>
                <td><html:text property="languages"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Caste: </td>
                <td><html:text property="caste"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Family: </td>
                <td><html:textarea property="familyDetail"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Qualification: </td>
                <td><html:textarea property="qualification"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Working at: </td>
                <td><html:textarea property="workingAt"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Hobbies: </td>
                <td><html:text property="hobbies"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Favorite Music: </td>
                <td><html:textarea property="favoriteMusic"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Cuisine: </td>
                <td><html:textarea property="cuisine"/></td>
                <td></td>
            </tr>
            <tr>
                <td>Books: </td>
                <td><html:textarea property="books"/></td>
                <td></td>
            </tr>
            <tr>
                <td></td>
                <td><html:submit property="action" value="Register"/></td>
                <td></td>
            </tr>
        </table>
    </html:form>
</body>
</html:html>
