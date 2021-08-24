package corejava;

public class FunctionOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DriverTest test = new DriverTest();
		test.connection("Type-1 Driver");  
		test.connection("type2 driver","MySQL");
		test.connection("type2 driver","MySQL","praveen");
		test.connection("type2 driver","MySQL","praveen","1234");  
		System.out.println(4+5);
		System.out.println(3.5+4.8);
		System.out.println("Hello "+" Hai");
		
	}

}
