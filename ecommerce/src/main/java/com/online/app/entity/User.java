package com.online.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(unique = true)
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column
	private UserType userType;

	public Long getUserId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserId(long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public User() {
	}

	public User(long userId, String username, String password, String name, UserType userType) {
		this.id = userId;
		this.username = username;
		this.password = password;
		this.name = name;
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Users [userId=" + id + ", username=" + username + ", password=" + password + ", name=" + name
				+ ", userType=" + userType + "]";
	}
	
}
