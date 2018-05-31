package com.neorays.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neorays.business.entities.SeedStarter;
import com.neorays.business.entities.repositories.SeedStarterRepository;

@Service
public class SeedStarterService {

	 @Autowired
	    private SeedStarterRepository seedstarterRepository; 
	    
	    
	    public SeedStarterService() {
	    	System.out.println(this.getClass().getSimpleName());
	    }
	    
	    
	    
	    public List<SeedStarter> findAll() {
	        return this.seedstarterRepository.findAll();
	    }

	    public void add(final SeedStarter seedStarter) {
	        this.seedstarterRepository.add(seedStarter);
	    }
}
