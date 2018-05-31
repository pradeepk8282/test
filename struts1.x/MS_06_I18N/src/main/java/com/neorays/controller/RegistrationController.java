package com.neorays.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class RegistrationController 
{

	@RequestMapping(value="/",method=RequestMethod.GET)
	
	public ModelAndView index() {
		return new ModelAndView("index");
	}
}
