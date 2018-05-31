package com.cluster.form;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class GlobalColorForm extends ActionForm {

	private String globalcolor;

	public String getGlobalcolor() {
		return globalcolor;
	}

	public void setGlobalcolor(String globalcolor) {
		this.globalcolor = globalcolor;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		return super.validate(mapping, request);
	}

	@Override
	public ActionErrors validate(ActionMapping arg0, ServletRequest arg1) {
		return super.validate(arg0, arg1);
	}

}
