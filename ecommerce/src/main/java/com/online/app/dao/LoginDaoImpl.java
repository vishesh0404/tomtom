package com.online.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.online.app.entity.User;
import com.online.app.repo.UserRepository;

@Component
public class LoginDaoImpl implements LoginDao {

	@Autowired
	UserRepository repo;
	
	@Override
	public User getUser(String userName) {
		User repoUser = repo.findByUsername(userName);
		return repoUser;
	}
}
