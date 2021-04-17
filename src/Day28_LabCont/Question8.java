package Day28_LabCont;

import java.util.Arrays;

public class Question8 {

	public static void main(String[] args) {
		int[] x= {1,2,5};
		int[] y= {7,4,6,3};
		int[] z= {7,4,15,31};
		System.out.println(containArr(x));
		System.out.println(containArr(y));
		System.out.println(containArr(z));
		

	}
	public static boolean containArr(int[] arr) {
		for(int value:arr) {
			if(value==2 || value==3) {
				return true;
			}
			
		}
		return false;
		
		
		
		
	}

}
