<%-- <%@page import="com.mysql.cj.x.protobuf.MysqlxDatatypes.Array"%>h
 --%><%@page import="model.StudentBean"%>
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
  <h1 class="display-4">Following are your searched students</h1>
  <p class="lead">You will find your search students here</p>
  
</div>

<div class="container" align="right">
	<form action="logout">
	  <button type="submit" class="btn btn-danger">Logout</button>
	</form>
</div><br><br>


<div class="container">	
<form action="studentList" id="studentListForm"> 
<table class="table">
  	<tr>
    <th>View Profile</th>
    <th>RollNum</th>
    <th>Name</th>
    <th>Grade</th>
    <th>Section</th>
    <th>Gender</th>
  </tr>
    
    <c:forEach items="${stdBeanList}" var="elements">
        <tr> 
        
        	<%-- <button id="next" onclick="<c:set var="cardIndex" scope="session" value="${cardIndex + 1}"></c:set>">Next</button>
        	       	
        	<td> 
				<c:set var = "rollNum" scope = "session" value = "${elements.rollNum}"/> 
       			<input type="submit" value="view Profile" >
       			
        	</td> --%>
        	
        	<td><input type="radio" value="${elements.rollNum}" name="studRollNo"></td>              	
            <td>${elements.rollNum}</td>
            <td>${elements.name}</td>
            <td>${elements.grade}</td>
            <td>${elements.section}</td>
            <td>${elements.gender}</td>
        </tr>
    </c:forEach>   
</table> 
   
      <button type="submit" class="btn btn-primary">View Profile</button>    

</form>  

       
</div> 
</div>
 
<br><br>
 
</body>
</html>