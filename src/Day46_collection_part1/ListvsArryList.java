package Day46_collection_part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListvsArryList {

	public static void main(String[] args) {
		
		int[] numsArray = {30,50,100,5,6};
		
		String[] days = new String[7];
		
		Object[] obj = {30,"apple",true};
		
		ArrayList<Integer> numberlist=new ArrayList<>();
		List<Integer> numberlist2=new ArrayList<>();
		Collection<Integer> numberlist3=new ArrayList<>();
		
		numberlist.add(140);
		numberlist.add(50);
		numberlist.add(100);
		
		numberlist2.add(410);
		numberlist2.add(50);
		numberlist2.add(100);
		
		numberlist3.add(401);
		numberlist3.add(50);
		numberlist3.add(100);
		
		System.out.println(numsArray[0]);
		System.out.println(numberlist.get(0));
		System.out.println(numberlist2.get(0));
		System.out.println(((ArrayList<Integer>) numberlist3).get(0));

	}

}
