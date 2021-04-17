package Day25_Arrays_Part2;

import java.util.Scanner;

public class PassArray {

	public static void main(String[] args) {
		int[] numbers=new int[4];
		
		getValue(numbers);
		System.out.println("here are the numbers that you entered");
		
		showArray(numbers);

	}
	public static void getValue(int[] array) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a series of "+array.length);
		for(int i=0;i<array.length;i++) {
			System.out.print("Enter number "+(i+1)+":");
			array[i]=sc.nextInt();
		}
		
	}
	public static void showArray(int[] array) {
		for(int value:array) {
			System.out.println(value);
		
	}
	}
}
