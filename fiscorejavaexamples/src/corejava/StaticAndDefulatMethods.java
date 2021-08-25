package corejava;

interface StatAndDefaultExample{
	void example1();
	void example2();
	public default void example3() {
		System.out.println("inside the default method of interface");
	}
	public static void example4() {
		System.out.println("Inside the static method of interface");
	}
}

class DefaultExample implements StatAndDefaultExample{

	@Override
	public void example1() {
		// TODO Auto-generated method stub
		System.out.println("Inside the example1");
	}
	@Override
	public void example2() {
		// TODO Auto-generated method stub
		System.out.println("Inside the example2");
	}
}

public class StaticAndDefulatMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultExample de = new DefaultExample();
		de.example1();
		de.example2();
		de.example3();
		StatAndDefaultExample.example4();
	

	}

}
