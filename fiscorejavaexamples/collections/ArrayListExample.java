package collections;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ar = new ArrayList();
		ar.add("India");
		ar.add("china");
		ar.add("Japan");
		ar.add("America");
		ar.add("India");
		ar.add(null);
		
		
		ArrayList ar1 = new ArrayList();
		ar1.add("Canada");
		ar1.add("australia");
		
		for(Object s:ar) {
			System.out.println(s);
		}
		
		ar.addAll(ar1); // ar = ar + ar1;
		System.out.println(ar);
		
		if(ar.containsAll(ar1))
			System.out.println("all are available");
		else
			System.out.println("not available..");
		
		if(ar.contains("japan"))
			System.out.println("Country found");
		else
			System.out.println("Country not found...");
		
		ar.retainAll(ar1);
		System.out.println(ar);
		
		// 1. By using a for loop
		
		for(Object s:ar) {
			System.out.println(s);
		}
		
		
		// 2. is by using iterator class
		
		Iterator itr = ar.iterator();
		// two useful methods 1. next() and 2. hasNext()
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		// 3. forEach -- java8
		
		System.out.println("Below display is by using foreach...");
		ar.forEach(System.out::println);
		
	}

}
