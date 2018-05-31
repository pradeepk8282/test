package com.cluster;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 *  Cluster Software Solutions.
 *  (Mob:98451-31637/39
 *  www.clusterindia.com)
 */
public class MyContextListener implements ServletContextListener {

	ServletContext ctx = null;

	public void contextDestroyed(ServletContextEvent se) {
		System.out.println("CONTEXT IS DESTROYED");
	}

	public void contextInitialized(ServletContextEvent se) {
		ctx = se.getServletContext();
		System.out.println("CONTEXT IS CREATED");
		Integer i = new Integer(0);

		ctx.setAttribute("TC", i);
		ctx.setAttribute("CC", i);
	}
}
