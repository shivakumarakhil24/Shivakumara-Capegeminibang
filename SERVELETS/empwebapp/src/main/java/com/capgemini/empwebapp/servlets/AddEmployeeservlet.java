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
import com.capgemini.empwebapp.dao.EmployeeDAO;
import com.capgemini.empwebapp.dao.EmployeeDAOJpaImpl;

@WebServlet("/addEmployee")
public class AddEmployeeservlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if (session != null) {
			// vaild session
			// Get the form data
			int empId = Integer.parseInt(req.getParameter("empId"));
			String empName = req.getParameter("empName");
			String password = req.getParameter("password ");
			String designation = req.getParameter("designation");
			long mobile = Long.parseLong(req.getParameter("mobile"));

			EmployeeInfoBeans employeeInfoBean = new EmployeeInfoBeans();
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setEmpName(empName);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setPassword(password);
			employeeInfoBean.setMobile(mobile);

			EmployeeDAO dao = new EmployeeDAOJpaImpl();
			boolean isAdded = dao.addEmployee(employeeInfoBean);

			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");

			if (isAdded) {
				out.println("<h2>Employee Record Added Successfully</h2>");

			} else {
				out.println("<h2 style='color:red'>Unable to add Employee Records...!!!</h2>");

			}
			out.println("</html>");
			out.println("</body>");

		} else {

			PrintWriter out = resp.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<h2 Style='color:red>Please login again</h2> ");
			out.println("</html>");
			out.println("</body>");
			RequestDispatcher dispatcher = req.getRequestDispatcher("./loginForm.html");
			dispatcher.include(req, resp);
		}

	}// dopst

}// class
