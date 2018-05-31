package com.neorays.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neorays.model.User;

@Service("userService")
public class UserService{

	public User user;
	public User user2;
	public User user3;
	public List<User> findAll() {
		List<User> list=new ArrayList<User>();
		user=new User();
		user.setName("Pradeep");
		user.setEmail("p@email.com");
		user.setPassword("******");
		user.setConfirmPassword("******");
		list.add(user);
		user2=new User();
		user2.setName("Suresh");
		user2.setEmail("s@email.com");
		user2.setPassword("******");
		user2.setConfirmPassword("******");
		list.add(user2);
		 user3=new User();
		user3.setName("Hari");
		user3.setEmail("H@email.com");
		user3.setPassword("******");
		user3.setConfirmPassword("******");
		list.add(user3);
		
		return list;
	}


	public User findByemail(String email) {
		
		if(email.equals("p@email"))
			return user;
		else if(email.equals("s@email"))
			return user2;
		else if(email.equals("H@email"))
			return user3;
		else
			return null;
		


	}
public User findBemail(String email) {
		
		if(email.equals("p@email.com"))
			return user;
		else if(email.equals("s@email.com"))
			return user2;
		else if(email.equals("H@email.com"))
			return user3;
		else
			return null;
		


	}
	

	public void delete(String email)
	{
			System.out.println("removed");	
	}


}