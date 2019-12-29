package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/createCookie")
public class CreateCookieServlet  extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	Cookie cookie =new Cookie("name" , "Broosley");
	cookie.setMaxAge(24*60*60);// creating persistence cookie for one day,,,it is taking in the form sec...
	resp.addCookie(cookie);
	
	resp.setContentType("text/html");
	PrintWriter out= resp.getWriter();
	 
	out.print("<html>");
	out.print("<body");
	out.println("Cookie craeted sucessfully");
	out.print("</html>");
	out.print("</body");
		
		
	}

}
