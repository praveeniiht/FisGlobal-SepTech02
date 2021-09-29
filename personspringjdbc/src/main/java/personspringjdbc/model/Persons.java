package personspringjdbc.model;

public class Persons {
	
	String name;
	String city;
	String state;
	
	public Persons() {
		
	}
	public Persons(String name, String city, String state) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
