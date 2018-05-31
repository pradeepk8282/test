package com.neorays.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class LoginDTO  implements Serializable{
	@Id
	@Column(name="EID")
	private int id;
	@Column(name="USERNAME")
	private String username;
	@Column(name="PASSWORD")
	private String password;

	public LoginDTO() {
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

	@Override
	public String toString() {
		return "LoginDTO [username=" + username + ", password=" + password
				+ "]";
	}
	

}
