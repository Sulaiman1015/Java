package Day32_ArrayList_part2;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		l1.add(30);l1.add(12);l1.add(22);
		
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(30);l2.add(345);l2.add(1);l2.add(12);l2.add(12);l2.add(22);l2.add(12);
		
		System.out.println(l1);
		System.out.println(l2);
		l2.removeAll(l1);
		System.out.println(l2);

	}

}
