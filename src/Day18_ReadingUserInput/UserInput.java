package Day18_ReadingUserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a byte value:");
		byte b=sc.nextByte();
		System.out.println(b+","+b*4);
		
		System.out.println("--------------------");
		
		System.out.print("Enter a int value:");
		int i=sc.nextInt();
		System.out.println(i+","+i*4);
		
        System.out.println("--------------------");
		
		System.out.print("Enter a long value:");
		long l=sc.nextLong();
		System.out.println(l+","+l*4);
		
        System.out.println("--------------------");
		
		System.out.print("Enter a boolean value:");
		boolean bl=sc.nextBoolean();
		System.out.println(bl);

	}

}
