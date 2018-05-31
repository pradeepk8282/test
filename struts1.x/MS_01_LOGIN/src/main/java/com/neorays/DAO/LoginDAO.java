package com.neorays.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neorays.dto.LoginDTO;
@Repository
public class LoginDAO 
{
	@Autowired
	private SessionFactory factory;
	public LoginDAO() {
	System.out.println(this.getClass().getCanonicalName());
	}
	
	public LoginDTO validateEmp(LoginDTO dto)
	{
		try{
		String qry="from LoginDTO where username=:user and password=:pass";
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		System.out.println("Query");
		Query query=session.createQuery(qry);
		query.setParameter("user",dto.getUsername());
		query.setParameter("pass",dto.getPassword());
		LoginDTO loginDTO=(LoginDTO)query.uniqueResult();
		
		System.out.println(loginDTO);
		if(loginDTO!=null)
			return dto;
		return loginDTO;}
		catch(Exception e){
			return dto;
		}
	}

}
