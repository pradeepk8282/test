package com.mkyong.customer.dao.impl;

import java.util.Date;
import java.util.List;

import com.mkyong.customer.dao.CustomerDao;
import com.mkyong.customer.model.Customer;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
	
	
	
	public CustomerDaoImpl() {
		System.out.println(this.getClass().getCanonicalName());
	}

	public void addCustomer(Customer customer) {

		customer.setCreatedDate(new Date());
		getHibernateTemplate().save(customer);

	}

	@SuppressWarnings("unchecked")
	public List<Customer> findAllCustomer() {

		return getHibernateTemplate().find("from Customer");
		/*
		 * List<Customer> list=new ArrayList<>(); list.add(new Customer());
		 * 
		 * return list;
		 */

		// return

	}
}