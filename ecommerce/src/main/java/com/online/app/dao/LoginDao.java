package com.online.app.dao;

import org.springframework.stereotype.Component;

import com.online.app.entity.User;

@Component
public interface LoginDao{

	User getUser(String userName);
	
}
