<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-commerce</title>
</head>
<body>
<h1>Welcome <c:out value="${userName}"></c:out> </h1>

<h3>List of Products <a href="/seller/addproduct">Add New</a></h3>

<table style="width:100%" border="1">
	<tr>
		<th>Name</th><th>Brand</th><th>Price</th><th>Description</th>
	</tr>
	<c:forEach items="${productList}" var="product">
		<tr>
			<td align="center"><c:out value = "${product.getProductName()}"/></td>
			<td align="center"><c:out value = "${product.getBrand()}"/></td>
			<td align="center"><c:out value = "${product.getPrice()}"/></td>
			<td align="center"><c:out value = "${product.getDescription()}"/></td>
		</tr>
	</c:forEach>
</table>
<br><br><br><br>
<a href="/logout">Logout</a>
</body>
</html>