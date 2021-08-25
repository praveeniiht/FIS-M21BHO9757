package corejava;
import java.util.function.Consumer;
public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> c1 = str-> System.out.println(str);
		Consumer<String[]> c2 = names->{
			for(int i=0;i<names.length;i++)
				System.out.println(names[i]);
		};
		
		
		String[] names = {"India","China","Japan","America"};
		String[] cities = {"Bangalore","Chennai","Hyderabad","Delhi","Pune"};
		c1.accept("hello");
		c1.accept("hai");
		c2.accept(names);
		c2.accept(cities);
	}

}
