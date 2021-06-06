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
	<h3 align="right">
		<a href="/user">Home</a>
	</h3>
	<h2>Cart</h2>
	<br>
	<br>
	<table style="width: 100%" border="1">
		<tr>
			<th>Product</th>
			<th>Price</th>
			<th>Items/Pc.</th>
		</tr>
		<c:forEach items="${cartItems}" var="item">
			<tr>
				<td align="center"><c:out
						value="${item.getProduct().getProductName()}" /></td>
				<td align="center"><c:out
						value="${item.getProduct().getPrice()}" /></td>
				<td align="center"><c:out value="${item.getQuantity()}" /></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<h3 align="right">
		Total Items :
		<c:out value="${cart.getTotalItems()}"></c:out>
	</h3>
	<br>
	<br>
	<h3 align="right">
		Total Amount :
		<c:out value="${cart.getTotalAmount()}"></c:out>
	</h3>
	<br>
	<br>
	<h3 align="right">
		<a href="/user/checkout">Checkout</a>
	</h3>
	<br>
	<br>
	<br>
	<a href="/logout">Logout</a>


</body>
</html>