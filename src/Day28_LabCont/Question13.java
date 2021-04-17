package Day28_LabCont;

import java.util.Arrays;

public class Question13 {

	public static void main(String[] args) {
		int[] x= {1,2,3};
		int[] y= {1,3,2};
		
		maxSum(x,y);

	}
	public static void maxSum(int[] arr1,int[] arr2) {
		int sum1=0;
		int sum2=0;
		
		for(int value:arr1) {
			sum1=sum1+value;
		}
		for(int value:arr2) {
			sum2=sum2+value;
		}
		if(sum1>sum2) {
			System.out.println(Arrays.toString(arr1));
		}else if(sum1==sum2){
			System.out.println("equal");
		}else {
			System.out.println(Arrays.toString(arr2));
		}
		
		
		
	}

}
