package Day31_ArrayList;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		System.out.println(nums.toString());
		
		Integer n1=new Integer(5);
		Integer n2=Integer.valueOf(4);
		Integer n3=new Integer(1);
		nums.remove(n1);
		System.out.println(nums.toString());
		nums.remove(n2);
		System.out.println(nums.toString());
		nums.remove(new Integer(1));
		System.out.println(nums.toString());
		
		nums.set(1, 66);
		System.out.println(nums.toString());
		

	}

}
