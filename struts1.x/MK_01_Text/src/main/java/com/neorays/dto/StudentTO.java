package com.neorays.dto;

import java.io.Serializable;

public class StudentTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Studentname;
	//private String phonenumber;

	public StudentTO() {
		System.out.println(this.getClass().getCanonicalName());
	}

	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	@Override
	public String toString() {
		return "StudentTO [Studentname=" + Studentname + "]";
	}

	/*public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
*/
	
	
}
