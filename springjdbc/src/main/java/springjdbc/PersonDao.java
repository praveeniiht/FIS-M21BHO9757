package springjdbc;

import java.util.*;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDao {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertPerson(Persons person) {
		String SQL = "insert into Persons values (?, ?,?)";
		jdbcTemplate.update(SQL, person.getName(), person.getCity(), person.getState());
		System.out.println("Record inserted.....");
	}

}
