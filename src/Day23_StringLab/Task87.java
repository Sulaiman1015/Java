package Day23_StringLab;

import java.util.Scanner;

public class Task87 {

	public static void main(String[] args) {
		String[] day=new String[7];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter index number:");
		int i=sc.nextInt();
		day[0]="monday";
		day[1]="tuesday";
		day[2]="wednesday";
		day[3]="thursday";
		day[4]="friday";
		System.out.println("Today is "+day[i]);
		

	}

}
