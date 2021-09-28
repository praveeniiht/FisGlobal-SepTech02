package com.examples.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPersonJavaConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(PersonConfig.class);
		
		//Person p = context.getBean(Person.class);
		
		Person p = (Person) context.getBean("p");
		System.out.println(p);
		
		Person p1 = (Person) context.getBean("p");
		System.out.println(p1);
		
		Employee e = (Employee) context.getBean("emp");
		System.out.println(e);
		
		Student s = (Student) context.getBean("student");
		System.out.println(s);
		

	}

}
