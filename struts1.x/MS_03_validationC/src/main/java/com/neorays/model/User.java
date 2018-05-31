package com.neorays.model;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ResponseStatus;


public class User {
	
	
	private String name;
	private String email;
	private String password;
	private String confirmPassword;
	//private List<String> framework;

	public User() {
		System.out.println("<=================DTO");
	}

	
	public boolean isNew() {
		return (this.email == null);
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password="
				+ password + ", confirmPassword=" + confirmPassword + "]";
	}




	

}
