package service;

import java.util.List;

import model.Persons;

public interface PersonService {
	public String insertPerson(Persons person);
	public List<Persons> displayPersons();
	public Persons searchPerson(String name);
}
