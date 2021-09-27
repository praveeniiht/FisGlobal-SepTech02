package com.examples.spring.core;
import java.util.*;
public class Tutor {
	
	String name;
	int exp;
	List<String> languages;
	Set<String> degrees;
	
	
	public Set<String> getDegrees() {
		return degrees;
	}
	public void setDegrees(Set<String> degrees) {
		this.degrees = degrees;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public List<String> getLanguages() {
		return languages;
	}
	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}
	

}
