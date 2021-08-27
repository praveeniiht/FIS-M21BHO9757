package service;

import java.util.List;

import dao.PersonDao;
import model.Persons;

public class PersonServiceImpl  implements PersonService{
	
	PersonDao dao = null;
	public PersonServiceImpl() {
		dao = new PersonDao();
	}

	@Override
	public String insertPerson(Persons person) {
		
		// TODO Auto-generated method stub
		return dao.insertPerson(person);
	}

	@Override
	public List<Persons> displayPersons() {
		// TODO Auto-generated method stub
		return dao.displayPersons();
	}

	@Override
	public Persons searchPerson(String name) {
		// TODO Auto-generated method stub
		return dao.searchPerson(name);
	}

}
