<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>E-commerce</title>
</head>
<body>
	<h1>
		Welcome
		<c:out value="${userName}"></c:out>
	</h1>
	<h3 align="right">
		<a href="/user/cart">Cart</a> :
		<c:out value="${cart.getTotalItems()}"></c:out>
	</h3>
	<h3>Products</h3>

	<table style="width: 100%" border="1">
		<tr>
			<th>Name</th>
			<th>Brand</th>
			<th>Price</th>
			<th>Description</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${productList}" var="product">
			<tr>
				<td align="center"><c:out value="${product.getProductName()}" /></td>
				<td align="center"><c:out value="${product.getBrand()}" /></td>
				<td align="center"><c:out value="${product.getPrice()}" /></td>
				<td align="center"><c:out value="${product.getDescription()}" /></td>
				<td align="center"><form:form method="post"
						action="/user/addtocart/${product.getId()}">
						<input type="Submit" value="Add To Cart">
					</form:form></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<br>
	<br>
	<a href="/logout">Logout</a>
</body>
</html>