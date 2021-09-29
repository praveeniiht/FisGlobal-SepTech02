package personspringjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import personspringjdbc.model.PersonRowMapper;
import personspringjdbc.model.Persons;


public class PersonsDaoImpl implements PersonsDao{
	
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public Persons insertPerson(Persons person) {
		// TODO Auto-generated method stub
		String SQL = "insert into Persons values (?, ?,?)";
		template.update(SQL, person.getName(), person.getCity(), person.getState());
		return person;
	}
	public String deletePerson(String name) {
		// TODO Auto-generated method stub
		String sql = "delete from Persons where name =?";
		template.update(sql,name);
		return "Record is deleted";
	}

	public List<Persons> displayPersons() {
		// TODO Auto-generated method stub
		String sql = "select * from Persons";
		List<Persons> persons = template.query(sql, new PersonRowMapper());
		return persons;
	
	}

	public Persons searchPerson(String name) {
		// TODO Auto-generated method stub
		Persons temp=null;
		String sql = "select * from Persons";
		List<Persons> persons = template.query(sql, new PersonRowMapper());
		for(Persons p:persons) {
			if(p.getName().equals(name)) {
				temp =p;
				break;
			}
		}
		return temp;
	}
	
}
