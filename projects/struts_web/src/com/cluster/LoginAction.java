package com.cluster;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action {
	
	
	
	public LoginAction() {
		System.out.println(this.getClass().getSimpleName());
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String str=request.getRequestURI();
		System.out.println(str);
		System.out.println(this.getClass().getCanonicalName()+"StartMethod");
		LoginTO loginTO = (LoginTO) form;
		String struser =loginTO.getUsername();
		String strpass= loginTO.getPassword();
		
		System.out.println(struser +" "+strpass);

		if (struser.equals("mact")&& loginTO.getPassword().equals("mact")) 
						return mapping.findForward("success");
		System.out.println(this.getClass().getCanonicalName()+"EndMethod");
			return mapping.findForward("failure");
			

	}

}
