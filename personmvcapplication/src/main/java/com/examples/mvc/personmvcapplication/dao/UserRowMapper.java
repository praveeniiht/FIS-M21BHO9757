package com.examples.mvc.personmvcapplication.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.examples.mvc.personmvcapplication.model.FisUsers;

public class UserRowMapper implements RowMapper<FisUsers> {

	@Override
	public FisUsers mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		FisUsers user = new FisUsers();
		user.setUserid(rs.getString(1));
		user.setPassword(rs.getString(2));
		return user;
	}

}
