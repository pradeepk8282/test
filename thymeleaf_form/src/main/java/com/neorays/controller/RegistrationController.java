package com.neorays.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neorays.dto.RegistrationDTO;
import com.neorays.service.RegistionService;

@Controller
public class RegistrationController {

	@Autowired
	private RegistionService registionService;
	public RegistrationController() {
		System.out.println(this.getClass().getCanonicalName());
	}
	
	@RequestMapping(value="/")
	public String index(Model model)
	{
		
		model.addAttribute("registration", new RegistrationDTO());
		return "index.html";
		
	}
	
	@RequestMapping(value="/register" ,method=RequestMethod.POST)
	public String register(@ModelAttribute @Valid RegistrationDTO dto,Model model,BindingResult bindingResult,RedirectAttributes attributes){
			
		System.out.println(bindingResult.hasErrors());
		if(registionService.register(dto)) 
			model.addAttribute("msg","Success created Account");
		
		else 
			model.addAttribute("msg","Account Not Created");
		return "index.html";
	}
}
