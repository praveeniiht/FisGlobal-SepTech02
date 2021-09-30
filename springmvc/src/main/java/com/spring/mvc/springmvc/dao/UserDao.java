package com.spring.mvc.springmvc.dao;

import java.util.List;

import com.spring.mvc.springmvc.model.Users;

public interface UserDao {
	public List<Users> getUsers();
	public String insertUser(Users user);
}
