package personspringjdbc.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import personspringjdbc.config.PersonsConfig;
import personspringjdbc.model.Persons;
import personspringjdbc.service.PersonsServiceImpl;

public class JavaBasedSpringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(PersonsConfig.class);
		PersonsServiceImpl service = (PersonsServiceImpl)context.getBean("pservice");
		List<Persons> persons = service.displayPersons();
		for(Persons p:persons) {
			System.out.println(p.getName()+" "+p.getCity()+" "+p.getState());
		} 
		
		System.out.println("Enter Name ");
		String name = sc.nextLine();
		System.out.println("Enter city");
		String city = sc.nextLine();
		System.out.println("Enter state");
		String state = sc.nextLine();
		Persons person = new Persons(name,city,state);
		service.insertPerson(person);
		System.out.println("Record inserted...");

	}

}
