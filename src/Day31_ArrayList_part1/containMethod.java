package Day31_ArrayList;

import java.util.ArrayList;

public class containMethod {

	public static void main(String[] args) {
		
		
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1.toString());
		
		ArrayList<String> list2=list1;
		
		ArrayList<String> months=new ArrayList<String>(list1);
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		System.out.println(months);
		
		System.out.println(months.contains("Jan"));
		System.out.println(months.contains("Dec"));
		
		System.out.println(months.indexOf("Feb")==1);
		System.out.println(months.get(1).equals("Feb"));
		
		if(months.containsAll(list1)){
			System.out.println("months has all list1");
		}else {
			System.out.println("some values are missing");
		}
		
		
	}

}
