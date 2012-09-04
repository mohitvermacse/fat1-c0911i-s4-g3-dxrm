<%-- 
    Document   : transfer
    Created on : Sep 4, 2012, 3:49:11 AM
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
        <c:set var="pending" value="${requestScope.listTransfer}"/>        
        <c:set var="transfer" value="${requestScope.listRequestTransfer}"/>
        <c:set var="approved" value="${requestScope.listRequestApproved}"/>


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
                <jsp:include page="template/leftPanel.jsp"></jsp:include>
            </div>
            <div id="rightPanel">
                <h2 class="welcomeHeader">Welcome to Matrimony Online</h2>
                <form id="1" name="myform" action="TransferRequest" method="POST">
                    <input type="submit" name="action" class="goBtn1"  value="Display All Transfer"/>
                    <input type="submit" src="temaple/images/go_btn.gif" name="action" class="goBtn2"  value="Display All Approved"/>

                    <h3 style="color: green" align="center" >List request Pending </h3>
                    <input type="submit" name="action" value="Transfer"/>
                    <ul class="profiles">   
                        <table width="100%" > 
                            <th><input type="checkbox" onclick="check(document.myform.list)"/></th>
                            <th></th>               
                            <th></th>
                            <th></th>                            
                            <c:forEach var="t" items="${pending}">
                                <tr>
                                    <td width="8%" align="center">
                                        <input type="checkbox" name="list" value="${t.receiverId}"/>
                                    </td><td align="center">
                                        <a href="InforServlet?id=${t.sendUserId}">
                                            <img src=".${t.images}" height="40px" width="35px"/>${t.userName}
                                            <input type="hidden" name="receiveID" value="${t.receiverId}"/>
                                        </a>
                                    </td> <td align="center">${t.content}</td> 
                                    <td align="center">
                                        <a href="InforServlet?id=${t.userId}">
                                            <img src=".${t.sImages}" height="45px" width="40px"/>${t.sUserName}
                                        </a>
                                    </td> 
                                </tr>
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
                    <h3 style="color: green" align="center" >List request Transfer </h3>
                    <table width="100%">
                        <th></th>               
                        <th></th>
                        <th></th>
                        <th></th>
                        <c:forEach var="t" items="${transfer}">
                            <form id="2" action="TransferRequest" method="POST">
                                <tr>
                                    <td align="center">
                                        <a href="InforServlet?id=${t.sendUserId}" style="font: underLine ">
                                            <img src=".${t.images}"  height="45px" width="40px"/>${t.userName}
                                        </a>
                                        <input type="hidden" name="receiveID" value="${t.receiverId}"/></td>
                                    <td align="center">${t.content}</td>
                                    <td align="center">
                                        <a href="InforServlet?id=${t.userId}">
                                            <img src=".${t.sImages}"  height="45px" width="40px"/>${t.sUserName}
                                        </a>
                                    </td>
                                </tr>
                            </form>
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
                <ul class="profiles"> 
                    <h3 style="color: green" align="center">List request approved </h3>
                    <table width="100%">
                        <th></th>               
                        <th></th>
                        <th></th>
                        <th></th>
                        <c:forEach var="t" items="${approved}">
                            <form id="2" action="TransferRequest" method="POST">
                                <tr>
                                    <td align="center">
                                        <a href="InforServlet?id=${t.sendUserId}" style="font: underLine ">
                                            <img src=".${t.images}"  height="45px" width="40px"/>${t.userName}
                                        </a>
                                        <input type="hidden" name="receiveID" value="${t.receiverId}"/>
                                    </td>                               
                                    <td align="center">${t.content}</td>
                                    <td align="center">
                                        <a href="InforServlet?id=${t.userId}">
                                            <img src=".${t.sImages}"  height="45px" width="40px"/>${t.sUserName}
                                        </a>
                                    </td>           
                                </tr>
                            </form>
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
            </div> 
        <%--Footer End--%>       
    </body>
</html>
