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
		<th>ProductId</th>
		<th>ProductName</th>
		<th>ProductInfo</th>
		<th>Price</th>
	</tr>
	<c:forEach var="r" items="${list}">
	<tr>
		<td><c:out value="${r.id}"/></td>
		<td><c:out value="${r.name}"/></td>
		<td><c:out value="${r.info}"/></td>
		<td><c:out value="${r.price}"/></td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>