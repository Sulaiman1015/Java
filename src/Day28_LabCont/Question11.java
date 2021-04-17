package Day28_LabCont;

import java.util.Arrays;

public class Question11 {

	public static void main(String[] args) {
		int[] x= {1,2,3};
		int[] y= {2,0,5};
		int[] z= {1,2,1};
		int[] k= {11,2,13,3,2};
		System.out.println(Arrays.toString(changeArr(x)));
		System.out.println(Arrays.toString(changeArr(y)));
		System.out.println(Arrays.toString(changeArr(z)));
		System.out.println(Arrays.toString(changeArr(k)));
		
	}
	public static int[] changeArr(int[] arr) {
		//int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
				
				
			}
		}
		return arr;
	}

}
