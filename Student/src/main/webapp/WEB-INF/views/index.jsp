<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
	<div class="container mt-3">
	
		<div class="row">
		
		<div class="col-md-12">
		
			<h2 class="text-center mb-3">Student Details</h2>
			<div class="card">
    				<div class="card-body">	
			
				<div class="container text-right">
				
					<a href="add-student" class="btn btn-success">Add Student</a>
					<a href="add-student" class="btn btn-success">Download</a>
			
				
				</div>
				<div class="container mt-5">

				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Roll no</th>
							<th scope="col">Name</th>
							<th scope="col">Gender</th>
							<th scope="col">Class</th>
							<th scope="col">Address</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					
					<c:forEach items="${student }" var="s">
						<tr>
							<th scope="row">${s.rollNo }</th>
							<td>${s.name }</td>
							<td>${s.gender }</td>
							<td>${s.class1 }</td>
							<td>${s.address }</td>
							<td>
								<a href="update/${s.rollNo }"><i class="btn btn-outline-success">Edit</i></a>
								<a href="delete/${s.rollNo }"><i class="btn btn-outline-success">Delete</i></a>
							</td>
						</tr>
					</c:forEach>
					</tbody>
				</table>
				</div>
				</div>
				</div>

			</div>
		
		</div>
	
	</div>
</body>
</html>
