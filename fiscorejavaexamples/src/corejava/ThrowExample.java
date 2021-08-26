package corejava;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 19,b=20;
			int balance =5000;
			int age=100;
			
			
			if(a < b)
					throw new ArithmeticException();
			else
					throw new NullPointerException();
			
		}
		catch(NullPointerException e) {
			System.out.println("inside the null pointer exception");
		}
		catch(ArithmeticException e) {
			System.out.println("Inside the arthimetic exception");
		}

	}

}
