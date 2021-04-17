package Day28_LabCont;

import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		int[] x= {1,2,3};
		int[] y= {15,11,2,7};
		//int[] a= {3,-2,10,4};
		
		System.out.println(Arrays.toString(rotatArray(x)));
		System.out.println(Arrays.toString(rotatArray(y)));
		//System.out.println(rotatArray(a));

	}
	public static int[] rotatArray(int[] arr) {
		int x=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
			
		}
		arr[arr.length-1]=x;
		return arr;
		
	}

}
