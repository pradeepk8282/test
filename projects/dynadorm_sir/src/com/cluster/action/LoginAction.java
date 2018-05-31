package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class LoginAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest pRequest, 
			HttpServletResponse pResponse)throws Exception {
			
		DynaActionForm dynaActionForm = (DynaActionForm)pForm;
		
		String strUserName = (String)dynaActionForm.get("userName");
		String strPassword = (String)dynaActionForm.get("password");
		
		if(strUserName.equalsIgnoreCase("cluster")&& strPassword.equalsIgnoreCase("software")){
			
			return pMapping.findForward("success");
		}
		
		return pMapping.findForward("failure");
	}

}
