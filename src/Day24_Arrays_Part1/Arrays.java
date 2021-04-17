package Day24_Arrays_Part1;

public class Arrays {

	public static void main(String[] args) {
		int[] myList= { 10,20,30,40};
		
		String[] myArray = {"apple","orange","melon"};
		
		System.out.println(myList[3]);
		System.out.println(myArray[1]);
		System.out.println(myList.length);
		System.out.println(myArray.length);
		
		for(int i=0;i<myList.length;i++) {
			System.out.println(myList[i]);
		}
			
	}

}
