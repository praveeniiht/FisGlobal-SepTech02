package com.examples.spring.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class University {
	
	@Value("JNTU")
	String uname;
	
	@Value("1962")
	int estd;
	
	@Override
	public String toString() {
		return "University [uname=" + uname + ", estd=" + estd + ", city=" + city + "]";
	}
	@Value("Hyderabad")
	String city;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getEstd() {
		return estd;
	}
	public void setEstd(int estd) {
		this.estd = estd;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
