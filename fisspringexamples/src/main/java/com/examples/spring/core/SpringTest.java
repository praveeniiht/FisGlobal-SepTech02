package com.examples.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first create a spring IOC container
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Get the Bean reference
		Employee e = (Employee) context.getBean("emp");
		System.out.println(e);  // object id in hexadecimal format

		
		// call the bean methods
		e.display();	
		
		Address adr = (Address) context.getBean("addr");
		System.out.println(adr);  // it will call toString method in the class
		
		Person pr = (Person) context.getBean("p");
		System.out.println(pr);
		
	}

}
