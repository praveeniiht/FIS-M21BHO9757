package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Example3 {

	@Test(timeout = 2000)
	public void test5() {
		try {
			System.out.println("Inside the test5...");
			Thread t = new Thread();
			t.sleep(1500);
			System.out.println("After the sleep method");
		} catch (Exception e) {

		}
	}
	
	@Test(expected= ArithmeticException.class)
	
	public void test6() {
		int a=10,b=2,c;
		c=a/b;
		String str=null;
		System.out.println("The Value of c:"+c);
		str.equals("hello");
	}

}
