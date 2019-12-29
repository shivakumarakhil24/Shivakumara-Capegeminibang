package com.capgemini.student.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capgemini.student.beans.StudentBean;
import com.capgemini.student.dao.StudentDAO;
import com.capgemini.student.dao.StudentDAOJpaImpl;

@WebServlet("/searchStudent")
public class StudentServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String sIdval = req.getParameter("s_id");
		int s_id = Integer.parseInt(sIdval);

		StudentDAO dao = new StudentDAOJpaImpl();
		StudentBean stBean = dao.getStudent(s_id);

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<html>");
		out.print("<body");

		if (stBean != null) {
			out.println("<h1 style='color: brown'>Employee ID " + s_id + " Found: </h1><br>");
			out.println("<h4 style='color:blue'>Student Id         : " + stBean.getSd_id());
			out.println("<br>Student Name: " + stBean.getSd_name());
            out.println("<br>College      : " + stBean.getCollege());
			out.println("<br>Semister      : " + stBean.getSem());
			out.println("<br>Branch         : " + stBean.getBranch() +"</h4>");

		}
		else {
			out.print("<h2 style='color :blue'>Student Id "+s_id+" Not Found in the Database</h2>");
		}

	}

}
