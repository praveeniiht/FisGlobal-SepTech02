package com.examples.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class PersonConfig {
	
	
	@Bean(name="p")
	@Scope("prototype")
	//@Bean
	public Person createPerson() {
		return new Person("Praveen","Hyderabad");
	}
	
	
	@Bean(name="emp")
	public Employee createEmployee() {
		return new Employee();
	}
	
	@Bean(name="student")
	public Student createStudent() {
		return new Student(1001,"kumar", createAddress());
	}
	
	@Bean(name="addr")
	public Address createAddress() {
		return new Address();
	}

}
