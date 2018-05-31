package com.cluster.form;

import org.apache.struts.action.ActionForm;

public class HomeForm  extends ActionForm
{
	private String Firstname;
	private String lastname;
	private String DOB;
	
	public HomeForm() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "HomeForm [Firstname=" + Firstname + ", lastname=" + lastname
				+ ", DOB=" + DOB + "]";
	}

	
	

}
