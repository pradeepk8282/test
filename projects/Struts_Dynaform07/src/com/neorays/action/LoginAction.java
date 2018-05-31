package com.neorays.action;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class LoginAction extends Action {
	
	
	
	public LoginAction() {

	System.out.println(this.getClass().getCanonicalName());
	}
	
	
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DynaActionForm dynaActionForm = (DynaActionForm) form;
		System.out.println("Action");
		String strUserName = (String) dynaActionForm.get("userName");
		String strPassword = (String) dynaActionForm.get("password");
		
		loginTo to=new loginTo();
		if (strUserName.equalsIgnoreCase(to.getUsername())	&& strPassword.equalsIgnoreCase(to.getPassword())) {
			
			return mapping.findForward("success");
		}
		System.out.println("failure");
		return mapping.findForward("failure");
	}
	/*@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			ServletRequest request, ServletResponse response) throws Exception {
		DynaActionForm dynaActionForm = (DynaActionForm) form;
		System.out.println("Action");
		String strUserName = (String) dynaActionForm.get("userName");
		String strPassword = (String) dynaActionForm.get("password");
		
		loginTo to=new loginTo();
		if (strUserName.equalsIgnoreCase("pradeep")	&& strPassword.equalsIgnoreCase("")) {
			
			return mapping.findForward("success");
		}
		System.out.println("failure");
		return mapping.findForward("failure");
	}*/
}
