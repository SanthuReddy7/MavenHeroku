package com.dss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FirstServlet() {
		super();
	}

	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * response.getWriter().append("Served at: ").append(request.getContextPath(
	 * )); }
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	//	doGet(request, response);

		// getting requested details
		String uname = request.getParameter("uname");
		String uage = request.getParameter("uage");

		// Create hypertext session object
		HttpSession session = request.getSession();

		// Set the session object
		session.setAttribute("uname", uname);
		session.setAttribute("uage", uage);
		
		// Forward the req to form2.html
		RequestDispatcher dispatcher = request.getRequestDispatcher("form2.html");
		dispatcher.forward(request, response);
	}
}
