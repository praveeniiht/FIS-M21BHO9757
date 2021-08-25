package corejava;

interface inter1{
	public void test1();
	public void test2();
}

interface inter2{
	public void test3();
	public void test4();
}

class Hello{
	public void test5() {
		System.out.println("Inside the test5 of Hello class");
	}
}

class Example1 extends Hello implements inter1{
	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Inside the test1 of interf1");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Inside the test2 interf1");
	}
}
interface inter3 extends inter1{
	void test6();
}


class MultipleExample implements inter1, inter2{

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("Inside the test3 of interf2");
		
	}

	@Override
	public void test4() {
		// TODO Auto-generated method stub
		System.out.println("Inside the test4 of interf2");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("Inside the test1 of interf1");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("Inside the test2 interf1");
	}

}



public class MultipleInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
