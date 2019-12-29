package com.capgemini.empwebapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectDirect extends HttpServlet {
	// redirect means the external resource present in other system ....!!!
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = "http://www.google.com";
		String url1 = "http://www.facebook.com";
		
		resp.sendRedirect(url1);

	}

}
