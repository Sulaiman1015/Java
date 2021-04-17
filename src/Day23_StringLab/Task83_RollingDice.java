package Day23_StringLab;

import java.util.Random;
import java.util.Scanner;

public class Task83_RollingDice {

	public static void main(String[] args) {
		int dice1;
		int dice2;
		String again="y";
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		while(again.equalsIgnoreCase("y")) {
			
			System.out.println("Rolling the dice...");
			dice1=rn.nextInt(6)+1;
		    dice2=rn.nextInt(6)+1;
		    System.out.println("Their values are:");
		    System.out.println(dice1+" "+dice2);
		    
		    System.out.print("Roll them again (y=yes)?");
			again=sc.nextLine();
			
		}
			
			

	}

}
