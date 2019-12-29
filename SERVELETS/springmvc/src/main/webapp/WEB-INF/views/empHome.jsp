<%@page import="com.capgemini.springmvc.beans.EmployeeInfoBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="false" %>
	<% HttpSession session=request.getSession(false);
	EmployeeInfoBeans employeeInfoBeans=(EmployeeInfoBeans)session.getAttribute("employeeInfoBeans"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>Select Required Option</legend>
        <h1>Welcome <%=employeeInfoBeans.getEmpName() %>...</h1>
		<a href="./addEmployeeForm">Add Employee</a><br> <a
			href="./updateEmployeeForm">Update Employee</a><br> <a
			href="./deleteEmployeeForm">Delete Employee</a><br> <a
			href="./searchEmployeeForm">Search Employee</a><br> <a
			href="./seeAllEmployee">See All Employees</a> <br> <br> <a
			href="./displayAllEmployee">See All Employees</a> <a
			href="./logout">Logout</a>
	</fieldset>

</body>
</html>