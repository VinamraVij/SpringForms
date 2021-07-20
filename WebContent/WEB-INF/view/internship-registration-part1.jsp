<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Internship Registration</title>
<style>
.error{color: red;}
body{background-color: blanchedalmond;}
table {
	margin: auto;
	margin-left: 50px;
	margin-bottom: 20px;
	font-size: 20px;
}
input,textarea{
width: 300px;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  background: #f1f1f1; }
  caption{
  font-size: 25px;}
  td{
  width: 200px;
  text-align: left;}
  h1{
  text-align: center;}
</style>
</head>
<body>
<h1>Internship Application Form</h1>
	<form:form action="processForm" modelAttribute="intern">
	
	<table>
	<caption>Personal Details</caption>
		<tr>  
			<td>First Name:</td>
		<td><form:input path="internFirstName" placeholder="First Name"/></td>
		<td><form:errors path="internFirstName" cssClass="error"/>
		</tr>
		<tr>
		<td>Middle Name:</td> 
		<td><form:input path="internMiddleName" placeholder="middle Name"/> </td>
		<td>
		</tr>
		<tr>
		<td>Last Name: </td>
		<td><form:input path="internLastName" placeholder="Last name"/></td>
		<td><form:errors path="internLastName" cssClass="error"/>
		</tr>
		<tr>
		<td>Gender: </td>
		<td>   <form:radiobutton path="internGender" style="width:50px" value="Male"/>Male<br> <form:radiobutton path="internGender" style="width:50px" value="Female"/>Female</td>
		<td><form:errors path="internGender" cssClass="error"/>
		</tr>
		<tr>
		<td>Phone No.: </td>
		<td><form:input path="internPhone" placeholder="Phone No."/></td>
		<td><form:errors path="internPhone" cssClass="error"/>
		</tr>
		<tr>
		<td>Address:</td> 
		<td><form:textarea path="internAddress" cols="80" rows="5" placeholder="Current Address" /></td>
		</tr>
		<tr>
		<td>Email Address: </td>
		<td><form:input path="internEmail" placeholder="Email Address"/></td>
		<td><form:errors path="internEmail" cssClass="error"/>
		</tr>
	</table>
			<form:form action="processForm" modelAttribute="primary">
			<table>
			<caption>Class 10th Details</caption>
			<tr>
			<td>10th Institute:
			<td><form:input path="internTenInstitute" placeholder="Institue"/>
			<td><form:errors path="internTenInstitute" cssClass="error"/>
			</tr>
			<tr>
			<td>10th Board:
			<td><form:input path="internTenBoard" placeholder="Board"/>
			<td><form:errors path="internTenBoard" cssClass="error"/>
			</tr>
			<tr>
			<td>10th percentage(%):
			<td><form:input path="internTenPercent" placeholder="Percentage"/>
			<td><form:errors path="internTenPercent" cssClass="error"/>
			</tr>
			<tr>
			<td>10th YOP
			<td><form:input path="internTenYOP" placeholder="Year of Passing"/>
			<td><form:errors path="internTenYOP" cssClass="error"/>
			</tr>
			
			
			</table>
			<table>
			<caption>Class 12th Details</caption>
			<tr>
			<td>12th Institute:
			<td><form:input path="internTwelveInstitute" placeholder="Institue"/>
			<td><form:errors path="internTwelveInstitute" cssClass="error"/>
			</tr>
			<tr>
			<td>12th Board:
			<td><form:input path="internTwelveBoard" placeholder="Board"/>
			<td><form:errors path="internTwelveBoard" cssClass="error"/>
			</tr>
			<tr>
			<td>12th percentage(%):
			<td><form:input path="internTwelvePercent" placeholder="Percent"/>
			<td><form:errors path="internTwelvePercent" cssClass="error"/>
			</tr>
			<tr>
			<td>12th YOP
			<td><form:input path="internTwelveYOP" placeholder="Year of Passing"/>
			<td><form:errors path="internTwelveYOP" cssClass="error"/>
			</tr>
			</table>
			
			<table>
			<caption>College Details</caption>
			<tr>
			<td>Enter College Name:
			<td><form:input path="internCollegeName" placeholder="College name"/>
			<td><form:errors path="internCollegeName" cssClass="error"/>
			</tr>
			<tr>
			<td>Enter Current Sem:
			<td><form:input path="internCurrentSem" placeholder="Semester"/>
			<td><form:errors path="internCurrentSem" cssClass="error"/>
			</tr>
			<tr>
			<td>Enter Current CGPA:
			<td><form:input path="internCurrentCGPA" placeholder="CGPA"/>
			<td><form:errors path="internCurrentCGPA" cssClass="error"/>
			</tr>
			<tr>
			<td>Enter Passing Year:
			<td><form:input path="internPassingYear" placeholder="Passing Year"/>
			<td><form:errors path="internPassingYear" cssClass="error"/>
			</tr>
			<tr>
			<td>Comfortable Languages:
			<td><form:checkboxes style="width:30px; margin-top:24px" items="${primary.favLanguage}" path="language"/>
			<td><form:errors path="language" cssClass="error"></form:errors>
			</tr>
			
			</table>
			<input style="margin-left: 270px" type="submit" value="Next" style="margin=auto">
			
			</form:form>
	
	
	</form:form>
</body>
</html>