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
import com.mkyong.customer.dto.IBo;
import com.mkyong.customer.form.CustomerForm;

public class AddAction extends ActionSupport
{
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("ADD CUstomer Action");
		

		ApplicationContext context=getWebApplicationContext();
		System.out.println("Web container created");
		IBo customerBo=	(IBo) context.getBean("cust",IBo.class);
		System.out.println("Bean Created");
		/*CustomerForm customerForm = (CustomerForm) form;
		Customer customer = new Customer();
		BeanUtils.copyProperties(customer, customerForm);
//		customerBo.addCustomer(customer);
*/
		return mapping.findForward("success");
		
	}

}
