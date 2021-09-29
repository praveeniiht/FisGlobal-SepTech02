package personspringjdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonRowMapper implements RowMapper<Persons>{

	public Persons mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Persons person = new Persons();
		person.setName(rs.getString(1));
		person.setCity(rs.getString(2));
		person.setState(rs.getString(3));
		return person;
	}

}
