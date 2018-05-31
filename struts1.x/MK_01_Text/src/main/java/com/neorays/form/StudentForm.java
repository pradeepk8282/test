package com.neorays.form;

import org.apache.struts.action.ActionForm;

public class StudentForm extends ActionForm {
	private String studentname;

	public StudentForm() {
		System.out.println(this.getClass().getCanonicalName());
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	@Override
	public String toString() {
		return "StudentForm [studentname=" + studentname + "]";
	}
	

	
}
