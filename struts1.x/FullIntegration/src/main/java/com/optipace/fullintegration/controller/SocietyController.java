package com.optipace.fullintegration.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.optipace.fullintegration.dao.SocietyRegistrationDAO;
import com.optipace.fullintegration.dto.SocietyRegistrationDTO;
import com.optipace.fullintegration.service.SocietyRegistrationService;

@Controller
@RequestMapping("/")

public class SocietyController {
	public static final Logger LOGGER = Logger.getLogger(SocietyController.class);

	private SocietyRegistrationService service;
	
	public SocietyController() {
		LOGGER.debug(this.getClass().getSimpleName() + "\t created...");
	}

	 @RequestMapping(value="/", method=RequestMethod.GET)
	   public String index(Model model) {
		 

		 model.addAttribute("society", new SocietyRegistrationDTO());
	      return "index";
	   }
	 @RequestMapping(value="/save.do", method=RequestMethod.POST)
	 public ModelAndView formPost( @ModelAttribute("society") @Validated SocietyRegistrationDTO dto, BindingResult result, Model model)
	 {
		 LOGGER.debug("Inside save method");
		 service.saveForm(dto);
		 
		return new ModelAndView("index");
		 
	 }


}
