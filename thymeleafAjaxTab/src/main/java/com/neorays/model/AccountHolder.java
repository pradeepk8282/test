package com.neorays.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class AccountHolder implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String middleName;
	@NotEmpty
	private String lastName;
	
	private Integer age;
	@NotEmpty
	private String gender;

	public AccountHolder() {
		System.out.println(this.getClass().getCanonicalName());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "AccountHolder [firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", age=" + age
				+ ", gender=" + gender + "]";
	}



	

	
	
	

}
