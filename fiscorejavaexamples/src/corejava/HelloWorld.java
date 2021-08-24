package corejava;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Employee emp1 = new Employee(1001,"kumar","java");
		emp1.setCompany("Fis Global");
		emp1.showData();
		System.out.println(emp1);
		emp1.showComapany();
		
		Employee.company = "Fis International";
		Employee emp2 = new Employee(1002,"sunil","dotnet");
		emp2.showData();
		
		emp2.showComapany();
		
		System.out.println(emp2);	
		
		Employee emp3 = new Employee();
		emp3.showData();
		emp3.showComapany();
		
		System.out.println(emp3);
		emp1.showData();
		
		Employee.showComapany();
	}
}

