package com.examples.mvc.personmvcapplication.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examples.mvc.personmvcapplication.dao.UserDao;
import com.examples.mvc.personmvcapplication.dao.UserRowMapper;
import com.examples.mvc.personmvcapplication.model.FisUsers;
import com.examples.mvc.personmvcapplication.model.Persons;



@Controller
public class HomeController {

	@Autowired
	UserDao dao;

	@RequestMapping(value = "/")
	public String test() {
		return "login";
	}

	@RequestMapping(value = "/validate")
	public ModelAndView validate(HttpServletResponse response, HttpServletRequest request) throws IOException {
		String uid = request.getParameter("lid");
		String passwd = request.getParameter("pwd");

		List<FisUsers> users = dao.getAllUsers();
		boolean isValidUser = false;
		FisUsers user = null;
		for (FisUsers u : users) {

			if (uid.equals(u.getUserid()) && passwd.equals(u.getPassword())) {
				isValidUser = true;
				user=u;
				break;
			}
		}
		if(isValidUser)
			return new ModelAndView("success", "username",user.getUserid());
		else
			return new ModelAndView("fail");
	}
	
	@RequestMapping("/display")
	public ModelAndView display() {
		List<Persons> persons = dao.getAllPersons();
		return new ModelAndView("display","persons",persons);
	}
	
	@RequestMapping("/search")
	public ModelAndView search() {
		return new ModelAndView("search");
	}
	
	@RequestMapping("/searchPerson")
	public ModelAndView searchPerson(HttpServletRequest request) {
		String name = request.getParameter("sname");
		Persons data = dao.getPerson(name);
		return new ModelAndView("searchdata","person",data);
	}
}
