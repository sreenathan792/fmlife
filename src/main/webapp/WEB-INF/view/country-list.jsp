<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" 
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<script type="text/javascript">
		
		function addNew() {
			window.location.href = "../country/add";
		}
		
		function editCountry(ab) {
			window.location.href = "../country/edit/"+ab;
		}
		
		function deleteCountry(ab) {
			window.location.href = "../country/delete/"+ab;
		}
	
	</script>	
	<meta charset="ISO-8859-1">
	<title>Country List</title>
</head>
<body>
<div class="container">
	<div>
		<h1>Country List</h1>
	</div>
	<table class="table table-striped table-bordered">
		<thead class="thead-dark">
		<tr>
			<th>Country Name</th>
			<th>Federation</th>
			<th>Continental Federation</th>
			<th>Action</th>
		</tr>
		</thead>
		<c:forEach var="tempCountries" items="${countries}">
			<tr>
				<td>${tempCountries.countryName}</td>
				<td>${tempCountries.federation}</td>
				<td>${tempCountries.continentalFederation}</td>
				<td>
					<button type="button" class="btn btn-outline-warning" onclick="javascript:editCountry(${tempCountries.id})">Edit</button>
					<button type="button" class="btn btn-outline-danger" onclick="javascript:deleteCountry(${tempCountries.id})">Delete</button>
				</td>	
			</tr>
		</c:forEach>
	</table>
	<button type="button" class="btn btn-outline-info" onclick="javascript:addNew()">Add New</button>
</div>
</body>
</html>