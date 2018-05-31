package com.optipace.fullintegration.controller;

import java.io.Serializable;

public class Book implements Serializable {

	private int id;
	private String name;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Book(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	
	
	

}
