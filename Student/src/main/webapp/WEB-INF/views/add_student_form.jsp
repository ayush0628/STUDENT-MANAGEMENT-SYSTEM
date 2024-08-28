<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
  <body class="" style="background: #e2e2e2">
    <div class="container mt-4">
    	
    	<div class="row">
    		<div class="col-md-8 offset-md-2">
    			<div class="card">
    				<div class="card-body">	
    					<h3>Add Student</h3>
    				
    					<form action="handle-student", method="post">		
    						<div class="form-group">
    							<label for="exampleInputEmail1">Name</label> 
    							<input
    								name="name" type="text" class="form-control"
    								id="name" aria-describedly="emailHelp">
 
    						</div>


							<div class="form-group">
								<label for="address">Address</label>
								<textarea class="form-control" id="address"
									name="address" row="8"></textarea>

							</div>


							<div class="form-group">
    							<label for="exampleInputEmail1">Class</label> 
    							<input
    								name="class1" type="text" class="form-control"
    								id="class1" aria-describedly="emailHelp"> 
    						</div>
    						
    						<div class="form-group">
    							<label for="exampleInputEmail1">Roll No</label> 
    							<input
    								name="rollNo" type="text" class="form-control"
    								id="rollNo" aria-describedly="emailHelp"> 
    						</div>
    						
    						<div class="form-group">
    							<span class="mr-3">Select Gender</span>
    							<div class="form-check form-check-inline">
    								<input class="form-check-input" type="radio" name="gender"
    								id="inlineRadio1" value="male"> <label
    								class="form-check-label" for="inlineRadio1">Male</label>
    							</div>
    							<div class="form-check form-check-inline">
    								<input class="form-check-input" type="radio" name="gender"
    								id="inlineRadio2" value="female"> <label
    								class="form-check-label" for="inlineRadio2">Female</label>
    							</div>
    						</div>

							<div class="container text-center">
								<a href="${pageContext.request.contextPath }/"
									class="btn btn-outline-danger">Back</a>
								<button type="submit" class="btn btn-primary">Add</button>
							</div>
						</form>
    	
    				</div>
    			</div>
 			</div>
 			
 		</div>
 		
 	</div>

</body>
</html>