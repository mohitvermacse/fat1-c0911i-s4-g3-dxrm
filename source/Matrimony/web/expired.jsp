<%-- 
    Document   : expired
    Created on : Aug 29, 2012, 6:44:46 AM
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

        <script type="text/javascript"> 
            function checkAll(field)
            {
                for (i = 0; i < field.length; i++)
                    field[i].checked = true ;
            }

            function uncheckAll(field)
            {
                for (i = 0; i < field.length; i++)
                    field[i].checked = false ;
            }
            function check(field){
                for (i = 0; i < field.length; i++){
                    if(field[i].checked == true ){
                        uncheckAll(field);   
                    } 
                    else   
                        checkAll(field);     
                }
            }
            function validate(form) {                
                var total=""
                for(var i=0; i < document.sd.list.length; i++){
                    if(document.myform.list[i].checked)
                        total +=document.sd.list[i].value + "\n"
                }
                if(total=="")
                    alert("Please choose")
          
                return false;
            }
        </script>
    </head>
    <body style="background-color: white">
        <c:set var="listUser" value="${requestScope.listUserExpired}"/>
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
                <jsp:include page="template/leftBody2.jsp"></jsp:include>
            </div>
            <div id="rightPanel">

                <form id="1" name="myform" action="ExpireAction" method="POST">
                    <h2 class="welcomeHeader">Welcome to Matrimony Online</h2>
                    <h3 style="color: green"> ${requestScope.status}</h3>
                    <%----%>                   
                    <input type="submit" name="action" class="goBtn" value="Expired"/>
                    <h3 style="color: green" align="center" >List user expired </h3>
                    <ul class="profiles">   
                        <input type="checkbox" onclick="check(document.myform.list)"/> all
                        <table width="100%" >                                           
                            <c:forEach var="u" items="${listUser}">
                                <tr>                                         
                                    <td>
                                        <input type="checkbox" name="list" value="${u.userId}"/>
                                        <a href="InforServlet?id=${u.userId}">
                                            <img src=".${u.images}" height="40px" width="35px"/>
                                            ${u.fullName}
                                        </a>                       
                                        <html:hidden property="email" value="${u.email}"/>
                                        <html:hidden property="expireDa" value="${u.expireDate}"/>
                                    </td>                                      
                                </tr>                        
                            </c:forEach>
                        </table>
                    </ul>
                </form>
                <br class="spacer" />
                <ul class="pagination">
                    <li class="left"><a href="#" title="Previous">&lt;
                            Previous</a></li>
                    <li><a href="#" title="1">1</a>|</li>
                    <li><a href="#" title="2">2</a>|</li>
                    <%--<li><a href="#" title="3">3</a>|</li>
                    <li><a href="#" title="4">4</a>|</li>
                <li><a href="#" title="5">5</a></li--%>
                    <li class="right"><a href="#" title="Next">Next
                            &gt;</a></li>
                </ul>
                </form>
                <br class="spacer" />
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