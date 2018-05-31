package com.neorays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neorays.model.User;
import com.neorays.service.LoginService;


@Controller
public class LoginController {
	
	@RequestMapping(value="/")
	public String enter(Model model){
		
		System.out.println("inside entry point");
		model.addAttribute("usr",new User());
		return "check";
	}
	
	@RequestMapping(value="/display")
	public String display( @ModelAttribute("user")User user,BindingResult error){
		
		System.out.println("inside validation");
		String uname=user.getName();
		String pwd=user.getPassword();
		System.out.println("inside validate "+uname +" "+pwd);
		
		if(error.hasErrors()){
			return "check";
		}
		
		return "check";
	}
	
	
	@RequestMapping("/login")
	public ModelAndView checkUser(User user)
	{
		
		ModelAndView mv=new ModelAndView();
		
	
		String uname=user.getName();
		String pwd=user.getPassword();
		System.out.println(uname +" "+pwd);
		
		return new ModelAndView("asda");
		
	}

}
