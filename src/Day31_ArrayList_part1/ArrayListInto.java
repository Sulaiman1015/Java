package Day31_ArrayList;

import java.util.ArrayList;

public class ArrayListInto {

	public static void main(String[] args) {
		//creating a arraylist
		ArrayList<String> names=new ArrayList<>();
		ArrayList<Integer> nums=new ArrayList<>();
		
		//assigning value to arraylist
		
		names.add("Mike");
		names.add("Smith");
		names.add("Emmy");
		names.add("Evan");
		names.add("Mary");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(new Integer("200"));
		
		//reading from arraylist
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		
		System.out.println(nums.get(2));
		System.out.println(nums.get(3));
		
		
		System.out.println("Names count: "+names.size());
		System.out.println("Nums count: "+nums.size());
		
		System.out.println(names.toString());
		System.out.println(nums.toString());

	}

}
