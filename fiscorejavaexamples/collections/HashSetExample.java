package collections;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Set hs = new HashSet();
	hs.add("Japan");
	hs.add("England");
	hs.add("India");
	hs.add("America");
	hs.add("England");
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	
	
	Set h = new LinkedHashSet();
	h.add("Japan");
	h.add("England");
	h.add("India");
	h.add("America");
	h.add("England");
	h.add(null);
	h.add(null);
	System.out.println(h);
	
	Set t = new TreeSet();
	t.add("Japan");
	t.add("England");
	t.add("India");
	t.add("America");
	t.add("England");
	System.out.println(t);

	}

}
