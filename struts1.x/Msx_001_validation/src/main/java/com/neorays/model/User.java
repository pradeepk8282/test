package com.neorays.model;




public class User {

	private String name;
	private String password;
	
	
	public String getName() {
		
		System.out.println("inside getter name");
		return name;
	}
	public void setName(String name) {
		
		System.out.println("inside setter name");
		
		this.name = name;
	}
	public String getPassword() {
		System.out.println("inside getter password");
		return password;
	}
	public void setPassword(String password) {
		System.out.println("inside setter password");
		this.password = password;
	}
	
	

}
