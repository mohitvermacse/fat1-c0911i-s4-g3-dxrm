<%-- 
    Document   : transferRequest
    Created on : Aug 22, 2012, 4:36:24 PM
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
        <title></title>
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

        <form id="1" name="myform" action="TransferRequest" method="POST">            
            <input type="submit" name="action" value="Request Transfer"/>
            <input type="submit" name="action" value="Request Approved"/>
            <h3 style="color: green" >List request Pending </h3>
            <input type="submit" name="action" value="Transfer"/>

            <table border="1" width="100%"> 
                <th><input type="checkbox" onclick="check(document.myform.list)"/></th>
                <th>Full Name user send</th>               
                <th>Content</th>
                <th>Full Name user receive</th>
                <th></th>
                <c:forEach var="t" items="${pending}">
                    <tr>
                        <td width="8%" align="center">
                            <input type="checkbox" name="list" value="${t.receiverId}"/>
                        </td><td align="center">
                            <a href="InforServlet?id=${t.sendUserId}">
                                <img src=".${t.images}" height="40px" width="35px"/>${t.fullName}
                                <input type="hidden" name="receiveID" value="${t.receiverId}"/>
                            </a>
                        </td> <td align="center">${t.content}</td> <td align="center"><img src=".${t.sImages}" height="45px" width="40px"/>${t.sFullName}</td> 
                    </tr>
                </c:forEach>
            </table>
            <h3 style="color: green" >List request Transfer </h3>
            <table width="100%">
                <th>Full Name user send</th>               
                <th>Content</th>
                <th>Full Name user receive</th>
                <th></th>
                <c:forEach var="t" items="${transfer}">
                    <form id="2" action="TransferRequest" method="POST">
                        <tr>
                            <td align="center">
                                <a href="InforServlet?id=${t.sendUserId}" style="font: underLine ">
                                    <img src=".${t.images}"  height="45px" width="40px"/>${t.fullName}
                                </a>
                                <input type="hidden" name="receiveID" value="${t.receiverId}"/></td>
                            <td align="center">${t.content}</td>
                            <td align="center"><img src=".${t.sImages}"  height="45px" width="40px"/>${t.sFullName}</td>
                        </tr>
                    </form>
                </c:forEach>
            </table>
            <h3 style="color: green" >List request approved </h3>
            <table width="100%">
                <th>Full Name user send</th>               
                <th>Content</th>
                <th>Full Name user receive</th>
                <th></th>
                <c:forEach var="t" items="${approved}">
                    <form id="2" action="TransferRequest" method="POST">
                        <tr>
                            <td align="center">
                                <a href="InforServlet?id=${t.sendUserId}" style="font: underLine ">
                                    <img src=".${t.images}"  height="45px" width="40px"/>${t.fullName}
                                </a>
                                <input type="hidden" name="receiveID" value="${t.receiverId}"/>
                            </td>                               
                            <td align="center">${t.content}</td>
                            <td align="center"><img src=".${t.sImages}"  height="45px" width="40px"/>${t.sFullName}</td>           
                        </tr>
                    </form>
                </c:forEach>
            </table>
        </form>
        <div style="color: green">${requestScope.status}</div>
    </body>
</html>

