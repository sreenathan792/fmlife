<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Country List</title>
</head>
<body>

<table>
	<tr>
		<th>Country Name</th>
		<th>Federation</th>
		<th>Continental Federation</th>
		<th>Action</th>
	</tr>
	<c:forEach var="tempCountries" items="${countries}">
		<tr>
			<td>${tempCountries.countryName}</td>
			<td>${tempCountries.federation}</td>
			<td>${tempCountries.continentalFederation}</td>
			<td></td>	
		</tr>
	</c:forEach>
</table>

</body>
</html>