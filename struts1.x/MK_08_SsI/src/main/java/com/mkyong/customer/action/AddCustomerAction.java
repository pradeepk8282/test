package com.mkyong.customer.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.context.ApplicationContext;
import org.springframework.web.struts.ActionSupport;

import com.mkyong.customer.bo.CustomerBo;
import com.mkyong.customer.bo.impl.CustomerBoImpl;
import com.mkyong.customer.form.CustomerForm;
import com.mkyong.customer.model.Customer;

public class AddCustomerAction extends ActionSupport {

	public AddCustomerAction() {
		System.out.println(this.getClass().getCanonicalName());
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("ADD CUstomer Action");
		ApplicationContext context=getWebApplicationContext();
		System.out.println("Web container created");
//		CustomerBo customerBo = (CustomerBo) getWebApplicationContext().getBean("customerBo");
//		CustomerBo customerBo=		(CustomerBo) context.getBean("customerBo");
		CustomerBoImpl customerBo=	(CustomerBoImpl) context.getBean("cust");
		System.out.println("Bean Created");

		CustomerForm customerForm = (CustomerForm) form;
		Customer customer = new Customer();

		// copy customerform to model
		BeanUtils.copyProperties(customer, customerForm);

		// save it
		customerBo.addCustomer(customer);

		return mapping.findForward("success");

	}

}