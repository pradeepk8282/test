package com.neorays.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.dto.LoginDTO;
import com.neorays.services.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {

	@Autowired
	private LoginService service;

	public LoginController() {
		System.out.println(this.getClass().getCanonicalName());
	}

	@RequestMapping(value="login.do",method=RequestMethod.POST)
	public ModelAndView validateEmpCont(LoginDTO dto) {
		if (service.validateEmpServ(dto))
			return new ModelAndView("success", "user", dto.getUsername());

		return new ModelAndView("failure");
	}
}
