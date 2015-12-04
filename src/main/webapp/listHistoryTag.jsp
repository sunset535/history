<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User list</title>
</head>
<body>
  	<h3>UserList</h3>
  	<a href="<%=path %>/addHistoryTag.jsp">Add HistoryTag</a><br/>
	<table border="1" width="70%">
   		<tr>
   			<td>Id</td>
   			<td>Name</td>
   			<td>Createtime</td>
   			<td>LastupdateTime</td>
   			<td>Delete</td>
   			<td>Update</td>
   		</tr>
   		<c:forEach items="${historyTagList}" var="historyTag">
   		<tr>
   			<td>${historyTag.id }</td>
   			<td>${historyTag.name }</td>
   			<td><fmt:formatDate value="${historyTag.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
   			<td><fmt:formatDate value="${historyTag.lastupdatetime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
   			<td><a href="<%=path %>/muserController/deleteUser.do?id=${user.id }">Delete</a></td>
   			<td><a href="<%=path %>/muserController/updateUserUI.do?id=${user.id }">Update</a></td>
   		</tr>
   		</c:forEach>
   </table>
   
</body>
</html>