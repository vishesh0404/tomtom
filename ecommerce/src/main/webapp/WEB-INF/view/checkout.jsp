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
	<h3>
		<a href="/user/cart">Cart</a>
	</h3>
	<h2>Checkout</h2>
	<br>
	<br>
	<br>
	<h3>
		Total Items :
		<c:out value="${cart.getTotalItems()}"></c:out>
	</h3>
	<br>
	<br>
	<h3>
		Total Amount :
		<c:out value="${cart.getTotalAmount()}"></c:out>
	</h3>
	<br>
	<h1>Checked out successfully!!</h1>

	<br>
	<br>
	<a href="/logout">Logout</a>
</body>
</html>