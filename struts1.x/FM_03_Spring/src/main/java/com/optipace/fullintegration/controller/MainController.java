package com.optipace.fullintegration.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.optipace.fullintegration.Form.PersonForm;
import com.optipace.fullintegration.dto.PersonDTO;

public class MainController {
	  private static List<PersonDTO> persons = new ArrayList<PersonDTO>();
	  
	    static {
	        persons.add(new PersonDTO("Bill", "Gates"));
	        persons.add(new PersonDTO("Steve", "Jobs"));
	    }
	    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	    public String index(Model model) {
	 
	        model.addAttribute("persons", persons);
	 
	        return "index";
	    }
	    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.GET)
	    public String addPersonForm(Model model) {
	 
	        PersonForm personForm = new PersonForm();
	        model.addAttribute("personForm", personForm);
	 
	        return "addPerson";
	    }
	    @RequestMapping(value = { "/addPerson" }, method = RequestMethod.POST)
	    public String addPersonSave(Model model, //
	            @ModelAttribute("personForm") PersonForm personForm) {
	 
	        String firstName = personForm.getFirstName();
	        String lastName = personForm.getLastName();
	 
	        if (firstName != null && firstName.length() > 0 //
	                && lastName != null && lastName.length() > 0) {
	            PersonDTO newPerson = new PersonDTO(firstName, lastName);
	            persons.add(newPerson);
	 
	            return "redirect:/index";
	        }
	        String error = "First Name & Last Name is required!";
	        model.addAttribute("errorMessage", error);
	        return "addPerson";
	    }
	 
}
