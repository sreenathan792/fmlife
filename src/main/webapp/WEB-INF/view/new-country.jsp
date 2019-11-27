<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>    
<!DOCTYPE html>
<html>
<head>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" 
		integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<meta charset="ISO-8859-1">
	<title>Add New Country</title>
</head>
<body>
	<div class="container">
		<h1>New Country Addition</h1>
		<sf:form action="add" modelAttribute="country" method="POST">
			<div class="form-row">
				<div class="form-group col-md-6">
				    <label for="countryName">Country Name</label>
				    <sf:input type="text" class="form-control" path="countryName" id="countryName" placeholder="eg. France, England..."/>
				</div>
				<div class="form-group col-md-6">
				    <label for="federation">Federation</label>
				    <sf:input type="text" class="form-control" path="federation" id="federation" placeholder="eg. FFA, FA..."/>
				</div>
				<div class="form-group col-md-12">
				    <label for="continentalFederation">Continental Federation</label>
				    <sf:input type="text" class="form-control" path="continentalFederation" placeholder="eg. UEFA, CONMEBOL..."/>
				</div>
			</div>
			<button class="btn btn-primary">Save</button>
		</sf:form>
	</div>
</body>
</html>