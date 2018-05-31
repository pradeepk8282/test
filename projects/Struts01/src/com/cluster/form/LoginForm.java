package com.cluster.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.MultipartRequestHandler;

public class LoginForm extends ActionForm {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public void setMultipartRequestHandler(
			MultipartRequestHandler multipartRequestHandler) {
		// TODO Auto-generated method stub
		super.setMultipartRequestHandler(multipartRequestHandler);
	}

}
