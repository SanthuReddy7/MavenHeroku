package com.dss;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.DriverManager;



//import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DIsplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter w = response.getWriter();
		
		String umail=request.getParameter("umail");
		String umobile=request.getParameter("umobile");
		
		
		HttpSession session = request.getSession(false);
		
		//print all details from the client------6 session-4 req-2
w.println("User Name:"+session.getAttribute("uname"));
w.println("<br>");
w.println("User Age:"+session.getAttribute("uage"));
w.println("<br>");
w.println("User Qualification:"+session.getAttribute("uqual"));
w.println("<br>");
w.println("User Designation:"+session.getAttribute("udesig"));
w.println("<br>");
w.println("User EMail:"+umail);
w.println("<br>");
w.println("User Mobile:"+umobile);
w.println("<html><body bgcolor='wheat'><center><h1>");
w.println("REGISTRATION DONE SUCCESSFULLY");
w.println("</h1></center></body></html>");
	}
}
