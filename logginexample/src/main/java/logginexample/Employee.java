package logginexample;

public class Employee {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Hello , "+name+" Welcome");
	}

}
