package Day28_LabCont;

import java.util.Arrays;

public class Question6 {

	public static void main(String[] args) {
		int[] x= {1,2,3};
		int[] y= {15,11,2,7};
		
		
		System.out.println(Arrays.toString(greatestArr(x)));
		System.out.println(Arrays.toString(greatestArr(y)));
		

	}
	public static int[] greatestArr(int[] arr) {
		int max=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]>max) {
				max=arr[i+1];
				
			}
			
			
		}
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=max;
			
		}
		return arr;
		
		
	}

}
