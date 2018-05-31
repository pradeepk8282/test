package com.mkyong.customer.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;
import org.springframework.context.ApplicationContext;
import org.springframework.web.struts.ActionSupport;

import com.mkyong.customer.dto.Bo;
import com.mkyong.customer.form.CustomerForm;
import com.mkyong.customer.model.Customer;

public class ListAction extends ActionSupport
{

	public ListAction() {
	System.out.println(this.getClass().getCanonicalName());
	}
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("creating container");
		ApplicationContext context=getWebApplicationContext();
		System.out.println("container created");
		Bo bo=(Bo) context.getBean("cust",Bo.class);
		System.out.println("bean created");
		
		
		DynaActionForm dynaCustomerListForm = (DynaActionForm) form;
		
		/*List<Customer> list=new ArrayList<>();
		list.add(new Customer(1, "pradeep","Neorays"));
		list.add(new Customer(2, "asd","optipace"));
		list.add(new Customer(3, "acd","L&T"));
		list.add(new Customer(4, "asc","TCS"));
		dynaCustomerListForm.set("customerList", list);*/
		List<Customer> list=new ArrayList<>();
		System.out.println("list created");
	list=bo.findAllCustomer();
	
		
		dynaCustomerListForm.set("customerList", list);
		System.out.println("Sucess");
		
		
		
		return mapping.findForward("success");
	}
}
