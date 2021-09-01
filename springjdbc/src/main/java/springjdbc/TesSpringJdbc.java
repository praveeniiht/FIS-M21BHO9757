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
	System.out.println("Enter city of the person");
	String city = sc.next();
	System.out.println("Enter state of the person");
	String state = sc.next();
	Persons person = new Persons(name,city,state);
	
	dao.insertPerson(person);
	

	}

}
