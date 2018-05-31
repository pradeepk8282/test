package com.neorays.business.services;

import java.util.List;

import com.neorays.business.entities.Product;
import com.neorays.business.entities.repositories.ProductRepository;

public class ProductService {

	 public ProductService() {
	        super();
	    }
	    
	    
	    
	    public List<Product> findAll() {
	        return ProductRepository.getInstance().findAll();
	    }

	    public Product findById(final Integer id) {
	        return ProductRepository.getInstance().findById(id);
	    }
	    
}
