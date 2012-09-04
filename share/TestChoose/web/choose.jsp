<%-- 
    Document   : choose
    Created on : Sep 4, 2012, 9:17:24 PM
    Author     : UTAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/jquery.js"></script>              
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
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean scope="request" id="coutryList" class="bean.CountryBean"/>
        <html:form action="testAction">
            <html:select property="country" styleId="country" >
                <html:option value="">Select Country</html:option>
                <c:forEach var="item" items="${countryList.ar}">
                    <html:option value="${item.code}">${item.name}</html:option>
                </c:forEach>
            </html:select>
                <br/>
            <html:select property="city" styleId="city">
                <html:option value="">Select Country First</html:option>
            </html:select>
            <html:submit value="Submit"/>
        </html:form>
    </body>
</html>
