package com.mkyong.customer.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mkyong.customer.dao.CustomerDao;
import com.mkyong.customer.model.Customer;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CustomerDaoImpl  implements CustomerDao {
	
	List<Customer> list=new ArrayList<>();
	
	public CustomerDaoImpl() {
		System.out.println(this.getClass().getCanonicalName());
	}

	public void addCustomer(Customer customer) {
		
		System.out.println("CustomerDaoImpl  addCustomer  ");
			
			System.out.println(customer);
		list.add(customer);
		System.out.println("End");

//		getHibernateTemplate().save(customer);

	}

	@SuppressWarnings("unchecked")
	public List<Customer> findAllCustomer() {

//		return getHibernateTemplate().find("from Customer");
		System.out.println("CustomerDaoImpl        findAllCustomer ");
		
		for (Customer id : list) {
			System.out.println(id);
		}
		return list;
		

	}
}