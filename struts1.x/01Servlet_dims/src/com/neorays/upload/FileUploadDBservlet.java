package com.neorays.upload;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class FileUploadDBservlet
 */
@WebServlet("/upload")
@MultipartConfig(maxFileSize=16177215)
public class FileUploadDBservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FileUploadDBservlet() {
		super();
		System.out.println(this.getClass().getCanonicalName());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		
		InputStream stream=null;
		System.out.println("inside MEthod");
		
		
		Part filePart=request.getPart("photo");
		if(filePart !=null)
		{
			System.out.println(filePart.getName());
			System.out.println(filePart.getSize());
			System.out.println(filePart.getContentType());
			stream=filePart.getInputStream();
		}
		Connection connection=null;
		String msg=null;
		System.out.println("database creation");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","cluster");
			String sql="INSERT INTO CONTACTS (FIRST_NAME,LAST_NAME,PHOTO) VALUES(?,?,?)";
			PreparedStatement statement=connection.prepareStatement(sql); 
			statement.setString(1,firstname);
			statement.setString(2,lastname);
			if(stream!=null)
			{
				statement.setBlob(3,stream);
			}
			int row=statement.executeUpdate();
			if(row>0){
				msg="FILE UPLOADED AND AND SAVED INTO THE DATABASE ";
			}
			
		}
		catch(Exception ex){
			msg="ERROR"+ex.getMessage();
		}
		finally{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		request.setAttribute("message", msg);
		getServletContext().getRequestDispatcher("/message.jsp").forward(request, response);

	}
	

}
