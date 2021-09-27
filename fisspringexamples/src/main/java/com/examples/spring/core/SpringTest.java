package com.examples.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// first create a spring IOC container
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		// Get the Bean reference
		Employee e = (Employee) context.getBean("emp");
		e.display();
		System.out.println(e.hashCode());  // object id in hexadecimal format
		
		// Get the Bean reference
		Employee e1 = (Employee) context.getBean("emp");
		System.out.println(e1.hashCode());

		
		// call the bean methods
		e.display();	
		
		Address adr = (Address) context.getBean("addr");
		System.out.println(adr);  // it will call toString method in the class
		
		Person pr = (Person) context.getBean("p");
		System.out.println(pr);
		
		FisEmployee f = (FisEmployee) context.getBean("fis");
		System.out.println(f);
		
		Tutor tr = (Tutor) context.getBean("tutor");
		System.out.println(tr.getName()+" "+tr.getExp()+" "+tr.getLanguages());
		System.out.println(tr.getDegrees());
		
	}

}
