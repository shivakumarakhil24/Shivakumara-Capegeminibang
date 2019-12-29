package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.empwebapp.beans.EmployeeInfoBeans;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session =req.getSession();
		if(session !=null) {
			EmployeeInfoBeans employeeInfoBean = (EmployeeInfoBeans) session.getAttribute("empId");
			session.invalidate();
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 Style='color:green'>Thanks for visit</h2>");
			out.println("<h3 Style='color:red'>You are successfullly logged out </h3>");
			out.println("</html>");
			out.println("</body>");
		}
		RequestDispatcher disp= req.getRequestDispatcher("./loginForm.html");
		disp.include(req, resp);
		
	}//end of DOGET

}//END of Class
