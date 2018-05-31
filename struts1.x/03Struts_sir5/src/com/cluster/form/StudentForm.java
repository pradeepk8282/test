package com.cluster.form;

import org.apache.struts.action.ActionForm;

public class StudentForm extends ActionForm{
	String studentName;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
