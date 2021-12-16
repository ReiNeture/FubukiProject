<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<tr>
		<td>${product.id}</td>
		<td>${product.name}</td>
		<td>${product.info}</td>
		<td>${product.price}</td>
	</tr>
	</table>
</body>
</html>