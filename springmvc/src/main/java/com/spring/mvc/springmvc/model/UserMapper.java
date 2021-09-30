package com.spring.mvc.springmvc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class UserMapper implements RowMapper<Users>{

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Users user = new Users();
		user.setUsername(rs.getString(1));
		user.setPassword(rs.getString(2));
		return user;
	}
	
	

}
