package unittesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.OrderWith;

public class Example1 {

	@Test

	public void test1() {
		String str = "hai";
		//assertEquals("Praveen","Praveen");
		//assertNotNull(str);
		System.out.println("Inside the test1...");
	}
	@Test
	public void test2() {
				System.out.println("Inside the test2...");
	}
	@Before
	public void before() {
		System.out.println("This method will be executed before every test method..");
	}
	
	@After
	public void after() {
		System.out.println("This method will be executed after every test method..");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("This method will be executed once before all the test methods in  class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("This method will be executed once after all the test methods class");
	}

}
