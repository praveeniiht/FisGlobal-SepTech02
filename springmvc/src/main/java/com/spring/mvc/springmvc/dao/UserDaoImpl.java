package com.spring.mvc.springmvc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.mvc.springmvc.model.UserMapper;
import com.spring.mvc.springmvc.model.Users;

public class UserDaoImpl implements UserDao {

	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		String sql = "select * from users";
		List<Users> users = template.query(sql, new UserMapper());
		return users;
	}

	@Override
	public String insertUser(Users user) {
		// TODO Auto-generated method stub
		String sql = "insert into users values (?,?)";
		int result = template.update(sql, user.getUsername(), user.getPassword());
		if (result == 1)
			return "User Registered Successfully";
		else
			return "User is not Registered";
	}

}
