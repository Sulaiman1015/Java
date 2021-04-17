package Day48_collection_part3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Day46_collection_part1.Product;

public class HashSetProducts {

	public static void main(String[] args) {
		
		Set<Product> productSet = new TreeSet<>();
		productSet.add(new Product("book",25.99));
		productSet.add(new Product("book",20.99));
		productSet.add(new Product("magazine",7.99));
	
		System.out.println(productSet.toString());
		
		for(Product p : productSet) {
			System.out.println(p.getPrice());
		}
		
		productSet.forEach(p -> System.out.print(p.getPrice()));

	}

}
