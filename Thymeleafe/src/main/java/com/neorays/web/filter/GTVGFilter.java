package com.neorays.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.ITemplateEngine;

import com.neorays.business.entities.User;
import com.neorays.web.application.GTVGApplication;
import com.neorays.web.controller.IGTVGController;

public class GTVGFilter implements Filter {

	private ServletContext servletContext;
	private GTVGApplication application;

	public GTVGFilter() {
		super();
	}

	private static void addUserToSession(final HttpServletRequest request) {
		// Simulate a real user session by adding a user object
		request.getSession(true).setAttribute("user",
				new User("John", "Apricot", "Antarctica", null));
		
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(final ServletRequest request,
			final ServletResponse response, final FilterChain chain)
			throws IOException, ServletException {
		addUserToSession((HttpServletRequest) request);
		if (!process((HttpServletRequest) request,
				(HttpServletResponse) response)) {
			chain.doFilter(request, response);
		}
	}

	public void init(final FilterConfig filterConfig) throws ServletException {
		this.servletContext = filterConfig.getServletContext();
		this.application = new GTVGApplication(this.servletContext);
	}

	private boolean process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException {

		System.out.println("1"+request.getRequestURI().startsWith("/css"));
		System.out.println("3"+request.getRequestURI().startsWith("/images"));
		System.out.println("2"+request.getRequestURI().startsWith("/favicon"));
		try {

			// This prevents triggering engine executions for resource URLs
			if (request.getRequestURI().startsWith("/css")|| request.getRequestURI().startsWith("/images")|| request.getRequestURI().startsWith("/favicon")) {
				return false;
			}

			IGTVGController controller = this.application.resolveControllerForRequest(request);
			if (controller == null) {
				return false;
			}

			ITemplateEngine templateEngine = this.application.getTemplateEngine();

			
			response.setContentType("text/html;charset=UTF-8");
			response.setHeader("Pragma", "no-cache");
			response.setHeader("Cache-Control", "no-cache");
			response.setDateHeader("Expires", 0);
			response.setIntHeader("refresh", 5);

			
			controller.process(request, response, this.servletContext,templateEngine);

			return true;

		} catch (Exception e) {
			try {
				response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			} catch (final IOException ignored) {
				// Just ignore this
			}
			throw new ServletException(e);
		}

	}

}
