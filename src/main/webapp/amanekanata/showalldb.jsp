<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>かなた本屋</title>
</head>
<body>
	<h1 align="center">こんかなた！</h1>
	<table border="1" width="100%">
	<tr>
		<th>Id</th>
		<th>ProductName</th>
		<th>Price</th>
	</tr>
	<c:forEach var="r" items="${list}">
	<tr>
		<td>${r.id}</td>
		<td><a href="\FubukiProject\QueryIdSvl?id=${r.id}">${r.name}</a></td>
		<td>${r.price}</td>
		
	</tr>
	</c:forEach>
	</table>
</body>
</html>