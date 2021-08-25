package corejava;
final class Base{
	final int x=10;
	public final void test1() {
		//x++;
		System.out.println("Inside the test method of base class");
		System.out.println("The x = "+x);
	}
}
class Base1{
	
}
class Derived extends Base1{
	public void test() {
		System.out.println("Inside the test method of Derived class");
		
	}
}

public class FinalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d = new Derived();
		d.test();

	}

}
