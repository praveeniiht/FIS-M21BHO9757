package collections;
import java.util.*;
class Employee implements Comparable<Employee>{
	int empid;
	String name;
	public Employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	public String toString() {
		return empid+" "+name;
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(this.empid > e.empid)
			return 1;
		else if(this.empid < e.empid)
			return -1;
		else
			return 0;
	}
	
}

public class ArrayListUserDefinedExample {
	public static void main(String args[]) {
		List<Employee> ar = new LinkedList();
		ar.add(new Employee(101,"praveen"));
		ar.add(new Employee(102,"kumar"));
		ar.add(new Employee(104,"kishore"));
		System.out.println(ar);
		System.out.println("traversing using the for loop");
		for(Employee e : ar) {
			System.out.println(e.empid+" "+e.name);
		}
		System.out.println("traversing using the iterator class");
		Iterator itr = ar.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("traversing using the forEach method");
		ar.forEach(System.out::println);
		
	}

}
