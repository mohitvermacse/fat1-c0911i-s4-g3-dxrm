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
        <jsp:include page="template/meta.jsp"></jsp:include>
        <script type="text/javascript">
            $(document).ready(function(){
                $("#country").change(function(){
                    $id = $(this).val();
                    $.ajax({
                        type:"Post",
                        url:"LoadCity.page",
                        data:"id="+$id,
                        cache:"false",
                        success:function(html){
                            $("#city").html(html);
                        }
                    });
                });
            });
        </script>
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
                $('#startPicker').datepick({onSelect:customRange, showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'});
                $('#endPicker').datepick({onSelect: customRange, showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'}); 
                $('#aDayPicker').datepick({showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'});
                $('#aMonthPicker').datepick({onSelect: customRange, showTrigger: '#calImg', dateFormat: 'mm/dd/yyyy'});
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
            <div id="rightPanel" align="center">
                <h1>Profile</h1>
                <jsp:useBean scope="request" id="coutryList" class="bean.CountryBean"/>
                <jsp:useBean id="userManager" class="bean.UserManager" scope="session"/>
                <html:form action="ProfileAction" >
                    <logic:iterate id="p" collection="${userManager.userList}">
                        <table>
                            <tr>
                                <td></td>
                                <td><img src="${p.avatarLink}"/></td>
                                <td></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><html:link page="/ManagePhoto.page"><b>Change Avatar</b></html:link></td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>UserName: </td>
                                <td>
                                    <html:text property="" value="${p.userName}" disabled="true"/>
                                    <html:hidden property="userName" value="${p.userName}" />
                                </td>
                                <td></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><html:link page="/changePassword.jsp"><b>Change your password</b></html:link></td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>Full Name: </td>
                                <td>
                                    <html:text property="fullName" value="${p.fullName}"/>
                                    <font style="color: red">*</font>
                                </td>
                                <td>
                                    <font style="color: red">
                                        <html:errors property="fullNameError" />
                                    </font>
                                </td>
                            </tr>
                            <tr>
                                <td>Address: </td>
                                <td>
                                    <html:text property="address" value="${p.address}"/>
                                    <font style="color: red">*</font>
                                </td>
                                <td>
                                    <font style="color: red">
                                        <html:errors property="addressError" />
                                    </font>
                                </td>
                            </tr>
                            <tr>
                                <td>Gender: </td>
                                <td>
                                    Male <html:radio property="gender" value="Male"/>
                                    Female <html:radio property="gender" value="Female"/>
                                    <font style="color: red">*</font>
                                </td>
                                <td>
                                    <font style="color: red">
                                        <html:errors property="genderError" />
                                    </font>
                                </td>
                            </tr>
                            <tr>
                            <td>BirthDay: </td>
                            <td>
                                <html:text property="birthDay" styleId="aDayPicker" size="12" styleClass="dpDate" value="${p.birthDay}"/>                        
                                <font style="color: red">*</font> Format: mm/dd/yyyy
                            </td>
                            <td>
                                <font style="color: red">
                                    <html:errors property="birthdayError" />                        
                                    <html:errors property="birthdayInvalid" />
                                </font>    
                            </td>
                        </tr>
                            <tr>
                                <td>Email: </td>
                                <td>
                                    <html:text property="email" value="${p.email}"/>
                                    <font style="color: red">*</font>
                                </td>
                                <td>
                                    <font style="color: red">
                                        <html:errors property="emailExisted" />
                                        <html:errors property="invalidEmail" />
                                    </font>
                                </font>
                                </td>
                            </tr>
                            <tr>
                                <td>Phone Number: </td>
                                <td>
                                    <html:text property="phoneNumber" value="${p.phoneNumber}"/>
                                    <font style="color: red">*</font>
                                </td>
                                <td>
                                    <font style="color: red">
                                        <html:errors property="phoneInvalid" />
                                    </font>
                                </td>
                            </tr>
                            <tr>
                                <td>Marital Status: </td>
                                <td>
                                    <html:select property="maritalStatus" >
                                        <html:option value="Single"/>
                                        <html:option value="Marrie"/>
                                    </html:select>
                                    <font style="color: red">*</font>
                                </td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>Country: </td>
                                <td>
                                    <html:hidden property="countryIDTemp" value="${p.countryName}" />
                                    <html:select property="countryID" styleId="country" >
                                        <html:option value="empty">Select Country</html:option>
                                        <c:forEach var="item" items="${countryList.ar}">
                                            <html:option value="${item.countryId}">${item.countryName}</html:option>
                                        </c:forEach>
                                    </html:select>
                                    <font style="color: red">*</font>
                                </td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>City: </td>
                                <td>
                                    <html:hidden property="cityNameTemp" value="${p.cityName}" />
                                    <html:select property="cityName" styleId="city">
                                        <html:option value="empty">Select Country First</html:option>
                                    </html:select>
                                    <font style="color: red">*</font>
                                </td>
                                <td></td>
                            </tr>
                            <tr>
                            <td>Height: </td>
                                <td>
                                    <html:text property="height" value="${p.height}"/> Cm 
                                    <font style="color: red">*</font>
                                </td>
                                <td>
                                    <font style="color: red">
                                        <html:errors property="heightInvalid" />
                                    </font>    
                                </td>
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
                                <td></td>
                                <td><html:submit property="submit" value="Update"/></td>
                                <td></td>
                            </tr>
                        </table>
                    </logic:iterate>
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