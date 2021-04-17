package Day28_LabCont;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		int[] x= {1,2,3};
		int[] y= {7,4,6,2};
		System.out.println(Arrays.toString(newArray(x)));
		System.out.println(Arrays.toString(newArray(y)));

	}
	public static int[] newArray(int[] arr) {
		int[] arrNew=new int[2];
		arrNew[0]=arr[0];
		arrNew[arrNew.length-1]=arr[arr.length-1];
		return arrNew;
		
		
	}

}
