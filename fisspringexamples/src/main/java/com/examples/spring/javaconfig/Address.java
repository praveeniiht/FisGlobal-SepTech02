package com.examples.spring.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	@Value("302")
	int dno;
	
	@Value("shanti Nagar")
	String street;
	
	@Value("Hyderabad")
	String city;
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}
	
	
	

}
