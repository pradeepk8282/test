package com.cluster.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cluster.form.HomeForm;

public class DepartmentDAO
{

	public HomeForm fetchbyid(int id)
	{
		Connection connection=Connutils.getConnection();
		HomeForm form=null;
		try {
			PreparedStatement statement=connection.prepareStatement("SELECT FIRSTNAME,LASTNAME,DOB FROM EMPLOYEE WHERE EMPLOYEE_ID=?");
			statement.setInt(1, id);
			ResultSet set =statement.executeQuery();
			
			while(set.next())
			{
				form=new HomeForm();
				
				form.setFirstname(set.getString("Firstname"));
				form.setLastname(set.getString("lastname"));
				form.setDOB(set.getString("DOB"));
				
			}
			System.out.println("<------dao--->"+form);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return form;
		

	}

}
