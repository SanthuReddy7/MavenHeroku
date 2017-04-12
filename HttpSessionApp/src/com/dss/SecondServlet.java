package com.dss;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SecondServlet() {
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
		// doGet(request, response);

		// getting requested details
		String uqual = request.getParameter("uqual");
		String udesig = request.getParameter("udesig");

		// PREPARE THE SESSION  //it locate the object
		// if reference variable is there then return false so that it does not
		// create a new object
		HttpSession session = request.getSession(false);

		// Set the session object
		session.setAttribute("uname", uqual);
		session.setAttribute("uage", udesig);

		// Forward the req to form2.html
		RequestDispatcher dispatcher = request.getRequestDispatcher("form3.html");
		dispatcher.forward(request, response);
	}

}
