package com.online.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.online.app.dao.LoginDao;
import com.online.app.entity.LoginUserDetails;
import com.online.app.entity.User;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;
	
	@Override
	public User getUser(String userName) {
		return loginDao.getUser(userName);
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails userDetails = new LoginUserDetails(getUser(username));
		return userDetails;
	}
	
	
}
