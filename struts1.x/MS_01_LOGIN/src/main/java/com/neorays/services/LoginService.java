package com.neorays.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neorays.DAO.LoginDAO;
import com.neorays.dto.LoginDTO;

@Service
public class LoginService 
{
	@Autowired
	private LoginDAO loginDAO;
	public LoginService() {
	System.out.println(this.getClass().getCanonicalName());
	}
	
	
	public boolean validateEmpServ(LoginDTO dto)
	{
		
		 LoginDTO loginDTO=loginDAO.validateEmp(dto);
		if(dto.getUsername().equals(loginDTO.getUsername()) && dto.getPassword().equals(loginDTO.getPassword()))
			return true;
		
		return false;
	}
	
	

}
