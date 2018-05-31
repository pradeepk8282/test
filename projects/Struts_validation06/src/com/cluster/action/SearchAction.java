package com.cluster.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cluster.DAO.DepartmentDAO;
import com.cluster.form.HomeForm;
import com.cluster.form.SearchForm;

public class SearchAction extends Action 
{
	public ActionForward execute(ActionMapping pMapping, ActionForm pForm,HttpServletRequest pRequest, 
			HttpServletResponse pResponse)throws Exception {
		SearchForm searchform = (SearchForm) pForm;
		String strSid = searchform.getSid();
		int id=Integer.parseInt(strSid);
		
		DepartmentDAO dao=new DepartmentDAO();
		HomeForm form= dao.fetchbyid(id);
		System.out.println("<----actioncontroller----->"+form);
		
		

		if (strSid.equals("105")) {
			pRequest.setAttribute("a", form.getFirstname());
			pRequest.setAttribute("b", form.getLastname());
			pRequest.setAttribute("c", form.getDOB());
			
			pRequest.setAttribute("home",form);

			return pMapping.findForward("success");
		} else {
			String strMsg = "student not found";
			pRequest.setAttribute("MSG", strMsg);

			return pMapping.findForward("failure");

		}
	}
}
