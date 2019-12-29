package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigParamservlet extends HttpServlet { 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     resp.setContentType("text/html");
     
     ServletConfig config=getServletConfig();
     String empNameVal = config.getInitParameter("empName");
     
     ServletContext context= getServletContext();
      String compnyNameVal= context.getInitParameter("companyName");
     
     PrintWriter out= resp.getWriter();
     out.println("<html>");
     out.println("<body>");
     out.println("<h2> Configparam value is: "+empNameVal);
     out.println("<h2>Context param value is: "+compnyNameVal);
     out.println("</body>");
     out.println("</html>");
	
	
	}

}
