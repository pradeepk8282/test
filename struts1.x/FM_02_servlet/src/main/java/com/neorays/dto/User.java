package com.neorays.dto;

public class User {
	private String firstname;
	private String lastname;

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public User(String firstname, String lastname) {
		
		this.firstname = firstname;
		this.lastname = lastname;
	}




	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}