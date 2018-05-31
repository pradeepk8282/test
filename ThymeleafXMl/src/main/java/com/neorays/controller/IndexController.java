package com.neorays.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class IndexController {

	public IndexController() {
		System.out.println(this.getClass().getCanonicalName());
	}
	
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String index(Model model)
	{
        model.addAttribute("recipient", "World");
		return "index.html";
	}

}
