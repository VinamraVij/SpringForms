<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Final Check</title>
<script type = "text/javascript">
  function printPage(){
	  window.print();
  }
</script>
<style>
.error{color: red;}
body{background-color: blanchedalmond;}
table {
	margin: auto;
	
	margin-bottom: 20px;
	font-size: 20px;
}

  caption{
  font-size: 25px;}
  td{
  width: 200px;
  text-align: center;}
  h1{
  text-align: center;}

</style>
</head>
<body>
<h1>Internship Application Form</h1>
	<table border>
	<caption>Personal Details</caption>
		<tr>
		<th>First Name
		
		<th>Last Name
		<th>Gender
		<th>Phone No.
		
		<th>Email 
		</tr>
		<tr>
		<td>${intern.internFirstName}
		
		<td>${intern.internLastName}
		<td>${intern.internGender}
		<td>${intern.internPhone}
		
		<td>${intern.internEmail}
		</tr>
	
	
	
	</table>
	<table border>
	<caption>Class 10th Details</caption>
	<tr>
	<th>10th Institute
	<th>10th Board
	<th>10th %
	<th>10th YOP
	</tr>
	<tr>
	<td>${primary.internTenInstitute}
	<td>${primary.internTenBoard}
	<td>${primary.internTenPercent}
	<td>${primary.internTenYOP}
	</tr>
	</table>
	<table border>
	<caption>Class 12th Details</caption>
	<tr>
	<th>12th Institute
	<th>12th Board
	<th>12th %
	<th>12th YOP
	</tr>
	<tr>
	<td>${primary.internTwelveInstitute}
	<td>${primary.internTwelveBoard}
	<td>${primary.internTwelvePercent}
	<td>${primary.internTwelveYOP}
	</tr>
	</table>
	<table border>
	<caption>College Details</caption>
	<tr>
	<th>College Name
	<th>Current Semester
	<th>Current CGPA
	<th>Passing Year
	<th>Comfortable Languages
	</tr>
	<tr>
	<td>${primary.internCollegeName}
	<td>${primary.internCurrentSem}
	<td>${primary.internCurrentCGPA}
	<td>${primary.internPassingYear}
	<td><c:forEach var="temp" items="${primary.language}">${temp}<br></c:forEach>
	</tr>
	
	</table>
	<form:form action="finalForm" >
	Check if all the details enter are correct and press submit, else please go back and change the details.
	<input type="submit" value="Submit">
	</form:form>
	<button onclick = "printPage();">Print details</button>
</body>
</html>