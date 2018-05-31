package com.cluster;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class LogoutServlet extends HttpServlet {

	public void doGet(HttpServletRequest req,	HttpServletResponse res)
			throws ServletException, IOException {
		
		HttpSession ses = req.getSession();
		ses.invalidate();
		RequestDispatcher rd = req.getRequestDispatcher("/html/logout.html");
		rd.forward(req, res);
	}
}
