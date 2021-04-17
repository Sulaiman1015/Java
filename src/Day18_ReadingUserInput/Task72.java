package Day18_ReadingUserInput;

import java.util.Scanner;

public class Task72 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number 1: ");
		double num1=sc.nextDouble();
		System.out.print("Enter a number 2: ");
		double num2=sc.nextDouble();
		System.out.print("Enter a number 3: ");
		double num3=sc.nextDouble();
		double sum=num1+num2+num3;
		System.out.println("sum=num1+num3+num3="+sum);

	}
	
}
