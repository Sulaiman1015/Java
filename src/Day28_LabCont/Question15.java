package Day28_LabCont;

import java.util.Arrays;

public class Question15 {

	public static void main(String[] args) {
		int[] x= {1,2,3,4,5};
		System.out.println(Arrays.toString(swapEnds(x)));

	}
	public static int[] swapEnds(int[] arr) {
		int temp=0;
		temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		return arr;
		
		
	}

}
