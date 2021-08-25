package corejava;



public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
	//	int a=10,b=0,c;
	//	c=a/b;
	//	System.out.println("c = "+c);
		String str ="Hai";
		System.out.println(str.charAt(5));
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println("inside the string index out of bound exception");
	}
	catch(ArithmeticException e) {
		System.out.println("Inside the arthimetic exception");
	}
	finally {
		System.out.println("Inside the finally block");
	}
	System.out.println("After finally block");

	}

}
