<%-- 
    Document   : search
    Created on : Sep 4, 2012, 1:56:50 PM
    Author     : nvc
--%>

<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Matrimony Online</title>
        <jsp:include page="template/meta.jsp"></jsp:include>
    </head>
    <body style="background-color: white">
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
                <form action="SearchSevlet" method="post" enctype="multipart/form-data">
                    <h2 class="formHeader">Partner Search</h2>
                    <input type="checkbox" name="searchCheck"/>Date
                    <label>I am a</label> <input name="" type="text" /><br class="spacer" />
                    <label>Seeking a</label> <input name="" type="text" /><br class="spacer" />
                    <label>Between ages</label> <input name="" class="small" type="text" /> <label class="small centerAlign">And</label> <input name="" class="small" type="text" /><br class="spacer" />
                    <label>Photos only</label> <input name="" type="text" /><br class="spacer" />
                    <input src="template/images/go_btn.gif" title="Go" class="goBtn3" type="image" /> <br class="spacer" />
                </form>
                <%-- <jsp:include page="template/leftBody1.jsp"></jsp:include>--%>
                <jsp:include page="template/leftBody2.jsp"></jsp:include>
            </div>
            <div id="rightPanel">
                <jsp:include page="template/rightBody1.jsp"></jsp:include>
                <jsp:include page="template/rightBody2.jsp"></jsp:include>
                <jsp:include page="template/rightBody3.jsp"></jsp:include>
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