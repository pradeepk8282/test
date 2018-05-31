package com.neorays.jc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neorays.jc.config.PersistenceConfig;
import com.neorays.jc.dto.User;
import com.neorays.jc.service.UserService;

public class Tester
{
	public static void main(String[] args) {
		
		System.out.println("Start");
		AnnotationConfigApplicationContext	context =new AnnotationConfigApplicationContext(PersistenceConfig.class);
		System.out.println("end");
	
		UserService service=context.getBean(UserService.class);
		//System.out.println(service.toString());
		UserService userService = context.getBean(UserService.class);
		/*userService.add(new User("Sunil", "Bora", "suni.bora@example.com"));
	      userService.add(new User("David", "Miller", "david.miller@example.com"));
	      userService.add(new User("Sameer", "Singh", "sameer.singh@example.com"));
	      userService.add(new User("Paul", "Smith", "paul.smith@example.com"));
	      */
	    /*  List<User> users = userService.listUsers();
	      for (User user : users) {
	         System.out.println("Id = "+user.getId());
	         System.out.println("First Name = "+user.getFirstname());
	         System.out.println("Last Name = "+user.getFirstname());
	         System.out.println("Email = "+user.getEmail());
	         
	         System.out.println();
	      }*/
		System.out.println("context");
	}

}
