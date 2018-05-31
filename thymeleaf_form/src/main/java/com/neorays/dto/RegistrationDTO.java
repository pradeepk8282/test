package com.neorays.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;


public class RegistrationDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String firstname;
	@NotEmpty
	private String lastname;
	@NotEmpty
	private String email;
	@NotEmpty
	private String password;
	@NotEmpty
	private String cpassword;

	public RegistrationDTO() {
		System.out.println(this.getClass().getCanonicalName());
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

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RegistrationDTO [firstname=" + firstname + ", lastname="
				+ lastname + ", email=" + email + ", password=" + password
				+ ", cpassword=" + cpassword + "]";
	}
	
	

}
