package examples;

import java.util.*;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.buildSessionFactory();
		
		
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		//Persons person = new Persons("prasad","Madhurai","Tamilnadu",1010);
		//session.save(person);
	//	System.out.println("Record inserted...");
	//	Persons p1 = new Persons("kumar","chennai","tamilnady",1002);
	//	session.delete(p1);
	//	System.out.println("Record deleted...");
		
		List<Persons> p2 = session.createQuery("from Persons").list();
		p2.forEach(System.out::println);
		
		List<String> cities = session.createQuery("select c.city from Persons c").list();
		System.out.println(cities);
		
		List<Persons> data = session.createQuery("from Persons p where p.pid=1001").setMaxResults(3).list();
		System.out.println(data);	
		
		System.out.println("Persons names in ascending order");
		List names = session.createQuery("select p.name from Persons p order by p.name").list();
		names.forEach(System.out::println);
		
		System.out.println("complete details of  Persons  in ascending order of names");
		List<Persons> details = session.createQuery("from Persons p order by p.name").list();
		details.forEach(System.out::println);
		
		String hql = "update Persons set city=:city where pid=1001";
		Query qry = session.createQuery(hql);
		qry.setParameter("city","Warangal");
		int k = qry.executeUpdate();
		System.out.println(k+" Record(s) are updated...");
		
		String h1 = "delete from Persons where pid=:pid";
		Query q1 = session.createQuery(h1);
		q1.setParameter("pid", 1008);
		q1.executeUpdate();
		System.out.println("Record with 1008 id is deleted...");		
		txn.commit();
	}
}
