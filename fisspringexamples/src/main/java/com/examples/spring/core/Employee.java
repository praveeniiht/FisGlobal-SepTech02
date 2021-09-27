package com.examples.spring.core;

public class Employee {
	String name;
	String dept;
	String desg;
		
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getDesg() {
		return desg;
	}


	public void setDesg(String desg) {
		this.desg = desg;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", desg=" + desg + "]";
	}


	public void display() {
		System.out.println(name+" "+dept+" "+desg);
	}
	

}
