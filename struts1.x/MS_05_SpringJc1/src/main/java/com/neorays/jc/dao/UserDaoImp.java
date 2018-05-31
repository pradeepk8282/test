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

	@Autowired
	   private SessionFactory sessionFactory;
	
	public UserDaoImp() {
		System.out.println(this.getClass().getCanonicalName());
	}

	@Override
	public List<User> listUsers() {
		 @SuppressWarnings("unchecked")
		  TypedQuery<User> query=(TypedQuery<User>) sessionFactory.getCurrentSession().createQuery("from User");
	      return query.getResultList();
	}

	
	

	@Override
	public void add(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}


	
}
