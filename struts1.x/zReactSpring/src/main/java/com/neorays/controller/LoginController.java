package com.neorays.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;



@RestController
@RequestMapping("/")
public class LoginController {

	

	public LoginController() {
		System.out.println(this.getClass().getCanonicalName());
	}

	
	@CrossOrigin(origins="http://localhost:3000/")
	@RequestMapping("/json")
	public  @ResponseBody String  validateEmpCont() {
		
		List list =new ArrayList();
		list.add(new Book(1, "pradeep"));
		list.add(new Book(2, "manju"));
		list.add(new Book(3, "hari"));
		list.add(new Book(4, "panchal"));
		Gson gson=new Gson();
		return gson.toJson(list);
	}

}
