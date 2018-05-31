package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.apache.struts.validator.DynaValidatorForm;

public class LoginAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest pRequest, 
			HttpServletResponse pResponse)throws Exception {
			
		DynaValidatorForm dynaActionForm=(DynaValidatorForm)pForm;
		
		String strUserName=(String)dynaActionForm.get("userName");
		String strPassword=(String)dynaActionForm.get("password");
		
		if(strUserName.equalsIgnoreCase("pradeep")&& strPassword.equalsIgnoreCase("pass")){
			
			return pMapping.findForward("success");
		}
		
		return pMapping.findForward("error");
	}

}
