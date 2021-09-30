package com.spring.mvc.springmvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.springmvc.dao.UserDaoImpl;
import com.spring.mvc.springmvc.model.Users;

@Controller
public class HomeController {
	
	
	
	@Autowired
	UserDaoImpl userDaoImpl;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/validate")
	public ModelAndView test1(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String uname = request.getParameter("lid");
		String passwd = request.getParameter("pwd");
		
		List<Users> users = userDaoImpl.getUsers();
		boolean isFound=false;
		for(Users u:users) {
			if(uname.equals(u.getUsername()) && passwd.equals(u.getPassword())) {
				isFound=true;
				break;
			}
		}
		
		
		if(isFound)
				return new ModelAndView("success","username",uname);
		else
			return new ModelAndView("fail");
	}
	
	@RequestMapping("/test2")
	public String test2() {
		return "home2";
	}
}
