package com.neorays.jc.service;

import java.util.List;

import com.neorays.jc.dto.User;

public interface UserService {

	void add(User user);

	List<User> listUsers();
}
