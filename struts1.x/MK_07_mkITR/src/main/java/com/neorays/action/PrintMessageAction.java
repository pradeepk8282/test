package com.neorays.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class PrintMessageAction  extends Action
{
	public PrintMessageAction() {
	System.out.println(this.getClass().getCanonicalName());
	}
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		/*List<String> list=new ArrayList<String>();*/
		List<String> list =new ArrayList<String>();
		list.add("Message A");
		list.add("Message B");
		list.add("Message C");
		list.add("Message D");
		request.setAttribute("list1", list);
		return mapping.findForward("success");
	}

}
