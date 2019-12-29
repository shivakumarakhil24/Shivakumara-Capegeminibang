<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="false" %>
	<% String msg = (String) request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Portal</title>
</head>
<body>
	<fieldset>
	<% if(msg!=null && !msg.isEmpty()) { %>
	<h1 style="color: green"><%= msg %></h1>
	<%} %>
		<form action="./addEmployeeForm" method="post">
			<legend>Add Employee</legend>
			<table>
				<tr>
					<td>Employee Id</td>
					<td>:</td>
					<td><input type="number" name="empId" required></td>
				</tr>
				<tr>
					<td>Age</td>
					<td>:</td>
					<td><input type="number" name="age" required></td>
				</tr>

				<tr>
					<td>Employee Name</td>
					<td>:</td>
					<td><input type="text" name="empName" required></td>
				</tr>

				<tr>
					<td>Designation</td>
					<td>:</td>
					<td><input type="text" name="designation" required></td>
				</tr>

				<tr>
					<td>Gender</td>
					<td>:</td>
					<td><input type="text" name="gender" required></td>
				</tr>

				<tr>
					<td>Salary</td>
					<td>:</td>
					<td><input type="number" name="salary" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td>:</td>
					<td><input type="number" name="mobile" required></td>
				</tr>
				<tr>
					<td colspan="3"><br> <input type="submit" value="submit"></td>
				</tr>

			</table>
		</form>


	</fieldset>
</body>
</html>