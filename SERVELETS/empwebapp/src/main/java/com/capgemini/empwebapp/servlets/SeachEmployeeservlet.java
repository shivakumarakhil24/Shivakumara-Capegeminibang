package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.empwebapp.beans.EmployeeInfoBeans;
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJpaImpl;

@WebServlet("/searchEmployee")
public class SeachEmployeeservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Get the form data
		String empIdVal =req.getParameter("empId");
		int empId=Integer.parseInt(empIdVal);

		EmployeeDAO dao= new EmployeeDAOJpaImpl();
		EmployeeInfoBeans empinfobean =dao.getEmployee(empId);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<html>");
		out.print("<body>");

		if (empinfobean != null) {
			//display record
			out.println("<h2>Employee ID " + empId +" Found: </h2>");
			out.println("Employee Name: " + empinfobean.getEmpName()) ;
			out.println("<br>Age: "+ empinfobean.getAge());
			out.println("<br>Mobile: "+empinfobean.getMobile());
			out.println("<br>Gender: "+empinfobean.getGender());
			out.println("<br>Designation: "+empinfobean.getDesignation());
			out.println("<br>Salary: "+empinfobean.getSalary());
			out.println("<br>Password: "+empinfobean.getPassword());
		} else {
			//display error 
			out.println("<h1 style='color :red'>Employee ID" + empId+"Not Found");
		}
		out.print("</html>");
		out.print("</body>");

	}
}
