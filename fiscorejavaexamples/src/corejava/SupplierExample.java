package corejava;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Float> s1 = ()->{
			float x = (float) Math.random();
			return x;
		};
		
		System.out.println(s1.get());
		System.out.println(s1.get());
		System.out.println(s1.get());

	}

}
