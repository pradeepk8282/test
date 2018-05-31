package com.neorays.form;

import org.apache.struts.action.ActionForm;

public class Loginform extends ActionForm
{
	private String sID;

	public Loginform() {
		System.out.println(this.getClass().getCanonicalName());
	}

	public String getsID() {
		return sID;
	}

	public void setsID(String sID) {
		this.sID = sID;
	}

}
