<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>

<%

	response.setHeader("Cache-Control","no-cache");
	response.setHeader("Cache-Control","no-store");
	response.setHeader("Pragma","no-cache");
	response.setDateHeader ("Expires", 0); 

	if(session.getAttribute("loginId")==null){
		response.sendRedirect("login.jsp");
	}

%>

<br>
<div class="container">
<div class="jumbotron">
  <h1 class="display-4">Add a new student here</h1>
  <p class="lead">Enter the criteria for the student</p>  
</div>



<!-- <form action="addStudent">

Roll Num: <input type="number" name="rollNum"><br>
Name:    <input type="text" name="name"><br>
Grade:   <input type="number" name="grade"><br>
Section: <input type="text" name="section"><br>
Gender: <br>
<input type="radio" name="gender" value="male"> Male<br>
<input type="radio" name="gender" value="female"> Female<br>	 
<input type="submit" value="add student">
</form>

<br>
<form action="logout">
<input type="submit" value="Logout">
</form> -->



<div class="container" align="right">
	<form action="logout">
	  <button type="submit" class="btn btn-danger">Logout</button>
	</form>
</div><br>

<div class="container" >
<form action="addStudent" method="get">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Roll Num:</label>
    <input type="number" class="form-control" name="rollNum">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Name:</label>
    <input type="text" class="form-control" name="name">
  </div>
  
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Grade:</label>
    <input type="number" class="form-control" name="grade">
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Section:</label>
    <input type="text" class="form-control" name="section">
  </div> 

  <div class="mb-3">  	
	Gender: <br>
	<input type="radio" name="gender" value="male"> Male
	<input type="radio" name="gender" value="female"> Female<br>	 
  </div>  <br> 
     
  <button type="submit" class="btn btn-primary">Add Student</button>
  
</form>
</div>
</div>
<br><br>




</body>
</html>