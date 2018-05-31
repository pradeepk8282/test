package com.neorays.jc.dao;

import java.util.List;

import com.neorays.jc.dto.User;

public interface UserDao {
	void add(User user);
	   List<User> listUsers();

}
