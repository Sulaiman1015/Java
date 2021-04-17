package Day48_collection_part3;

import java.util.HashMap;
import java.util.Map;

public class MapExemple {

	public static void main(String[] args) {
		
		Map<String,Double> items = new HashMap<>();
		
		items.put("apple", 3.78);
		items.put("tomat", 2.83);
		items.put("eggs", 1.35);
		items.put("milk", 4.22);
		
		System.out.println(items.size());
		System.out.println(items.toString());
		System.out.println(items.isEmpty());
		System.out.println(items.get("apple"));
		items.remove("eggs");
		System.out.println(items.toString());
		
		System.out.println("is there apple? "+items.containsValue(3.78));
		items.replace("apple", 2.7);
		System.out.println(items.toString());
		
		System.out.println("---------------------------------------");
		
		items.replace("apple", items.get("apple")+2);
		System.out.println(items.toString());

	}

}
