<%-- 
    Document   : profile
    Created on : Aug 17, 2012, 11:31:29 PM
    Author     : nvc
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html:html lang="true">
    <head>      
        <title>Matrimony.com</title>      
    </head>
    <body style="background-color: white">
        <c:set var="infor" value="${requestScope.information}"/>
        <table>
            <c:forEach var="inf" items="${infor}">
                <tr>
                    <td align="right">
                        <img src=".${inf.images}" height="40px" width="35px"/>
                    </td>
                    <td align="left">${inf.fullName}</td>
                </tr>
                <tr>
                    <td align="right">Address: </td>
                    <td align="left">${inf.address}</td>
                </tr>
                <tr>
                    <td align="right">Gender:</td>
                    <td align="left">${inf.gender}</td>
                </tr>
                <tr>
                    <td align="right">Email:</td>
                    <td align="left">${inf.email}</td>
                </tr>
                <tr>
                    <td align="right">Phone Number:</td>
                    <td align="left">${inf.phoneNumber}</td>
                </tr>
                <tr>
                    <td align="right">City:</td>
                    <td align="left">${inf.cityName}</td>
                </tr>
                <tr>
                    <td align="right">Country:</td>
                    <td align="left">${inf.countryName}</td>
                </tr>
                <tr>
                    <td align="right">Marital:</td>
                    <td align="left">${inf.maritalStatus}</td>
                </tr>
                <tr>
                    <td align="right">Height:</td>
                    <td align="left">${inf.languages}</td>
                </tr>
                <tr>
                    <td align="right">Caste: </td>
                    <td align="left">${inf.caste}</td>
                </tr>
                <tr>
                    <td align="right">Family Detail: </td>
                    <td align="left">${inf.familyDetail}</td>
                </tr>
                <tr>
                    <td align="right">Qualification: </td>
                    <td align="left">${inf.qualification}</td>
                </tr>
                <tr>
                    <td align="right">Working At:</td>
                    <td align="left">${inf.workingAt}</td>
                </tr>
                <tr>
                    <td align="right">Hobbies: </td>
                    <td align="left">${inf.hobbies}</td>
                </tr>
                <tr>
                    <td align="right">Favorite Music: </td>
                    <td align="left">${inf.favorite}</td>
                </tr>
                <tr>
                    <td align="right">Movies:</td>
                    <td align="left">${inf.movies}</td>
                </tr>
                <tr>
                    <td align="right">Cuisine: </td>
                    <td align="left">${inf.cuisine}</td>
                </tr>
                <tr>
                    <td align="right">Book: </td>
                    <td align="left">${inf.book}</td>
                </tr>

            </c:forEach>

        </table>
    </body>
</html:html>