package com.neorays.business.services;

import java.util.List;

import com.neorays.business.entities.Customer;
import com.neorays.business.entities.repositories.CustomerRepository;

public class CustomerService {

	public CustomerService() {
        super();
    }
    
    
    
    public List<Customer> findAll() {
        return CustomerRepository.getInstance().findAll();
    }

    public Customer findById(final Integer id) {
        return CustomerRepository.getInstance().findById(id);
    }
}
