package com.neorays.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.neorays.exception.PhoneNotFound;

public class PhoneDAO
{
	private static Connutils connutils;
	public PhoneDAO() {
	System.out.println(this.getClass().getCanonicalName());
	}
	
	public String getphonebyname(String studentname) throws PhoneNotFound
	{
		String phone =null;
		Connection connection=connutils.getConnection();
		try {
			PreparedStatement statement=connection.prepareStatement("SELECT PHONE_NUM FROM STUDENT WHERE NAME=?");
			statement.setString(1,studentname);
			ResultSet set =statement.executeQuery();
			
			if(set.next())
			{
			 phone=set.getString("PHONE_NUM");
				
			}
			else
			{
				throw new PhoneNotFound("phone not found");
			}
			System.out.println(phone);
			return phone;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return studentname;
		
	}
	
}
