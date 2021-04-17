package Day19_StringManimulation;

import java.util.Scanner;

public class Task75 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you first name:");
		String firstName=sc.next();
		System.out.println("Enter your last name:");
		String lastName=sc.next();
		
		System.out.println("Total characters of full name is "+((firstName.length())+lastName.length()));

	}

}
