package com.capgemini.empwebapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/forword")
public class ForwrdServlet extends HttpServlet {

	// forword means the internal resource present in our system or like that
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String url = "./currentDate"; ///dynamic resource
		String url1="./SearchEmployee.html";
		
		RequestDispatcher dispatcher  = req.getRequestDispatcher(url1);
		dispatcher.forward(req, resp);
	
	}
}
