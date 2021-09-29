package personspringjdbc.service;

import java.util.List;

import personspringjdbc.dao.PersonsDaoImpl;
import personspringjdbc.model.Persons;

public class PersonsServiceImpl implements PersonsService{
	
	
	PersonsDaoImpl repo;

	public PersonsDaoImpl getDao() {
		return repo;
	}

	public void setDao(PersonsDaoImpl repo) {
		this.repo = repo;
	}

	public Persons insertPerson(Persons person) {
		// TODO Auto-generated method stub
		return repo.insertPerson(person);
	}

	public List<Persons> displayPersons() {
		// TODO Auto-generated method stub
		return repo.displayPersons();
	}

	public String deletePerson(String name) {
		// TODO Auto-generated method stub
		return repo.deletePerson(name);
	}

}
