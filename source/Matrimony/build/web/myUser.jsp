<%-- 
    Document   : homeUser
    Created on : Aug 13, 2012, 11:27:04 PM
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
        <c:set var="receive" value="${requestScope.listReceive}"/>
        <c:set var="friend" value="${requestScope.listFriend}"/>


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
                <h2 class="welcomeHeader">Welcome to Matrimony Online</h2>
                <form id="1" name="myform" action="TransferRequest" method="POST">
                    <h3 style="color: green" align="center" >List My Friend</h3>
                    <ul class="profiles">  
                        <table width="100%">
                            <c:forEach var="f" items="${friend}">
                                <html:form action="MyUserAction" method="POST">
                                    <tr>
                                        <td align="left">
                                            <a href="MyUserAction.page?friendId=${f.sendUserId}" style="font: underLine ">
                                                <img src=".${f.images}" height="45px" width="40px"/>${f.fullName}
                                            </a>
                                        </td>                                   
                                    </tr>
                                </html:form>
                            </c:forEach>
                        </table>
                    </ul>
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
                </form><br class="spacer" />
                <ul class="profiles"> 
                    <h3 style="color: green" align="center" >List Friend Pending</h3>                   
                    <table width="100%">
                        <c:forEach var="r" items="${receive}">
                            <html:form  action="MyUserAction" method="POST">
                                <tr>
                                    <td>
                                        <a href="MyUserAction.page?friendId=${r.sendUserId}" style="font: underLine ">
                                            <img src=".${r.avatarLink}" height="45px" width="50px"/> ${r.userName}
                                        </a>
                                    </td>
                                    <td align="center">
                                        ${r.content}
                                        <html:hidden property="receiveId" value="${r.receiverId}"/>
                                        <html:hidden property="sendId" value="${r.sendId}"/>
                                    </td>                                   
                                    <td align="center">                         
                                        <html:submit property="btn" value="Accept"/>
                                        <html:submit property="btn" value="Deny"/>
                                    </td>
                                </tr>
                            </html:form>
                        </c:forEach>
                    </table>
                </ul>
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
            <div style="color: red">${requestScope.status}</div>
        </div> 
        <%--Footer End--%>   
    </body>
</html>