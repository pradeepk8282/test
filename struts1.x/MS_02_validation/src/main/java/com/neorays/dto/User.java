package com.neorays.dto;

import java.util.List;


public class User 
{
	
	
	private Integer id;
	
	private String name;
	private String email;
	private String address;
	private String password;
	private String confirmpassword;
	private boolean newsletters;
	private List<String> framework;
	private String sex;
	private Integer number;
	private String country;
	private List<String> skill;
	
	public User() {
	System.out.println(this.getClass().getCanonicalName());
	}
	
	
	public boolean isNew() {
		return (this.id == null);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public boolean isNewsletters() {
		return newsletters;
	}

	public void setNewsletters(boolean newsletters) {
		this.newsletters = newsletters;
	}

	public List<String> getFramework() {
		return framework;
	}

	public void setFramework(List<String> framework) {
		this.framework = framework;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getSkill() {
		return skill;
	}

	public void setSkill(List<String> skill) {
		this.skill = skill;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email
				+ ", address=" + address + ", password=" + password
				+ ", confirmpassword=" + confirmpassword + ", newsletters="
				+ newsletters + ", framework=" + framework + ", sex=" + sex
				+ ", number=" + number + ", country=" + country + ", skill="
				+ skill + "]";
	}

}
