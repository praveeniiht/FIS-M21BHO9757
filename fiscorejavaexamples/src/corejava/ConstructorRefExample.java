package corejava;



class Student{
	String name;
	Student(String name){
		this.name=name;
	}
	public void display() {
		System.out.println("The Name : "+name);
	}
}

@FunctionalInterface
interface StudentInteface{
	public Student createStudent(String name);
}


public class ConstructorRefExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StudentInteface  sf = str-> new Student(str);
		
		StudentInteface  sf = Student::new;
		Student s  = sf.createStudent("praveen");
		s.display();
		

	}

}
