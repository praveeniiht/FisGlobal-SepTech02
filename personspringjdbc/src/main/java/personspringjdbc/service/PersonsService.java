package personspringjdbc.service;

import personspringjdbc.model.Persons;
import java.util.List;
public interface PersonsService {
	
	public Persons insertPerson(Persons person);
	public List<Persons> displayPersons();
	public String deletePerson(String name);

}
