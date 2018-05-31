package com.cluster.DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connutils 
{
	
	
	public static Connection getConnection() 
	{
		
		Properties properties=new Properties();
		
		Connection connection =null;
		try {
			FileInputStream stream =new FileInputStream("D:/ITC/PROJECT/Struts_validation06/src/myapp/Datasource.properties");
			properties.load(stream);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.out.println(properties.getProperty("user"));
		try {
			Class.forName(properties.getProperty("Driver"));
			connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user"),properties.getProperty("password"));
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
}
