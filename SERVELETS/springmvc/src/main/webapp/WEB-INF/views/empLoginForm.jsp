<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<!-- This beolw line for the show login forst when user was logged out and if try to  work with aad, update. -->
<%@ page session="false"%>
<%
	String msg = (String) request.getAttribute("msg");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<h1 style="color: red"><%=msg%></h1>
	<%
		}
	%>
	<fieldset>
		<legend>LoginForm</legend>
		<form action="./empLogin" method="post">
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
					<td colspan="3" align="center"><br> <input type="submit"
						name="Login"></td>
			</table>
		</form>
	</fieldset>

</body>
</html>