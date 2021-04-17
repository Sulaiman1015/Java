package Day18_ReadingUserInput;

import java.util.Scanner;

public class Task73 {

	public static void main(String[] args) {
		int x;
		int y=22;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		
	
		do {
			x=sc.nextInt();
		if(x<y) { 
			
			
			System.out.println("too small");
			System.out.print("Enter a number:");
		}else if(x>y) {
			
			System.out.println("too biger");
			System.out.print("Enter a number:");
			
		}else {
			
			System.out.println("congratelation");
			
			
		}
		
		}while(x!=y);
		

	}

}
