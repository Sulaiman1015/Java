package Day47_collection_part2;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExemple {

	public static void main(String[] args) {
		List<Integer> numberList = new LinkedList<>();
		
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		
		System.out.println(numberList.get(1));
		
		System.out.println(((LinkedList<Integer>)numberList).getFirst());
		
		
		((LinkedList<Integer>)numberList).addFirst(1);
		((LinkedList<Integer>)numberList).addLast(99);
		
		for(int i:numberList) {
			System.out.println(i);
		}

	}

}
