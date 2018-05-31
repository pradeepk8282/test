package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.LocalColorForm;

public class LocalColorAction extends Action {
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,
			HttpServletRequest pRequest, HttpServletResponse pResponse)
			throws Exception {

		LocalColorForm localForm = (LocalColorForm) pForm;
		String strColor = localForm.getLocalcolor();

		if (strColor.equalsIgnoreCase("orange")) {
			throw new ArithmeticException();
		}

		return null;
	}

}
