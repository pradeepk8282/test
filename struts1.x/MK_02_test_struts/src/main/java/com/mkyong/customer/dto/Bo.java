package com.mkyong.customer.dto;

import java.util.ArrayList;
import java.util.List;

import com.mkyong.customer.dao.CustomerDao;
import com.mkyong.customer.dao.impl.CustomerDaoImpl;
import com.mkyong.customer.model.Customer;

public class Bo {
	
	private CustomerDao customerDao=new CustomerDaoImpl();
	
	
	
	public Bo() {
		System.out.println(this.getClass().getCanonicalName());
	}
	

	public List<Customer> findAllCustomer() {
		System.out.println("Bo  Fetch");
		
		List<Customer> list=new ArrayList<>(); 
		list=customerDao.findAllCustomer();
		System.out.println("return lIst");
		return list;
	}


	public void addCustomer(Customer customer) {
		System.out.println("Bo addCustomer ");
		customerDao.addCustomer(customer);
		System.out.println("Bo addCustomer ");
	}


	
}
