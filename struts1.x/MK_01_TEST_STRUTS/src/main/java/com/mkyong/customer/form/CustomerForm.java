package com.mkyong.customer.form;

import org.apache.struts.action.ActionForm;

public class CustomerForm  extends ActionForm
{
	private String name;
	private String address;
	
	public CustomerForm() {
		System.out.println("Created"+this.getClass().getCanonicalName());
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	
	
	
}
