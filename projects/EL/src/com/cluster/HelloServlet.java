package com.cluster;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HelloServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		String strFname = req.getParameter("fname");
		String strLname = req.getParameter("lname");
		String [] strPh = req.getParameterValues("ph");
		
		ServletContext ctx = getServletContext();
		HttpSession ses = req.getSession();
		
		req.setAttribute("FNAME", strFname);
		ses.setAttribute("LNAME", strLname);
		ctx.setAttribute("PH", strPh);
		
		RequestDispatcher rd = req.getRequestDispatcher("./jsp/withEL.jsp");
		rd.forward(req, res);
		
	}
}
