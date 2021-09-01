package springjdbc;
import java.util.*;

import org.springframework.jdbc.core.JdbcTemplate;
public class PersonDao {
	
	JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void insertPerson(Persons person) {
		
	}
	
	public List<Persons> displayPersons(){
		
		return null;
	}
	
	public void deletePerson(Persons person) {
		
	}
	
	public Persons searchPerson(String name) {
		
		
		return null;
	}

}
