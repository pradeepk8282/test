package com.neorays.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neorays.form.Loginform;

public class LoginAction extends Action {

	public LoginAction() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Loginform loginForm = (Loginform) form;

		String strUserName = loginForm.getUsername();
		String strPassword = loginForm.getPassword();

		if (strUserName.equalsIgnoreCase("cluster")
				&& strPassword.equalsIgnoreCase("software")) {

			return mapping.findForward("success");
		}

		return mapping.findForward("failure");

	}

}
