<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>    
<!DOCTYPE html>
<html>
<head>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" 
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
	<title>Update Country</title>
</head>
<body>
	<div class="container">
		<h1>Update Country</h1>
		<sf:form action="update" modelAttribute="country" method="PUT">
			<div class="form-row">
				<div class="form-group col-md-6">
				    <label for="countryName">Country Name</label>
				    <sf:input type="text" class="form-control" path="countryName" id="countryName"/>
				</div>
				<div class="form-group col-md-6">
				    <label for="federation">Federation</label>
				    <sf:input type="text" class="form-control" path="federation" id="federation"/>
				</div>
				<div class="form-group col-md-12">
				    <label for="continentalFederation">Continental Federation</label>
				    <sf:input type="text" class="form-control" path="continentalFederation"/>
				</div>
			</div>
			<sf:hidden path="id"/>
			<button class="btn btn-primary">Update</button>
		</sf:form>
	</div>
</body>
</html>