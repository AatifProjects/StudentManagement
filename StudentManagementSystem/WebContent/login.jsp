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
<br>



<!-- <form action="login" method="post">
Login id:   <input type="text" name="loginId"> <br>
Login pass: <input type="text" name="loginPass"> <br>
<input type="submit" value="submit">
</form>  -->
<div class="container">	
<div class="jumbotron">
  <h1 class="display-4">Student Management System</h1>
  <p class="lead">Manage all your students here</p>
  
</div> <br>


<div class="container">	

<form action="login" method="post">
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Login id:</label>
    <input type="text" class="form-control" aria-describedby="emailHelp" name="loginId">
    <div id="emailHelp" class="form-text">We'll never share your credentials with anyone else.</div>
  </div>
  <div class="mb-3">
    <label for="exampleInputPassword1" class="form-label">Login pass:</label>
    <input type="password" class="form-control" name="loginPass">
  </div>  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</div>
</div>


</body>
</html>