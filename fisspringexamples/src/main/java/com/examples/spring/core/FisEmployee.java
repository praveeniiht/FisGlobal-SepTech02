package com.examples.spring.core;

public class FisEmployee {
	
	String name;
	Address address;
	Person person;
	// remove the parametarized constructor to verify byName or byType autowirings
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "FisEmployee [name=" + name + ", address=" + address + ", person=" + person + "]";
	}

	
	

}
