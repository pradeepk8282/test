package com.neorays.common.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.neorays.common.UserForm;

public class User extends Action{
	
	public User() {
	System.out.println(this.getClass().getCanonicalName());
	}
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
/*List<String> listMsg = new ArrayList<String>();
		
		listMsg.add("Message A");
		listMsg.add("Message B");
		listMsg.add("Message C");
		listMsg.add("Message D");
		
		request.setAttribute("listMsg", listMsg);
List<UserForm> listUsers = new ArrayList<UserForm>();


		listUsers.add(new UserForm("user1", "http://www.user1.com"));
		listUsers.add(new UserForm("user2", "http://www.user2.com"));
		listUsers.add(new UserForm("user3", "http://www.user3.com"));
		listUsers.add(new UserForm("user4", "http://www.user4.com"));
		request.setAttribute("listUsers", listUsers);*/
		
		return mapping.findForward("success");
	}

}
