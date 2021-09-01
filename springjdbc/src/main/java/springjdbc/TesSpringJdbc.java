package springjdbc;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TesSpringJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	PersonDao dao = (PersonDao) ctx.getBean("dao");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter name of the person");
	String name = sc.next();
	Persons p = dao.searchPerson(name);
	System.out.println(p);
	
	dao.deletePerson(name);  
	List<Persons> persons = dao.displayPersons();
	for(Persons p1 :persons) {
		System.out.println(p1.getName()+" "+p1.getCity()+" "+p1.getState());
	}

	
	/*
	System.out.println("Enter city of the person");
	String city = sc.next();
	System.out.println("Enter state of the person");
	String state = sc.next();
	Persons person = new Persons(name,city,state);
	
	dao.insertPerson(person);
	/*
	dao.deletePerson(name);  
	List<Persons> persons = dao.displayPersons();
	for(Persons p :persons) {
		System.out.println(p.getName()+" "+p.getCity()+" "+p.getState());
	}
	
*/
	}

}
