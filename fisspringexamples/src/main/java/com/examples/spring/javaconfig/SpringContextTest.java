package com.examples.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springs.xml");
		
		University univ = (University)context.getBean("university");
		System.out.println(univ);
		
		
		College c = (College) context.getBean("clg");
		System.out.println(c);
		
		
	}

}
