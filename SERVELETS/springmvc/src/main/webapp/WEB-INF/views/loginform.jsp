<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>LoginForm</legend>
		<!-- <form action="./login" method="post"> -->
		<!-- <form action="./login2" method="post"> -->
		<!-- <form action="./login3" method="post"> -->
		<form action="./login4" method="post">
			<table>
				<tr>
					<td>EmployeeId</td>
					<td>:</td>
					<td><input type="text" name="empId"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>DOB</td>
					<td>:</td>
					<td><input type="date" name="dob"></td>
				</tr>
				<tr>
					<td colspan="3" align="center"><br> <input type="submit"
						name="Login"></td>
			</table>
		</form>
	</fieldset>

</body>
</html>