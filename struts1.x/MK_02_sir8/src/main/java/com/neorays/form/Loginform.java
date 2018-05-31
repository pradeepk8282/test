package com.neorays.form;

import org.apache.struts.validator.ValidatorForm;

public class Loginform extends ValidatorForm {

	private String username;
	private String password;

	public Loginform() {
		System.out.println(this.getClass().getCanonicalName());
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
