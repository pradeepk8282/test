package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.form.EmployeeForm;

public class EmployeeAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest pRequest, 
			HttpServletResponse pResponse)throws Exception {
			
		EmployeeForm employeeForm = (EmployeeForm)pForm;
		
		String strName = employeeForm.getName();
		int intId  = employeeForm.getId();
		
		if(strName.equalsIgnoreCase("neorays")&& (intId==132)){
			
			return pMapping.findForward("success");
		}
		
		return pMapping.findForward("error");
	}

}
