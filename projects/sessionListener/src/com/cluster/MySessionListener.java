package com.cluster;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class MySessionListener implements HttpSessionListener {
	HttpSession ses = null;
	ServletContext ctx = null;

	public void sessionCreated(HttpSessionEvent se) {
		ses = se.getSession();
		ctx = ses.getServletContext();
		System.out.println("SESSION IS CREATED");
		int t = Integer.parseInt(ctx.getAttribute("TC").toString());
		t = t + 1;
		System.out.println("value of Total Client " + t);
		ctx.setAttribute("TC", t);
		int c = Integer.parseInt(ctx.getAttribute("CC").toString());
		c = c + 1;
		System.out.println("value of Current Client " + c);
		ctx.setAttribute("CC", c);

	}

	public void sessionDestroyed(HttpSessionEvent se) {

		System.out.println("SESSION IS DESTROYED");
		int c = Integer.parseInt(ctx.getAttribute("CC").toString());
		c = c - 1;
		
		ctx.setAttribute("CC", c);
	}
}
