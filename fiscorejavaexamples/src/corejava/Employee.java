package corejava;

public class Employee {
	private int employeeId;
	private String name;
	private String dept;  
	public static String company;
	static {
		System.out.println("Inside the static block s");
	}
	
	{
		System.out.println("Inside the non static block...");
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Employee() {
		System.out.println("Inside the default constructor....");
		name="hari";
		employeeId=9999;
	}
	public Employee(int employeeId, String name, String dept){
		System.out.println("Inside the parameterized constructor....");
		this.employeeId=employeeId;
		this.name=name;
		this.dept=dept;
		this.company=company;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void showData(){
		int x,y ;
		System.out.println(employeeId+" "+name+" "+dept+" "+company);
	}
	public static void showComapany() {
		System.out.println("  "+company);
	}
}
