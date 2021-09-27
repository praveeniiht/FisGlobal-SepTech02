package com.examples.spring.core;

public class Person {
	int age;
	String name;
	String qualification;
	public Person(int age, String name, String qualification) {
		super();
		this.age = age;
		this.name = name;
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", qualification=" + qualification + "]";
	}
	
	
	

}
