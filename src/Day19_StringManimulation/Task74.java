package Day19_StringManimulation;
import java.util.Scanner;

public class Task74 {

	public static void main(String[] args) {
		int sum=0;
		int num=0;
		Scanner sc=new Scanner(System.in);
		
		
		do {
			System.out.print("Enter a number:");
			num=sc.nextInt();
			if(num<0) {
				break;
			}else {
				sum=sum+num;
			}
		
			
		}while(true);
		System.out.println("total is "+sum);

	}

}
