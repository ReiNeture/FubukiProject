<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
 
<sql:setDataSource var="snapshot" driver="com.mysql.cj.jdbc.Driver"
     url="jdbc:mysql://localhost:3306/FubukiProject"
     user="root" password="root"/> 
     
<sql:query dataSource="${snapshot}" var="result">
SELECT * from Items;
</sql:query>

<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>SQL JSTL</title>
</head>

<body>
	<table border="1" width="50%">
	<tr>
		<th>Item ID</th>
		<th>Title</th>
		<th>info</th>
	</tr>
	<c:forEach var="row" items="${result.rows}">
	<tr>
	   <td><c:out value="${row.item_id}"/></td>
	   <td><c:out value="${row.title}"/></td>
	   <td><c:out value="${row.info}"/></td>
	</tr>
	</c:forEach>
	
	</table>
</body>

</html>