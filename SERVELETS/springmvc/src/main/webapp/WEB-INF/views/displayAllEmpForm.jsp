<%@page import="com.capgemini.springmvc.beans.EmployeeInfoBeans"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>

<%	List<EmployeeInfoBeans> employeesList = (List<EmployeeInfoBeans>) request.getAttribute("employeesList"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./displayAllEmployee">Home</a>
	<br><br>
	<% if (employeesList != null && !employeesList.isEmpty()) { %>
	<div align="center">
		<table>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Salary</th>
				<th>Designation</th>
				<th>Mobile</th>
			</tr>
			<% for (EmployeeInfoBeans employeeInfoBean : employeesList) { %>
				<tr>
					<td><%=employeeInfoBean.getEmpName()%></td>
					<td><%=employeeInfoBean.getAge()%></td>
					<td><%=employeeInfoBean.getSalary()%></td>
					<td><%=employeeInfoBean.getDesignation()%></td>
					<td><%=employeeInfoBean.getMobile() %></td>
				</tr>
			<% } %>	
		</table>
	</div>
	<% } else { %>
		<h3 style="color: red;">Unable To Fetch Records!!!</h3>
	<% } %>

</body>
</html>