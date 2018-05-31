package com.neorays.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neorays.business.entities.Variety;
import com.neorays.business.entities.repositories.VarietyRepository;

@Service
public class VarietyService {

	 @Autowired
	    private VarietyRepository varietyRepository; 
	    
	    
	    public VarietyService() {
	    	System.out.println(this.getClass().getSimpleName());
	    }
	    
	    
	    
	    public List<Variety> findAll() {
	        return this.varietyRepository.findAll();
	    }

	    public Variety findById(final Integer id) {
	        return this.varietyRepository.findById(id);
	    }
}
