package com.cluster;

import org.apache.struts.action.ActionForm;

public class LoginTO  extends ActionForm
{
	private String username;
	private String password;
	
	public LoginTO() {
		System.out.println(this.getClass().getSimpleName());
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
}
