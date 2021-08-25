package corejava;


@FunctionalInterface
interface Maths{
	public int add(int a, int b);
}

/*
 * (a,b)->a+b;
 * 
 */
public class LambdaExample1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		Maths m = (a,b)->a+b;
		System.out.println(m.add(200,300));

	}

}
