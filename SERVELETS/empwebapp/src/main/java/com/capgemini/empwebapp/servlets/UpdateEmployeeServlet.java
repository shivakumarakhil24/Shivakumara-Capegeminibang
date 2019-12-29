package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
@WebServlet("/update")
public class UpdateEmployeeServlet extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		if(session != null) {
			//validate 
			//get the data from form
			
				int empIdVal = Integer.parseInt(req.getParameter("empId"));
				String ageVal = req.getParameter("age");
				String empNameVal = req.getParameter("empName");
				String genderVal = req.getParameter("gender");
				String passwordVal = req.getParameter("password ");
				String designationVal = req.getParameter("designation");
				String mobileVal = req.getParameter("mobile");
				String salaryVal = req.getParameter("salary");

				EmployeeInfoBeans employeeInfoBean = new EmployeeInfoBeans();
				employeeInfoBean.setEmpId(empIdVal);
				 
					
					if(empNameVal!=null && !empNameVal.isEmpty()) {
						employeeInfoBean.setEmpName(empNameVal);
					}
					if(salaryVal!=null && !salaryVal.isEmpty()) {
					employeeInfoBean.setSalary(Double.parseDouble(salaryVal));
					}
					if(ageVal !=null && !ageVal.isEmpty()) {
						employeeInfoBean.setAge(Integer.parseInt(ageVal));
					}
					if(designationVal !=null && !designationVal.isEmpty()) {
						employeeInfoBean.setDesignation(designationVal);
					}
					if(mobileVal !=null && !mobileVal.isEmpty()) {
						employeeInfoBean.setMobile(Long.parseLong(mobileVal));
					}
					if(passwordVal !=null && !passwordVal.isEmpty()) {
						employeeInfoBean.setPassword(passwordVal);
					}
					if(genderVal !=null && !genderVal.isEmpty()) {
						employeeInfoBean.setGender(genderVal.charAt(0));
					}
				

				EmployeeDAO dao = new EmployeeDAOJpaImpl();
				boolean isAdded = dao.updateEmployee(employeeInfoBean);

				PrintWriter out = resp.getWriter();
				out.println("<html>");
				out.println("<body>");

				if (isAdded) {
					out.println("<h2>Employee Record Updated Successfully</h2>");

				} else {
					out.println("<h2 style='color:red'>Employee Id is not Found...!!!</h2>");

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
			
		}
		
		
	}
	


