package Day27_Arrays_Part4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {

	public static void main(String[] args) {
		//Array.toString
		int[] nums= {22,34,45,34};
		System.out.println(Arrays.toString(nums));
		System.out.println("******************");
		
		//equals
		int[] nums1= {22,34,45,34};
		int[] nums2= {22,34,45,34};
		
		System.out.println(Arrays.equals(nums1, nums2));
		System.out.println("******************");
		
		//sort()
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages= {"zulu","spanish","italian","english"};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		System.out.println("******************sort");
		
		//binarySearch()
		int[] numsx= {21,32,41,31};
		System.out.println(Arrays.binarySearch(numsx, 21));
		
		System.out.println("******************binary search index position");
		
		//copyOf()
		double[] d1= {22,34,45,34};
		double[] d2= d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		

		d2[1]=400.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double[] d3=Arrays.copyOf(d2, d2.length);
		System.out.println(Arrays.toString(d3));

	}

}
