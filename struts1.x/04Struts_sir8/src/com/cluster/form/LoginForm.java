package com.cluster.form;

import org.apache.struts.action.DynaActionForm;
import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm {
	
	private String userName;
	private String password;
	
	public LoginForm() {
	System.out.println("FORM BEAN CREATED.....................");
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
