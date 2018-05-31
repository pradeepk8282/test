package com.neorays.jc.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.neorays.jc.dto.User;

@Repository
public class UserDaoImp implements UserDao
{

	public void add(User user) {
		System.out.println("ADd");
		
	}

	public List<User> listUsers() {
		System.out.println("execute");
		return null;
	}

	@Autowired
	   private SessionFactory sessionFactory;
	
	public UserDaoImp() {
		System.out.println(this.getClass().getCanonicalName());
	}
	/*
	public void add(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}

	public List<User> listUsers() {
		 @SuppressWarnings("unchecked")
		  TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
	      return query.getResultList();
	}*/
	
}
