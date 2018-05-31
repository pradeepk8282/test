package com.itc.login.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login.do")
public class LoginController extends HttpServlet
{
	
 	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException 
	{
		String username=req.getParameter("username");
		String password=req.getParameter("password");
			String id=req.getSession(true).getId();
			
	
		
		PrintWriter printWriter=resp.getWriter();
	
		HttpSession httpSession=req.getSession(true);
		Cookie cookie=new Cookie(username, password);
		cookie.setMaxAge(50);
		Cookie cookie2=new Cookie(username, password);
		req.authenticate(resp);
		
		req.getRequestDispatcher("index.html").forward(req, resp);
		
	}
}
