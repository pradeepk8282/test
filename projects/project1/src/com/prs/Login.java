package com.prs;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServlet;

public class Login extends HttpServlet
{
	
	public static void main(String[] args) throws Exception {
		String string="select * from emp where id=:?";
		PreparedStatement statement=null;
		Class.forName("");
		Connection con=DriverManager.getConnection(string);
		statement =con.prepareStatement("SELECT * from employee WHERE  userID = :userId");
		
		
	}
}
