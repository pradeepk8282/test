package com.neorays.controller;

import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neorays.model.AccountHolder;

@Controller
public class HomeController {

	
	@RequestMapping(value = "/home")
	public ModelAndView getHome(ModelAndView mv) {
		System.out.println("getHome");
		
		AccountHolder accountHolder = new AccountHolder();
		mv.addObject("accountHolder", accountHolder);
	
		mv.setViewName("home");
		return mv;
	}
	
	
	@RequestMapping(value = "createAccount")
	public ModelAndView createAccount(ModelAndView mv,
			@ModelAttribute @Valid AccountHolder accountHolder,
			BindingResult bindingResult, Model model,
			RedirectAttributes redirectAttributes) {
		System.out.println("Create account");
		
		if(accountHolder.getAge()==null||!Pattern.matches("^[0-9]{2}$", accountHolder.getAge().toString())){
			bindingResult.rejectValue("age", "maxDigit.accountHolder.age", "Please enter valid Age");
		}
		System.out.println(bindingResult.hasErrors());
		if (bindingResult.hasErrors()) {
			mv.setViewName("home");
		} else {
			redirectAttributes.addFlashAttribute("accountHolder", accountHolder);
			mv.setViewName("redirect:/createAccountInfo");
		}
			
		
		return mv;
	}
	
	
	@RequestMapping(value="/createAccountInfo")
	public ModelAndView createPolicyInfo(ModelAndView mv,@ModelAttribute("accountHolder") AccountHolder accountHolder){
		System.out.println("createAccountInfo");

		mv.setViewName("accountcreated");
		mv.addObject("accountHolder", accountHolder);
		return mv;
	}
	

}
