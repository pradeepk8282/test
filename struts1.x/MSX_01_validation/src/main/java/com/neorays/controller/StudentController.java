package com.neorays.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neorays.dto.Student;

@Controller
public class StudentController
{
	@RequestMapping(value="/users.do",method=RequestMethod.POST )
  public void Add(@ModelAttribute("userForm") Student student)
  {
	  System.out.println("inside controller");
  }
}