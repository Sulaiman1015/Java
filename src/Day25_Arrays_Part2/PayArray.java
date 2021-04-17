package Day25_Arrays_Part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		final int employees=5;
		//double payRate;
		double grossPay;
		
		Scanner sc=new Scanner(System.in);
		
		int[] hours=new int[employees];
		System.out.println("Enter the hours worked by "+employees+" employee who all earn the same hourly wage");
		for(int i=0;i<employees;i++) {
			hours[i]=sc.nextInt();
		}
		
		double[] payRate=new double[employees];
		System.out.println("Enter the hourly rate for each employees:");
		for(int i=0;i<employees;i++) {
		payRate[i]=sc.nextDouble();
		}
		
		for(int i=0;i<employees;i++) {
			grossPay=hours[i]*payRate[i];
			System.out.println("Employee #"+(i+1)+": $ "+grossPay);
		}
	}

}
