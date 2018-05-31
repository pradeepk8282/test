package com.neorays.jc;

import java.util.ArrayList;
import java.util.List;




import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.neorays.jc.config.AppConfig;
import com.neorays.jc.dto.User;
import com.neorays.jc.service.UserService;

public class Tester {
	
	public Tester() {
		System.out.println(this.getClass().getCanonicalName());
	}
	public static void main(String[] args) {

		System.out.println("STARTED THE MAIN");
	AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("SERVICE CREATION");
		
	UserService userService = context.getBean(UserService.class);
		/*userService.add(new User("Sunil", "Bora", "suni.bora@example.com"));
	      userService.add(new User("David", "Miller", "david.miller@example.com"));
	      userService.add(new User("Sameer", "Singh", "sameer.singh@example.com"));
	      userService.add(new User("Paul", "Smith", "paul.smith@example.com"));

	      List<User> users = userService.listUsers();
	      for (User user : users) {
	         System.out.println("Id = "+user.getId());
	         System.out.println("First Name = "+user.getFirstname());
	         System.out.println("Last Name = "+user.getFirstname());
	         System.out.println("Email = "+user.getEmail());
	         
	         System.out.println();
	      }*/
	      context.close();
	}
}
