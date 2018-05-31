package com.neorays.web.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

public class SubscribeController implements IGTVGController{

	 public SubscribeController() {
	        super();
	    }
	    
	    
	    public void process(
	            final HttpServletRequest request, final HttpServletResponse response,
	            final ServletContext servletContext, final ITemplateEngine templateEngine)
	            throws Exception {
	        
	        WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
	        templateEngine.process("subscribe", ctx, response.getWriter());
	        
	    }
}
