package Day25_Arrays_Part2;

public class SomeArray {

	public static void main(String[] args) {
		int[] array1= {2,4,6,8};
		int[] array2= array1;
		
		array1[0]=200;
		array1[2]=1000;
		System.out.println("The contents of array1:");
		for(int value:array1) {
			System.out.println(value);
		}
		System.out.println("The contents of array2:");
		for(int value:array2) {
			System.out.println(value);

	    }
	}

}
