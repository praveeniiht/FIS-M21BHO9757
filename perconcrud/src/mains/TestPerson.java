package mains;

import java.util.List;
import java.util.Scanner;

import model.Persons;
import service.PersonServiceImpl;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PersonServiceImpl service = new PersonServiceImpl();
		printMenu();
		int choice;
		System.out.println("Enter your choice...");
		choice = sc.nextInt();
		switch(choice) {
		case 1 : System.out.println("Enter name");
			     String n = sc.next();
			     System.out.println("Enter city");
			     String c = sc.next();
			     System.out.println("Enter state");
			     String s = sc.next();
			     Persons person = new Persons(n,c,s);
			     String str = service.insertPerson(person);
			     System.out.println(str);
			     break;
		case 2: 
			System.out.println("Enter name to search");
			String name = sc.next();
			Persons p = service.searchPerson(name);
			System.out.println(p);
			break;
		case 3: 
			List<Persons> persons = service.displayPersons();
			persons.forEach(System.out::println);
			break;
			
		case 4: exit(0);
		default: System.out.println("Wrong Choice...");
		}

		

	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

	public static void printMenu() {
		System.out.println("Person CRUD Application");
		System.out.println("------------------------");
		System.out.println("1. Insert Person Data");
		System.out.println("2. Search Person Data");
		System.out.println("3. Display All Persons Data");
		System.out.println("4. Exit Application");
	}
}
