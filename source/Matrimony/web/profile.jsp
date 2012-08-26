<%-- 
    Document   : profile
    Created on : Aug 26, 2012, 11:51:06 PM
    Author     : SENJURO
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
        <h1>Profile</h1>
        <jsp:useBean id="userManager" class="bean.UserManager" scope="session"/>
        <html:form action="ProfileAction" >
            <logic:iterate id="p" collection="${userManager.userList}">
            <table>
                <tr>
                    <td>UserName: </td>
                    <td><html:text property="userName" value="${p.userName}" disabled="true"/></td>
                    <td>
                    </td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><html:text property="password" value="${p.password}"/></td>
                    <td><html:errors property="passwordError" /></td>
                </tr>
                <tr>
                    <td>Full Name: </td>
                    <td><html:text property="fullName" value="${p.fullName}"/></td>
                    <td><html:errors property="fullNameError" /></td>
                </tr>
                <tr>
                    <td>Address: </td>
                    <td><html:text property="address" value="${p.address}"/></td>
                    <td><html:errors property="addressError" /></td>
                </tr>
                <tr>
                    <td>Gender: </td>
                    <td>
                        Male <html:radio property="gender" value="Male"/>
                        Female <html:radio property="gender" value="Female"/>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td>BirthDay: </td>
                    <td><html:text property="birthDay" value="${p.birthDay}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><html:text property="email" value="${p.email}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Phone Number: </td>
                    <td><html:text property="phoneNumber" value="${p.phoneNumber}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Marital Status: </td>
                    <td><html:text property="maritalStatus" value="${p.maritalStatus}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Country: </td>
                    <td>
                        <html:select property="countryName">
                            <logic:iterate id="country" collection="${userManager.countryList}">
                                <html:option value="${country}"/>
                            </logic:iterate>
                        </html:select>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td>City: </td>
                    <td>
                        <html:select property="cityName">
                            <logic:iterate id="city" collection="${userManager.cityList}">
                                <html:option value="${city}"/>
                            </logic:iterate>
                        </html:select>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td>Height: </td>
                    <td><html:text property="height" value="${p.height}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Languages: </td>
                    <td><html:text property="languages" value="${p.languages}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Caste: </td>
                    <td><html:text property="caste" value="${p.caste}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Family Details: </td>
                    <td><html:text property="familyDetails" value="${p.familyDetail}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Qualification: </td>
                    <td><html:text property="qualification" value="${p.qualification}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Working At: </td>
                    <td><html:text property="workingAt" value="${p.workingAt}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Hobbies: </td>
                    <td><html:text property="hobbies" value="${p.hobbies}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Favorite Music: </td>
                    <td><html:text property="favoriteMusic" value="${p.favorite}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Movies: </td>
                    <td><html:text property="movies" value="${p.movies}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Cuisine: </td>
                    <td><html:text property="cuisine" value="${p.cuisine}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Books: </td>
                    <td><html:text property="books" value="${p.book}"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Registed Date: </td>
                    <td><html:text property="" value="${p.registerDate}" disabled="true"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Expire Date: </td>
                    <td><html:text property="" value="${p.expireDate}" disabled="true"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Status: </td>
                    <td><html:text property="" value="${p.status}" disabled="true"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td><html:submit property="submit" value="Update"/></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
        </logic:iterate>
        </html:form>
    </body>
</html>
