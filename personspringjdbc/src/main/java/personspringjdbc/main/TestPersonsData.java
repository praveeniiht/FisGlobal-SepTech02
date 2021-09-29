package personspringjdbc.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import personspringjdbc.model.Persons;
import personspringjdbc.service.PersonsServiceImpl;

public class TestPersonsData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PersonsServiceImpl service = (PersonsServiceImpl)context.getBean("pservice");
		
		/* The below code for display all records
		List<Persons> persons = service.displayPersons();
		for(Persons p:persons) {
			System.out.println(p.getName()+" "+p.getCity()+" "+p.getState());
		} 
		*/
		
		/* This code is for inserting a record
		
		System.out.println("Enter Name ");
		String name = sc.nextLine();
		System.out.println("Enter city");
		String city = sc.nextLine();
		System.out.println("Enter state");
		String state = sc.nextLine();
		Persons person = new Persons(name,city,state);
		service.insertPerson(person);
		System.out.println("Record inserted...");  */
		
		
		/* This below code is for searching a person
		System.out.println("Enter Name ");
		String name = sc.nextLine();
		Persons p = service.searchPerson(name);
		if(p!=null)
			System.out.println(p.getName()+" "+p.getCity()+" "+p.getState());
		else
			System.out.println("Name not found...");
			
			
		*/
		
		
		/* this below code is delete a person 
		System.out.println("Enter Name ");
		String name = sc.nextLine();
		System.out.println(service.deletePerson(name));
		
		*/
		
		
		List<Persons> persons = service.displayPersons();
		for(Persons p:persons) {
			System.out.println(p.getName()+" "+p.getCity()+" "+p.getState());
		} 
		
		
		
		
		
		
		

	}

}
