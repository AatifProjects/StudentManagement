<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.*" %>

 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    
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
  <h1 class="display-4">Student Profile</h1>
  <p class="lead">Here is your selected student profile</p>
  
</div>


 <%-- Roll Num: ${stdBean.rollNum} <br>
 Name: 	   ${stdBean.name} <br>
 Grade:    ${stdBean.grade} <br>
 Section:  ${stdBean.section} <br>
 Gender:   ${stdBean.gender} <br> 

<form action="editStudent.jsp">
  <c:set var = "editStudID" scope = "session" value = "${stdBean.rollNum}"/>  
  <c:set var = "studentProfile" scope = "session" value = "${stdBean}"/>
  <input type="submit" value="EditStudent">
</form>

<form action="deleteStudent">
  <c:set var = "deleteStudID" scope = "session" value = "${stdBean.rollNum}"/>  
  <input type="submit" value="DeleteStudent">
</form>

<br>
<form action="logout">
<input type="submit" value="Logout">
</form> --%>


<div class="container" align="right">
	<form action="logout">
	  <button type="submit" class="btn btn-danger">Logout</button>
	</form>
</div> <br>


<div class="container" style="border: 2px solid grey" ><br>
  <div class="row">
    <div class="col">Roll Num:</div>
    <div class="col">${stdBean.rollNum}</div>
    <div class="w-100"></div>
    <div class="col">Name:</div>
    <div class="col">${stdBean.name}</div>
    <div class="w-100"></div>
    <div class="col">Grade:</div>
    <div class="col">${stdBean.grade}</div>
    <div class="w-100"></div>
    <div class="col">Section:</div>
    <div class="col">${stdBean.section}</div>
    <div class="w-100"></div>
    <div class="col">Gender:</div>
    <div class="col">${stdBean.gender}</div>    
  </div><br>
 </div>
 
 <br>
 <div class="container" >
	<form action="editStudent.jsp">
	  <c:set var = "editStudID" scope = "session" value = "${stdBean.rollNum}"/>  
	  <c:set var = "studentProfile" scope = "session" value = "${stdBean}"/>	  
  	  <button type="submit" class="btn btn-primary">EditStudent</button>
	</form>	
</div>

<div class="container" align="right">
	<form action="deleteStudent">
	  <c:set var = "deleteStudID" scope = "session" value = "${stdBean.rollNum}"/>  
	  <c:set var = "studentProfile" scope = "session" value = "${stdBean}"/>	  
	  <button type="submit" class="btn btn-primary">DeleteStudent</button>
	</form>
</div>
</div>

<br><br>
 
 



 
</body>
</html>