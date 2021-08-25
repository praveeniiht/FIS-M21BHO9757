package corejava;
class Sample{
	public void test() {
		for(int i=0;i<=10;i++)
			System.out.println(i);
	}
}

@FunctionalInterface
interface Func1{
	public void dotest();
}
public class MethodReferenceExample {
	public static void main(String args[]) {
		
		Sample s = new Sample();
			
		Func1 f = s::test;
		
		f.dotest();
		
		
		
	}

}
