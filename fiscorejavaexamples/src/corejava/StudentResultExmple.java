package corejava;

import java.util.function.*;
class FisStudent{
	private String name;
	private int marks;
	
	public FisStudent(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
};

public class StudentResultExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Function<FisStudent,String> result = student->{
			String temp=null;
			if(student.getMarks() >=70)
				temp="first";
			else if (student.getMarks() >=50 && student.getMarks() < 70)
				temp = "second";
				else if (student.getMarks() >=40 && student.getMarks() <50)
					temp = "third";
				else 
					temp = "fail";
			return temp;
			
		};
		
		Consumer<FisStudent> consume = student->{
			System.out.println("Student Name : "+student.getMarks());
			System.out.println("Student Marks: "+student.getMarks());
		};
		
		FisStudent student1 = new FisStudent("Kumar",76);
		FisStudent student2 = new FisStudent("Sunil",54);
		FisStudent student3 = new FisStudent("Satish",32);
	
		consume.accept(student1);
		System.out.println("Student Result:"+result.apply(student1));
		
		consume.accept(student2);
		System.out.println("Student Result:"+result.apply(student2));
		
		consume.accept(student3);
		System.out.println("Student Result:"+result.apply(student3));
	}

}
