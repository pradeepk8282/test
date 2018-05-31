package com.neorays.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neorays.form.Loginform;


public class Loginaction  extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Loginform loginform=(Loginform)form;
		
		if(loginform.getUsername().equals("user") && loginform.getPassword().equals("pass"))
			return mapping.findForward("success");
		
		return mapping.findForward("failure");
		
	}

}
