package Day47_collection_part2;

import java.util.ArrayList;
import java.util.List;

public class LoopArrayList {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(50);
		nums.add(10);
		nums.add(434);
		nums.add(52);
		nums.add(44);
		
		//looping using for each loop
		for(Integer n:nums) {
			System.out.print(n+" / ");
		}
		System.out.println();
		
		//looping using for iterator loop
		for(int i=0;i<nums.size();i++) {
			System.out.print(nums.get(i)+" / ");
		}
		System.out.println();
		
		//looping using forEach method
		nums.forEach(n -> System.out.print(n+" / "));
		
		System.out.println();
		
		nums.removeIf(n -> n<45);
		nums.forEach(n -> System.out.print(n+" / "));

	}

}
