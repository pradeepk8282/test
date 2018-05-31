package com.neorays.service;

import java.util.List;

import com.neorays.dto.User;

public interface UserService 
{
	User findById(Integer id);
	
	List<User> findAll();
	
	void saveOrUpdate(User user);
	
	void delete(int id);

}
