package Day18_ReadingUserInput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("provide a sentence and i will repeat it: ");
		String str=sc.next();
		System.out.println(str);
		
		Scanner sc2=new Scanner(System.in);
		System.out.print("provide a sentence and i will repeat it: ");
		String str2=sc2.nextLine();
		System.out.println(str2);
		

	}

}
