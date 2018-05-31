package com.cluster;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */

@WebServlet("/show")
public class HelloServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		ArrayList arlNames = new ArrayList();
		arlNames.add("ravi");
		arlNames.add("kumar");
		arlNames.add("amogh");
		arlNames.add("vinay");
		arlNames.add("amit");
		
		ArrayList arlCity = new ArrayList();
		arlCity.add("Delhi");
		arlCity.add("Mumbai");
		arlCity.add("Pune");
		arlCity.add("Bangalore");
		
		ArrayList arlDetails = new ArrayList();
		arlDetails.add(arlNames);
		arlDetails.add(arlCity);
		
		req.setAttribute("ARLDETAILS",arlDetails);
		
		RequestDispatcher rd = req.getRequestDispatcher("hello.jsp");
		rd.forward(req, res);
	}
}
