package com.neorays.web.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

import com.neorays.business.entities.Order;
import com.neorays.business.services.OrderService;

public class OrderListController implements IGTVGController{

	public OrderListController() {
        super();
    }
    
    
    public void process(
            final HttpServletRequest request, final HttpServletResponse response,
            final ServletContext servletContext, final ITemplateEngine templateEngine)
            throws Exception {
        
        final OrderService orderService = new OrderService();
        final List<Order> allOrders = orderService.findAll(); 
        
        final WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
        ctx.setVariable("orders", allOrders);
        
        templateEngine.process("order/list", ctx, response.getWriter());
        
    }
}
