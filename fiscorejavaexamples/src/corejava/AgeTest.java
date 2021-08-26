package corejava;
import java.util.Scanner;
public class AgeTest {
	
	public static void testAge(int age) {
		if(age < 0)
			throw new NegativeAgeException();
		else if (age > 100)
			throw new InvalidAgeException();
		else
			System.out.println("Valid age for humans....");
	}
	
	public static void main(String args[]) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age...");
		age = sc.nextInt();
		
		try {
			testAge(age);
		}
		catch(NegativeAgeException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
