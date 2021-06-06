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
		<a href="/seller">Home</a>
	</h3>
	<h1>Add Product</h1>
	<form:form method="post" action="saveproduct" modelAttribute="product">
		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="productName" /></td>
			</tr>
			<tr>
				<td>Brand :</td>
				<td><form:input path="brand" /></td>
			</tr>
			<tr>
				<td>Price :</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td>Description :</td>
				<td><form:input path="description" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>