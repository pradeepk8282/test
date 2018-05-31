package com.cluster;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class LoginAction extends Action
{
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		LoginTO loginTO =(LoginTO)form;
		
		 if(loginTO.getUsername() == null || loginTO.getPassword() == null ||
			        !loginTO.getUsername().equalsIgnoreCase("rahul") || !loginTO.getPassword().equals("abc")){
			            return mapping.findForward("failure");
			        }
			        else
			            return mapping.findForward("success");
		
		
	}

}
