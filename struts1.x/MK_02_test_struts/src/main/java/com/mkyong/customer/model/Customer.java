package com.mkyong.customer.model;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int customerId;
	private String name;
	private String address;

	public Customer() {
		System.out.println(this.getClass().getCanonicalName());
	}
	

	public Customer(int customerId, String name, String address) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}

	public long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name
				+ ", address=" + address + "]";
	}

	
	

}
