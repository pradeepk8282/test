package com.neorays.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.form.JasperInputForm;

@Controller
public class LoadJasperReprt
{
	
	public LoadJasperReprt() {
		System.out.println(this.getClass().getCanonicalName());
	}

	@RequestMapping(value = "/", method = RequestMethod.GET) 
	public String displayLogin(Model model) { 
	    model.addAttribute("jasperInputForm", new JasperInputForm()); 
	    return "loadJasper"; 
	}
	
	
}
