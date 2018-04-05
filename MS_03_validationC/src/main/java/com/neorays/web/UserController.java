package com.neorays.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neorays.model.User;
import com.neorays.service.UserService;
import com.neorays.validator.UserFormValidator;

@Controller
public class UserController {

	@Autowired
	UserFormValidator userFormValidator;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(userFormValidator);
	}

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserController() {
		System.out.println("<========================================="
				+ this.getClass().getCanonicalName());
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model model) {
		
		return "redirect:/users";
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String showAllUsers(Model model) {

		 User user=new User();
		 model.addAttribute("users", userService.findAll());
		return "users/list";

	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String add(@ModelAttribute("user") @Validated User user,
			BindingResult result, Model model,
			final RedirectAttributes redirectAttributes) {
		return "users/userform";
	}
	
	@RequestMapping(value = "/users/{id}/delete", method = RequestMethod.POST)
	public String deleteUser(@PathVariable("email") String email, final RedirectAttributes redirectAttributes) {


		userService.delete(email);
		
		redirectAttributes.addFlashAttribute("css", "success");
		redirectAttributes.addFlashAttribute("msg", "User is deleted!");
		
		return "redirect:/users";

	}
	@RequestMapping(value = "/users/{email}/update", method = RequestMethod.GET)
	public String showUpdateUserForm(@PathVariable("email") String email, Model model) {

		System.out.println(email);

		User user = userService.findByemail(email);
		model.addAttribute("userForm", user);
		System.out.println("-------------------------------->show update");
		
		
		return "users/userform";

	}

	@RequestMapping(value = "/users/add", method = RequestMethod.GET)
	public String showAddUserForm(Model model) {

		User user = new User();

		user.setName("Neorays");
		user.setEmail("test@gmail.com");

		model.addAttribute("userForm", user);

		return "users/userform";
	}
	
	@RequestMapping(value = "/users/{email}", method = RequestMethod.GET)
	public String showUser(@PathVariable("email") String email, Model model) {

		System.out.println(email);

		User user = userService.findByemail(email);
		
		if (user == null) {
			model.addAttribute("css", "danger");
			model.addAttribute("msg", "User not found");
		}
		model.addAttribute("user", user);

		return "users/show";

	}

	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ModelAndView handleEmptyData(HttpServletRequest req, Exception ex) {

		ModelAndView model = new ModelAndView();
		model.setViewName("user/show");
		model.addObject("msg", "user not found");

		return model;

	}

}
