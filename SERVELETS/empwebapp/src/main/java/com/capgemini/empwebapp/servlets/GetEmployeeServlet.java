package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String empIdVal = req.getParameter("empId");
	 resp.setContentType("text/html");
	 PrintWriter out =resp.getWriter();
	 
	 out.print("<html>");
	 out.print("<body>");
	 out.print("<h1>Empoyee ID:" + empIdVal + "Found-</h1>");
	 out.print("<h3>Empoyee salary:70000<br>");
	 out.print("Empoyee Name:Shiva <br>");
	 out.print("Empoyee Adress: Banglore <br>");
	 out.print("Designation = FSD</h3>");
	 out.print("<body>");
	 out.print("<html>");
	 
	
	
	}
}
