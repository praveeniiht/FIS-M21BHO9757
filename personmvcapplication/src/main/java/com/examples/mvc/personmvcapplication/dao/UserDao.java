package com.examples.mvc.personmvcapplication.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.mvc.personmvcapplication.model.FisUsers;

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
	

}
