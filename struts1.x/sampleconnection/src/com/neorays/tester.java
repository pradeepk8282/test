package com.neorays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class tester {

	public static void main(String[] args) 
	{
		String phone=null;
		try {
			Class.forName("org.postgresql.Driver");
			Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/itc","postgres","cluster");
			PreparedStatement statement=connection.prepareStatement("SELECT PHONE_NUM FROM STUDENT WHERE NAME=?");
			statement.setString(1,"VENKY");
			ResultSet set =statement.executeQuery();
			
			if(set.next())
			{
			 phone=set.getString("PHONE_NUM");
			
				
			}
			 System.out.println("===============>"+phone);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
