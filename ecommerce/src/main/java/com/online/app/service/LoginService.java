package com.online.app.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.online.app.entity.User;

@Service
public interface LoginService extends UserDetailsService{
	public User getUser(String userName);
}
