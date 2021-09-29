package personspringjdbc.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import personspringjdbc.model.Persons;
import personspringjdbc.service.PersonsServiceImpl;

public class TestPersonsData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PersonsServiceImpl service = (PersonsServiceImpl)context.getBean("pservice");
		List<Persons> persons = service.displayPersons();
		for(Persons p:persons) {
			System.out.println(p.getName()+" "+p.getCity()+" "+p.getState());
		}
		

	}

}
