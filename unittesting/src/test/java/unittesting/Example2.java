package unittesting;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class Example2 {

	@Test
	@Ignore
	public void test3() {
		System.out.println("Inside the test3 method...");
	}
	
	@Test
	public void test4() {
		System.out.println("Inside the test4 method...");
	}

}
