<%-- 
    Document   : register
    Created on : Aug 22, 2012, 9:02:30 PM
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
        <jsp:useBean id="cityList" class="bean.UserManager" scope="session"/>
        <html:form action="RegisterAction" >
            <table>
                <tr>
                    <td>UserName: </td>
                    <td><html:text property="userName"/></td>
                    <td>
                        <html:errors property="userNameError" />
                        <html:errors property="existed" />
                    </td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><html:text property="password"/></td>
                    <td><html:errors property="passwordError" /></td>
                </tr>
                <tr>
                    <td>Full Name: </td>
                    <td><html:text property="fullName"/></td>
                    <td><html:errors property="fullNameError" /></td>
                </tr>
                <tr>
                    <td>Address: </td>
                    <td><html:text property="address"/></td>
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
                    <td><html:text property="birthDay"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Email: </td>
                    <td><html:text property="email"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Phone Number: </td>
                    <td><html:text property="phoneNumber"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Marital Status: </td>
                    <td><html:text property="maritalStatus"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>City: </td>
                    <td>
                        <html:select property="cityName">
                            <logic:iterate id="city" collection="${cityList.cityList}">
                                <html:option value="${city}"/>
                            </logic:iterate>
                        </html:select>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td>Height: </td>
                    <td><html:text property="height"/></td>
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
                    <td>Family Details: </td>
                    <td><html:text property="familyDetails"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Qualification: </td>
                    <td><html:text property="qualification"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Working At: </td>
                    <td><html:text property="workingAt"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Hobbies: </td>
                    <td><html:text property="hobbies"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Favorite Music: </td>
                    <td><html:text property="favoriteMusic"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Movies: </td>
                    <td><html:text property="movies"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Cuisine: </td>
                    <td><html:text property="cuisine"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td>Books: </td>
                    <td><html:text property="books"/></td>
                    <td></td>
                </tr>
                <tr>
                    <td><html:submit property="submit" value="Register"/></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
        </html:form>
    </body>
</html>
