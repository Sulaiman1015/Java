package Day31_ArrayList;

import java.util.ArrayList;

public class shoppingList {

	public static void main(String[] args) {
		ArrayList<String> sl=new ArrayList<>();
		sl.add("paper towel");
		sl.add("dish soap");
		sl.add("trash bag");
		sl.add("clorox");
		sl.add("gloves");
		sl.add("shovel");
		
		int count=sl.size();
		System.out.println(count);
		System.out.println(sl.toString());
		System.out.println(sl.get(0)+", "+sl.get(count-1));
		sl.remove("paper towel");
		sl.remove("shovel");
		sl.remove(0);
		System.out.println(sl.toString());
		for(String item:sl) {
			System.out.println(item);
		}
		sl.clear();
		System.out.println(sl.toString());
		
		
		

	}

}
