package collections;
import java.util.*;
import java.util.Map.Entry;

public class MapExample {

	private static final Object String = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap();
		// put method to insert the data into map object
		
		map.put("k1", "India");
		map.put("k2", "Japan");
		map.put("k3", "America");
		
		System.out.println(map);
		
		System.out.println(map.get("k3"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.containsKey("k3"));
		System.out.println(map.containsValue("India"));
		
		Set keys = map.entrySet();
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			Map.Entry<String,String> hs = (Map.Entry<String, String>)itr.next();
			System.out.println(hs.getKey()+"   "+hs.getValue());
		}

	}

}
