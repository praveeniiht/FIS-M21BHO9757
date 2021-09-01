package examples;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
									.configure()
									.buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
	//	Persons person = new Persons("sunny","Coachin","Kerala",1009);
	//	session.save(person);
	//	System.out.println("Record inserted...");
	//	Persons p1 = new Persons("kumar","chennai","tamilnady",1002);
	//	session.delete(p1);
	//	System.out.println("Record deleted...");
		
		List<Persons> p2 = session.createQuery("from Persons").list();
		p2.forEach(System.out::println);
		txn.commit();
		
		

	}

}
