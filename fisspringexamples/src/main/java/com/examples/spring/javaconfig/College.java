package com.examples.spring.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("clg")
public class College {  //college
	
	@Value("CBIT")
	String name;
	
	
	@Autowired
	University university;
	
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public University getUniversity() {
		return university;
	}
	
	//@Autowired
	public void setUniversity(University university) {
		this.university = university;
	}
	
	@Override
	public String toString() {
		return "College [name=" + name + ", university=" + university + "]";
	}

}
