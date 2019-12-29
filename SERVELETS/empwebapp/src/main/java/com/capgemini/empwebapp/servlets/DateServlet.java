package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {

	public DateServlet() {

		System.out.println("Its instantiation phase");
	}// end of init

	@Override
	public void init() throws ServletException {
		System.out.println("Initi phase");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Its service phase....");
		Date date = new Date();
		// resp.setHeader("refresh", "1"); // For refreshing every 1 sec ...And it is
		// Java code
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.println("<html>");
//		out.println("<head>");  //For refreshing every 1 sec ...And it is HTML code (this head tag)
//		out.println("<meta http-equiv='refresh' content='1'> ");
//		out.println("</head>");
		out.println("<body>");
		out.println("<h1>current system date and time:<br>");
		out.println(date + "</h1>");
		out.println("</body>");
		out.println("</html>");

	}// end of doGet()

	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Its destroy pase");
	}

}// end of class
