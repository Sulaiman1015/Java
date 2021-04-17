package Day31_ArrayList;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<>();
		cities.add("London");
		cities.add("Paris");
		cities.add("Budapes");
		cities.add("Rome");
		cities.add("NY");
		cities.add("Dubai");
		System.out.println(cities.toString());
		
		for(String city:cities) {
			System.out.print(city+" ");
			
		}
		
		System.out.println();
		
		for(int i=0;i<cities.size();i++) {
			System.out.print(cities.get(i)+" ");
		}
		System.out.println();
	    int idx=cities.indexOf("Dubai");
	    System.out.println(idx);
	    
	    cities.clear();
	    System.out.println(cities.toString());
	    System.out.println(cities.isEmpty());
		
		
			

	}

}
