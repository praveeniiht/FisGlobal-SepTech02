package personspringjdbc.dao;

import java.util.List;

import personspringjdbc.model.Persons;

public interface PersonsDao {
	
	public Persons insertPerson(Persons person);
	public List<Persons> displayPersons();
	public String deletePerson(String name);
	public Persons searchPerson(String name);


}
