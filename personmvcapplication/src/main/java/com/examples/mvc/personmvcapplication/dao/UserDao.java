package com.examples.mvc.personmvcapplication.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.mvc.personmvcapplication.model.FisUsers;
import com.examples.mvc.personmvcapplication.model.PersonRowMapper;
import com.examples.mvc.personmvcapplication.model.Persons;

public class UserDao {
	
	@Autowired
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template=template;
	}
	
	public List<FisUsers> getAllUsers(){
		
		List<FisUsers> users = template.query("select * from fisusers",new UserRowMapper());
		return users;
		
	}
	
	public List<Persons> getAllPersons(){
		List<Persons> persons = template.query("select * from fisperson", new PersonRowMapper());
		return persons;
	}
	
	public Persons getPerson(String name) {
		String sql = "select * from Persons where name=?";
		Persons p = template.queryForObject(sql, new Object[]{name}, new PersonRowMapper());
		return p;
	}

}
