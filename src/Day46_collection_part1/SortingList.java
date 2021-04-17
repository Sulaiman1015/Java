package Day46_collection_part1;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("js");
		list.add("html");
		list.add("ruby");
		list.add("c++");
		
		
		System.out.println("before sorting");
		System.out.println(list.toString());
		
		Collections.sort(list);
		
		System.out.println("after sorting");
		System.out.println(list.toString());
		
		List<Product> productList = new ArrayList<Product>();
		Product p = new Product("table",81.99);
		
		productList.add(new Product("spoon",13.99));
		productList.add(new Product("bag",130.99));
		productList.add(new Product("shoes",59.99));
		productList.add(new Product("computer",2000.99));
        productList.add(p);
		
		System.out.println("--------------------------------------");
		
		System.out.println("Before sorting");
		System.out.println(productList.toString());
		
		Collections.sort(productList);
		
		System.out.println("After sorting");
		System.out.println(productList.toString());
		
		Product p1 = new Product("spoon", 25.34);
		Product p2 = new Product("chair", 7.99);
		System.out.println(p1.compareTo(p2));
	}

}
