package collections;
import java.util.*;
class Student{
	int htno;
	String name;
	public Student(int htno, String name) {
		super();
		this.htno = htno;
		this.name = name;
	}
	public String toString() {
		return htno+" "+name;
	}
	
}
class HtnoComporator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(o1.htno> o2.htno)
			return 1;
		else if(o1.htno< o2.htno)
			return -1;
		else
			return 0;
	}
	
}
public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> ls = new ArrayList();
		ls.add(new Student(101,"praveen"));
		ls.add(new Student(104,"kumar"));
		ls.add(new Student(102,"kishore"));
		
		System.out.println("sorted on name basis");
		Collections.sort(ls,(s1,s2)->s1.name.compareTo(s2.name));  // by using the lambda expression instead of compartor 
		System.out.println(ls);								       // implementation
		
		System.out.println("sorted on htno basis");
		Collections.sort(ls,new HtnoComporator());
		System.out.println(ls);
		
	}

}
