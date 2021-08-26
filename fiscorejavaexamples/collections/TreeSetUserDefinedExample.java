package collections;
import java.util.*;
public class TreeSetUserDefinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> ts = new TreeSet();
		ts.add(new Employee(101,"praveen"));
		ts.add(new Employee(102,"kumar"));
		ts.add(new Employee(104,"kishore"));
		System.out.println(ts);
	}

}
