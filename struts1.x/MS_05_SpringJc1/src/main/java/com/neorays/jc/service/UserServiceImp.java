package com.neorays.jc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.neorays.jc.dao.UserDao;
//import com.neorays.jc.dao.UserDao;
import com.neorays.jc.dto.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;
	
	public UserServiceImp() {
	System.out.println(this.getClass().getCanonicalName());
	}

	
	@Transactional
	   public void add(User user) {
	      userDao.add(user);
		System.out.println("ADD");
	   }

	@Transactional(readOnly=true)
	   public List<User> listUsers() {

		return userDao.listUsers();
		   }

	

}
