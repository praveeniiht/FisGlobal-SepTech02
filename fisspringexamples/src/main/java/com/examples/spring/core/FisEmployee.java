package com.examples.spring.core;

public class FisEmployee {
	
	String name;
	Address address;
	FisEmployee(String name, Address address){
		this.name=name;
		this.address=address;
	}
	@Override
	public String toString() {
		return "FisEmployee [name=" + name + ", address=" + address + "]";
	}
	

}
