package com.mkyong.customer.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.web.struts.ActionSupport;

import com.mkyong.customer.dto.Bo;
import com.mkyong.customer.form.CustomerForm;
import com.mkyong.customer.model.Customer;

public class AddAction extends ActionSupport {

	public AddAction() {
		System.out.println(this.getClass().getCanonicalName());
	}

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("ADD CUstomer Action");
		ApplicationContext context=getWebApplicationContext();
		System.out.println("Web container created");	
		Bo bo=(Bo) context.getBean("cust",Bo.class);
		System.out.println("bean created");
		
		CustomerForm customerForm = (CustomerForm) form;
		Customer customer = new Customer();
		BeanUtils.copyProperties(customer, customerForm);
		System.out.println("Bean copied");

bo.addCustomer(customer);

		
		return mapping.findForward("success");
	}
}
