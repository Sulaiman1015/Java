package Day31_ArrayList;

import java.util.ArrayList;

public class ArrayListExmple {

	public static void main(String[] args) {
		ArrayList<String> languages=new ArrayList<>();
		languages.add("Java");
		languages.add("English");
		languages.add("Arabic");
		languages.add("Turkish");
		
		System.out.println("Number of values: "+languages.size());
		System.out.println(languages.toString());
		
		languages.add("Russian");
		System.out.println(languages.toString());
		
		languages.add(2, "Uighur");
		System.out.println(languages.toString());
		
		languages.remove(0);
		System.out.println(languages.toString());
		
		
		System.out.println(languages.get(1));
		System.out.println("Number of values: "+languages.size());
		

	}

}
