package fisspringexamples;

public class Employee {
	String empid;
	String name;
	Address address;
	public Employee(String empid, String name, Address address) {
		this.empid = empid;
		this.name= name;
		this.address=address;
	}
	
	public void display() {
		System.out.println("Hello : "+name+" your id is : "+empid);
		System.out.println(address);
	}

}
