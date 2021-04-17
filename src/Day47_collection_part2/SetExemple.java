package Day47_collection_part2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExemple {

	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(100);
		mySet.add(200);
		mySet.add(300);
		mySet.add(400);
		mySet.add(500);
		mySet.add(1500);
		mySet.add(500);
		
		System.out.println(mySet.toString());
		System.out.println(mySet.size());
		
		
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(100);
		tSet.add(200);
		tSet.add(300);
		tSet.add(400);
		tSet.add(500);
		tSet.add(1500);
		tSet.add(500);
		
		
		System.out.println(tSet.toString());
	}

}
